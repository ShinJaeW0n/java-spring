package java8;

import java.util.Scanner;

public class Day2 {
	public static void main (String[] args) {
		Scanner ch = new Scanner(System.in);
		//스캐너 입력해주고 임포트 해주기.
		int number1 , number2 , result;
		
		//화면에 number1과 number2를 입력하도록 안내문구를 출력해 주세요.
		System.out.println("number1과 number2의 값을 차례대로 넣어주세요.");
		System.out.println("공백과 엔터로 값을 구분해주세요.");
		
		//작성된 스캐너로 number1과 number2의 값을 입력하세요.(nextInt() 사용해야함)
		number1 = ch.nextInt();
		number2 = ch.nextInt();
		
		//number1과 number2의 합계를 출력해주세요.
		result = number1 + number2;
		
		System.out.print("두 값의 합계는");
		System.out.print( result);
		System.out.print("입니다.");
		
		ch.close();
		
		
	}		
}
