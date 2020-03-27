package java8;

import java.util.Arrays;
import java.util.Random;

public class Day1105 {
		/*	1. 1에서 45를 입력한 배열을 작성합니다.
		 * 	2. 작성한 배열을 무작위로 섞습니다.
		 * 	3. 0 인덱스 부터 6인덱스 까지 출력합니다.
		 * 	*/
		public static void main(String[] args) {
			int a [] = new int[45];
			
			
			for(int i = 0; i<a.length; i++) {
				a[i] = i+1; //1부터 45 대입.
				System.out.print(a[i] + "\t");
				if((i+1)%5==0) { 						
					System.out.println();
				}
					// <- 보기 편하게 5열로 정리.
			} 										
			
			
			
			System.out.println(); // <- 띄어쓰기 해주려고.
							//굳이 만 번일 필요는 없음.	
			for(int i = 0; i<10_000; i++) {
				int r = (int)(Math.random()*45); //0에서 44까지 랜덤.	
				
				//버블소트
				//임시저장소 temp
				int temp = a[0]; //a배열의 첫번째 숫자.
				a[0] = a[r]; //1에서 45 중 무작위로 하나 넣음.
				a[r] = temp; //0만 숫자를 넣으면 나머지 숫자들에는 어떻게 랜덤하게 숫자가 들어가는 건지.
			
		
		}
			for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if ((i+1) % 5 == 0) {
				System.out.println();
			}
		}

				System.out.println();
				
				System.out.println("로또 추첨기");
				int[] ary = Arrays.copyOf(a, 6); 
				Arrays.sort(ary);
				System.out.print("당첨번호: "); // <= ?
				for (int i = 0; i < ary.length; i++) {
				System.out.println(ary[i] + " ");
		
				}
				
				System.out.println(" , 보너스 번호: " + a[7]); // <= ?

	}

}

//Random rd = new Random();
//int me = rd.nextInt(45)+1;
//for(int i = 0; i<6; i++) {
//	do {
//	 a[i] = rd.nextInt(45)+1;  //<- 같은 수가 나올 때가 있다. ex) 1 2 3 3 4 5
//	
//	}while(a[i] == me);
//	System.out.println();
//	System.out.println(a[i]);
//}