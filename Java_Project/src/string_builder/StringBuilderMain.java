package string_builder;

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();  //creates an empty string builder
		builder.append("Today is Thursady and it is day no.");
		builder.append(4);
		builder.append(". Usually we have lunch break at ");
		builder.append(1.30f);
		builder.append("pm. Are you enjoying this training ?");
		builder.append(true);
		
		System.out.println(builder); //Invokes toString()  from stringBuilde.
	} 
}
 