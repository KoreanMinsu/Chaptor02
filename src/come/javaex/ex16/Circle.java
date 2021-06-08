package come.javaex.ex16;

public class Circle {
//filed
	private String fillColor;
	private String lineColor;
	private int radius;

//constructor
	public Circle() {
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}
	
//method -g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	
//method-generic
	public void draw() {
		System.out.println("면색 : " + fillColor + ", 선색 : " + lineColor + ", 반지름 : " + radius + "] 을 그렸습니당");
	}
}
