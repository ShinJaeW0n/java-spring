package Programmers;

public class Ex002 {
		public static void main(String[] args) {
			Solution002 sol = new Solution002();
			String [] s = {"AB" , "z", "a B z"}; 
			int[] n = {1, 1, 4};
			String[] result = new String[s.length];
			
			for(int i =0; i<s.length; i++) {
				result[i] = sol.solution(s[i], n[i]);
				}
			
			for(int i = 0; i<s.length; i++) {
				System.out.println(s[i]);
			}
			
		}
	}
