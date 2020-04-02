package Day15;

			//String 배열
public class CharacterAtEx {
				//원하는 위치에 있는 문자 1개를 character로 출력받는 것 : charAt(숫자);
		public static void main(String[] args) {
			String str = "Hellow World!";
			char ch = str.charAt(4);
			System.out.println(ch);

			
			
			for(int i = 0; i<str.length(); i++) {
				//헬로월드 전부 출력
				System.out.print(str.charAt(i));
			}
			
			
			
			System.out.println("==============");
			
			//프로가 3번째에 있으니 3을 리턴한다.
			String str1 = "자바 프로그래밍";
			int i = str1.indexOf("프로");
			System.out.println(i);
			
			//C언어는 없으니 -1을 리턴한다.
			i = str1.indexOf("C언어");
			System.out.println(i);
			
			//바는 1번에 있으니 1을 출력한다.
			str1 = "자바자바자바 프로프로 그래밍이이입니다.";
			i = str1.indexOf("바"); //매개변수가 한 개일 경우에는 0번부터 검색.
			System.out.println(i);
			//두 번째 바를 출력하고 싶다면 첫번째 i 가 1이니 +1을 해준다.
			i = str1.indexOf("바" , i + 1); // 첫번째 매개변수 : 검색어, 2번째 매개변수 : 검색 시작 위치
			System.out.println(i);
			i = str1.indexOf("바" , i + 1);
			System.out.println(i);
			
			System.out.println("=============");
			
			//replace()를 이용하여 원하는 글자로 바꿀 수 있다.
			//프로프로를 프로로 바꿀 수 있다.
			String str2 = str1.replace("프로프로", "프로");
			System.out.println(str1);
			System.out.println(str2);
			
			String str3 = str1.replace("자바", "java");
			System.out.println(str3);
			
			String str5 = str1.replace(str1, "_");
			System.out.println(str5);
			
			
			System.out.println("=============");
			
			//substring(); - 문자열 숫자를 입력하면 원하는 문자열만 출력가능.
			String str4 = "00022313-232343";
			String f1 = str4.substring(0, 8); //뒷 번호 앞에까지만 출력
			System.out.println(f1);
			
			String f2 = str4.substring(9);
			System.out.println(f2);
			
			
			
			
		
		}
	
}
