package java8;

// \ 유니코드 사용하기. 
import java.util.Scanner;

public class Day0205 {
	public static void main(String[] args) {
	
		Scanner ch = new Scanner(System.in);
		
		int pw;
		
		
		System.out.println("비밀번호를 \n입력해\t주세요.");
		System.out.print("비밀번호:____\b\b\b\b"); 
		// 4칸앞으로 가서 ____위에 숫자를 입력하도록 하는 코드.
		// \b는 백스페이스를 뜻한다. 
		
		pw = ch.nextInt();
		System.out.print("입력하신 비밀번호는 \"");
		System.out.print(pw);
		System.out.print("\"입니다.");
		System.out.println("\'\'");
		ch.close();
}
}                           
