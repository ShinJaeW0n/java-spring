package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		//순차적으로 넣엇을땐 , 제일 뒤에 할때는 array가 더 빠르다.
		
		System.out.println("ArrayList와 LinkedList 비교");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {

			arrayList.add(String.valueOf(i));
		}
		
		System.out.println("===================");
		
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start)/1000 + "ms");
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {

			linkedList.add(String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start)/1000 + "ms");
		
		
		System.out.println("======================");
		
		
		
		//중간에 삽입해줄땐 linked가 더 빠르다.
		
		System.out.println("ArrayList와 LinkedList 비교");
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
						
						//0번에 스트링을 넣어주라고. 0번에 넣어줘서 하나하나씩 다 밀림.
			arrayList.add(0, String.valueOf(i));
		}
		
		System.out.println("===================");
		
		end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start)/1000 + "ms");
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {

			linkedList.add(0, String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start)/1000 + "ms");
		
		
	}
}
