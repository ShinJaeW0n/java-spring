package Day14;

public class Child extends Parent  {
		
		//부모의 생성자가 매개변수를 가진다면, 
		//부모가 디폴트 생성자가 없다면, 자식의 생성자에 super라는 부모의 생성자호출을
		//명시적으로 넣어줘야한다.
		Child(String name){
			super(name); 	//얘는 명시하지 않으면 자동생성된다.
			
			System.out.println("자식을 생성합니다.");
		}
}
