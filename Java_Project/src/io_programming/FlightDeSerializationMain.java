package io_programming;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FlightDeSerializationMain {

	public static void main(String[] args) {
		String filePath = "./src/resourses/flight.txt";
		
		try(
				FileInputStream fin = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fin)
				
			){
			Object obj = in.readObject();
			System.out.println(obj);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
