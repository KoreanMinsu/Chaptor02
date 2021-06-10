package come.javaex.ex19;

public abstract class Shape {

	// 필드
	protected String fillColor;
	protected String lineColor;

	// 생성자
	public Shape() {
		// System.out.println("Shape()");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		// System.out.println("Shape(2)");
	}

	// 메소드-gs
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

	// 메소드-일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		// [면색:빨강, 선색:검정] 도형을 그렸습니다.
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + "] 도형을 그렸습니다.");
	}

	public abstract double area();
}
