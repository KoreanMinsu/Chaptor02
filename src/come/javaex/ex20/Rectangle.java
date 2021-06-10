package come.javaex.ex20;

public class Rectangle extends Shape implements Drawable{
//field
	
	private int width;
	private int height;
	
//constructor
	
	public Rectangle() { 
		//super();   //shape() --> 표기는 super()
		//System.out.println("Rectangle()");
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
		//System.out.println("Rectangle(4)");
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
		return "Rectangle [width=" + width + ", height="+ height +", fillColor=" +this.fillColor+", lineColor="+this.lineColor+ "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
				           ", 가로:" + width + ", 세로:" + height + 
				           "] 사각형을 그렸습니다. " );
	}
		
	
	public double area() {
		return width*height;
	}
	
}
