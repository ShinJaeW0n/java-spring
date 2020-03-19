package java8;

import java.util.Scanner;

public class Day0503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 영어점수를 입력해 주세요(0~100): ");
		int score = sc.nextInt();

		String pass = "";
		
		//하나의 조건이 아니라 여러개의 조건이 붙을때. if if 는 용량도 크고 속도가 느림. 그래서 else if로.
		if (score>=90) {
			pass = "A학점";
			}
		else if //이렇게 하면 안됨.(90>score>=80) 이항연산자로 해야해서. 3개가 오면 안됨. else if는 생략가능
		(score >= 80) { pass = "B학점";}
		
		else if (score >= 70) { pass = "C학점";}
		
		else if (score >= 60) { pass = "D학점";}
		
		//else if (score < 60) { pass = "F학점";}
		else { pass = "F학점"; }
		
		System.out.println("시험 성적은" + pass + "입니다.");
		
		sc.close();
	
	}
	
}

//else if는 여러개 사용해도 ㄱㅊ , else는 1개만 사용가능. 둘 다 필요하지 않으면 생략 가능.

/* 90점 이상은 A학점
 * 90점 미만 80점 이상은 B학점
 * 80점 미만 70점 이상은 C학점
 * 70점 미만 60점 이상은 D학점
 * 60점 미만은 F학점
 * */
