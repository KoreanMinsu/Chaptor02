package come.javaex.ex17;

public class ShapeApp {
	public static void main(String[] args) {
		
		//parents class test
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();
		
		//rectangle test
		/*
		 * Rectangle r01 = new Rectangle("빨간맛"," 검정치마",3,3); //constructor oder Shape(2) -> Rectangle(4) 
		 
		System.out.println(r01.toString());
		r01.draw();
		*/
		//array
		Rectangle[] rArray = new Rectangle[3];
		//rectangle
		Rectangle r01 = new Rectangle("빨간맛"," 검정치마",3,3);
		Rectangle r02 = new Rectangle("주황맛"," 검정치마",4,4);
		Rectangle r03 = new Rectangle("매운맛"," 검정치마",5,5);
		
		//array<- rectangle
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		//draw with array
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		//circle manage
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("매운맛","검정",3);
		Circle c02 = new Circle("중간맛","파랑",4);
		Circle c03 = new Circle("약간 매운맛","노랑",3);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		System.out.println(cArray[0]);
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		//triangle manage
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] = new Triangle("매운맛","검정",3,90,45);
		tArray[1] = new Triangle("덜매운맛", "노랑", 6,45,45);
		tArray[2] = new Triangle("보통맛", "빨강", 12,30,30);
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}
}
