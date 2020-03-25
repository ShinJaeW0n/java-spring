package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0904 {

	public static void main(String[] args) {
		//구구단 게임을 작성하세요
		Scanner sc = new Scanner (System.in);
		
		int a , b , an, r;
		int sScore = 0; //감점
		
		
		long startTime = System.currentTimeMillis();
		
		
		for(int i = 0; i <=10; i++) 
		
		{
			
			 a = (int)(Math.random()*8)+2;
			 b = (int)(Math.random()*9)+1;
			an = a*b;
			System.out.print(a + "x" + b + "= ");
			r = sc.nextInt();
		
		if(r==an) {System.out.println("정답입니다.");
					
		}else {
			sScore +=5; //나중에 다 빼면 되기 때문에 +로 함.
			System.out.println("틀렸습니다. " + sScore + " 점 감점입니다.");
		}
				
		}
		
		long endTime = System.currentTimeMillis();
		long playTime = (endTime-startTime) / 1000;
		long score = 200 - playTime - sScore;  // 200-진행시간-감점
		
		if(score > 100) {
			score = 100;
		}else if ( score < 0) {
			score = 0;
		}
		
		
		System.out.println("최종점수는 " + score + " 입니다." );
		sc.close();
		
		
		
	}
}
