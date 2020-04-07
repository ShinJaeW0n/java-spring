package Day18;

public class UsingLocalVariable {
	
		//람다식 final 변환
	
	void method(int arg) {// arg는 final 특성을 가짐.
		int localVar = 40; // localVar는 final특성을 가짐.
		//람다는 메소드이지만 안에 값을 바꾸는건 허용안됨.
		//람다를 호출하면 자동으로 final로 변환됨.
		
		//arg  = 31;		//final 특성 때문에 수정 불가, 람다식을 호출하면 값을 바꾸지 못한다는 뜻.
		//localVar = 41;	//final 특성 때문에 수정 불가
		
		//람다식
		MyFunc fi = () -> {
			//로컬변수사용 
		System.out.println("arg: " + arg);
		System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
		
		
	}
		//원래 메소드는 이렇게 값을 바꾸는게 허용됨. 하지만 람다식호출하면 ㄴㄴ
		void method2(int x) {
			System.out.println(x);
			x = 50;
			System.out.println(x);
		}

}
