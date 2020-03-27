package java8;

public class Day1112 {

		/*중첩된 for문을 사용해서 2차원 배열에 구구단을 저장후에 
		 * 화면에 출력하는 프로그램을 작성하라*/
		public static void main(String[] args) {
						//2부터 9 라서 8줄 출력
			int[][] a = new int[8][9]; //왜 [9][9]로 하면 안되는지.
			
			for(int i = 0; i<a.length; i++) {
				
				for(int j = 0; j<a[i].length; j++) {
					a[i][j] = (i+2) * (j+1);
					}
			}
				//출력값
				for(int i = 0; i<a.length; i++) {
				
					for(int j = 0; j<a[i].length; j++) {
					System.out.print((i+2) + "x" + (j+1) + "=" + a[i][j] + "\t");
					}System.out.println();
			}
			
				
				System.out.println("====================");
				
				
				//위에꺼보다 메모리는 더 차지하지만 조금 더 쉽게 연산을 함. 
				int[][] ay = new int[10][10];
				
				for(int i = 0; i<ay.length; i++) {
					
					for(int j = 0; j<ay[i].length; j++) {
						ay[i][j] = i*j;
						}
				}
		
					//출력 구문
					for(int i = 2; i<ay.length; i++) {
						for(int j = 1; j<ay[i].length; j++) {
						System.out.print(i + "x" + j + "=" + ay[i][j] + "\t");
						}System.out.println();
				}
				
				
				
				
				
				
				
}
	
	
}
