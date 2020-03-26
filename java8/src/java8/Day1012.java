package java8;

import java.util.Scanner;

public class Day1012 {
	public static void main(String[] args) {
		//5개의 정수를 입력받아 최대값을 구하기.
		
		//쌤이 한거
		System.out.print("5개의 정수를 입력받아 최대값을 구하는 프로그램: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 정수를 입력하세요: ");
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE; // int값의 제일 작은 값
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
		}
		System.out.println("최대값: " + max);
		
		
		
		
		
		
//		System.out.print("5개의 정수를 입력받아 최대값을 구하는 프로그램: ");
//		Scanner sc = new Scanner(System.in);
//		
//		
//		
//		int[] number = new int[5]; 
//		int max = number[0];
//		int num;
//						
//		for(int i=0; i<number.length; i++) {
//			num = sc.nextInt();
//			number[i] = num;
//			
//			if(number[i] > max) {
//				max = number[i];
//			}
//			
//		}
//			System.out.println("최대값은 " + max + "입니다." );
		
		
	
	
	
	}

}
