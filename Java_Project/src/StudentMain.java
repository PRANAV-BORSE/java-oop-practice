
public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();
		std.rollNo = 12;
		std.name = "Brooke";
		std.percentage = 85.32f;       //or (float)85.32
		//float = (4) bytes, double = (8) bytes
		
		Student std2 = new Student();
		std2.rollNo = 13;
		std2.name = "Harry";
		std2.percentage = 70.84f;  
		
		System.out.println("Printing first student data:");
		System.out.println("Roll No :" + std.rollNo);
		System.out.println("Name :" + std.name);
		System.out.println("Percentage :" + std.percentage);
		
		System.out.println("-------------------------------");
		
		System.out.println("Printing Second student data:");
		System.out.println("Roll No :" + std2.rollNo);
		System.out.println("Name :" + std2.name);
		System.out.println("Percentage :" + std2.percentage);
	}

}
