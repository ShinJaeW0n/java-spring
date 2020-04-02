package Day15;

public class Audio implements RemoteControl {
		
	int volume;	
	
		//일반 클래스가 추상 클래스를 상속 받으려면 오버라이딩 해줘야함.
		//소스에서 오버라이딩 하거나 일반 클래스 타입 명에 마우스 갖다대거나.
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume < MIN_VOLUME){
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("오디오의 볼륨을" + volume + "으로 변경합니다.");
	}

		
				
	
	
}
