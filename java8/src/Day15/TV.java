package Day15;

public class TV implements RemoteControl {
		
	int volume;	
	
		//일반 클래스가 추상 클래스를 상속 받으려면 오버라이딩 해줘야함.
		//소스에서 오버라이딩 하거나 일반 클래스 타입 명에 마우스 갖다대거나.
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
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
		System.out.println("TV의 볼륨을" + volume + "으로 변경합니다.");
	}

		@Override
		public void setMute(boolean mute) {
			if(mute) 
			System.out.println("TV를 음소거 상태로 설정합니다.");
			else 
			System.out.println("TV의 음소거 상태를 해제합니다.");
			
			
		}	
				
	
	
}
