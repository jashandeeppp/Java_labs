package Lab04;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/* Review the application given in the reference link in slide #34 of the Multithreading PP that is posted in week 3 on BB. 
 * Add a new thread with InvestTask(). Develop a public static class InvestTask that implements Runnable(). 
 * In the class Account add a new method – invest. 
 * Implement Invest so you can invest at most 40% of your balance as long as you have at least $1000 in it. 
 * The interest rate to use to calculate the investment is 0.01. 
 * Run the application and record the output to include in the submission.
*/
public class lab04 {
	private static Account account = new Account();

	public static void main(String[] args) {
		System.out.println("Thread 1\t\tThread 2\t\tInvestmentPercentage\tInvestment\tInterested Money\tBalance");
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.execute(new InvestTask());
		executor.shutdown();
	}

	public static class DepositTask implements Runnable {
		@Override
		public void run() {
			try { 
				while (true) {
					account.deposit((int) (Math.random() * 10000) + 1);
					Thread.sleep(1000);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static class WithdrawTask implements Runnable {
		public void run() {
			while (true) {
				account.withdraw((int) (Math.random() * 10000) + 1);
			}
		}
	}

	public static class InvestTask implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					int max = 40;
					int min = 1;
					int range = max - min + 1;
					int num = (int) (Math.random() * range) + min;
					account.invest(num);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static class Account {
		private static Lock lock = new ReentrantLock();
		private static Condition newDeposit = lock.newCondition();
		private int balance = 0;
		private int invest = 0;
		private int interestedMoney = 0;
		
//		public int interestedMoney() {
//			return interestedMoney;
//		}
		
		public int getBalance() {
			return balance;
		}
		
		public void withdraw(int amount) {
			lock.lock(); 
			try {
				while (balance < amount) {
					System.out.println("\t\t\tWait for a deposit");
					newDeposit.await();
				}

				balance -= amount;
				System.out.println("\t\t\tWithdraw " + amount + "\t\t\t\t\t\t\t\t\t\t" + getBalance());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				lock.unlock(); 
			}
		}

		public void deposit(int amount) {
			lock.lock(); 
			try {
				balance += amount;
				System.out.println("Deposit " + amount + "\t\t\t\t\t\t\t\t\t\t\t\t\t" + getBalance() );
				newDeposit.signalAll();
			} finally {
				lock.unlock(); 
			}
		}

		public void invest(int interest) {
			lock.lock();
			try {
				while(balance < 1000) {
					System.out.println("Sorry :( Not enough money for investment please deposit to continue in investment");
					newDeposit.await();
				}
				invest = balance*interest/100;
				balance = balance - invest;
				interestedMoney += invest*0.01+ invest;
				System.out.println("\t\t\t\t\t\t"+interest+"\t\t\t"+invest+"\t\t"+interestedMoney+"\t\t\t"+balance);

			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}