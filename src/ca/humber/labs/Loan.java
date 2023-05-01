package ca.humber.labs;

abstract public class Loan {

	private String name;
	private double loanAmount;
	private int loanNumber;
	private double interest;
	private double time;

	public Loan(String name, double loanamount, int loannumber, double interest, double time) {
		this.name = name;
		this.loanAmount = loanamount;
		this.loanNumber = loannumber;
		this.interest = interest;
		this.time = time;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}


	public abstract double calculateLoan();

}
