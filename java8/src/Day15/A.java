package Day15;


/*중첩 */
public class A {
	
	A(){
		System.out.println("A객체가 생성됨");
	}
	
			
	/* 인스턴스 멤버 클래스 */
	class B { // <-클래스 선언하는 경우
		B() {
			System.out.println("B 객체가 생성됨.");
		}

		int field1;

		//static int field2; //정적 불가능.
		
		void method1() {
			}
		// static void method2;
		}
	
	
	/*정적 멤버 클래스*/
	
	static class C{ // <-클래스 선언하는 경우!! 
		C(){
			System.out.println("C 객체가 생성됨");
		}
		
		int field1;
		static int field2;
		
		void method1() {
			
		}
	
		static void method2() {
			
		}
	
	}
	
	void method() {
		/*로컬 클래스*/
		class D {
			D() {
				System.out.println("D객체가 생성됨");
			}
			
			int field1;
			
			//static int field2;
			void method1(){
				
			}
			//static void method2(){}
		}
			D d = new D();
			d.field1 = 3;
			d.method1();
		
	
	}
	
	
	
	
	//내부에서 사용할 때!!!
	//인스턴스는 스테틱과 인스턴스 둘다 사용가능.
	//스테틱은 스테틱만 사용가능.
	
	
	//인스턴스 필드
	
	B outerfield1 = new B(); // (o)
	C outerfield2 = new C(); // (o)

	
	//인스턴스 메소드
	
	void method1() {
		B var1 = new B(); //(o)
		C var2 = new C(); //(o)
	}
	
	
	//정적 필드 초기화
	//static B outerfield3 = new B(); // (x) A객체 없음
	static C outerfield4 = new C(); // (o) 정적은 가능 //내부에서 스테틱멤버는 스테틱만 사용한다. 왜냐하면 값이 로딩되려면 객체 생성 전에 해야해서.
	
	
	//정적메소드
	
	static void method2() {
		//B var1 = new B(); // (x) A객체 없음
		C var2 = new C(); // (o) 정적은 가능
	}
	
	
	
			
			
}
