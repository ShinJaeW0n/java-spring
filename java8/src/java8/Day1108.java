package java8;

import java.util.Scanner;

public class Day1108 {
			/* 2개의 정수를 입력받아서 큰값과 작은값 출력 
			 * 반드시 if~else를 사용하세요.
			 */
			public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				System.out.print("정수를 2개 입력하라: ");
				int[] a = new int[2];
				for(int i =0; i < a.length; i++) {
					a[i] = sc.nextInt();
				}
				
				if(a[0] > a[1]) {
					int temp = a[0];
					a[0] = a[1];
					a[1] = temp; //이렇게 하면 무조건 앞에꺼가 작은값이 된다.
				}
				System.out.println("작은값: " + a[0] + ",  큰 값: " + a[1]);
				sc.close();
				
				
				
//				Scanner sc = new Scanner(System.in);
//				System.out.print("1번 정수를 입력하라: ");
//				int a = sc.nextInt();
//				
//				System.out.print("2번 정수를 입력하라: ");
//				int b = sc.nextInt();
//				
//				int min = 0;
//				int max = 0;
//				
//				if(a>b) {
//					a = max;
//					b = min;
//					System.out.println("큰 수: " + max + " 작은수: " + min);
//				
//				}else {
//					b = max;
//					a = min; 
//					System.out.println("큰 수: " + min + " 작은수: " + max);
//				}
//				
//			sc.close();
				
				
				
	}
}
