package Day17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

		//벡터 Vector - list 쓰면 elements가 안나오기 때문에 Vector로 객체생성, 자바 297p까지
public class EnumerationEx {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("사과");
		v.add("배");
		v.add("복숭아");
		
		Enumeration<String> e = v.elements();
		
		//요소가 남아있나?
		while(e.hasMoreElements()) {
			String fruit = e.nextElement();
			System.out.println(fruit);
		}
		
		System.out.println("================");
		
		//해시테이블에서 이너멀레이션을 사용하면 키 값이 없어지고 벨류값만 남게된다.
		Hashtable<String, Integer> h = new Hashtable<>();
		h.put("국어", 90);
		h.put("영어", 90);
		h.put("수학", 90);
		
		Enumeration<Integer> he = h.elements();
		while(he.hasMoreElements()) {
			int score = he.nextElement();
			System.out.println(score);
		}
		
		System.out.println("==============");
		
		//Entry는 set이다.
		Set<Entry<String, Integer>> entry = h.entrySet();
		Iterator<Entry<String, Integer>> iterator = entry.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> en = iterator.next();
			String subject = en.getKey();
			int score = en.getValue();
			System.out.println(subject + " : " + score);
		}
		
		
		
	}
}
