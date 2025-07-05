package structuralPatterns.adapterPattern.Example1;

public class RunAdapterExample {

	public static void main(String[] args) {
		
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Test User");
		xpay.setCardExpYear("26");
		xpay.setCardExpMonth("11");
		xpay.setCardCVVNo((short)259);
		xpay.setAmount(25986.35);
		
		
		PayD payD = new XpayToPayDAdapter(xpay);
		
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCardExpYearMonth());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getAmount());
	}

}
