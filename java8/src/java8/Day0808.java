package java8;

import java.util.Scanner;

public class Day0808 {
	public static void main(String[] args) {
	
		//두 수를 입력받아 두 수의 최대공약수, 최대공배수를 출력하라.
		//두 수의 곱은 최대공약수*최소공배수
		//3 12 => [3, 12] 2 5 =>[1,10]
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0; //최소공배수
		int max = 0; //최대공약수
							
		
						//12억 숫자끝까지 가는것.
		for (int i=1; i<=Integer.MAX_VALUE; i++) {
			if(i % a == 0 && i % b == 0) {
				min = i; //최소공배수
				break; //12억 끝까지 갈 필요가 없어서
			}
		}
		
		max = a * b / min;
		System.out.println("최소공배수 " + min + ", 최대공약수" + max);
		sc.close();
		
		
		
		
//		min = a*b;
//		max = a/b;
//		System.out.println("최대공약수" + min/a);
//		System.out.println(max/b);
	
	}
}
