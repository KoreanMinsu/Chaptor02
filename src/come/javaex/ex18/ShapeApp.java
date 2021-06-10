package come.javaex.ex18;

public class ShapeApp {
	public static void main(String[] args) {

		// 배열을 만든다.
		Shape[] sArray = new Shape[3];

		// 도형을 만든다
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정", 5);
		Shape st01 = new Triangle("노랑", "검정", 30, 30);

		// 배열<--도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;

		// 배열을 이용해서 그리기
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();

			// 오버라이딩을 이용해서 구현할 수 있다
			System.out.println("넓이:" + sArray[i].area());

		}

		// 오버라이딩 부작용-->추상클래스, 추상메소드 해결
		Shape ss01 = new Shape("검정", "검정");
		System.out.println("Shape 넓이:" + ss01.area());

		// 캐스팅
		// Rectangle sr01 = new Rectangle("빨강", "검정", 10, 10);
		System.out.println(((Rectangle) sr01).getWidth());
	}
}
