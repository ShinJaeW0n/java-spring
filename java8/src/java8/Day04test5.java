package java8;

import java.util.Scanner;

public class Day04test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//String st = "";
		 
		
		System.out.println("이름, 학번, 토플 점수를 입력하세요: ");
		String name = sc.next(); //공백을 사용하여 //라인-공백까지도 한개의 데이타로 인식.
		
		//st = sc.next();
		System.out.println("나의 이름은 " + name + " 입니다.");
		
		int no = sc.nextInt();
		System.out.println("학번은 " + no + " 입니다.");
		
		int score = sc.nextInt();
		System.out.println("그리고 토플점수는 " + score +" 점입니다.");
		
		sc.close();
	}
}

