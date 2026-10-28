
public class SimpleArrayMain {

	public static void main(String[] args) {
		
		//Declaring the array
		float[] temperatures = new float[5];  //this array contains default value ( 0.0f )
		
		//Initialization the array
		temperatures[0] = 34.45f;
		temperatures[1] = 17.85f;
		temperatures[2] = 15.23f;
		temperatures[3] = 40.45f;
		temperatures[4] = 12.32f;
		
		int size = temperatures.length;
		System.out.println("Size :" + size);
		
		//Performing Iterations on the array to fetch values and print them
		for(int index = 0;index < size; index++) {
			float temp = temperatures[index];
			System.out.println(temp);
		}
		
		System.out.println("==========================");
		
		//Performing Iterations on the array to fetch values and print them using for each array
		for(float tmp : temperatures) 
			System.out.println(tmp); 
		//this for loop is used for fixed length, u cannot do manipulate data 
		
	}

}
