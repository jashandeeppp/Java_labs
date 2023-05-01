package ca.humber.labs;

/*Develop a Java application that demonstrates the inheritance. The super class is named Loan. 
 * The sub classes are named CarLoan and HomeImprovementLoan. In the super class, define the required fields (e.g. loan number),
 * the constructor and the mutators and accessors. In each of the sub classes, define the required fields (e.g. car plate number, etc.)
 * and (e.g. home loan certificate, etc.), the constructor and the mutators and accessors. 
 * Add a method calculateLoan in the super class without providing an implementation. 
 * In each of the subclasses, provide the implementation of the calcualteLoan method (overriding the super class method).
 * You should use the keyword super in the sub classes and demonstrate the inheritance. 
 * In the Test class instantiate objects of CarLoan and HomeImprovementLoan and print 
*/
public class Lab01 {

	public static void main(String[] args) {
		// object of carloan
		CarLoan carloan = new CarLoan("Jashan", 25000, 77854, 3.5, 8, "CQXY 543");
		// name, amount, number, i, t, numberPlate
		// object of Homeloan
		HomeImporvementLoan homeloan = new HomeImporvementLoan("Deep", 130000, 12589, 7.5, 12, "ABC123");
		// name, amount, number, i, t, address
		System.out.println("#### Car Loan ###");
		System.out.println("Name: " + carloan.getName() + "\n" + "Loan Amount: " + carloan.getLoanAmount() + "\n"
				+ "Loan Number: " + carloan.getLoanNumber() + "\n" + "InterestRate: " + carloan.getInterest() + "\n"
				+ "Time: " + carloan.getTime() + " years" + "\n" + "Number Plate: " + carloan.getNumberplate() + "\n"
				+ "Total Loan Amount: " + carloan.calculateLoan());

		System.out.println();

		System.out.println("### Home Loan ###");
		System.out.println("Name: " + homeloan.getName() + "\n" + "Loan Amount: " + homeloan.getLoanAmount() + "\n"
				+ "Loan Number: " + homeloan.getLoanNumber() + "\n" + "InterestRate: " + homeloan.getInterest() + "\n"
				+ "Time: " + homeloan.getTime() + " years" + "\n" + "Home Loan Certificate: " + homeloan.getAddress()
				+ "\n" + "Total Loan Amount: " + homeloan.calculateLoan());
		System.out.println();
		
		System.out.println("#### Car Loan ###"); 
		carloan.setInterest(2.5);
		carloan.setLoanAmount(10000);
		carloan.setName("Arsh");
		carloan.setNumberplate("NJS 335");
		carloan.setLoanNumber(98727);
		carloan.setTime(5);
		
		System.out.println("Name: " + carloan.getName() + "\n" + "Loan Amount: " + carloan.getLoanAmount() + "\n"
				+ "Loan Number: " + carloan.getLoanNumber() + "\n" + "InterestRate: " + carloan.getInterest() + "\n"
				+ "Time: " + carloan.getTime() + " years" + "\n" + "Number Plate: " + carloan.getNumberplate() + "\n"
				+ "Total Loan Amount: " + carloan.calculateLoan());
		
		System.out.println();
		
		homeloan.setInterest(5);
		homeloan.setLoanAmount(500000);
		homeloan.setLoanNumber(58964);
		homeloan.setAddress("BYX123");
		homeloan.setName("Manvir");
		homeloan.setTime(15);
		System.out.println();
		System.out.println("### Home Loan ###");
		System.out.println("Name: " + homeloan.getName() + "\n" + "Loan Amount: " + homeloan.getLoanAmount() + "\n"
				+ "Loan Number: " + homeloan.getLoanNumber() + "\n" + "InterestRate: " + homeloan.getInterest() + "\n"
				+ "Time: " + homeloan.getTime() + " years" + "\n" + "Home Loan Certificate: " + homeloan.getAddress()
				+ "\n" + "Total Loan Amount: " + homeloan.calculateLoan());
	}

}
