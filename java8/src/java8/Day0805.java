package java8;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		/*
		 * 몇 줄을 출력할지 입력받아서
		 *@
		 *@@
		 *@@@
		 *@@@@
		 *@@@
		 *@@
		 *@
		 *위와 같은 형태로 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄 출력할건지(홀수만 입력): ");
		int r = sc.nextInt();
		if(r % 2 ==0) {
			System.out.println("짝수 입력. 프로그램 종료");
			System.exit(0);
		}
		int upLine = r/2;
		int downLine = r-upLine;
		
		for(int i=0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}System.out.println();
		}
		
		for(int i=downLine; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("@");
			}System.out.println();
		}
		
		
		
		
//		System.out.println();
		
//		for (int i = 0; i<r; i++) {
//			for(int j = 0; j<=i; j++) {
//				System.out.print("@");
//			}System.out.println();
//		}
//		
//		for (int i = r; i>0; i--) {
//			for(int j = 0; j<i; j++) {
//				System.out.print("@");
//			}System.out.println();
//		}
		
		
		
	}
	
}
