package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {
	public static void main(String[] args) {
		// 난수를 사용해서 구구단 문제를 출력하고, 답을 입력하도록 작성하세요
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int r, r2, quiz, answer;
		
		//현재 시간 구하기 //long형은 소문자로 적어야한다.
		long startTime = System.currentTimeMillis(); //밀리스 = 밀리세컨. 1000분의 1초.값이 1000이면 1초
		//Long startTime = System.nanoTime(); //10의 9승을 이용한다. 10억이 되면 1초.
		//System.out.println(startTime);
		
		//총 10번이 반복
		for (int i = 0; i <= 10; i++) {
			r = (int) (Math.random() * 8 + 2); // 0부터 9까지 나오게 될것이다.
			r2 = rd.nextInt(9) + 1; // 0부터 9까지

			quiz = r * r2;
			System.out.print(r + "x" + r2 + "=");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 게임을 종료합니다.");
				//break; 틀렸을때 종료하는 구문
				System.exit(0); 
			} 

		} 
		
		long endTime = System.currentTimeMillis();
		System.out.println("[게임진행시간]");
		System.out.println(endTime - startTime + "ms"); //ms = 밀리세컨
		
	//이 공식 겁나 많이쓴다. 끝난시간 - 시작한시간 = 진행한 시간***
	}
}