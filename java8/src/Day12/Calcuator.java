package Day12;

public class Calcuator {

	//생성자는 생성하지 않으면 자동 생성자, 디폴트생성자가 생김.
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//반드시 int 리턴값이 있어야함.
	int plus (int x , int y) {
		int result = x + y;
		return result;
	}
	
	int plus (long x, long y) {
		int result = (int)x+(int)y + 10000;
		return result;
	}
	
	double divide(int x , int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
		
}
