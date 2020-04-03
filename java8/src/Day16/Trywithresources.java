package Day16;

import java.io.File;
import java.util.Scanner;

public class Trywithresources {
		
		public void getData(String file) {
			Scanner sc = null; //초기화 해주기.
			
			try {
				sc = new Scanner(new File(file));
				System.out.println(sc.nextLine());
			
			//예외처리를 해주면 중단되지 않고 계속 사용할 수 있다.
			}	catch (Exception e) {
				System.err.println("예외발생");
				System.out.println();
				e.getMessage();
				System.out.println();
				e.printStackTrace();
			
			} finally {	//입출력 스트림을 강제로 닫기 위해서 finally 구간을 이용. (1.6 버전 이전)
				if(sc != null) {
					sc.close();
				}
			
			}
			
			}
			
		public static void main(String[] args) {
			
		
			Trywithresources twr = new Trywithresources();
			twr.getData("text.txt");
		}

		
		
}
