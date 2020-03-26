package java8;

public class Day1006 {
	//2차원 배열
	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 }; // length는 5라는 값을 출력
		int[][] ary1 = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } }; 
		// ary1.length는 첫번째[]의 숫자/4개.
		// new int[4][2];

		System.out.println(ary1.length);
		System.out.println(ary1[0].length); // 내부의 배열의 길이 반환. 10과 20 -> 2개.
		System.out.println(ary1[1].length);
		System.out.println(ary1[2].length);
		System.out.println(ary1[3].length);
		
								//4
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++)
				System.out.println(ary1[i][j]);
		}

		//이렇게 해도 같다.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++)
				System.out.println(ary1[i][j]);
		}
	
		System.out.println("===========");
	
		int[][] ary2 = {{10,20,30},{40},{50,60}};
		
		//길이가 다를 경우에는 length를 사용해야 전체를 반복해줄 수 있
		for(int i = 0; i<ary2.length; i++) {
			for(int j = 0; j<ary2[i].length; j++) {
				System.out.println(ary2[i][j]);
			}
		}
		
		
	
	
	
	}
}
