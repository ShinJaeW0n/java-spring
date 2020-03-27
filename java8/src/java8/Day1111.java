package java8;

import java.util.Scanner;

public class Day1111 {
				//할인된 상품단가*수량
	
		public static void main(String[] args) {
		
			Scanner sc= new Scanner (System.in);
			System.out.print("가격을 입력하세요: ");
			
			int price = sc.nextInt();
			
			System.out.print("수량을 입력하세요: ");
			int amount = sc.nextInt();
			
			int res1 = price * amount;
			System.out.println("상품단가: " + price + "원");
			System.out.println("상품 수량: " + amount + "개");
			
			int sale = 0; //할인율이 없다는 것을 표시해줘야해서.
			
			//50만원을 넘는건 100만원 넘는것도 포함이어서 100만원을 먼저 표시해줘야함.
			if(res1 >= 1_000_000) {
				price *=0.6; //40프로 할인 된 금액
				sale = 40;
				
			}else if(res1 >= 500_000) {
				price *=0.7; //30프로 할인 된 금액
				sale = 30;
			} 

			System.out.println("할인율: " + sale + "%");
			System.out.println("지불금액: " + price*amount + "원");
			
			sc.close();
			
			
			
//			int me = sang*cnt;
//			int hal = 0; //총 지불금액
//			int hal1 = 0;
//			
//			
//			if(me >= 500_000) {
//				hal =  sang - (int)(sang / 100.0 * 30);
//				hal1 = 30;
//			
//			}else if (me >= 1_000_000) {
//				hal = sang - (int)(sang / 100.0 * 40);
//				hal1 = 40;
//			}
//			
//			System.out.println(" 상품단가: " + sang + " 상품의 수량: " + cnt + " 지불금액: " + me + " 할인율 : " + hal1 + "%");
//			
	}
	
}
