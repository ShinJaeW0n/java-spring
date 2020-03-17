package java8;

import java.util.Scanner;

public class Day0310 {
	public static void main(String[] args) {
		//키보드입력을 위한 객체
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.print("수도입니까?(수도:1 , 수도아님:0 - ");
		int capital = sc.nextInt();
		boolean isCapital = capital == 0 ? false : true;
		//0은 false 다른 숫자는 true 라고본다.
		
		
		System.out.println("인구(단위:만) - ");
		int citizen = sc.nextInt();
		
		System.out.println("부자의 수(단위:만) - ");
		int rich = sc.nextInt();		
		
		  
		
		//판단 메트로 폴리스 여부 (논리 연산자)
		//한나라의 수도이고 인구가 100만 이상이어야 한다. (관계연산자)
		boolean isMetro1 = isCapital && (citizen >= 100); //관계연산자부터 하고 
		
		//연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
		
		boolean isMetro2 = rich >= 50;
	
		boolean isMetro = isMetro1 || isMetro2;
		
		System.out.println("메트로폴리스 여부: " + isMetro);
		
	
	}

}
