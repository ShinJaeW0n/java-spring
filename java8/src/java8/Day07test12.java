package java8;

import java.util.Scanner;

public class Day07test12 {

		//홀수는 $ 짝수는 @ 가 출력되도록하라.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력해라: ");
		int line = sc.nextInt();
		
		//line을 1이라고 했을때 i는 0이거나 1보다 작은 수이기 때문에 j는 1이 나옴.
		for (int i = 0; i < line; i++) {
			for ( int j = 0; j <= i; j++) {
				if(j % 2 == 0) {
					System.out.print("$"); //첫번째 출력이 왜 짝수인지. -> 프로그래밍은 숫자를 0부터 세기 때문에.
				} else {System.out.print("@"); // \를 넣으면 출력이 안됨. \\이렇게 해야 문자가 출력됨.
			}
		}
		System.out.println();
	}
	
	}
}
