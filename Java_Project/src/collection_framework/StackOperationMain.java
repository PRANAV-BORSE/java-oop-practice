package collection_framework;

import java.util.Stack;

public class StackOperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack dataValues = new Stack();
		dataValues.add("Mumbai");
		dataValues.add("Pune");
		dataValues.add("Nashik");
		for(Object obj : dataValues)
			System.out.println(obj);
		
		System.out.println("====================");
		Object poppedObj = dataValues.pop();
		System.out.println("Popped object is :" + poppedObj);
		for(Object obj : dataValues)
			System.out.println(obj);
		
		System.out.println("=======================");
		Object peekedObj = dataValues.peek();
		System.out.println("Peeked Object is :" + peekedObj);
		for(Object obj : dataValues)
			System.out.println(obj);
		
		
	}

}
