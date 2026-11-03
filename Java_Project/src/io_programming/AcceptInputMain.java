package io_programming;

import java.io.InputStream;
import java.util.Scanner;

public class AcceptInputMain {

	public static void main(String[] args) {
		//A PROGRAM THAT ACCEPTS NAME , HEIGHT , AND WEIGHT OF A PERSON AND DISPLAY BMI.
		InputStream keyboard = System.in;
		
		try(
				Scanner scr = new Scanner(keyboard);
			){
			System.out.println("Enter Your Name : ");
			String myName = scr.nextLine();
			
			System.out.println("Enter Your Height (cm): ");
			int myHeight = scr.nextInt();
			
			System.out.println("Enter Your weight (kg):");
			float myWeight = scr.nextFloat();
			
			float heightInMer = myHeight / 100.0f;
			float bmi = myWeight / (heightInMer * heightInMer);
			System.out.println("Hey " + myName + ", yours BMI is  " +bmi);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
