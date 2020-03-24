package java8;

import java.util.Scanner;

public class Day0807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("a와b의 값을 차례대로 입력하세요:");
		int a = sc.nextInt(); 
		int b = sc.nextInt();

//		이 구문도 가능하지만 밑에 !반전 구문이 더 자주쓰인다.	
//		if(a >= -10_000_000 && a <= 10_000_000) {
//		}else {
//			System.out.println("입력범위를 초과하였습니다.");
//			System.exit(0);
//		}
		
		
		//-천만 ~ 천만 까지만 입력할 수 있다는 것을 알려주는 것.
		if(!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.println("a 값의 입력범위를 초과하였습니다.");
			System.exit(0);
		}
		
		if(!(b >= -10_000_000 && b<= 10_000_000)) {
			System.out.println("b 값의 입력범위를 초과하였습니다.");
			System.exit(0);
		}
		
		
		
		int min =0 , max =0 , sum =0;
		
		
		if(a>b) {
			max = a;
			min = b;
		}else if(a==b){
			System.out.println("a부터 b까지의 값: " + a);
			System.exit(0);
		}else {
			max = b;
			min = a;
		}
		
		for (int i = min; i<=max; i++) {
			sum+=i;
		}
		
		System.out.println("a부터 b까지의 값: " + sum);
		
		
//		for (int i = 0; i>=a; i++) {
//			
//		
//		if(a<b) {
//			System.out.println(a+i+b);
//		}else if (a>b) {
//			System.out.println(a+b+i);
//		}else if(a==b) {System.out.println(a);
//			
//		}else {break;
//		}
//		
//		}
//	
	
	
	
	}
}
