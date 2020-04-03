package Day16;

import java.io.File;
import java.util.Scanner;

public class Trywithresources2 {
		public void getData(String file) {
			
				//try안에 자동으로 닫히는 구문을 넣어줘야한다. ()로 매개변수안에 넣어줘야한다.
			try(Scanner sc = new Scanner(new File(file)); 
				Scanner sc2 = new Scanner(System.in)	//여러 개의 자동 닫힘 소스를 작성할 수 있다.
			) {
				System.out.println(sc.nextLine());
			
			}	catch (Exception e) {
				System.err.println("예외발생");
				System.out.println();
				e.getMessage();
				System.out.println();
				e.printStackTrace();
			
			} 
			
			}
			
			public static void main(String[] args) {
		
			Trywithresources2 twr = new Trywithresources2();
			twr.getData("text.txt");
		}

		
		
}
