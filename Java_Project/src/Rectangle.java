public class Rectangle extends Shape{

public Rectangle() {
}

@Override
public void erase() {
	System.out.println("Erasing the shape using the eraser");
}

@Override
public void draw() {
System.out.println("Drawing rectangle using scale");
}

@Override
public void findArea() {
System.out.println("Finidng the area using formula l*b");
}

}