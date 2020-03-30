package Day12;

public class StaticBlock {
		static String company = "삼성";
		static String kind = "LCD";
		static String product = company + "-" + kind; //요즘 버전엔 이렇게 해도 가능.
		static String pro2;
		
		//8버전은 stataic을 연산하려면 오류남.
		//그래서 밑에 처럼 했었음.
		static {
			pro2 = company + "-" + kind;
		}
		
		

}
