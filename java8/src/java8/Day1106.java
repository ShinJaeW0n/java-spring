package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1106 {
			public static void main(String[] args) {
				/*로또 생성기 작성
				 * 1. 6개의 랜덤한 숫자(1부터45)를 배열에 입력하세요.  
				 * 2. 중복되지 않도록 작성하세요.
				 * */	
		
				int a[] = new int [6];
				
				
				Random rd = new Random();
				System.out.println("로또 생성기");
				System.out.println("몇 게임을 생성하시겠습니까? : ");
				Scanner sc = new Scanner(System.in);
				int game = sc.nextInt();
				
				
				
				for(int x = 0; x < game; x++) {
				/*로또 생성 시작*/
				for(int i = 0; i < a.length; i++) {
					a[i] = rd.nextInt(45)+1;// <=이렇게 하면 중복되는 숫자가 발생한다.
					for(int j = 0; j<i; j++ ) {
					//a[1] == a[0] 
					if(a[i] == a[j]) {
						i--; //로또의 1번을 다시 만들어주려고.								
						break;
					}
					}
					
				}
				
				//선택 정렬을 사용해서 배열을 오름차순으로 정렬하세요. 그냥 외워야함. 머리로 계산은 어려움.
			
				for(int i = 0 ; i < a.length; i++) {
					for(int j = 0; j < a.length-1; j++) {
						if(a[i] < a[j]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				
				
				for(int i = 0; i < a.length; i++) {
					System.out.println(a[i] + " ");
				}
				
				System.out.println();
				/*로또 생성 끝*/
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			}
	
	
}
