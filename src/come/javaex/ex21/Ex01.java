package come.javaex.ex21;

public class Ex01 {
	public static void main(String[] args) {
//NullPointerException		
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5,5);
		

		r01 = null;
		
		try {
			r01.draw();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			
		}
		
		
	}
}
