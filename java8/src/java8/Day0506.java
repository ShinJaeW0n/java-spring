package java8;

public class Day0506 {
	public static void main(String[] args) {
			System.out.println("주사위 게임을 시작합니다.");
			int dice = (int)(Math.random() * 6) +1;
					//0보다 크거나 같고 6보다 작은 수가 출력됨. 0~5 . 그래서 +1을 해줌.
			System.out.println("주사위를 던집니다.");
			
//			if (dice == 1) {System.out.println("주사위의 눈금은 1입니다.");}
//		
//			else if (dice == 2) {System.out.println("주사위의 눈금은 2입니다.");}
//			
//			else if (dice == 3) {System.out.println("주사위의 눈금은 3입니다.");}
//			
//			else if (dice == 4) {System.out.println("주사위의 눈금은 4입니다.");}
//			
//			else if (dice == 5) {System.out.println("주사위의 눈금은 5입니다.");}
//			
//			else {System.out.println("주사위의 눈금은 6입니다.");}
//		}
		
			
		switch(dice) {
			case 1:
				System.out.println("주사위의 눈금은 1입니다.");
				break;
		
			case 2:
				System.out.println("주사위의 눈금은 2입니다.");
				break;
			case 3:
				System.out.println("주사위의 눈금은 3입니다.");
				break;
			case 4:
				System.out.println("주사위의 눈금은 4입니다.");
				break;
			case 5:
				System.out.println("주사위의 눈금은 5입니다.");
				break;
			default: //else 구문과 같다.
				System.out.println("주사위의 눈금은 6입니다.");
				break; //있어도 되고 없어도됨. 이거 이상 넘어갈데가 없어서. 디폴트는 항상 제일 마지막에 있어야한다.
				
		}
		
	
	
	System.out.println("게임을 종료합니다..");
		

	}


}
