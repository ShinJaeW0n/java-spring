package java8;

import java.util.Scanner;

public class Day07test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ��� �Ͻðڽ��ϱ�? : ");
		int line = sc.nextInt();
		
		for (int i = 0; i < line ; i++) {
			for(int j = 0; j <= i; j++) {
			System.out.print("$");
		}
			
			System.out.println(); //�̰��� ����� �ݺ��ϸ鼭 �������� ���Ⱑ �ȴ�.
		
		}
		sc.close();
	}
}