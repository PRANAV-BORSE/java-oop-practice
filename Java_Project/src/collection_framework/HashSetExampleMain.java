package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {

	public static void main(String[] args) {
		Set<String> countries = new HashSet<>();
		countries.add("India");
		countries.add("India");
		countries.add("India");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("France");
		countries.add("Germany");
		countries.add("Austerlia");
		System.out.println("Size :" + countries.size());
		
		for(String ctr : countries) {
			System.out.println(ctr.toUpperCase());
		}
	}

}