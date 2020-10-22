package Services;

public class PayPal implements ServicePayment {

	public double paymentInterest(double interest) {
		interest = 0.01; 
		return interest;
	}
	
	public double paymentTax(double tax) {
		tax = 0.02;
		return tax;
	}
}
