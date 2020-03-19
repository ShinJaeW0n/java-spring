package java8;

import java.util.Scanner;

public class Day05test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("기호를 입력해주세요: ");
		String r = sc.next();
		
		switch (r)
		{case "a" :
		case "A" :
			System.out.println("아메리카노");
			break;
		
		case "C" :
		case "c" : 
			System.out.println("카푸치노");
			break;
			
		case "L" :
		case "l" : 
			System.out.println("카페라떼");
			break;
			
		case "M" :
		case "m" : 
			System.out.println("카페모카");
			
		}
	
		sc.close();
		
	}

}
