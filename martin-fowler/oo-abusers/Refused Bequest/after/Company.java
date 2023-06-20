
public class Company {
	private double revenues;
	private double expenses;
	private final TaxCalculator taxCalculator;
	
	public Company(TaxCalculator taxCalculator, double revenues, double expenses) {
		this.taxCalculator = taxCalculator;
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}

	public double calculateTax(double textRate) {
		return taxCalculator.calculateTax(getIncome(), textRate);
	}
}
