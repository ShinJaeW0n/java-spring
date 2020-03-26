package java8;

import java.util.Scanner;

public class Day1014 {
		public static void main(String[] args) {
		//뭘 먹을지 입력 받고 각각 얼마가 나왔고 총 합이 얼마인지 구하라.
			
			Scanner sc = new Scanner(System.in);
			
			//final=바뀔 수 없는 값
			final int k = 2000;
			final int dd = 2000;
			final int o = 500;
			final int s = 2000;
			int a,b,c,d;
			
			
			
			System.out.println("영남분식. 메뉴는 다음과 같다");
			System.out.println("김밥 1줄 : 2000원  , 떡볶이 1인분 : 2000원");
			System.out.println("오뎅 1개 500원, 순대 1인분 2000원");
			System.out.println("김밥 떡볶이 오뎅 순대 순으로 입력해주세요.");
			System.out.println();
			
			
			System.out.println("김밥은 몇 줄 구매하겠습니까?: ");
			a = sc.nextInt();
			System.out.println("떡볶이는 몇 인분 구매하겠습니까?: ");
			b = sc.nextInt();
			System.out.println("오뎅은 몇 개 구매하겠습니까?: ");
			c = sc.nextInt();
			System.out.println("순대는 몇 인분 구매하겠습니까?: ");
			d = sc.nextInt();
			System.out.println();
			
			System.out.println("김밥은" + a + "인분 구매하셨습니다.");
			System.out.println("김밥: " + k*a);
			System.out.println("떡볶이는" + b + "인분 구매하셨습니다.");
			System.out.println("떡볶이: " + dd*b);
			System.out.println("오뎅은" + c + "인분 구매하셨습니다.");
			System.out.println("오뎅: " + o*c);
			System.out.println("순대는 " + b + "인분 구매하셨습니다.");
			System.out.println("순대: " + s*d);
			System.out.println();
			
			System.out.println("총 금액: " + (k*a + dd*b + o*c + s*d));
			sc.close();
//			
//			
//			String [] str = new String[4];
//			
//			String 김밥 = "2000원";
//			String 떡볶이 = "2000원";
//			String 오뎅 = "500원";
//			String 순대 = "2000원";
//			int sum = 0;
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("뭘 먹을지 입력하시오: ");
//			String me = sc.next();
//			
//			if(me == 김밥) {
//				sum = 2000;
//			}else if(me == 떡볶이) {
//				sum = 2000;
//			}else if(me == 오뎅) {
//				sum = 500;
//			}else {
//				sum = 2000;
//			}
			
			
			
			
			
			}
	
	
	
	
}
