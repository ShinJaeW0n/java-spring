package java8;


import java.util.Random;

//import java.util.*;  //*은 모든것이라는 뜻이다. 자바.util에 있는 모든것을
//들고 오겠다는 뜻이다.

//랜덤함수
import java.util.Scanner;

public class Day0207 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in); //스캐너 작성 방법
		Random rd = new Random(); //Random은 매개변수(입력값)이 없습니다.
		System.out.println(rd.nextInt());
		//int값 -21억~21억까지의 숫자 중 랜덤으로 출력한다.
		
		System.out.println(rd.nextBoolean());
		//true와 false 둘 중 하나가 랜덤으로 출력됨.
		
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
	//실수 형들은 0보다 크고 작고 1보다 작은 수를 출력한다.
		
		System.out.println(rd.nextLong());
		//int보다 큰 숫자들이 출력된다.
		
		System.out.println(rd.nextGaussian());
		//가우시안 분포 네이버에 검색해보셈.
		
		System.out.println(rd.nextInt(10)); 
		//nextInt(bound) 0보다 크거나 같고 10보다 작은 수를 출력. 10은 출력되지 X
		
		System.out.println(Math.random()); //0보다 크거나 같고 1보다 작은 실수를 출력한다.
									//Math 클래스는 기본지원 클래스 이므로 임포트 할 필요 없다.
		System.out.println(rd.nextDouble()); // Math.random은 얘랑 같음.
		
		
	
	}
}
