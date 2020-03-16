package java8;

import java.util.Scanner;

public class Day2020 {
	public static void main(String[] args) {
		//스캐너를 작성하세요
		//Scanner ch = new Scanner(System.in); 
		Scanner ch = new Scanner(System.in);		
		
		
		//int number1 , number2;
		int number1 , number2;
		
		System.out.println("number1 + number2의 값을 차례대로 넣어주세요.");
		System.out.println("공백이나 엔터키로 값을 구분해주세요.");
		
		
		number1 = ch.nextInt();
		number2 = ch.nextInt();
		
		int result = number1 + number2;
		
		System.out.print("두 값의 합계는");
		System.out.print(result);
		System.out.print("입니다.");
		
		ch.close();
		
	/*	number1 = 10;
		number2 = 20;
		
		number1 + number2;
		
		System.out.println("값을 일력하세요:");
		System.out.printf(number1 + number2, ch.nextInt());
		
		ch.close();
		
		*/
	}
}
