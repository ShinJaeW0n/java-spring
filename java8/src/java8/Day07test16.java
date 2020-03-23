package java8;

import java.util.Scanner;

public class Day07test16 {
	
	//구구단을 2단부터 9단까지 출력하세요
	//중첩 포문
		public static void main(String[] args) {
			
		for(int i = 2; i <= 9; i++) {
		for(int j = 1; j <= 9; j++) {
						
		System.out.print(i + "x" + j + "=" + (i*j) + "\t");
		}
		System.out.println();
		}
				
		
		/*몇 단을 출력할지 입력받아서 출력해주세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할건가요?: ");
		int r = sc.nextInt();
		System.out.println(r + "단 출력");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(r + "x" + i + "=" + (r*i));
			}
		
		sc.close();
		}
		
				
	}


