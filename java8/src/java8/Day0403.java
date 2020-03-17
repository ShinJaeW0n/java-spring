package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); //문자만 입력받을 수 있다.
													//숫자도 문자로 인식
		
		System.out.println("키보드를 눌러서 문자열을 입력해주세요.");
		String str = br.readLine();
		System.out.println(str);
		
		System.out.println("숫자를 입력해 주세요.");
		String number = br.readLine();
		int num1 = Integer.parseInt(number); //문자를 숫자로 변경하는 메서드.
		System.out.println(number + 1);
		System.out.println(num1 + 10);
		
		br.close();
		isr.close();
		//isr 만들고 br을 만들었기 때문에 br닫고 isr 닫아야함. br을 isr을 통해 만들었기때문.
		//만든것의 역순으로 닫아야한다***
	}
}
