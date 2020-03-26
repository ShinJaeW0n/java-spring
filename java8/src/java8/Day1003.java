package java8;

public class Day1003 {

		public static void main(String[] args) {
		int[] arr = {10,20,30};
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
		int[] arr2 = {10,20,30,40,50};
		int sum2 = 0;
		double avg2 = 0;
		for(int i = 0; i <5; i++) {
			sum2+=arr2[i];
		}
		avg2 = sum2 / 5.0; // int / int 라서 5.0으로 실수로 바꿔줘야함. 작->크 라서 저렇게 바꿔주면 자동 형변환됨.
		System.out.println("배열의 합계: " + sum2);
		System.out.println("배열의 평균: " + avg2);
		System.out.println("배열의 개수: " + arr2.length); // lengh는 배열의 크기(개수)를 출력한다.
		//arr의 길이를 출력함.	
		
		
		
		int[] arr3 = {10,20,30,40};
		System.out.println("arr의 크기: " + arr3.length);
		
		for (int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		
		}
		
		
			
	}
}
