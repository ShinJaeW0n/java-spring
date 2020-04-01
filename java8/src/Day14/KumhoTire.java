package Day14;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		//부모에 디폴트생성자가 없기 때문에 부모로 전달
		super(location, maxRotation);
	}

	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	
	}


}
