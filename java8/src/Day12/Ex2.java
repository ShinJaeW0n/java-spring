package Day12;

public class Ex2 { //정렬할때 사용.
			public static void main(String[] args) {
				String a = "aaa";
				String b = "Abc";
				//aaa			aab						abc
		    // 97 97 97		   97 97 98				  97 98 99
				//97-98 = -1 , 그래서 결과가 -1이 나온다.
				//같으면 다음 결과로 넘어가고 같지 않다면 거기서 2개의 값의 차이를 비교하고 멈춘다. 그 다음으로 넘어가지 않는다.
				//양수가 나오면 숫자가 앞쪽이고 음수면 숫자가 그 다음순서다.
				//정렬할때 앞 뒤 숫자 비교할때 오름차순, 내림차순 배웠는데 compareTo로 정렬해줄 수 있다.
				//값이 얼마 나오는진 중요하지 않다.
				int res = a.compareTo(b);
				System.out.println("비교결과: " + res);
				
				String c = "Java Programming Very Good";
				String d = "java Programming";		
													//대소문자 구분
				boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
													//대소문자 구분x
				boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
				boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
			
				System.out.println(compare1);
				System.out.println(compare2);
				System.out.println(compare3);
			}
}
