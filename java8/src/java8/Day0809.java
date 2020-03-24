package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		
		Random rd = new Random();
		
		
		for (int i = 0; i<=100; i++) {
		
		int me = sc.nextInt();
//		int com = rd.nextInt(99)+1;
		int com = 84;
		if(me<com) {System.out.println("입력하신 숫자보다 이상입니다.");
		
		}else if(me==com) {
			System.out.println("정답입니다. 프로그램을 종료합니다.");
			System.exit(0);
			
		}else {
			System.out.println("입력하신 숫자보다 이하입니다. ");
		}
		
		}
		
		sc.close();
	
		
		}
	
}
