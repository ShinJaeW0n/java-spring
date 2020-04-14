package Day23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

		//스트림 예제-4
public class DataIOStream {

		static String fname;
		public static void main(String[] args) {
			try {															//dsfile을 생성
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("dsfile"));
				dos.writeChar('c');
				dos.writeInt(897);
				dos.writeDouble(234.6);
				dos.writeByte(34);
				dos.writeBoolean(true);
				dos.flush();
				dos.close();
				
				System.out.println("데이터 파일 입출력 : dsfile");
				System.out.println("----------------------");			//dsfile을 생성해서 읽어옴.
				DataInputStream dis = new DataInputStream(new FileInputStream("dsfile"));
				System.out.println(dis.readChar());
				System.out.println(dis.readInt());
				System.out.println(dis.readDouble());
				System.out.println(dis.readByte());
				System.out.println(dis.readBoolean());
				
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
			
}
