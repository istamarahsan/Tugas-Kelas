
public class Main {

	public static void main(String[] args) {
		Company abc = new Company(new PersonalTaxCalculator(), 5000000000.0, 2500000000.0);
		double tax = abc.calculateTax(0.3);
		
		System.out.println(tax);
	}

}
