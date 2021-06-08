package come.javaex.ex16;

public class ShappApp {
	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "검정", 6, 6);
		Rectangle r03 = new Rectangle("초록", "검정", 7, 7);

		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열 이용 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//원관리
		Circle[] cArray = new Circle[3];
		
		//변수를 만들지 않고 바로 배열에 저장		
		cArray[0] = new Circle("red", "black", 11);
		cArray[1] = new Circle("yelow", "black", 11);
		cArray[2] = new Circle("green", "black", 11);
		
		//배열이용 원그리기
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		/* 변수이용 면색 변경
		 * r01.setFillcolor("파랑");
 		 * r02.setFillcolor("파랑");
		 * r03.setFillcolor("파랑");
		 */
		
		//배열이용 면색 변경
			for(int i=0; i<rArray.length; i++) {
				rArray[i].setFillColor("파랑");
			}
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
			
		
	}
}
