package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExampleMain {

	public static void main(String[] args) {
		SortedSet socialMedia = new TreeSet<>();
		socialMedia.add("Whatsapp");
		socialMedia.add("Instagram");
		socialMedia.add("Facebook");
		socialMedia.add("Telegram");
//		socialMedia.add(100);  //WILL GIVE EROR
		
		
		for(Object media : socialMedia)
			System.out.println(media);

	}

}
