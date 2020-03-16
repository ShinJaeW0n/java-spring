package java8;

public class Day0305 {
	public static void main(String[] args) {
		int num1 = 10,  num2 = 20 ,  num3 = 20; //이렇게 하는 것도 가능
		System.out.println("num1 = 10,  num2 = 20 ,  num3 = 20");
		System.out.println("num1 < num2:" + (num1 < num2) ); // +가 우선하기 때문에 괄호로 최우선 연산으로 바꿔줘야함.
		System.out.println("num1 <= num2:" + (num1 <= num2) );
		System.out.println("num1 >= num2:" + (num1 >= num2) );
		System.out.println("num1 > num2:" + (num1 > num2) );
		System.out.println("num1 == num2:" + (num1 == num2) );
		System.out.println("num1 != num2:" + (num1 != num2) );
		
		System.out.println("num3 < num2:" + (num3 < num2) ); // +가 우선하기 때문에 괄호로 최우선 연산으로 바꿔줘야함.
		System.out.println("num3 <= num2:" + (num3 <= num2) );
		System.out.println("num3 >= num2:" + (num3 >= num2) );
		System.out.println("num3 > num2:" + (num3 > num2) );
		System.out.println("num3 == num2:" + (num3 == num2) );
		System.out.println("num3 != num2:" + (num3 != num2) );
	
		//쉬+알+a = 한번에 바꿔줄때.
		
		/* 제일중요한것 : =을 1개 사용하면 대입연산자로 오른쪽의 값을 왼쪽으로 대입한다.
		 *			==을 사용하면 왼쪽과 오른쪽 값이 동일한지를 판단합니다.
		 * 			=와 ==는 결과가 다르다. *****
		 */
	
	
		boolean result = num1 < num2;
		System.out.println(result); //참 거짓은 boolean이라는 자료형을 사용한다.
	
	
	}
}
