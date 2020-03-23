package java8;

import java.util.Scanner;

public class Day07test02 {
	
	//1개의 정수를 입력해서 그 정수가 짝수와 홀수인지 판별하는 코드.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자입력 :");
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		//삼항연산자를 이용하려면 2가지 변수가 나와야함.
//		String r = (int)(r % 2 == 0 ?) "짝수":"홀수";
//		System.out.println(r);

		sc.close();
	}

	
}
