package collection_framework;

import java.util.Vector;

public class VectorExampleMain {

	public static void main(String[] args) {
		Vector dataValues = new Vector();
		System.out.println("New size :" + dataValues.size());
		System.out.println("Current size :" + dataValues.capacity());
		dataValues.add(75);
		dataValues.add(75);
		dataValues.add(75);
		dataValues.add(85);
		dataValues.add(95);
		System.out.println("New size :" + dataValues.size());
		System.out.println("New capacity :" + dataValues.capacity());
		
		for(int x=101;x<=108;x++)
			dataValues.add(x);
		System.out.println("Final Size :" + dataValues.size());
		System.out.println("Final Capacity :" + dataValues.capacity());
	}

}
