package java8;

import java.util.Scanner;

public class Day0503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 영어점수를 입력해 주세요(0~100): ");
		int score = sc.nextInt();

		String pass = "";
		
		if (score>=90) {
			pass = "A학점";
			}
		else if //이렇게 하면 안됨.(90>score>=80) 이항연산자로 해야해서. 3개가 오면 안됨.
		(score < 90 && score >= 80) { pass = "B학점";}
		
		else if (score < 80 && score >= 70) { pass = "C학점";}
		
		else if (score < 70 && score >= 60) { pass = "D학점";}
		
		//else if (score < 60) { pass = "F학점";}
		else { pass = "F학점"; }
		
		System.out.println("시험 성적은" + pass + "입니다.");
		
		sc.close();
	
	}
	
}

/* 90점 이상은 A학점
 * 90점 미만 80점 이상은 B학점
 * 80점 미만 70점 이상은 C학점
 * 70점 미만 60점 이상은 D학점
 * 60점 미만은 F학점
 * */
