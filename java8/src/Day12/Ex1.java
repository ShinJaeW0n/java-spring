package Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex1 {

		public static void main(String[] args) throws IOException {
		System.out.print("출력할 문자열을 입력하세요!: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("입력한 문자열: " + sb);
		
		
		
		//문자열을 거꾸로 바꾼다
		
		sb.reverse();
		System.out.println(sb);
		
		}
}
