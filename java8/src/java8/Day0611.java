package java8;

import java.util.Scanner;

public class Day0611 {
	public static void main(String[] args) {
		int intvalue;
		int resvalue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		intvalue = sc.nextInt();
		
		while (intvalue > 0) {
			resvalue *= 10;
			resvalue = resvalue + (intvalue % 10); //1의 자리 복사 //10으로 남으면 1의 자리만 남을거다.
			intvalue /= 10;
			
		
		}
	
		System.out.println("바뀐숫자: " + resvalue);	
	}
}
