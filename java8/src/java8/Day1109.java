package java8;

import java.util.Scanner;

public class Day1109 {

	/*키보드로부터 두 개의 정수값을 입력받아서, 곱을 구하는 프로그램 작성하기
	 * 단 입력받은 두 수의 곱이 500을 초과하면 프로그램 중단, while, do while 사용하기. */
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("2개의 정수를 입력하라: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			//2개의 값을 받음.
			int res = num1*num2;
			System.out.println(num1 + "x" + num2 + "=" + res);
			
			if(res > 500) {
				break;
			}
			
			
			}System.out.println("결과 값이 500을 초과하여 프로그램을 종료합니다.");
			sc.close();
			
			
			
			
			
			
			
			
			
			

			
//			System.out.print("2번정수값을 입력하라: ");
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			int c = a*b;
//			
//			do { 
//
//			 if(c>500){System.out.println("결과 값이 500을 초과하여 프로그램을 종료합니다.");	
//			}
//			
//			System.out.print("정수 값을 입력하시오: ")
//			
//			}while(c > 500);
//			System.out.print(a + "x" + b + "=" + c)
//			
			
		}
		}









