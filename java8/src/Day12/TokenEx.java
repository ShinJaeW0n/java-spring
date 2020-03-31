package Day12;

import java.util.StringTokenizer;

public class TokenEx {
		
		public static void main(String[] args) {
						// /를 기준으로 구분. 구분자 /는 삭제됨.
			String now = "2020/03/31";
			
			StringTokenizer st = new StringTokenizer(now, "/");
			
			int cnt = st.countTokens();
			System.out.println("현재 토큰 수: " + cnt);
			
			//st안에 토큰이 더 있으면 트루, 아니면 펄스
			while(st.hasMoreTokens()) {
				String temp = st.nextToken(); //2020반환 후 더 있으니 03 더 있으니 31 반환 후 아무것도 없으니 끝.
				System.out.println(temp);
			}
			
			
			//StringTokenizer을 쓰거나 split을 씀.
			String[] arr = now.split("/");
			for(String str : arr) {
				System.out.println(str);
			}
			
			
		}
}
