package inner_classes;

public class AnonymousInnerClassMain {

	public static void main(String[] args) {
		CurrencyConvertor convertor;
		convertor = new CurrencyConvertor() {
			
			@Override
			public float doConvert(float amount) {
				// TODO Auto-generated method stub
				return amount / 8.45f;
			}
		};
		System.out.println(convertor.doConvert(50000));
	}

}
