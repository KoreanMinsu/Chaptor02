package come.javaex.ex21;

public class Ex02 {
	public static void main(String[] args) {
	//ArrayIndexOutOfBoundsException	
		int[] intArray = new int[3];
		
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 2;
		
		try {
			System.out.println(intArray[3]);	
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
	}
}
