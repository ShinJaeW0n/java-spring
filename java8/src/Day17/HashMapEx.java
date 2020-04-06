package Day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
			
				/*여기있는 3개 다 많이 씀. 중요!*/
	
		public static void main(String[] args) {
			
			//맵은 2개의 키, 값을 넣어줘야한다.
			Map <String , Integer> map = new HashMap<>();
			//put으로 값을 넣어준다.
			map.put("국어", 80);
			map.put("수학", 97);
			map.put("영어", 79);
			map.put("과학", 82);
			
			
			
			
			//키로 검색할 수도 있고 벨류(값)으로 검색할 수 도 있따.
			System.out.println(map.containsKey("국어")); //트루
			System.out.println(map.containsValue(90)); //펄스
			System.out.println(map.isEmpty());
			
			System.out.println("=====================");
			
			//keySet
			Set<String> keySet = map.keySet();	//set을 사용해서 순서는 무작위로 나옴.		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); //get에 key 값을 넣으면 그에 대응되는 값이 리턴된다.
			}
			
			
			System.out.println();
			
			map.put("과학", 80);
			/*Set<String>생략*/keySet = map.keySet();	//set을 사용해서 순서는 다르게 나옴.		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); //과학이 80으로 바뀜. key는 중복이 안되기 때문. 
				//뒤에 바뀐 값으로 출력이 된다. 값을 바꿀때 put을 사용할 수 있다. 국어와 과학의 값이 동일해도 출력되듯이 값은 중복 가능. 
			}
			
			
			System.out.println();
			
			//유틸로 임포트 해야함.
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
							
						//이터레이터가 다음과 같다면
			while(iterator.hasNext()) {
				Entry<String, Integer>entry = iterator.next();
				String key = entry.getKey(); //키 데이터를 가져오고
				int score = entry.getValue(); //값 데이터를 가져옴.
				System.out.println(key + " : " + score);
			}
			
			
			System.out.println("=================");
			
			int num = map.remove("수학"); //키가 지워짐.
			System.out.println(num);
			keySet = map.keySet();		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); 
		
		}
			
			System.out.println("==================");
			
			boolean isEntry = map.remove("과학", 79);
			System.out.println(isEntry);
			keySet = map.keySet();		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); 
		
		}
			
			
			System.out.println("========================");
			
			isEntry = map.remove("과학", 80);
			System.out.println(isEntry);
			keySet = map.keySet();		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); 
		
		}
			
			System.out.println("===================");
			
			
			if(!map.isEmpty()) {
				map.clear();
			}
			System.out.println(map.size());
			
	
}
		
}
