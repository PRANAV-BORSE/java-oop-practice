package exception_handling;

public class NameNotFoundException extends Exception{
private String invalidName;

public NameNotFoundException(String invalidName , String errorMessage) {
super(errorMessage);
this.invalidName = invalidName;
}
@Override
public String getMessage() {
return super.getMessage()+" "+"invalid Name";
}

}