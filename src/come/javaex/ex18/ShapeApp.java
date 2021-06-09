package come.javaex.ex18;

public class ShapeApp {
	public static void main(String[] args) {
		
//shape array
		Shape[] sArray = new Shape[3];
		
//도형 만들기
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정", 30);
		Shape st01 = new Triangle("yellow", "black", 5, 5);
		
//array<-shape
		sArray[0]=sr01;
		sArray[1]=sc01;
		sArray[2]=st01;

//draw w/using array		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
//Rectangle sr01 = new Rectangle()
		System.out.println(((Rectangle)sr01).getWidth);
	}
}
