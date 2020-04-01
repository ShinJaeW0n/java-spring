package Day14;

public class PromoEx {
		public static void main(String[] args) {
			PromoChild pc = new PromoChild();
			pc.method1();
			pc.method2();
			pc.method3();
			
			//자식은 부모에 대입이 가능합니다.
			PromoParent pp = new PromoChild();
			pp.method1();
			pp.method2();//부모에 대입되더라도 오버라이딩된 메소드가 뜬다.
//			pp.method3(); // <= 부모의 형태이기 때문에 부모에는 method3가 없다. 그래서 method3 사용이 불가능하다.
			
//			pc = pp;  //자식에 부모를 대입할 수 없습니다.
				
			
			//강제 형변환 , 부모의 형태에서 자식으로 바뀌면 자식메소드를 호출할 수 있다.
			pc = (PromoChild)pp; // <- 강제로 자식에 부모를 대입할 수 있다.
			pc.method1();	//부모의 객체가 자식의 객체에 대입될 때에는 원래부터 자식 객체였어야만 합니다.
			pc.method2();
			pc.method3();
			
			
			PromoParent pp2 = new PromoParent();
					
					//instanceof ->자료의 형태를 확인할때 사용, 형변환이 가능한지 boolean 값으로 반환합니다. 좌(객체) 우(타입)
			if (pp instanceof PromoChild) {
				pc = (PromoChild)pp;
				pc.method3();
			}else {
				System.out.println("강제형변환을 사용할 수 없습니다.");
			}
			
			
//			pc = (PromoChild)pp2;
//			pc.method3(); // <- 강제형변환은 원래의 형태로 복구만 가능합니다. pp2가 프로모차일드 형이 아니기 때문에 출력이 안됨.
//			
			
	}

}
