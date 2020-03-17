package java8;

import java.util.Random;

public class Day0304 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		int res1 = num1 + num2; // 10+3
		int res2 = num1 - num2; // 10-3
		int res3 = num1 * num2; // 10*3
		int res4 = num1 / num2; // 10/3 .int가 정수값이라 3만 나옴.
		int res5 = num1 % num2; // 10%3 .나누고 남은 값
		double res6 = num1 / num2; //정수 연산은 정수를 출력합니다.
		double res7 = (double)num1 / num2; //num1이 강제형변환하면서 num2는 자동형변환됩니다.
		//같은 형태끼리만 연산이 되기 때문.
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		System.out.println(res7);
		
		int res8 = num1 % 2;
		System.out.println(res8);
		
		Random rd = new Random(); //컨+쉬+O 인포트해줘야함.
		int num3 = rd.nextInt();
		System.out.println(num3); //int 범위안의 숫자들이 랜덤으로 나옴.
		int res9 = Math.abs(num3) % 45 + 1; //Math.abs 무조건 양수로 나오게 함.
		//0부터 45까지 나오게함. +1은 1부 터 45까지 나오게 하려고
		
		
		System.out.println(res9);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
