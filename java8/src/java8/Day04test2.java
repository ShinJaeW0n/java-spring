package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day04test2 {

	public static void main(String[] args) throws Exception, IOException {
	int intnum;
	double dblnum;
	Scanner ac = new Scanner(System.in);
	System.out.println("정수와 실수를 입력하세요!:");
	intnum = ac.nextInt();
	dblnum = ac.nextDouble();
	System.out.println("입력한 정수는" + "intnum" + "입니다." );
	System.out.println("입력한 실수는" + "dblnum" + "입니다." );
}
}

