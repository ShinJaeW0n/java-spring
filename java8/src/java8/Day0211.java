package java8;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str; 
		ch = 'A' + '1';  //기본적으로 자바는 숫자가 뒤에 온다.
		//A = 65, 1는 48. 그래서 r이 출력된다. 113
		System.out.println(ch);
		
		int res = ch;
		System.out.println(res);
		
		str = "A" + "1"; //문자열은 아무것도 없거나 한개의 문자만 있어도
						//쌍 따옴표로 감싸면 문자열입니다.
		System.out.println(str);
		//문자열의 덧셈은 하나의 문자열로 합치게 됩니다.
		
		String str2 = "10";
		int num2 = 10;
		String res2 = str2 + num2; //문자열과 다른 자료형이 합치게 되면 하나의 문자열이 됩니다.
		//다른 어느 자료형이 와도 문자열이 된다.
		System.out.println(res2);
		
		int num3 = 10;
		int num4 = 20; //int는 integer의 약어입니다.
		System.out.println(num3 + "" + num4); //숫자를 문자로 변형하는 방법1
		//덧셈은 왼쪽부터 계산하기 때문에 ""을 중간에 넣어준다.
		//컴퓨터는 앞에서 부터 2개씩 연산한다.
		//""을 넣으면 문자열이 된다.
		
		String str3 = String.valueOf(num3);//숫자를 문자로 변형하는 방법2
		
		String str4 = "100";
		System.out.println(str4 + 100);
		
		int num5 = Integer.valueOf(str4);//문자를 숫자로 변형하는 방법.
		double d1 = Double.valueOf(str4);
		
		int num6 = Integer.parseInt(str4);
		double d2 = Double.parseDouble(str4);
		
		
		String str5 = "Hello";
	//	int num7 = Integer.valueOf(str5);
		int num7 = Integer.parseInt(str5);
		System.out.println(num7); //숫자가 아닌것은 valueOf가 안된다.
		
		
	}
}


/* 
 number1;
 number2;
 number3;
 number4;
 number5;
 number6;
*/