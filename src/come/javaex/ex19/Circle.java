package come.javaex.ex19;

public class Circle extends Shape{
//field
	private int radius;

//constructor
	
	public Circle() {
		super();
		System.out.println("Circle()");
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
		System.out.println("Circle(3)");
	}
	
//method-g/s	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

//method - generic
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
				           ", 반지름:" + radius + "] 원을 그렸습니다. " );
	}
	
	public double area() {
		return radius*radius*3.14;
	}
}
