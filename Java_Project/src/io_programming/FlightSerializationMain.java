	package io_programming;
	
	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;
	
	public class FlightSerializationMain {
	
		public static void main(String[] args) {
			String filePath = "./src/resourses/flight.txt";
			try(
					FileOutputStream fout = new FileOutputStream(filePath);
					ObjectOutputStream out = new ObjectOutputStream(fout);
				){
				
				Flight flt = new Flight("AN445","All Nippon Airways","Mumbai","Tokyo");
				out.writeObject(flt);
				System.out.println("Flight Object Serialized Successfully !");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	
		}
	
	}
