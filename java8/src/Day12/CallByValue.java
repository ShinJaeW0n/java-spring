package Day12;

public class CallByValue {

		//값에 의한 전달****
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		CallByValue cv = new CallByValue();
		int res = cv.plus(num1, num2);
		System.out.println(res);
		System.out.println(num1 + num2); 
		//num의 값만 호출한거임. 값만 복사를 한거임. 원본의 변경은 불가능.
		//이것을 콜바이벨류라고 함.
	
		
		//콜바이레퍼런스. 원본의 주소값을 가져가기 때문에 원본의 값이 바뀌는 것.
		int [] arr = {10,20,30,40,50};
		int res2 = cv.sum(arr); 
		System.out.println(res2); //150, 원본의 값을 바꿔 450이 됨.
		
		int sum = 0;
		for (int n : arr) {
			sum +=n;
		}System.out.println(sum); //150
	
	}
				//num1 , num2와 별개다.
		int plus(int x, int y) {
			x +=10;
			y +=10;
			return x + y;
		
		}

		int sum(int [] arr) {
			arr[2] = 330;
			int sum = 0;
			for (int n : arr) {
				sum+=n;
			}
			return sum;
		}
		
		
}



