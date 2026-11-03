package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashingExampleMain {

	public static void main(String[] args) {
		Set<Country> countries = new HashSet<>();
		Country ind = new Country();
		Country jpn = new Country("Japan","Tokoyo");
		Country us = new Country("USA","Washington");
		Country gre = new Country("Germany","Berlin");
		Country eng = new Country("England","London");
		
		countries.add(ind);
		countries.add(jpn);
		countries.add(us);
		countries.add(gre);
		countries.add(eng);
		
		
		for(Country currentCountry : countries)
			System.out.println(currentCountry);
		
	}

}
