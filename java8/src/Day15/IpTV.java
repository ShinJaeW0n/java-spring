package Day15;

public class IpTV implements RemoteControl, Internet {

	//동시에 2개 클래스 구현가능
	//상속에서는 다중상속이 불가능하나, 인터페이스에서는 다중구현이 가능하다. 
	//그래서 처음 설계할때부터 메소드가 같아서 혼란을 겪지 않도록 서로 다른 메소드를 작성해줘야함.
	
	
	private int volume;
	
	//Internet
	@Override
	public void searchWeb() {
		System.out.println("인터넷을 검색합니다.");
		
	}

	
	//RemoteControl
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
		this.volume = volume;
		System.out.println(this.volume + "으로 볼륨을 변경합니다.");
	}
				
	
			
}
