package Day14;

public class CarExtendsEx { //**타이어에는 한국타이어나 금호타이어가 들어갈 수 있다.
		public static void main(String[] args) {
			CarExtends car = new CarExtends();
			for(int i = 0; i <= 5; i++) {
				int problemLocation = car.run();
				switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
					break;
				
				case 2:
					System.out.println("앞 오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
					break;
				
				case 3:
					System.out.println("뒤 왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
					break;
				
				case 4:
					System.out.println("뒤 오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
					break;
					
					
					
				}
			
			System.out.println("----------------------------");
			
			}
			
			
			
			
			
		}
	
	
}
