package java8;

public class Day1011 {
		// 향상된 for문. for-each
		// 향상된 for문이 더 빠르다는걸 증명하려고.
		// 모든 데이터를 사용하려면 - 향상된for문 (더 많이 사용함.)
		// 특정 데이터만 뽑아서 사용하려면 - 일반 c형 for문
	
		public static void main(String[] args) {
		int[] arr = new int[300_000_000]; //3억개짜리 배열
		int sum = 0;
		int sum2 = 0;
		
		System.out.println("C형 for문: ");
		long sTime = System.currentTimeMillis();
		for(int i =0; i<arr.length; i++) {
			sum +=i;
		}
		
		long eTime = System.currentTimeMillis();
		System.out.println(eTime - sTime);
		System.out.println();
		
		
		
		System.out.println("향상된 for문: ");
		long sTime2 = System.currentTimeMillis();
		for(int number1 : arr) {
			sum2 +=number1;
		}
		long eTime2 = System.currentTimeMillis();
		System.out.println(eTime2 - sTime2);
		
		
		
		
		}
}
