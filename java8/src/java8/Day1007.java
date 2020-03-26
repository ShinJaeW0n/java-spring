package java8;

public class Day1007 {

	public static void main(String[] args) {
		
		//보통은 이렇게 씀.
		
		int[][] ary1 = new int[][] {{10,20},{30,40},{50,60}};
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		System.out.println(ary1[1].length);
		System.out.println(ary1[2].length);
		
		System.out.println("========");
		
		int[][] ary2 = new int[3][2]; //비어있는 배열을 만들때는 반드시 값을 넣어줘야한다.
		System.out.println(ary2	.length);
		System.out.println(ary2[0].length);
		System.out.println(ary2[1].length);
		System.out.println(ary2[2].length);
		
		System.out.println("=========="); 
		
		
		
		//길이가 서로 다른 2차원 배열, 메모리는 효율적이나 귀찮아서 잘 안씀.
		//보통은 [3][10] 이렇게 제일 큰 걸 기분으로 만듦. 메모리는 많이 쓰게 되지만 그게 더 편해
		int[][] ary3 = new int[3][]; //내부 배열의 크기가 정해지지 않음.
		ary3[0] = new int[5];
		ary3[1] = new int[3];
		ary3[2] = new int[10];		
		
		System.out.println(ary3	.length);
		System.out.println(ary3[0].length);
		System.out.println(ary3[1].length);
		System.out.println(ary3[2].length);
		
	}
}
