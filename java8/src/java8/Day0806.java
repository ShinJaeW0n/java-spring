package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {

	public static void main(String[] args) {
		//구구단 10회 완료시 실행시간을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int r, c, b, answer;
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i <=10; i++) {
		
		r = (int)(Math.random()*8+2); //0부터 7 + 2 = 9 , 2부터 9가 나오게 하려고.
		c = rd.nextInt(9)+1; //0부터8+1 = 9 , 1부터 9 나오게 하려고.
		
		answer = r*c;
		System.out.print((i+1) +"번 문제"+ " : " + r + "x" + c +"=");
		b = sc.nextInt();
		
		if(answer==b) {
			System.out.println("정답입니다.");
		}else { System.out.println("틀렸습니다.게임을 종료합니다.");
				System.exit(0);
		}
			
	}
		long endTime = System.currentTimeMillis();
		System.out.println("[게임실행시간]" + (endTime-startTime) +"ms");
		//포문이 다 끝나고 난 후 나오는 문구.
		//문구는 왼쪽부터 계산. 그래서 () 안해줘도 되는데 확실하게 하려고 ()를 넣어줌.
		//변수는 오른쪽부터 계산.
		
		}
}
