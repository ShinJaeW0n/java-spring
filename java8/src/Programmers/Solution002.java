package Programmers;

public class Solution002 {
	public String solution(String s, int n) {
		char[] chArr = s.toCharArray();
		String answer = "";
		//문자가 캐릭터일 경우 숫자로 사용가능.
		for(int i = 0; i<chArr.length; i++) {
			if(chArr[i] >= 'a' && chArr[i] <= 'z') 
			{
				chArr[i] += n;
				if(chArr[i] > 'z') {//알파벳은 26자. 한바퀴 돌아서 a로 가야함
					chArr[i] -= 26;
				
				}else if ((chArr[i] >= 'A' && chArr[i] <= 'Z')) {
					chArr[i] += n;
					if(chArr[i] > 'Z') {//알파벳은 26자. 한바퀴 돌아서 A로 가야함
						chArr[i] -= 26;
				}
			}
			answer += chArr[i];
		}	
		
		
		
		
	}
		return answer;
	}
}

