package Day23;

import java.util.Date;

		//스트림 예제-5	
public class PrintfFormatEx {
		public static void main(String[] args) {
			int num = 10;
			double log = Math.log(num);
			System.out.format("log(%d) : %+10.6f %n" , num, log);
										//소수점 6자리만 출력
			//format과 printf는 똑같다.
			
			Date today = new Date();
			System.out.printf("오늘날짜: %tY년 %tm월 %td일 \n", today, today, today);
			System.out.printf("오늘날짜: %1$tY년  %1$tm월 %1$td일 \n", today);
			System.out.printf("현재시간: %1$tH시  %1$tM분 %1$tS초 \n", today);
			System.out.format("오늘날짜: %tY년  %tm월 %td일 \n", today,today,today);
		}
}
