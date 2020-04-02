package Day15;

public class RemonteControlEx {

			public static void main(String[] args) {
			
				TV tv = new TV();
				Audio ad = new Audio();
//				RemoteControl rc = new RemoteControl(); //인터페이스는 생성자가 없습니다.
				RemoteControl rc; //변수는 정의 할 수 있다.
				
				rc = tv; //인터페이스 변수에는 구현 클래스의 객체가 대입됩니다.
				rc = new TV(); // <-이렇게 해도 상관없다.
				
				RemoteControl.changeBattery(); //static메소드를 호출할 수 있으나 <인터페이스명.메소드 > 이렇게 호출해야한다. 객체가 없어도됨.
				rc.turnOn();
				rc.setVolume(5);
				rc.setMute(true);
				rc.setMute(false);
				rc.turnOff();
				System.out.println();
				
				rc = ad;
				rc.turnOn();
				rc.setVolume(5);
				rc.setMute(true); //오디오에서 재정의안함. 인터페이스에서 정의한 디폴트를 그대로 물려받는다.
				rc.setMute(false); //인터페이스 변수를 받는다면 인터페이스를 구현하는 객체들이 대입될 수 있다.
				rc.turnOff();
				System.out.println();
				
				
	}
}
