package java8;

import java.util.Scanner;

public class Day0609 {

	public static void main(String[] args) {

		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String user = "";
		String com = "";
		Scanner sc = new Scanner(System.in); //스캐너는 밖으로 빼주자
		int score = 0;
		int life = 3;
		
		while (true) {

			/* 사람 입력 */ // 게임의 시작지점
			System.out.println("가위, 바위, 보 중 하나를 선택하세요. < 가위 = a, 바위 = b , 보 = c > , 종료 = q > : ");
			user = sc.next();

			switch (user) {
			case "a":
			case "A":
				user = ga;
				break;

			case "b":
			case "B":
				user = ba;
				break;

			case "c":
			case "C":
				user = bo;
				break;

			case "q":
			case "Q":
				user = "quit"; //q를 누르면 종료하겠다.
				break;
				
			default:
				user = "error";
				System.out.println("잘 못 입력하셨습니다.");
			}

			if (user == "error") {
				System.out.println("잘 못 입력하셨습니다. 프로그램을 종료합니다."); // 없어도됨. 이미 위에 입력 해놔서.
				System.exit(0); // 시스템을 종료하는 구문.
			}
			else if (user== "quit") {
				System.out.println("종료를 선택하셨습니다.. 프로그램을 종료합니다.");
				break;
			}

			/* 컴퓨터 설정 */
			int number = (int) (Math.random() * 3); // 0 1 2 가 나온다.

			switch (number) {
			case 0:
				com = ga;
				break;

			case 1:
				com = ba;
				break;

			case 2:
				com = bo;
				break; // 없어도됨.
			}

			// 이 3가지 경우엔 사람이 승.
			// if((user == bo && com == ba) || (user == ga && com == bo) || (user == ba &&
			// com == ga)) //이거 좀 잘못됨. 기본형이면 맞는데,
			
			
			if ((user.equals(bo) && com.equals(ba)) || (user.equals(ga) && com.equals(bo))
					|| (user.equals(ba) && com.equals(ga)))

			// 기본자료형이 아니고 참조형일 경우 왼쪽의 값 주소와 오른쪽 값 주소가 같냐라고 물어보는것.
			// == : (기본형)왼쪽과 오른쪽 값이 같은지 물어보는 것.
			// == : (문자열은 기본형이 아니다.)값의 주소가 같은지 물어보는 것.
			// String ga ba bo 를 user와 com이 우연히 같은 주소를 공유했기 때문에 이건 그냥 넘어가게 됬던것. 원래는 저렇게 하면
			// 안됨.
			// 주소가 다른 기본형의 경우 equals를 사용해야함. ex)str2.equals(str3); = true, 자바는 객체와 객체의 비교는
			// equals를 이용함.
			{
				System.out.println("사람 승! 사람 : " + user + ", 컴퓨터 : " + com);
				score += 10;
			
			} else if (user.equals(com)) {
				System.out.println("비겼습니다! 사람 : " + user + ", 컴퓨터 : " + com);
				score += 1;
			} else {
				System.out.println("컴퓨터 승! 사람: " + user + " ,컴퓨터: " + com);
				life -=1;
			}
			System.out.println("현재점수: " + score + ", 현재 라이프 : " + life );
			System.out.println(); //구분해주기 위해서
			
			//라이프가 0개가 되었을때 while문이 멈추고 게임을 끝내도록해라.
			if(life == 0) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			
			
			
			// 게임의 끝

		}

	}
}
