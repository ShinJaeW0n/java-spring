package Programmers;

public class Ex002 {
		public String solution(String s, int n) {
			String answer = "";
			char[] s2 = new char[s.length()];
			
			for(int i = 0; i < s2.length; i++) {
				s2[i] = s.charAt(i);
				}
			
			
			for(int i=0; i<s2.length; i++) {
				if(s2[i] == '') {
					continue;
				}else if(s2[i] >= 'a' && s2[i] <= 'z') {
					if(s2[i]+n > 'z') {
						s2[i] = (char)((s2[i]+n)-26);
					}else {
						s2[i]+=i;
					}
				}
			}
			
			
			
				
			
				
				
				return answer;
			}
	
	
			
}
