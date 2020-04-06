package Day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

			/*list와 set*/
public class HashSetEx {
		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			
			list.add("사과");
			list.add("배");
			list.add("포도");
			list.add("멜론");
			list.add("멜론"); // list는 동일한 값을 넣을 수 있다. 중복 ㅇㅋ
			for(String str : list) {
				System.out.println(str);
			}
			
			System.out.println();
			
			
			//set은 섞이게 된다.
			Set<String> set = new HashSet<>();
			set.add("사과");
			set.add("배");
			set.add("포도");
			set.add("멜론");
			set.add("멜론");//set은 동일한 값을 허용하지 않음. 멜론 2개 넣어도 1개만 나옴.
			for(String str : set) {
				System.out.println(str);
			}
			
			System.out.println(set.contains("사과")); // 트루.
			System.out.println(set.isEmpty()); //펄스
			if(!set.isEmpty()) {
				set.clear();
			}
			
			System.out.println(set.size()); //0이라고 뜬다.
			
			System.out.println("=================");
			
			//유틸로 들고와야함.
			Iterator<String> iterator = list.iterator(); //컬렉션 공통 메소드.
						//해즈 넥스트라면 이터레이터 넥스트 값을 str에 넣어줘라.
			while (iterator.hasNext()) {
				String str = iterator.next();
				System.out.println(str);
			}
			
			System.out.println();
		
			
		}
}
