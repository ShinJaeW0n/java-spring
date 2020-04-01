package Day14;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	
	// 재 정의후 부모 메소드 다시 불러오기.
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly(); //부모클래스의 fly() 메소드 실행.
		}
		
	}
	
	
	
	
	
	
	
}
