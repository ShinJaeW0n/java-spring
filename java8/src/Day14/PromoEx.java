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
				
			
			//강제 형변환
			pc = (PromoChild)pp; // <- 강제로 자식에 부모를 대입할 수 있다.
			
			
	}

}
