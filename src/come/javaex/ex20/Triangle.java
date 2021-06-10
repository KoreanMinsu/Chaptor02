package come.javaex.ex20;

public class Triangle extends Shape implements Drawable{
//field
	private int width;
	private int height;
	
//constructor
	public Triangle() {
		//System.out.println("Triangle()");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		//System.out.println("Triangle(4)");
	}

//method-g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
//method-generic
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색: "+this.fillColor+", 선색: "+this.lineColor+ ", 변의 길이1: "+ width+", 변의길이2: "+height+"] 삼각형을 그렸습니다.");
	}
	
	public double area() {
		return (width*height)/2;
	}
}
