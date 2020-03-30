package Day12;

public class ComputerEx {

		public static void main(String[] args) {
		Computer com = new Computer();
		int [] arr1 = {10,20,30};
		int res1 = com.sum(arr1);
		System.out.println(res1);
		
		
		//매개변수로 생성할땐 중괄호로 대입 ㄴㄴ
		//메서드의 매개변수로 입력할때는 반드시 객체형태로 만들어줘야함.
		int res2 = com.sum(new int[]{10,20,30,40,50});
		System.out.println(res2);
		
		int res3 = com.sum2(arr1);
		System.out.println(res3);
		
		int res4 = com.sum2(new int[]{10,20,30,40,50});
		System.out.println(res4);
		
							//가변형 인자를 사용하면 그냥 매개변수 인자들을 받을 수 있다.
		int res5 = com.sum2(10,20,30,40,50,60,70);
		System.out.println(res5);
		
						//배열형으로 받으면 인자 그냥 받는거 안됨.
//		int res6 = com.sum(10,20,30);
	}
}
