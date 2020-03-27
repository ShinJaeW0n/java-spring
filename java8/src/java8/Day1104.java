package java8;

public class Day1104 {

		public static void main(String[] args) {
			/* 2차원 배열 이용하여 아래와 같이 입력하세요.
			 * 7열 5행에 배열에서
			 * 홀수 출력 줄은 정순으로
			 * 짝수 출력 줄은 역순으로
			 * 출력하세요.*/
			
			int a [][] = new int [5][7]; //5줄 7칸
			
			for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t"); // 이렇게 하면 7칸 5줄이된다.
			}System.out.println();
			
			
		} 
			System.out.println("===============");
			
			
			int cnt = 1;
			for(int i =0; i<a.length; i++) {
				if(i % 2 == 0) {   //<= 짝수 줄인데 왜 증감하는지.
					for(int j = 0; j<a[i].length; j++) { 
						a[i][j] = cnt;
						cnt++;
				}
				
				}else {				//왜 -1을 해주는지.
					for(int j = a[i].length-1; j>=0; j--) {
						a[i][j] = cnt;
						cnt++;
					}
				}
			
			}
			
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a[i].length; j++) {
					System.out.print(a[i][j] + "\t");
				
					
				}
				System.out.println();
				}
				
				
			} 
		

	}	


//if(a[i][j] % 2 == 0) {
//	System.out.print((i*5)+j+1+ "\t");
//	
//}else {System.out.print((i+1)*5-j+ "\t");
//
//}
