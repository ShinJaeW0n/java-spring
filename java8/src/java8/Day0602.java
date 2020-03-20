package java8;

public class Day0602 {
	public static void main(String[] args) {
		int sum = 0;
		
		
		//꼭 변수명을 i로 하지않아도됨. 하지만 일반적으로 for문을 사용할때는 변수를 i로 쓴다.
		//for문의 특성인 index라는 순차적인것을 위해 i를 쓰는 것이다.
		//증감식에선 ++ -- 등등 다 사용가능.	(index += 1 , index = index + 1 이랑 같은 뜻이다. index = index +3, index = index *3 도 가능.)
		for(int index = 1; index <= 100; index++) {
			sum +=index;
		}
		System.out.println("1부터 100까지의 합: " + sum);
		//System.out.println("현재 i의 값이 얼마인가: " + i);
		
		//i를 밖에서 선언하지 않고 조건식 안에서만 선언하면 괄호안에서만 사용할 수 있다. 괄호안의 것은 괄호 안에서만 쓸 수 있다.
		//i를 밖에서 출력해야된다면 괄호 밖에서 선언해줘야한다.
//		i가 101인 이유 : i++를 통해서 101이 되었으나 조건식에서 막혀서.
		
		//컨트롤+/ = 주석처리로 제일 많이 사용
		
	}
}
