package Day12;

public class CarReturnEx {
	
		public static void main(String[] args) {
			CarReturn myCar = new CarReturn();
			myCar.setGas(5);
			if(myCar.isLeftGas()) {
				myCar.run(); //만약에 가스가 있다면
			}else {
				System.out.println("가스를 충전하세요.");
			}
			
			
			
			
			
		}
		

}
