package structuralPatterns.adapterPattern.Example2;

public class PhonepayAdapter implements PaymentProcess{

	@Override
	public String makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Phonepay Gate way executed sucessfully");
		return String.format("Sucessfully Transfered the amount: %.2f", amount);
	}

}
