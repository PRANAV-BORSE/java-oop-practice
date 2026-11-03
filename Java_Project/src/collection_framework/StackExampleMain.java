package collection_framework;

import java.util.Stack;

import io_programming.Flight;

public class StackExampleMain {

	public static void main(String[] args) {
		Stack dataValues = new Stack();
		dataValues.add("Welcome to collections");//0 th index
		dataValues.add("collections are everywhere");//1 st index
		dataValues.add(new StringBuilder("Welcome"));
		dataValues.add(new Flight("LX369","Luftansa Airline","New Delhi","Berlin"));
		int score = 37;
		dataValues.add(score);  //dataValues.add(new Integer(score));  ==> autoboxing
		
		
		
		System.out.println("Elements at 3rd index : " + dataValues.get(3));
		System.out.println("================Printing all elements===============");
		
		int size = dataValues.size();
		System.out.println("Size is :"+ size);
		
		for(int index = 0;index < size; index++) {
			Object obj = dataValues.get(index);
			System.out.println(obj);
		}
		
		System.out.println("=================");
		
		for(Object obj : dataValues)
			System.out.println(obj);
	}

}
