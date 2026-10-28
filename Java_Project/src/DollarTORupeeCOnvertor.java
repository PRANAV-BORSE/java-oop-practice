
public class DollarTORupeeCOnvertor implements CurrencyConvertor{

	@Override
	public float doConvert(float amountInDollars) {
		float amountInRupees = amountInDollars * DOLLAR_TO_RUPEE;
		
		return amountInRupees;
	}
	
	

}
