package java8;

import java.util.Scanner;

public class Day0612 {
		public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		//do구문을 한번 실행하고 while로 감. 
		//while문 이었다면 do구문은 실행 안됐을것.
		
		do {System.out.println(" > ");
			inputString = sc.nextLine(); //한줄입력
			System.out.println(inputString);
			
		}while (!inputString.equals("q"));//!인풋에 저장된게 q가 아니라면
		System.out.println();
		System.out.println("프로그램 종료");
		
		}
}


