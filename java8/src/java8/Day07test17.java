package java8;

import java.util.Random;
import java.util.Scanner;

public class Day07test17 {

	public static void main(String[] args) {
		// 가위바위보 게임, 시작시 라이프 3개, 점수0점, 유저 승리시 100점 추가, 비겼을 시 10점 추가,
		// 컴퓨터 승리시 라이프 1개 감소 , q를 입력받으면 프로그램을 종료합니다. 라이프가 0개면 총점을 출력하세요.
		// static final - 값을 고정해놓는것.
		// 컴퓨터는 랜덤 해주기.

		// final - 값에 변형을 줄 수 없다.
		String user = "";
		String com = "";
		final String ga = "가위";
		final String ba = "바위";
		final String bo = "보";
		int score = 0;
		int life = 3;

		Scanner sc = new Scanner(System.in);
		
		//게임 판별문이 끝나는 곳까지 while 문으로 닫아줌.
		while (true) {
			// 유저값 입력문
			do {
				System.out.println("가위바위보 게임을 시작합니다. 1 = 가위, 2 = 바위, 3 = 보, 4 = 종료 ");
				System.out.print("무엇을 내시겠나요? : ");

				int temp = sc.nextInt();

				switch (temp) {
				case 1:
					user = ga;
					break;

				case 2:
					user = ba;
					break;

				case 3:
					user = bo;
					break;

				case 4:
					System.out.println("4번을 선택하여 프로그램을 종료합니다.");
					System.out.println("score : " + score + ", life : " + life);
					System.exit(0);

				default:
					System.out.println("잘 못 입력하셨습니다."); // 잘못입력하면 다시 do로
				}

			} while (user.equals(""));

			// 컴퓨터값 설정
			Random rd = new Random();
			int temp = rd.nextInt(3);
			switch (temp) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}

			// 게임의 승패판별
			if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga))
					|| (user.equals(bo) && com.equals(ba))) {
				score += 100;
				System.out.println("유저 승!" + " 유저 : " + user + ", 컴퓨터" + com);

			} else if (user.equals(com)) {
				score += 10;
				System.out.println("비겼음! 유저: " + user + ", 컴퓨터: " + com);
			} else {
				life -= 1;
				System.out.println("컴퓨터 승! 유저 :" + user + ", 컴퓨터: " + com);
			}
			System.out.println("score: " + score + ", life: " + life);

			if (life == 0) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}

		}
//		int number = (int)(Math.random()*3); // 0 1 2 가 나온다.
//		
//		switch (number) {
//		case 0 : 
//			com = ga;
//			break;
//			
//		case 1 : 
//			com = ba;
//			break;
//			
//		case 2 :
//			com = bo;
//			break;
//		}
//		
//		if ((user.equals(bo) && com.equals(ba)) || (user.equals(ba) && com.equals(ga))
//		|| (user.equals(ga) && com.equals(bo))) {
//			
//			System.out.println("사람 승! " + "사람 : " + user + ", 컴퓨터: " + com);
//			score += 100;
//			
//			}
//		else if (user.equals(com)) {
//			System.out.println("비겼습니다!");
//			score += 10;
//			
//		}else if (life == 0) {
//			System.out.println("시스템이 종료되었습니다.");
//			System.exit(0);
//		}
//		
//		else  {
//			System.out.println("컴퓨터 승!" + " 사람 : " + user + ", 컴퓨터: " + com);
//			life -= 1;
//		}
//	
//		
//		System.out.println("시스템 현재점수: " + score + ", 남은 라이프: " + life);
//		
//		sc.close();
//		

	}

}
