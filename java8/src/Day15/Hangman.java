package Day15;

import java.util.Scanner;

public class Hangman {

		private String hiddenString;		//숨겨진 문자열(문제)
		private StringBuffer outputString; 	//플레이어의 입력에 따른 결과로 보여줄 문자열
		private StringBuffer inputString;	//플레이어가 입력한 문자들의 모임
		private int remainder;				//맞힌 문자열(못 맞히고 남아있는 문자의 수)
		private int failed; //<-int는 이렇게 아무것도 입력안하면 자동으로 0으로됨.	//실패한 횟수
		private Scanner sc; 
		private String inputData;
		
	
		
		public Hangman() {
			this("hello");
			
			}
			
		
		public Hangman(String solution) {
			hiddenString = "hello"; //문제는 hello , 정답 초기화
			
			/*초기화 코드 추가*/
			outputString = new StringBuffer();
			inputString = new StringBuffer();
			remainder = hiddenString.length();
			failed = 0;
			sc = new Scanner(System.in);
			inputData = "";
			
			for(int i = 0; i<remainder; i++) {
				outputString.append("_");
			}
			
			}
		
		
		
			
		void playGame(){
			System.out.println("행맨 게임을 시작합니다.");
			show();
			do {
				do {
			setInputData();
			}while (checkChar(inputData)); //입력했던 글자가 true가 나오면 다시 반복될것이다.
			processGame(); //입력받은 구문을 처리하는 구간.
			show();
			}while(failed < 6 && remainder > 0); //페일이 6이 되거나 리마인더가 0이 되면 게임 종료.
			System.out.println("행맨 게임을 종료합니다.");
		}
		
				
				//현재상황
		private void show() {
			System.out.println("틀린 횟수 :" + failed + "/6");
			System.out.println(outputString); // <- 정답.
		}

		
		
		private void setInputData(){ //원하는 언어 인덱스 추출. 뒷 번호 전까지 가져옴.
			System.out.print("문자를 입력해주세요: ");
			this.inputData = sc.next().substring(0, 1); //한글자만 나올 수 있도록
		}
		
				//트루,펄스 	//글자 체크
		private boolean checkChar(String inputData) {
			//이 글자가 있는지 없는지 확인할 수 있다.
			if (inputString.indexOf(inputData) == -1){ //데이터가 없다면
				inputString.append(inputData); //inputData를 추가.
				return false;
			}
			
			System.out.println("이미 입력한 문자입니다.");
			return true;
		}
				//확인한 것을 처리한것.
			private void processGame() {
				//숫자로 나올거라서.
				
				if(hiddenString.indexOf(inputData) == -1) { //, 정답에 없는 문자라면
					failed++;
				}else {
					int index = hiddenString.indexOf(inputData);
					do {
					outputString.setCharAt(index, inputData.charAt(0)); // <-첫번째 글자를 가져와서 index번을 하겠다? 
					remainder--;
					index = hiddenString.indexOf(inputData, index+1);
					}while(index != -1); //돌아가면서 있는거 다 찾고 -1되면 빠져나온다.
					}
			}

}
		
		
		
		
//		for(int i = 0; i < 6; i++) {
//			
//			System.out.println(outputString);
//			System.out.print("알파벳 1개를 입력해주세요: ");
//			inputData = sc.next().substring(0, 1);
//			
//			if(inputData.equals(hiddenString.charAt(i))) {
//				
//				System.out.println(inputData+outputString);
//			}else {
//				
//				failed++;
//				System.out.println("틀렸습니다. 다시 입력해주세요.");
//			}
//			
//			
//		} System.out.println("틀린개수: " + failed);
		
		
		
		
		
		
		
		
		
		
		
//		public String playGame1() {
//			
//			for(int i = 0; i<hiddenString.length()+2; i++) {
//				
//				System.out.println(str);
//				System.out.print("알파벳 1개를 입력해주세요: ");
//				me = sc.next();	
//				
//				
//				if(me.equals(hiddenString.charAt(i))) {
//				String ch1 = me;
//					System.out.println(ch1+str);
//				}else {
//					System.out.println("틀렸습니다. 다시 입력해주세요.");
//				}
//				
//				
//			}
//			System.out.println("짝짝짝! 정답입니다.");
//			return hiddenString;
//		
//		
//		}
		
		
		
		
		
		
		
		
			
			
			
		
	
