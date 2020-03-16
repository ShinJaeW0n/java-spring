package java8;

public class Day0303 {
	public static void main(String[] args) {
		int number1 = 100; //지역변수(메인 대괄호안에 있기 때문)
		System.out.println(number1);
		
		{ //중괄호 블럭
			System.out.println(number1);
			int number2 = 200; //블럭변수
			System.out.println(number2);
		}
		
		System.out.println(number1);
		System.out.println(number2); 
		//이렇게 하면 넘버2는 에러가남. 새로운 블럭영역안에서 만든것은
		//이 블럭을 닫아줌과 동시에 삭제가됨. 외부의 것은 내부에서 쓸 수 있고
		//내부에서 쓴것은 외부에서 못 씀.
		
	}

}
