package java8;

import java.util.Scanner;

public class Day07test15 {

		public static void main(String[] args) {
			/*1부터 100까지 중에 5의 배수의 합을 출력하세요.*/
			int sum = 0;
			
			for (int i = 1; i <= 100; i++) {
				if (i % 5 == 0) {
					sum +=i;
					
				}
				
				} System.out.println("1부터 100까지의 수 중 5의 배수의 합: " + sum);
			
		//1에서 50 중에 3의 배수를 화면에 출력하세요.
				
				
				
				for (int i = 1; i <= 50; i++) {
					if ( i % 3 == 0) {
						System.out.println(i);
						
					}
			}
				
			/*1에사 50 중에 3의 배수의 총 합과 개수를 출력하세요.*/
				int sum2 = 0;
				int cnt = 0;
				
				for (int i = 1; i<=50; i++) {
					if(i % 3 == 0) {
						sum2 += i;
						cnt++;
						}
						
					}System.out.println("1부터 50까지 수 중 3의 배수의 합 :" + sum2 
							+ " 개수는? : " + cnt);
					
				
				
		}
}
		


