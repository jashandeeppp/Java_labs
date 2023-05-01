package ca.humber.labs;

public class CarLoan extends Loan {
	
	private String numberplate;
	
	public CarLoan(String name, double loanamount, int loannumber, double interest, double time, String numberplate) {
		super(name, loanamount, loannumber, interest, time);
		this.numberplate = numberplate;
	}
	
	public String getNumberplate() {
		return numberplate;
	}

	public void setNumberplate(String numberplate) {
		this.numberplate = numberplate;
	}

	public double calculateLoan() {
	double interestamount = (getLoanAmount()* getInterest()* getTime()/100);
	double totalamount = getLoanAmount() + interestamount;
	return totalamount;
	}
}
