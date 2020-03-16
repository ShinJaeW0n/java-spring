package java8;

public class Day0306 {
	public static void main(String[] args) {
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = true;
		boolean var4 = false;
	
		
		System.out.println(var1 && var2);
		System.out.println(var1 && var3);
		System.out.println(var1 && var4);
		
		System.out.println(var1 || var2);
		System.out.println(var1 || var3);
		System.out.println(var1 || var4);
		System.out.println(var2 || var3);
		System.out.println(var2 || var4);
		
		System.out.println(!var1);
		System.out.println(!var2);
		System.out.println(!var3);
		
	
		boolean light = false;
		System.out.println("스탠드의 전구가 켜졌나요? " + light);
		
		light = !light; //대입연산자 = 오른쪽값을 왼쪽으로 대입하고 제일 마지막에 대입해야한다.**
		System.out.println("스탠드가 켜졌나요?" + light);
		
		light = !light;
		System.out.println("스탠드가 켜졌나요?" + light);
		
		light = !light;
		System.out.println("스탠드가 켜졌나요?" + light);
		
		light = !light;
		System.out.println("스탠드가 켜졌나요?" + light);
		
		//이런것을 토글이라한다. 스위치를 껐다켰다하는 효과.
	}
}
