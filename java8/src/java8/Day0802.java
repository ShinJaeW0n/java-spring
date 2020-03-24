package java8;

import java.util.Scanner;

public class Day0802 {
	public static void main(String[] args) {
		//헬로월드 0부터~9까지 출력하기
	for(int i = 0; i<10; i++) {
		System.out.println("hello world " + i);
		}
	
	System.out.println();
	
	//위 결과물을 반전시켜서 역순으로 출력하기
	for(int i = 9; i>=0; i--) {
		System.out.println("hello world " + i);
	}
		
	
	
	// 중첩 포문 이용해서 @를 5개씩 7줄 출력하기
	for (int i = 0; i<7; i++) {
		for(int j = 0; j<5; j++) {  //j는 5보다 작을 때까지 반복한다.
			System.out.print("@");
			
		}System.out.println();
		}
	
	System.out.println();
	
	//@를 5개씩 7줄 출력하기
	for (int i = 0; i < 7; i++) {
		System.out.println("@@@@@");
	}
	
	System.out.println();
	
	
	//위의 출력문에서 2,4열은 # 1,3,5열은  @
	for(int i =0; i<7; i++) {
		for(int j = 0; j<5; j++) { //5열(칸) 7행(줄)짜리가 출력된다. 
			if(j % 2== 0) {
				System.out.print("@"); //숫자를 0부터 세기 때문에 0이 먼저 시작되므로 홀수@를 넣어줘야함.
			}else {System.out.print("#");
			
			}
			}
		System.out.println();//내부 포문 끝나는 지점.
	}
	
	
	
	//문자열을 입력받아서 for 문으로 출력하기

	Scanner sc = new Scanner(System.in);
	System.out.print("문자열을 입력해주세요: ");
	String str = sc.nextLine();
	
	for(int i = 0; i < str.length(); i++) {
		System.out.println(str.charAt(i)); //문자열 한글자씩 잘라서 출력해주는 구문.
	}
	System.out.println();
	
	
	}
}
