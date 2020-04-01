package Day14;

public class OverrideChild extends OverrideParent {

		void method3() {
			System.out.println("자식 메소드3");
		}
		
		//@ - 컴퓨터에게 알려주기 위한 오너테이션
		//부모의 메소드 재 정의, 부모와 똑같은 형태를 유지하여야한다.
		@Override //<-쟤를 지우면 그냥 새로운 메소드를 만드는 것.
		//될 수 있으면 source에서 오버라이드 메소드를 선택해서 자동으로 추가하는 식으로
		//자동시스템을 이용하면 오타도 안나고 코딩속도도 빨라진다..
		void method2() {
		System.out.println("자식 메서드2");
		
		}
		
		
	
}
