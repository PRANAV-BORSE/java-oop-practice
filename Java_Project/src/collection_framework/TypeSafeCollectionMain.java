package collection_framework;

import java.awt.List;
import java.util.ArrayList;

public class TypeSafeCollectionMain {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Japan");
		countries.add("France");
		countries.add("Germany");
		countries.add("Austerlia");
		//countries.add(false);  //error because type of this object is boolean i.e. other than boolean
		
//		for(Object obj : countries)
//			//string => toUpperCase()
//			String ctr = (String)obj;
//			System.out.println(ctr.toUpperCase());
		//NO EXPLICIT TYPE OF CASTING IS NEEDED
		for(String ctr : countries) {
			System.out.println(ctr.toUpperCase());
		}
	}

}