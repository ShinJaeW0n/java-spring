package Day15;

public class Hangman2 extends Hangman {
	
		//클래스에 귀속 시켜줘야함.
		static String[] arr = {"hello" , "hospital" , "capacity" , "java"};
		static String str = arr[(int)(Math.random()*arr.length)];
	
		public Hangman2() {
			super(str); // <-객체가 없으면 빨간줄이 나옴. 그래서 위에 애 둘을 클래스에 귀속 시켜줌.
		}

}
