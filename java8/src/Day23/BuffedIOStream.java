package Day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
			
			//스트림 예제-2
		public class BuffedIOStream {
			public static void main(String[] args) throws IOException {
				System.out.println("문자를 입력하고 [엔터] 치세요");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);//버퍼드는 보조스트림이다.
				System.out.println("입력한 문자 문자 : ");
				String str = br.readLine();
				System.out.print(str);
				System.out.println();
				
				System.out.println("출력 스트림");
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				bw.write("버퍼 스트림 출력");
				bw.flush();//bw안에 있는것을 모두 삭제하는것.
			}
}
