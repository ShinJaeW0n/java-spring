package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {
			
	
			/* 컬렉션   ::: remove, add, get 제일 중요. 외워주기.*/
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size()); //0
		
		
		list.add("사과");
		list.add("배");
		list.add("오렌지");
		list.add("파인애플");
		
		System.out.println(list.size()); //4
		
		String str = list.get(0); 
		System.out.println(str);//사과
		
		System.out.println("============");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //순서대로 출력됨. get -> 정보를 가져와라.
		}
		
		System.out.println("============");
		
		list.add(2,"포도"); //2번에 포도를 삽입
		for(String t : list) {
			System.out.println(t); //중간에 2에 포도가 들어간다.
		}
		
		System.out.println("============");
		
		
		list.remove(1);//1번을 삭제
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //순서대로 출력됨.
		}
		
		
		System.out.println("================");
		
		list.remove("오렌지");// 오렌지를 삭제. 숫자뿐 아니라 값(문자)를 넣어서 삭제 할 수도 있다.
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //순서대로 출력됨.
		}
		
		
		System.out.println("==========");
		
		list.set(1, "참외"); //1번을 참외로 바꿔주고 싶다.
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //순서대로 출력됨.
		}
		
		System.out.println(list.size()); //3개 밖에 없으니 3만 나온다.
		
		System.out.println("===========");
		
		
		System.out.println(list.contains("참외")); //참외가 있냐? 트루 펄스로 나옴.
		System.out.println(list.contains("포도")); //포토가 있나?
		System.out.println(list.isEmpty() ); //리스트가 비었나? 트루 펄스
		
		System.out.println("================");
		
		//반대하려면 앞에! 붙이면 된다.
		if(!list.isEmpty()) { //<= 리스트가 비지 않았다면!
			list.clear(); // <= 리스트를 다 비워라.
		}
		
		System.out.println(list.isEmpty()); //리스트가 비었나? 트루 펄스
		System.out.println(list.size()); //안에 아무것도 없으니 0으로 나온다.
		
		
		System.out.println("============");
		
		//배열일 경우 30을 확인 할때
		int[] arr = new int[] {10,20,30,40,50};
		for(int num : arr) {
			if(num == 30) { 
				System.out.println(num == 30); //트루.
			}
		}
		
		System.out.println("=============");
		
		//리스트 이용해서 30을 확인할 경우.  
		//제네릭에선 기본형 int 못씀. 참조형만 쓸 수 있음.
		List<Integer> arrList = Arrays.asList(10,20,30,40,50);
		System.out.println(arrList.contains(30)); //트루.
		
		//배열을 리스트로 한번에 바꾸는 방법은 없음. 밑에처럼 억지로는 가능.
//		List<Integer> streamList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		for(int i = 0; i<streamList.size(); i++) {
//			System.out.println(streamList.get(i));
//		}
		
		System.out.println("===============");
		
		//리스트를 배열로 바꿀 때.
		Integer[] ary = arrList.toArray(new Integer[arrList.size()]);
		
		//클리어나 리무브 사용이 안되고 get,set,contain만 사용가능하다.
//		arrList.clear();
//		System.out.println(arrList.get(0));
		
		
		
		
		
		
		
	}
}
