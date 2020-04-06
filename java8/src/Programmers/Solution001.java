package Programmers;

import java.util.Arrays;

public class Solution001 {
	//Arrays.copyOfRange 이용해서 풀기.
	public int[] solution(int[] array, int[][] commands) {
	        
			int[] answer = new int[commands.length];
			for(int i = 0; i<commands.length; i++) { //원본배열	//1부터 세야하기 때문에 -1해줘야한다.
				int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
				Arrays.parallelSort(temp);
				answer[i] = temp[commands[i][2] - 1];
			}
				return answer;
	      }
	
		
			
			
			
		}
	
	

	
