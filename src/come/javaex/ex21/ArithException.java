package come.javaex.ex21;

import java.util.Scanner;

public class ArithException {
	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("NUM:");
		num = sc.nextInt();
		try {
			result = 100/num;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요.");
		} finally {
			System.out.println("Finally영역0");
		}
		sc.close();
	}
}
