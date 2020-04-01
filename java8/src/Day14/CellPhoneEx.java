package Day14;

public class CellPhoneEx {

	public static void main(String[] args) {
		
		//자식의 객체는 부모의 인스턴스 멤버를 호출 할 수 없다.
		DmbCellPhone dcp = new DmbCellPhone("갤럭시s20", "레드", 10);
		
		dcp.powerOn(); //부모의 메소드
		dcp.bell();		//부모의 메소드
		dcp.spendVoice("여보세요."); 	//부모의 메소드
		dcp.receiveVoice("택배입니다."); //부모의 메소드
		dcp.spendVoice("집 앞에 놓아 주세요."); //부모의 메소드
		dcp.receiveVoice("알겠습니다."); //부모의 메소드
		dcp.hangUp(); //부모의 메소드
		dcp.turnOndmb(); //자신의 메소드
		dcp.setChannel(100); //자신의 메소드
		dcp.turnOffdmb(); //자신의 메소드
		dcp.powerOff(); //부모의 메소드
	
		
		//부모의 객체는 자식의 인스턴스 멤버를 호출 할 수 없다. 자기 자신 것만 사용할 수 있다.
		CellPhone cp = new CellPhone();
		cp.powerOn();
		
	
	
	
	}
		
}
