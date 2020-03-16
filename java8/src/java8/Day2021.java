package java8;

public class Day2021 {

	public static void main(String[] args) {
		int number1; //변수의 선언, 자료의 형태는 선언을 할때만 사용.
		int number2; //변수의 선언
		int number3, number4; //같은 자료형은 동시에 선언 가능.
		
		number1 = 10; //변수 사용시 자료의 형태는 생략한다.
		number2 = 20; // '=' 는 오른쪽의 값을 왼쪽으로 대입하는 기호.
		number3 = 30; //왼쪽과 오른쪽의 자료형이 같아야만 대입이 가능.
		number4 = 40; 
		int number5 = 50; // 위에 선언하지 않았기 때문에 선언해야함.
		//변수를 선언과 동시에 값을 할당. 이렇게 해도 상관없다.
		int number6 = 60, number7 = 70; //선언과 동시에 값을 할당할 때도
		//동시선언이 가능합니다.
		
		System.out.println(number1); //변수를 출력할 때는 쌍따옴표로 
		//(")로 감싸지 않는다. 변수는 그냥 출력을 한다.
		
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
	}
	

}
