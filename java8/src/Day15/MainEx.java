package Day15;

public class MainEx {
		public static void main(String[] args) {
			/*스테틱클래스*/
			
			A.C.field2 = 10;		//static 멤버는 객체없이 사용이 가능합니다.
			A.C.method2();
			A.C c = new A.C(); // <-객체를 만들면 인스턴스 멤버 호출 가능
			c.field1 = 10;
			c.field2 = 10;
			c.method1();
			c.method2();
			
			
			/*인스턴스 멤버 클래스*/
			
			A a = new A();
			A.B b = a.new B(); //A라는 객체가 있어야 B를 사용할 수 있다. 인스턴스 멤버 클래스의 객체화(정적멤버클래스의 객체화와 코드가 다르다.)
			b.field1 = 10;
			b.method1();
			
			a.method();//로컬 클래스 D를 사용하는 메소드.
			
			
		}
	
	
}
