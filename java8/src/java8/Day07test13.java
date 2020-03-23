package java8;

import java.util.Scanner;

public class Day07test13 {
	
	public static void main(String[] args) {
		//테스트 12를 거꾸로 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해라: ");
		int line = sc.nextInt();
						//i는 line보다 작을때까지 반복한다.
		
		//외부 포문을 바꾸는게 감소 식으로 만들때 더 쉽다.
		for(int i = line; i > 0; i--) {
			for(int j = 0; j < i; j++ ){
				if ( j % 2 == 0 ) {
					System.out.print("$");
				}else {
					System.out.print("\\");
				}
			
			}
			System.out.println();
		}
		
//		for(int i = line; i > 0; i--) {
//			System.out.println(i);
//		}
		
	}
}
