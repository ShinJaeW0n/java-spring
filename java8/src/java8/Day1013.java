package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1013 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new
				InputStreamReader (System.in));
		
		System.out.print("정수 10개를 입력하시오: ");
		for(int x = 0; x < r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		
		System.out.print("입력 데이터 값: ");
		for(int x = 0; x<r.length; x++) {
			System.out.println(r[x] + "..");
		}
		System.out.println();
		
//		//오름차순 정렬
//		Arrays.sort(r); //Arrays 클래스에서 제공하는 정렬메소드. 하지만 내림차순은 안된다.
//		 
//				
//		System.out.println("오름차순 데이터값 : ");
		
		
		//버블정렬 - 큰 숫자가 뒤로 가는 것.
		for (int x = 0; x <r.length; x++) {
			for(int j = 0; j <r.length; j++) {
				if(r[x] < r[j]) { //앞보다 뒤가 더 크면 바꿔줘라.
					int temp = r[x];
					r[x] = r[j];
					r[j] = temp;
				}
			}
		}	
		System.out.println("오름차순 데이터값 : ");
		
		
		for(int x = 0; x<r.length; x++) {
			System.out.println(r[x] + "..");
		}
		System.out.println();
		
		System.out.print("합계 : ");
		int sum = 0;
		for(int x = 0; x<r.length; x++) {
			sum += r[x];
		}
		System.out.println(sum);
		System.out.println("평균 : " + (sum / r.length) );
	
	}
}
