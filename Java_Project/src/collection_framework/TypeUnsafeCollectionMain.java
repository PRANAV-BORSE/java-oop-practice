package collection_framework;

import java.awt.List;
import java.util.ArrayList;

public class TypeUnsafeCollectionMain {

	public static void main(String[] args) {
		List countries = new ArrayList();
		countries.add("India");
		countries.add("Japan");
		countries.add("France");
		countries.add("Germany");
		countries.add("Austerlia");
//		countries.add(false);
		
		for(Object obj : countries)
			//string => toUpperCase()
			String ctr = (String)obj;
			System.out.println(ctr.toUpperCase());

	}

}
