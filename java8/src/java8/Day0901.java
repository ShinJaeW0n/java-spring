package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0901 {

	public static void main(String[] args) {
		/* 1부터 100 중에 랜덤하게 정답을 설정한다.
		 * 입력한 값이 정답보다 크면 "up" 작으면 "down" 으로 출력합니다. 
		 * 최대 횟수는 10회로 설정합니다.
		 * 게임 적 요소를 위해 점수를 출력합니다.*/
		
		
		//변수선언
		int number = (int) (Math.random() * 100) + 1; // 원래는 실수가 나와서 정수로 강제 형변환 해줌.
		int inputNum = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		
		//게임실행
		long startTime = System.currentTimeMillis();
		
		
		while (true) {
			
			//유저입력
			do {
				if (inputNum != 0) {
					System.out.println("잘못 입력하셨습니다.");
				}

				System.out.print("정수를 입력해주세요(1~100): ");
				inputNum = sc.nextInt();
			} while (inputNum < 1 || inputNum > 100);
			
			//결과출력
			cnt++; //do while을 반복할때마다 1회씩 증가한다.
			if (number == inputNum) {
				System.out.println("정답입니다." + cnt + "회 입력하였습니다.");
				break; //최종점수를 출력해야해서. if문을 빠져나오고 마지막 프린트문이 출력되게 하려고.
			} else if (number > inputNum) {
				System.out.println("UP!" + cnt + "회 입력하였습니다.");
			} else {
				System.out.println("Down!" + cnt + "회 입력하였습니다.");

			}
			if (cnt == 10) {
				System.out.println("최종점수는 0 점입니다. 게임을 종료합니다.");
				System.exit(0);
			}

		} 
		
		//점수계산
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000; //초로 표현하기 위해서. 밀리초 -> 초
		
		//3분안에 게임이 끝나는걸로 상정해서		//180.0으로 나누지 않으면 0이 나온다.
		//원하는 시간-playtime, 1분이라면 60 2분이라면 180 , 빨리 맞출수록 고득점이 나오게된다.
		double score = (180 - playTime) / 1.8; // <-100분의 180 / %로 나오게 하기위해서. 
		//3분을 넘기게 되면 0점이 나온다. 빨리 풀수록 점수가 높아지게 하기 위해서.
		
		
		
		//또는 이렇게 해도됨.
		//long score = (long) ((180 - playTime) / 18000.0);
		
		System.out.println("최종점수는: " + score + " 점 입니다. 게임을 종료합니다.");
		

	}
}
