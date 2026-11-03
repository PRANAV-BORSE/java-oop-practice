package collection_framework;

import java.util.LinkedList;

public class LinkedListExampleMain {

	public static void main(String[] args) {
		LinkedList iceCreams = new LinkedList();
		iceCreams.add("Vanilla");
		iceCreams.add("Mango");
		iceCreams.add("Butterscoth");
		
		for(Object obj : iceCreams) 
			System.out.println(obj);
		
		System.out.println("=========ADDING NEW ELEMENTS AT THE TOP================");
		
		iceCreams.addFirst("Gulkand");
		for(Object obj : iceCreams) 
			System.out.println(obj);
		
		System.out.println("First element is :" + iceCreams.getFirst());
		System.out.println("Last element is :" + iceCreams.getLast());
		
		System.out.println("===========REMOVING ELEMENTS FROM TOP TO BOTTOM===========");
		
		iceCreams.removeFirst();
		iceCreams.removeLast();
		
		for(Object obj : iceCreams) 
			System.out.println(obj);		
	}

}
