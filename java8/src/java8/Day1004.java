package java8;

public class Day1004 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {0,0,0,0,0}; // 0으로 채워진 크기가 5인 배열
		int[] arr3 = new int[5]; //배열의 크기가 5인 값이 없는 배열. 크기만 설정. 값은 넣어주지 않았음.
		
		//값을 입력하지 않으면 0이 들어간다.
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//false가 0이기 때문에.
		boolean[] arr4 = new boolean[5];
		for(int i =0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		//object는 아무것도 없다는 null이 뜬다. 참조형, 레퍼런스 타입  = 기본값 null
		String[] arr5 = new String[5];
		for(int i =0; i<arr5.length; i++) {
			System.out.println(arr5[i]);
		}
	
		//arr3 = {10,20,30,40,50}; // <=이렇게 하면 안됨. 중괄호 초기화는 최초의 한번만 사용가능합니다.
		//배열은 최초에 한번만 초기화가능. 두번째부터 중괄호로 초기화하는 것은 불가능.
		arr3[0] = 10; //각각의 인덱스에 접근하는 것은 가능합니다.
		arr3[1] = 20;
		arr3[2] = 30;
		arr3[3] = 40;
		arr3[4] = 50;
		//자바의 배열은 객체가 들어간다. 자바는 객체를 대입해줄 수 있다.
		
		
	
	}
	
	
	
}
