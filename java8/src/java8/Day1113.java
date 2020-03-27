package java8;

import java.util.Scanner;

public class Day1113 {
					/*가위 바위 보 게임*/
			public static void main(String[] args) {
			
			final String ga = "가위"; //1
			final String ba = "바위"; //2
			final String bo = "보";  //3
			
			int com , user; 
			
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				com = (int)(Math.random()*3)+1; // 1 2 3 이 나옴.
			
				do {
				
			System.out.println("가위바위보 게임 시작");
			System.out.print("가위 = 1 , 바위 = 2 , 보 = 3, 종료 = 4 : ");
			user = sc.nextInt();
			
			if(user < 1 || user > 4) {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
			}else if (user == 4) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
			}while(user < 1 || user > 3); //이 경우라면 다시 시작해야함.
			
			
			String userStr = user == 1 ? "가위" : user == 2 ? "바위" : "보";
			String comStr = com == 1 ? "가위" : com == 2 ? "바위" : "보";
			
			if((user == 1 && com == 3) || (user == 2 && com ==1) || (user ==3 && com ==2)){
				System.out.println("유저 승! 유저 : " + userStr + ", 컴퓨터: " + comStr);
			}else if (user == com) {
				System.out.println("비겼음! 유저: " + userStr + ", 컴퓨터: " + comStr);
			}else {
				System.out.println("컴퓨터 승! 컴퓨터 : " + comStr + ", 유저: " + userStr);
			}
			//게임끝
			
			
			
			}
			
			
		}
}
