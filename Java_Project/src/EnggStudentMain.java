
public class EnggStudentMain {

	public static void main(String[] args) {
		EnggStudent st = new EnggStudent();
		st.assignValues(101, "harry", "Mech");
		st.printValues();
		
		System.out.println("---------------------------");
		
		st.setBranch("Comp. Sci");
		st.printValues();
		
		System.out.println("---------------------------");
		
		String studentName = st.getName();
		System.out.println(studentName);
		System.out.println(st.getName());
		
		
		
	}

}
