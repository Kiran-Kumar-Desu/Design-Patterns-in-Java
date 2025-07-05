package structuralPatterns.adapterPattern.Example1;

public interface PayD {

	public String getCustCardNo();

	public String getCardOwnerName();

	public String getCardExpYearMonth();

	public Integer getCVVNo();

	public Double getAmount();

	public void setCustCardNo(String custCardNo);

	public void setCardOwnerName(String cardOwnerName);

	public void setCardExpYearMonth(String cardExpYearMonth);

	public void setCardCVVNo(Integer cVVNo);

	public void setAmount(Double amount);

}
