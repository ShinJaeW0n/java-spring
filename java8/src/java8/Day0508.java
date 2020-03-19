package java8;

import java.util.Scanner;

public class Day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 등급을 입력해주세요: ");
		String grade = sc.next();
		
		
		//자바는 다른 언어와 다르게 switch 케이스 에서 string 문자열도 사용가능하다.
		switch(grade) {
		case "s" : 
		case "S" : 
			System.out.println("당신은 VIP 입니다.");
			break;
			
		case "a" : 
		case "A" : 
			System.out.println("당신은 우대고객 입니다.");
			break;
		
		case "b" : 
		case "B" : 
			System.out.println("당신은 우수고객 입니다.");
			break;
			
		default: 
			System.out.println("당신은 일반고객 입니다.");
			
			}
		
	}
}
