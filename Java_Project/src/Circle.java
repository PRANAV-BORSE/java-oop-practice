public class Circle extends Shape {

public Circle() {
// TODO Auto-generated constructor stub
}

@Override
public void draw() {
System.out.println("Drawing Circle using scale");
}

@Override
public void findArea() {
System.out.println("Finidng the area using formula Pi R Square");
}
}


final class SemiCircle extends Circle {

}
