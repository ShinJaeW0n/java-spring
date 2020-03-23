package java8;

import java.util.Scanner;

public class Day07test14 {
		public static void main(String[] args) {
			//짝수를 입력받으면 종료시키고 홀수 일 경우만 출력시킨다.
			//증가했다 감소하는 반복문은 존재하지 않는다.
			//증가와 감소구간을 따로따로 출력해야한다.
			
			//내가할땐 짝수 입력 후 종료가 이상하게 뜸. -> 짝수 if문을 for문 밖에 선언하면 해결.
			Scanner sc = new Scanner (System.in);
			System.out.print("수를 입력해라: ");
			int line = sc.nextInt();
			
			if (line % 2 == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); //0번이 에러코드 기본임.
			}
			
			int upLine = line / 2; // 9를 넣었을때 2로 나누면 4.5가 나옴. int 이기 때문에 4가 몫에 남는다.
			int downLine = line - upLine; // 9에서 4를 빼면 5가 된다. 
			//그래서 이 둘을 더하면 9가 나오는것이다.
			
			for (int i = 0; i < upLine; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			
			
			for (int i = downLine; i > 0; i--) {
				for(int j = 0; j < i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
//			for(int i = 0; i < line; i++) {
//				for(int j = 0; j <= i; j++) {
//					System.out.print("#");
//					
//					}
//				System.out.println();
//				}
//				
//				System.out.println();
//			
//			
//			for (int i = line-1; i > 0; i--) {
//				for(int j = 0; j < i; j++) {
//					System.out.print("#");
//					
//					}
//			System.out.println();
//			}
				
		}
	
		}

