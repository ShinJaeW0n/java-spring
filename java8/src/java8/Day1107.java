package java8;

import java.util.Scanner;

public class Day1107 {

	public static void main(String[] args) {
		//0부터 입력받은 값까지
		//1개의 정수를 입력받아서 5의 배수의 개수와 합을 출력
		//출력내용: 입력받은 값, 5의 배수의 개수, 5의 배수의 합.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 1개 입력하시오: ");
		int num = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		for(int i = 1; i <= num ; i++) {
			if (i % 5 == 0) {
				cnt++;
				sum+=i;
			}
		}
		
		//포문 빠져나와서.
		System.out.println("5의 배수의 갯수는: " + cnt + " 개");
		System.out.println("5의 배수의 합계는: " + sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하시오: ");
//		int me = sc.nextInt();
//		int sum = 0;
//		int cnt = 0;
//		
//		for(int i = 0; i <= me ; i++) {
//			if (i % 5 == 0){
//				cnt++;
//				System.out.println("5의 배수의 갯수는: " + cnt + " 개");
//				sum+=i;
//				System.out.println("5의 배수의 합계는: " + sum);
//			}else { 
//				break;
//			}
//		System.out.println();
//		
//		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
