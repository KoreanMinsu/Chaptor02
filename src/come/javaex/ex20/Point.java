package come.javaex.ex20;

public class Point implements Drawable {
//field
	private int x;
	private int y;

//constructor
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//method - g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

// method - generic
	public void draw() {
		System.out.println("[x=" + x + ",y=" + y + "] 점을 그렸습니당");
	}
}
