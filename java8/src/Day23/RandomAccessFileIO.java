package Day23;

import java.io.IOException;
import java.io.RandomAccessFile;
		//��Ʈ�� ����-7
public class RandomAccessFileIO {

		public static void main(String[] args) throws IOException {
			byte[] data = {21,1,43,12,76,34,54,29,66,99};
			RandomAccessFile rac = new RandomAccessFile("temp.txt", "rw");
			rac.write(data);
			System.out.println("���� ���: temp.txt"); //txt�� 2������.
			System.out.println("-----------------");
			for(int i=0; i<data.length; i++) {
				int accpoint = (int)((Math.random()*100)%10);
				rac.seek(accpoint);
				System.out.println("���� ���� ������: " + rac.getFilePointer());
				System.out.println(", ������ : " + rac.read());
			}
			
			
		}
}