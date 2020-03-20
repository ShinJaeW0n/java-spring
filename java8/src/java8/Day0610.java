package java8;

import java.util.Scanner;

public class Day0610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년을 판별할 년도 입력! : ");
		int year = sc.nextInt();
		
		//왼쪽이나 오른쪽이 충족되면 트루다.
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
			
			System.out.println(year + "년은 윤년이다");
		}
		
		else {
			System.out.println("윤년이 아니다.");
		}
		
		
		
		sc.close();
	}
}
