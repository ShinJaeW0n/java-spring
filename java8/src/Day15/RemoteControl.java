package Day15;

public interface RemoteControl {

	//일반클래스에서 상수 만들려면 public static 을 붙였어야 했는데
	//인터페이스에서 필드는 무조건 대문자로 해줘야한다. 
	//public static은 자동으로 생성되기 때문에 굳이 명시하지 않아도된다.
		
		//상수필드
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
	
		//추상메소드
		void turnOn();
		void turnOff();
		void setVolume(int volume);
		
		//7버전까지는 일반(디폴트) 메소드는 가질 수 없다. 8버전부터는 가능하게 함.(앞에 default를 붙힘).
		
		//디폴트메소드
		default void setMute(boolean mute) {
			if(mute) {System.out.println("음소거 상태를 설정합니다.");
			}else {System.out.println("음소거 상태를 해제합니다.");
			}
		}
			
		//정적 메소드
		static void changeBattery() {
			System.out.println("건전지를 교환합니다.");
		}
			
			
		}

