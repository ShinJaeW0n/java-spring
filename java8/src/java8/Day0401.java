package java8;

public class Day0401 {
	public static void main(String[] args) {
		int a = 3 , b = 5;
		
		/*비트이동(shift) 연산자*/
		int res1 = a << 2;
		System.out.println(res1);
		//왼쪽으로 x2가 되기 때문에. 3x2 6x2 = 12
		
		int res2 = a>>1; //   /2가 된다.
		System.out.println(res2);
		
		int res3 = a >> 2;
		System.out.println(res3);
		
		int res4 = ~b; //비트 반전 -5에 -1 한 값. 비트 논리연산자.
		System.out.println(res4);
		
		int res5 = res4 << 1;
		System.out.println(res5);
		
		int res6 = res4 >> 1;
		System.out.println(res6);
		
		int res7 = res4>>> 1; 
		System.out.println(res7);
		
		//비트논리연산자
		int res8 = a & b; //비트 논리 연산자는 기호를 하나만 사용합니다. 2개는 논리연산자
						//a는 3이여서 0011이 되고  b는 5니까 0101이 된다.
						//0001 이 되어서 끝에 1이 나온다.
		System.out.println(res8);
		
		int res9 = a|b;
		System.out.println(res9); //0111 이 됨. 0111은 7
		
		int res10 = a ^ b;
		System.out.println(res10); //2개가 같으면 0 , 0110 = 6
		
	}

}
