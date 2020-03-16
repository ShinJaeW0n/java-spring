package java8;

public class Day0308 {
	public static void main(String[] args) {
		//증감 연산자는 많이 사용함****
		
		int a = 10;
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		System.out.println();
		
		a++;  // a++ = a+1 / 전위연산자, 전치연산자
		System.out.println(a);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
	
	
		++a; // ++가 앞이나 뒤에 있어도 동일하게 1씩 증가된다. / 후위연산자, 후치연산자
		System.out.println(a);
		++a;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println();
		
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		a--;
		System.out.println(a);
		System.out.println(); // 얘는 한칸 띄어줄려고
		
		
		
		
		//전위와 후위를 구별하는 이유.
		
		a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println();
		//먼저 증가나 감소를 한 후에 
		
		
		
		System.out.println(a++); //15의 후위연산
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println();
		//자기가 소속되어있는 줄(51)에 먼저 연산을 하고 그 다음에 +1을 한다.
		
		System.out.println(a);
		
		
		
		
	}
}

