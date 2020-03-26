package java8;

import java.util.Arrays;

public class Day1010 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = num1;
		System.out.println(num2);
		
		String str1 = "hello";
		String str2 = str1;
		System.out.println(str2);
		
		System.out.println("==========");
		
		int [] arr1 = {10,20,30};
		int [] arr2 = arr1; //원래 프로그래밍에서는 불가능합니다. 자바에서는 예외로 사용가능합니다.
		for(int i =0;  i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("==========");
	
		int num = Integer.MAX_VALUE + 1;
		System.out.println(num);
		
		System.out.println("==========");
		
		
		//배열 복사
		
		int [] arr3 = new int[5];
							//arr1의 0번째를 arr3의 0번째에 arr1길이만큼 복사하겠다.
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		for(int i = 0; i <arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.arraycopy(arr1, 1, arr3, 3, 2);
		
		System.out.println("==========");
		
		for(int i = 0; i <arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("==========");
										//2개만 복사해라.
		int[] arr4 = Arrays.copyOf(arr1, 2);
		for(int i = 0; i <arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		//arr4의 길이는 2가 되는것을 알 수 있다.
		System.out.println(arr4.length);
	}

}
