package java8;

public class Day07test09 {
	public static void main(String[] args) {
		
		//1부터 50까지의 합의 평균을 구하라. 답이 25.5가 나오게 하라.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum += i;
		}
		
		//실수가 정수보다 크다. 작 -> 크 로 갈때는 자동 형변환이 된다.
		//크 -> 작으로 갈땐 밑에 처럼 강제 형변환을 해주어야 한다.
		double avg = (double)sum / 50;
		//평균은 average를 쓴다.
		
		//또는
		//double avg = sum / 50.0;
		//double avg = sum / 50f; float
		//double avg = sum / 50D; double
		System.out.println("1부터 50까지의 합의 평균은? : " + avg);
	
	
	}

}
