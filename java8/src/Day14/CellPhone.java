package Day14;

	//생성자, 필드, 메소드는 순서가 바껴도 상관 ㄴ
public class CellPhone {
		//필드
		String model = "";
		String color = "";
		
		//생성자
		//생성자는 따로 만들지 않아서 디폴트 생성자 자동 생성됨.		
		
		//메소드
		void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
		void bell() {
			System.out.println("벨이 울립니다.");
		}
		
		void spendVoice(String message) {
			System.out.println("자기: " + message);
		}
		void receiveVoice(String message) {
			System.out.println("상대방: " + message);
		}
		void hangUp() {
			System.out.println("전원을 끊습니다.");
		}
	
}
