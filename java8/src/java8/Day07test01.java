package java8;

import java.util.Scanner;

public class Day07test01 {	
		public static void main (String[]args) {
		
			//2개의 정수를 입력받아 서로 같다면 same 다르면 different 출력.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("두 개의 정수를 입력해주세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			//내가 한 코드.
//			System.out.print("첫번째 정수를 입력하세요: ");
//			int num1 = sc.nextInt();
//			System.out.print("두번째 정수를 입력하세요: ");
//			int num2 = sc.nextInt();
			
			if(num1==num2) {
				System.out.println("Same");
			} else {
				System.out.println("Different");
			}
			
//			삼항연산자를 사용해볼때(한 줄만 출력해볼거라면)
//			String result = num1 == num2 ? "같음" : "다름";
//			System.out.println(result);
//			sc.close();
			
			
			sc.close();
			
		}

}
