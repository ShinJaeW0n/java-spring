package Day12;

public class Computer {
		
	
		//리턴값을 입력해줘야함.
		int sum(int [] arr) {
			int sum = 0;
			
			for(int i =0; i<arr.length; i++) {
				sum+=arr[i];
			}
			return sum;
		}
					
					//가변형 , 가변형인자는 배열형으로 자동으로 변환이 된다.
		int sum2(int ... arr) {
			int sum2 = 0;
			
			for(int i =0; i<arr.length; i++) {
				sum2+=arr[i];
			}
			return sum2;
		}
		
	
}
