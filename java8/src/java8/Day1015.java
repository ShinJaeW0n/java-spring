package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1015 {
			//숫자야구게임
			/*1부터 9까지의 숫자 중에 3개를 랜덤으로 골라서 답이 되게 한다.
			 * ex) 3 7 5 가 답이라면
			 * 	   1 2 3 <- 1볼
			 * 	   1 2 4 <- 아웃
			 * 	   3 5 6 <- 1스트라이크 1볼
			 * 	   3 5 7 <- 1스트라이크 2볼
			 * 	   3 7 5 <- 3스트라이크 */
		public static void main(String[] args) {
			Random rd = new Random();
			int[] com = new int[3];
			com[0] = rd.nextInt(9)+1;
			do {
				com[1] = rd.nextInt(9)+1; //x와y가 같다면 y를 다시 만들어라
			}while(com[0]==com[1]);
			
			do {
				com[2] = rd.nextInt(9)+1; //z가 x와 같거나 y와 똑같다면 다시 만들어라
			}while(com[0]==com[2] || com[1]==com[2]);

			Scanner sc =  new Scanner(System.in);
			int [] user = new int[3];
			int strike = 0, ball = 0;
			
			
			for(int x = 0; x < 11; x++) {
			//user입력부분
			System.out.print("첫 번째 값을 입력해 주세요(1~9): ");
			
			do {
				if(user[0] != 0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해주세요.");
				}
				user[0] = sc.nextInt();
			}while(user[0] < 1 || user[0] > 9);
			
			do {
				if (user[0] == user[1]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}
				System.out.print("두 번째 값을 입력해주세요.(1~9): ");
				do {
				if(user[1] != 0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해주세요.");
				}
				user[1] = sc.nextInt();
			}while(user [1] < 1 || user[1] > 9);
			
		}while(user[0] == user [1]);
			
			
			do {
				if (user[0] == user[2] || user[1] == user [2]) {
					System.out.println("동일한 숫자는 입력 할 수 없습니다.");
				}
				System.out.println("세 번째 값을 입력해주세요.(1~9)");
				do {
				if(user[2] != 0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해주세요.");
				}
				
				user[2] = sc.nextInt();
			}while(user[2] < 1 || user[2] > 9);
		}while(user[0] == user[2] || user[1] == user[2]);
			
			
			
			
			for(int i = 0; i < 3; i++) {
			if(com[0] == user [i]) {
				strike++;
			}
			}
		
			if(com[0] == user [1] || com[0] == user[2]) {
				ball++;
			}
			if(com[1] == user [0] || com[1] == user[2]) {
				ball++;
			}
			if(com[2] == user [0] || com[2] == user[1]) {
				ball++;
			}
			
			System.out.println(strike + "스트라이크" + ball + "볼");
			
			if(strike == 3) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			
			strike = ball = 0; //=이 2개 이므로 좌측에서 우측으로 연산이 된다.
			
			for(int i = 0; i < user.length; i++) {
			user = new int [3]; //user를 0으로 초기화 해줘야한다.
			}
			
			}
		}
}

//Scanner sc = new Scanner(System.in);
//int ba [] = new int[3];
//
//Random rd = new Random(9);
//int x = rd.nextInt();
//x = ba[0];
//int y = rd.nextInt();
//y = ba[1];
//int z = rd.nextInt();
//z = ba[2];
//
//int cnt = 0; //스트라이크
//int cnt1 = 0; //볼
//
//	System.out.print("숫자 3개를 입력하세요: ");
//	int me = sc.nextInt();
//	
//	for(int i=0; i<11; i++) {
//	
//	if(x==me) { 
//	cnt++;
//	System.out.println(cnt + "회 스트라이크 입니다.");
//		}
//	
//	
//	}














//if(me==ba[0]) {
//cnt++;
//System.out.println(cnt + "볼 입니다.");
//}else if (me==ba[1]) {
//cnt++;
//System.out.println(cnt + "볼 입니다.");
//}else if (me==ba[2]) {
//cnt++;
//System.out.println(cnt + "볼 입니다.");
//}else if (x != me && y != me && z !=me){ 
//System.out.println("아웃 입니다.");
//}else if (x==me || y==me || z==me) {
//cnt1++;
//System.out.println(cnt1 + "스트라이크 입니다.");
//}
//
//else {
//System.out.println();
//}
//
