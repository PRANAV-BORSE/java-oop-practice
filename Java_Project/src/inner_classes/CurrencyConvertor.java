//Collection of abstract methods and possibly final variables
package inner_classes;

public interface CurrencyConvertor {
	float DOLLAR_TO_RUPEE = 96.23f;
	float POUND_TO_RUPEE = 115.32f;
	float doConvert(float amount);
	
	
}


//1. USD TO INR => DollarTORupeeCOnvertor
//2. INR TO GBP => RupeeToPoundConvertor