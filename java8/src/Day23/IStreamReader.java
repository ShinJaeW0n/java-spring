package Day23;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

			//스트림 예제-1
public class IStreamReader {

		static String fname;
		public static void main(String[] args) {
			int idata = -1; //read에서 아무것도 못 읽었을때 -1 리턴.
			Reader isr = new InputStreamReader(System.in);
			System.out.println("키보드에서 문자입력(마지막에 엔터)");
			System.out.println("=========================");
			
			try {
				while(true) {
					idata = isr.read(); //매개변수가 없을때 한 바이트만 가져온다.
					if(idata == -1) //읽어오는게 없다면
						break;//멈춰라. , if가 {}없이 한 줄이면 그 한줄만 영향을 받는다.
					System.out.println((char)idata);//idata는 int니까 문자로 형변환.
				}
			} catch (IOException e) {
				System.out.println(e.toString());	
			}
			
		}
}
