package java8;

import java.util.Random;
import java.util.Scanner;

public class Dayhappy {
	public static void main (String[] args) {
		Scanner ch = new Scanner(System.in);
		String name = "";
		
		
		int happy = 0;
		Random rd = new Random();
		happy = rd.nextInt(101); //0~100
		
		
		
		System.out.print("이름을 입력해 주세요:");
		name = ch.next();
		System.out.println("짝짝짝!" + name + "님의 오늘의 행운은");
		System.out.println(happy + "%입니다.");
		
		
		ch.close();
		
		
		
	}
	
}
