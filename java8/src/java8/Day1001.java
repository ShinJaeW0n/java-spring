package java8;

public class Day1001 {
		//�迭
		public static void main(String[] args) {
		int s0 = 10;
		int s1 = 20;
		int s2 = 30;
		int s3 = 40;
		int s4 = 50;
		int [] students = {10,20,30,40,50}; //�߰�ȣ�� �迭�� �ʱ�ȭ�ϸ�
											//�迭�� ũ�⸦ �ԷµǴ� ������ �ڵ� ����մϴ�.
		
		int res1 = s0+s1+s2+s3+s4;
		System.out.println(res1);
							//10		20			30				40			50
		int res2 = students[0] + students[1] + students[2] + students[3] + students[4]; 
		System.out.println(res2);
		
		int res3 = 0;
		//res2 += si �� �� ������. ���� ������ ���ڸ� i�� �� ���� ����.
		for(int i = 0; i < 5; i++) {
			res3 += students[i]; //�迭�� �ε����� ������ ��밡���մϴ�.
			
		}System.out.println(res3);
		
		s0 = 100; //�ٽ� ���� ������ �� �ִ�.
		System.out.println(s0); // �迭�� �ε����� �Ϲ� ������ �����ϰ� ����մϴ�.
		
		students[0] = 1000; //�ٽ� ���� ������ �� �ִ�.
		System.out.println(students[0]);
		
		
		
		
		
		
		
		
		
		}
}