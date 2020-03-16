package java8;

public class Day0203 {
	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000; //2십억을 넣었을때 엉뚱한 값이 나오는것을 오버플로우라고함.
		//int는 20억 이상을 담을 수 없기 때문에 그 이상을 담으면 오버플로우가 발생.
		//int의 범위는 -21억에서 21억까지이다.
		
		int result = number1 + number2; //범위를 넘어서면 오버플로우가 발생한다.
		System.out.println(result);
		
		long result2 = number1 + number2;
		System.out.println(result2); //오른쪽의 연산은 int + int 이다.
										//그래서 결과값도 int 이다.
		long num3 = 1000000000;
		long num4 = 2000000000;
		long result3 = num3 + num4;
		System.out.println(result3); //long형은 30억이 표현이된다.
		
		long result4 = 1000000000l + 2000000000L;
		System.out.println(result4); //일반적으로 연산에서 사용하는 정수는 int입니다.
					//그래서 위에 값은 int 정수로 표현된 값이라 값이 출력안됨.
	//그래서 long으로 표현하려면 숫자 뒤에 l이나 L을 사용. 대소문자 상관없다. 그래도 1과 구분을 위해
		//대문자L을 사용하는 것이 좋다.
	
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6;
		//왜 byte rfesult5라고 하면 빨간줄이 생기는가 : 자바의 기본연산은 int라서.
				//byte + byte 의 결과는 int값이다. 그래서 byte에 담을 수 없다.
				//int로 고쳐줘야한다.
		System.out.println(result5);
		
		short num7 = 3000;
		short num8 = 5000;
		int result6 = num7 + num8; //short + short의 결과도 int입니다.
		System.out.println(result6);
		
		long result7 = num7 + num8; //오른쪽의 자료형이 왼쪽의 자료형보다
					//작을 경우, 오른쪽에서 왼쪽으로 대입이 가능합니다.
					//자동 형변환. 묵시적 형변환. = promotion
		
		
		/*int result8 = 10L; //long형을 int에 대입할 수 없다. 
		//오른쪽이 왼쪽보다 크기 때문에 불가능.
		*/
		
//		ctrl+shift+c 드래그해서 누르면 여러 줄도 주석으로 가능.
//		ctrl+7을 누르면 한줄주석
		
		int num9 = 10;
		int num10 = 20;
		short result9 = (short)(num9 + num10); 
		System.out.println(result9);
		//이것을 강제 형변환이라고 한다. 명시적 형변환. =casting
		//큰 자료형을 작은 자료형으로 변환할때는 강제 형변환을 해야합니다.
		//원래는 대입이 불가능. ()을 해주고 앞에 바꿀 자료를 명시함.
		
		
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11 + num12); 
		//이렇게 하면 -25536이 나옴. 이건 오버플로우가 아님.
		//casting은 표현할 수 없는 비트는 버린다.
		System.out.println(result10);
		//1만+3만은 4만
		
//	4만은 2진수로 1001 1100 0100 0000이라는 값이 나온다.
//	(프로그래머 계산기 bin값.)
		
	}									
}
