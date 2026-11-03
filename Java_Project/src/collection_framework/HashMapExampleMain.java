package collection_framework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleMain {

	public static void main(String[] args) {
		Map<Long, String> contacts = new HashMap<>();
		contacts.put(9845445655L, "James");
		contacts.put(7725433622L, "Jack");
		contacts.put(7392445655L, "Ana");
		
		//Obtaining set of keys
		Set<Long> allKeys= contacts.keySet();
		
		for(long everyKey : allKeys) {
			String everyValue = contacts.get(everyKey);
			System.out.println("Key is "+ everyKey + "value is " + everyValue);
		}
		System.out.println("=====================================");
		
		//OBTAINING A SET OF ENTRIES
		Set<Map.Entry<Long, String>> setOfEntries = contacts.entrySet();
		
		for(Map.Entry<Long, String> everyEntry : setOfEntries) {
			Long everyKey = everyEntry.getKey();
			String everyValue = everyEntry.getValue();
			System.out.println("Key :" + everyKey + ", Value :" + everyValue);
		}
		
		
		System.out.println("=====================================");

		//OBTAINING LIST OF VALUES
		Collection<String> allValues =  contacts.values();
		for(String everyValue : allValues) {
			System.out.println("Value: " + everyValue);
		}	
	}

}











