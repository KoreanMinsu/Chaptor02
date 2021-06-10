package come.javaex.ex20;

public class ShapeApp {
	public static void main(String[] args) {

		/*
		 * Point p01 = new Point(5,5); p01.draw();
		 * 
		 * Drawable dp01 = new Point(10,10); dp01.draw();
		 */

		// 배열Drawable[] 만들기
		Drawable[] dArray = new Drawable[4];

		// 도형
		Drawable r01 = new Rectangle("Red", "Black", 7, 7); // draw() 만 쓸수 있다.
		Drawable c01 = new Circle("Orange", "Ornage", 5);
		Drawable t01 = new Triangle("Yellow", "Black", 15, 15);
		Drawable p01 = new Point(100, 100);
		// 배열<- 도형
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;

		// 배열 Draw
		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}

		// 사각형 면적 출력
		// System.out.println(((Rectangle)r01).area());
		// System.out.println(((Shape)r01).area());

		// 배열로 area 출력
		for (int i = 0; i < dArray.length; i++) {
			if (dArray[i] instanceof Shape) {
				System.out.println(((Shape) dArray[i]).area());
			}
		}

	}
}
