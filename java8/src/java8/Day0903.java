package java8;

public class Day0903 {

	public static void main(String[] args) {
		
		
	/*1���� 25���� 5ĭ 5�ٷ� ����ϼ���*/
		
		// system.out.printf �� ����(format)�� �°� ����ϴ� �޼ҵ�
		// system.out.printf �� c���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����� �� �ֽ��ϴ�.
		// ù��° �μ�(�Է°�)�� ��� ������ �Է��ϰ� �ι�°���ʹ� ��� ���Ŀ� ������ ������ �Է��մϴ�.
		// 
		// ������ ������ %�� �����մϴ�. (���Ŀ� ���� ����ϰ� �ʹ�)
		// d : decimal => 10����
		// f : float => �Ǽ�
		// lf : long float => double �Ǽ�  //c����. �ڹ� ��� ����.
		// o : octa => 8����
		// x : hexa => 16����
		// b : binary 2���� (?)
		// s: String ���ڿ�
		// c : char ����1��
		
		// ���� �� �� �ִ°�
		// ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
		// %2d => �������� 2�ڸ� ���, %10d => �������� 10 �ڸ� ���.
		// ���ھտ� 0�� ���̸� �� ������ 0���� ä��ϴ�.
		// �ٸ� ���ڴ� ����� �� ����.
		// ���� ���ʿ� - �� ���̸� ���� �����մϴ�. ex) %-03d
	
	for(int i = 1; i <=25; i++) {
		System.out.print(i + "\t");
		if(i%5==0) {
			System.out.println();
		}
	}
	
	
	System.out.println();
	
	int cnt = 1;
	for(int i =1; i <=5; i++) {
		for(int j=1; j <= 5; j++) {
			System.out.printf("%02d ", cnt );
			cnt++;			//2�ڸ��� ��µ�. -> %02d //"%02d %f %s ", cnt , 3.14, "���ڿ�"
		
		}System.out.println();
	}
	
	
	System.out.println();
	/* 01 02 03 04 05
	 * 10 09 08 07 06
	 * 11 12 13 14 15
	 * 20 19 18 17 16
	 * 21 22 23 24 25
	 * 
	 * */
	
	
	//�迭������.
	
	for(int i = 0; i < 5; i++) {
		for(int j=0; j < 5; j++) {
			if(i % 2 == 0) {
				System.out.print((i*5)+j+1+ "\t");
			}else {
				System.out.print((i+1)*5-j+ "\t");
			}
			
		
		}System.out.println();
	}
	
	System.out.println();
	
	

	/*
	 * @ 1�� 1��
	 *  @ 2�� 2��
	 *   @ 3�� 3��
	 *    @
	 *     @
	 * 
	 * */
	
	for(int i = 0; i < 5; i++) {
		for(int j = 0; j < 5; j++) {
		if(i == j) {
			System.out.print("@");
		}else {
			System.out.print(" ");
		}
		
		}System.out.println();
		
		
	}
	
	
	
	
	
	
//	for(int i = 1; i <= 25; i++ ) {
//		System.out.printf("%02d " , i );
//		if(i%5==0) {
//			System.out.println();
//		}else if (i%10==0) {
//			
//		}
//			
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	}	
	
}