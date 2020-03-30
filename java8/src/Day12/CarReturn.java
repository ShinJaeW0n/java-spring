package Day12;

public class CarReturn {
	// 필드
	int gas;

	// 생성자 - 생략되면 기본 생성자 생성
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴

	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
				;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;
				//System.out.println("리턴 후 출력"); <- 리턴하고 나면 더 이상 실행할 필요가 없기때문에 더 이상 출력이 안된다.
				//값을 반환할 필요가 없기 때문에 리턴뒤에 값을 적진 않았지만
				//void 메소드는 리턴을 만나게 되면 그 즉시 값을 반환하고 멈춘다.
				//****리턴은 메소드를 멈추게하는 기능을 가지고 있다.
			}
		}

	}
	
	
}
