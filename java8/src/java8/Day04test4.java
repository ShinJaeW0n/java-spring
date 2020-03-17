package java8;

import java.util.Scanner;

public class Day04test4 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double pi = 3.14159;
			
			System.out.println("반지름을 입력하세요:");
			int r = sc.nextInt();
			System.out.println("원주의 값 :");
			
			double result = 2*pi*r;
			System.out.println(result);
			System.out.println("원주의 값 :");
			
			result = 2*Math.PI*r;
			System.out.println(result);
			
			sc.close();
		}
}

