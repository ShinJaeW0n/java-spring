package java8;

//형변환은 중요하기 때문에 꼭 알고가기***

public class Day0204 {
	public static void main(String[] args) {
	 
	 double num1;
	 num1 = 3.14;
	 double num2 = 1.23;
	 double result1 = num1 + num2;
	 System.out.println(result1);
	 
	 //8바이트를 4바이트에 넣으려고 하면 이렇게 빨간줄이 생김
	 //float result2 = num1 + num2;
	 //그래서 이렇게 형변환 해줘야함.
	 float result2 = (float)(num1+num2);
	 System.out.println(result2);
	 
	 
	 double result3 = 3.14 + 1.23;
	 System.out.println(result3);
	 
	 //float result4 = 3.14 + 1.23; //실수의 기본형은 double이기 때문에
	 //빨간 줄이 생기고 형변환이 필요해진다.
	 
	 float result4 = 3.14f + 1.23f;
	 System.out.println(result4);
	 //float형 값에는 숫자 끝에 f를 붙인다. float은 일반적으로 소문자f를 적는다.(대문자도 상관없)
	 //실수의 기본형은 double이라서 뒤에 f를 붙이며 형변환을 해준것이다.

	 double result5 = 3.14f + 1.23; //서로 다른 자료형을 연산하게 되면 큰 자료형으로 
	 								//자동 형변환합니다.
	 
	 //int result6 = 10 + 20L; //int10과 long형 20이 더해지면 long형 30이 된다.
	 //그래서 int가 아니라 아래처럼 long형으로 바꿔야한다.
	 
	 
	 long result6 = 10 + 20L; // 정수도 동일하게 서로 다른 자료형으로 연산하게되면
	 							//큰 쪽으로 자동 형변환합니다.
	 
	 
	 int numb1 = 100;
	 System.out.println(numb1);
	 numb1 =200;
	 System.out.println(numb1);
	 
	 
	 
	}

}
