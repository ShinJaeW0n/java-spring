package Day12;

import java.util.ArrayList;
import java.util.List;

//박싱, 언박싱***
public class WrapperEx {
	public static void main(String[] args) {
			
			int number = 10;
			
			
			//박싱 , 기본값인 int를 객체로 바꾸고 싶을때, 객체로 처리해야할 부분이 필요하기 때문에 사용.
			Integer iBox = new Integer(number); //매개변수는 기본값 또는 문자열을 입력할 수 있다.
			Integer iBox2 = Integer.valueOf(number);
			
			//언박싱 , 객체를 int기본값으로 바꿀 때
			number = iBox.intValue();
			number = iBox2.intValue();
			
			//자동 박싱
			Integer iBox3 = number;
			
			//자동 언박싱 ,원래라면 객체와 기본값은 연산이 안되는데 자동 언박싱되서 연산이 됨.
			int result = iBox3+10;
			System.out.println(result);
			
			//List는 객체만 넣을 수 있음. 그냥 기본값인 int로는 List 목록을 만들어줄 수 없기 때문에.
			List<Integer> list = new ArrayList();
			
	}
}
