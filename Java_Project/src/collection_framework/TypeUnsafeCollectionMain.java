package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionMain {

	public static void main(String[] args) {
		List countries = new ArrayList();
		countries.add("India");
		countries.add("USA");
		countries.add("Russia");
		countries.add("Japan");
		countries.add("Europe");
		//countries.add(false);
		
		for(Object obj : countries) {
			String ctr = (String)obj;
			System.out.println(ctr.toUpperCase());
		}
	}

}