package java8;

public class Day1101 {

	/*1부터 100까지 저장하는 배열을 만들고 전체의 합을 출력하라*/
	
	public static void main(String[] args) {
		//나는 배열에 1부터 100을 저장하는 곳에서 막힘.
		int[] a = new int[100];
		
		for(int i = 0; i <a.length; i++) {
			a[i] = i + 1; //1부터 100까지 출력하려고	
			
		}
		
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			//1부터 100까지 숫자 중 5로 나누어 떨어지면 엔터쳐줘.
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	
		int sum = 0;
		for(int i =0; i <a.length; i++) {
			sum += a[i];
		}
		System.out.println("1~100까지의 합: " + sum);
	
	}
	
}
