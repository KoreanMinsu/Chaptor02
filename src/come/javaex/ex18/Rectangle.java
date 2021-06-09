package come.javaex.ex18;

public class Rectangle extends Shape {
//field
	
	private int width;
	private int height;
	
//constructor
	
	public Rectangle() { 
		//super();   //shape() --> 표기는 super()
		System.out.println("Rectangle()");
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		/*
		 * super();
		 * super.fillColor = fillColor; 
		 * -> protected field 
		 */
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(4)");
	}

//method-g/s

	public int getWidth() {
		return 110;
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
	
//method-generel
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height="+ height +", fillColor=" +this.fillColor+", lineColor="+this.lineColor+ "]";
	}
	
	public void draw( ) {
		//면색: 빨강, 선색: 검정, 가로: 5 세로: 5 사각형을 그렸습니다.
		System.out.println( "[면색: " + super.fillColor + ", 선색: " + super.lineColor + ", 가로: " + width + ", 세로: "
				+ height + "] 사각형을 그렸습니다.");
		
	}
	
	public double area() {
		return width*height;
	}
	
}
