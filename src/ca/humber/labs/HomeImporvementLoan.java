package ca.humber.labs;

public class HomeImporvementLoan extends Loan {

	private String address;

	public HomeImporvementLoan(String name, double loanamount, int loannumber, double interest, double time,
			String address) {
		super(name, loanamount, loannumber, interest, time);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double calculateLoan() {
		double interestamount = (getLoanAmount() * getInterest() * getTime() / 100);
		double totalamount = getLoanAmount() + interestamount;
		return totalamount;
	}
}