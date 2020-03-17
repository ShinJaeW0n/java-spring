package java8;

import java.util.Scanner;

public class Day04test7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n , m;
		int temp;
		
		
		System.out.println("입력N: ");
		n = sc.nextInt();
		
		System.out.println("입력M: ");
		m = sc.nextInt();
		
		System.out.println("교환 전: N = " + n + "  , M = " + m);
		
		
		//값을 교환하는 swap code가 필요. (n =10, m=20으로 가정)
		//n = m;
		//m = n; <-이렇게 출력되면 m이 n과 똑같은 수가 나온다.
		
		temp = n;
		n = m;
		m = temp;
		
		//주로 오름차순, 내림차순같은 정렬에 사용됨.**
		
		System.out.println("교환 후: M = " + m + "  , N = " + n);
	}

}
