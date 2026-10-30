package exception_handling;

public class NameCollection {
private static String[] names={
"Kashyap",
"Manas",
"Anish",
"Preeti",
"Shreeya"
};
public static int getPosition(String name) throws NameNotFoundException{
int position=-1;
for(int index=0;index<5;index++) {
String nm=names[index];
if(nm.equals(name)) {
position=index;
break;
}
}
if(position==-1) {
NameNotFoundException nx= new NameNotFoundException(name, "The entered name is not availble");
throw nx;
}
return position;
}
}