package java8;

import java.util.Random;
import java.util.Scanner;

//스캐너 이용해서 운세 만들기, String 참조형 변수에 대해서.

public class Day0209 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		String name = ""; //String형은 문자열(텍스트)를 입력합니다.
		//초기화는 ""으로 할 수 있습니다.
		
		
		
		
		int happy = 0;
		Random rd = new Random();
		happy = 50 + rd.nextInt(51); //50부터 100까지 나오게 하려면 이렇게.
		//happy = rd.nextInt(101); 이렇게 하면 0부터 100까지만 가능.
		happy = (int)(Math.random() * 51) + 50; //이렇게도 가능.
		
		
		
		//happy = (int)(Math.random() * 100); = 이것도 가능함.
		
		
		//사용자의 이름을 입력 받습니다.
				System.out.print("이름을 입력해주세요:");
				name = ch.next(); //또는 next 라인을 사용해도됨.
		
		//오늘의 운세 출력
		System.out.println(name + "님의 오늘의 행운은?");
		String str = "%입니다." //String 형에는 문자열을 저장할 수 있습니다.
				//String은 참조형으로 그 값이 저장되는 것이 아니라
				//값이 가지고 있는 메모리 주소가 저장됩니다.
				//작은 따옴표로 감싸면 char형이고 큰 따옴표로 감싸면 String형 입니다.
				
				
		System.out.print(happy + str); //0~100사이의 수를 출력.
		//행운지수는 50에서 100 사이를 출력하게 변경해주세요.
		
		
		
		ch.close();
		
		
	}

}
