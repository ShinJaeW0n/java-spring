package java8;

import java.util.Scanner;

public class Day1110 {

		/*한 학생의 자바 점수인 출석, 과제, 중간고사, 기말고사 점수(각각100점 만점)를 키보드로부터
		 * 정수로 입력받아 학점을 화면에 출력하라*/
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = 0 , b = 0 , c = 0 , d = 0;
			char grade;
			
			do {
				if(a < 0 || a > 100) {
			System.out.print("입력 범위를 초과하였습니다.");
			}
			System.out.println("출석점수: ");
			a = sc.nextInt();
			
			
			}while(a < 0 || a > 100);
			

			do {
				if(b < 0 || b > 100) {
			System.out.print("입력 범위를 초과하였습니다.");
			}
			System.out.println("과제점수: ");
			b = sc.nextInt();
			
			
			}while(b < 0 || b > 100);
			

			do {
				if(c < 0 || c > 100) {
			System.out.print("입력 범위를 초과하였습니다.");
			}
			System.out.println("중간고사 점수: ");
			c = sc.nextInt();
			
			
			}while(c < 0 || c > 100);
			

			do {
				if(d < 0 || d > 100) {
			System.out.print("입력 범위를 초과하였습니다.");
			}
			System.out.println("기말고사 점수: ");
			d = sc.nextInt();
			
			
			}while(d < 0 || d > 100);
			
			//소숫값을 버리고 인트로 가져갈려고 강제 형변환.
			int score =(int)(a/100.0*20  + b/100.0*20 + c/100.0*30 + d/100.0*30); 
			System.out.println("총점 : " + score + "입니다." );
			
			if (score >=90) {
				grade = 'A';
				
			}else if (score >= 80) {
				grade = 'B';
			}else if (score >= 70) {
				grade = 'C';
			}else if (score >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println("당신의 학점은" + grade + "입니다.");
			
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("출석 , 과제, 중간고사, 기말고사 점수 입력하세요.");
//			
//			System.out.print("출석: ");
//			double ch = sc.nextDouble();
//			System.out.print("과제: ");
//			double ga = sc.nextDouble();
//			System.out.print("중간고사: ");
//			double ju = sc.nextDouble();
//			System.out.print("기말고사: ");
//			double gi = sc.nextDouble();
//			
//			double hak = ch*0.2 + ga*0.2 + ju*0.3 + gi*0.3;
//			
//			
//			if(hak >= 90 && hak <=100) {
//					System.out.println("학점 : A");
//			}else if (hak >=80 && hak <= 89) {
//				System.out.println("학점 : B");
//			}else if (hak >= 70 && hak <= 79) {
//				System.out.println("학점 : C");
//			}else if (hak >= 60 && hak <= 69) {
//				System.out.println("학점 : D");
//			}else {
//				System.out.println("학점 : F");
//			}
//			
			
			
		}
	
}
