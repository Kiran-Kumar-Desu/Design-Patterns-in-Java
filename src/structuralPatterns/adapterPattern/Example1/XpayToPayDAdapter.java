package structuralPatterns.adapterPattern.Example1;

public class XpayToPayDAdapter implements PayD {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpYearMonth;
	private Integer cVVNo;
	private Double amount;

	private final Xpay xpay;

	public XpayToPayDAdapter(Xpay xpay) {
		super();
		this.xpay = xpay;
		setProp();
	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpYearMonth() {
		return cardExpYearMonth;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getAmount() {
		return amount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpYearMonth(String cardExpYearMonth) {
		this.cardExpYearMonth = cardExpYearMonth;
	}

	@Override
	public void setCardCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	private void setProp() {
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardOwnerName(this.xpay.getCustomerName());
		setCardExpYearMonth(this.xpay.getCardExpYear() + "/" + this.xpay.getCardExpMonth());
		setCardCVVNo(this.xpay.getCardCVVNo().intValue());
		setAmount(this.xpay.getAmount());
	}

}
