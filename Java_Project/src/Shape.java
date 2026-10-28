
public abstract class Shape {
	
	public abstract void draw();
	
	public abstract void findArea();
	
	public void erase() {
		System.out.println("Erasing the shape using the eraser");
	}
	
	public Shape() {
		
	}
}
