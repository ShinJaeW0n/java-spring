package java8;

import java.util.Scanner;

public class Day04test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int width,height;
		int area, perimeter;
		
		System.out.println("너비를 입력해 주세요: ");
		width = sc.nextInt();
		System.out.println("높이를 입력해주세요: ");
		height = sc.nextInt();
		
		area = width*height;
		perimeter = 2*(width + height);
		
		System.out.println("사각형의 넓이:" + area);
		System.out.println("사각형의 둘레:" + perimeter);
		
		sc.close();
		
		
		/*System.out.println("사각형의 가로의 길이: ");
		int w = sc.nextInt(); 
		System.out.println("사각형의 세로의 길이: ");
		int h = sc.nextInt();
		
		int result = w*h;
		System.out.println("사각형의 면적: " + result);
		int result2 = 2*(w+h);
		System.out.println("사각형의 둘레: " + result2);
		*/
	
				
		
		
		
		
		
	}
	}
