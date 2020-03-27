package java8;

public class Day1103 {
		//처음 두개의 배열 요소만 초기화된 상태에서 나머지 배열요소는 다음 계산 규칙에 따라 채우고
		//배열을 출력하세요. ex)세번째 요소 - 첫번째 요소 + 두번째요소 ~ 열번째 요소  = 여덟번째요소+아홉번째요소
		public static void main(String[] args) {
			int[] a = new int[10];
			a[0] = 1;
			a[1] = 2;
			
					//0과 1은 있으니까
		for(int i = 2; i<a.length; i++) {
			a[i] = a[i-2] + a[i-1];
			
		}
		
		for(int num : a) {
			System.out.println(num);
		}
		}
}
