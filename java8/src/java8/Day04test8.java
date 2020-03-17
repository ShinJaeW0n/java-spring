package java8;

import java.util.Scanner;

public class Day04test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n , m;
		
		System.out.println("n의 값을 입력: ");
		n = sc.nextInt();
		System.out.println("m의 값을 입력: ");
		m = sc.nextInt();
		
		String stra = "n(" + n + ")";
		String strb = "m(" + m + ")";
		
		System.out.println("입력 : " + stra + " , " + strb);
		
		
		String result = n >= m ? stra : strb ; 
		System.out.println("결과: " + result);
		
		//System.out.println("n의 값: " + n + "m의 값" + m);
		//int x = (n>m)? n:m;
		//System.out.println("결과:" + x); 
		
	}

}
