package come.javaex.ex17;

public class Triangle extends Shape{
//field
	private int width;
	private int angle1;
	private int angle2;
	
//constructor
	public Triangle() {
		System.out.println("Triangle()");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int angle1, int angle2) {
		super(fillColor, lineColor);
		this.width = width;
		this.angle1 = angle1;
		this.angle2 = angle2;
		System.out.println("Triangle(5)");
	}

//method-g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getAngle1() {
		return angle1;
	}

	public void setAngle1(int angle1) {
		this.angle1 = angle1;
	}
	
	public int getAngle2() {
		return angle2;
	}

	public void setAngle2(int angle2) {
		this.angle2 = angle2;
	}
	
//method-generic
	public void draw() {
		System.out.println("[면색: "+this.fillColor+", 선색: "+this.lineColor+ ", 변의 길이: "+ width+", 각도1:"+angle1+", 각도2: "+angle2+"] 삼각형을 그렸습니다.");
	}
}
