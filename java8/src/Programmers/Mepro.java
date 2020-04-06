package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Mepro {
	//Arrays.copyOfRange 이용해서 풀기.
		public int[] solution(int[] array, int[][] commands) {
		        
				int[] answer = {};
		        return answer;
		      }
			
			int [] array = new int [] {1, 5, 2, 6, 3, 7, 4};
			int [][] commands = new int [][] {{2,5,4} , {4,4,1} , {1,7,3}};
			
			int []array1 = {};
			int []array2 = {};
			
			Scanner sc = new Scanner(System.in);
			
			
				void arr1 (int [] i) {
				
					int[] array1 = Arrays.copyOfRange(array, 1, 5);
				
				for(int a : array1) {
					System.out.println(a + " ");
					}
				
							
				}
		
			
				public int[] arr2 (int[] j) {
					
					int [] array2 = Arrays.sort(array1);
					
					for(int b : array2) {
					System.out.println(b + " ");
				}
				 return array2;
				 
				 
				 int [] arr3 (int [] k) {
					 
					 int [] array3 = array2.length[3];
					 
					 for(int c : array3) {
						 System.out.println(c + " ");
					 }
				 }
				 
				
				
			}
		
		

		

}
