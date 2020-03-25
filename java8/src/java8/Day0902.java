package java8;

public class Day0902 {
	
	//마방진
		public static void main(String[] args) {
		
			/*@
			 *@@ 
			 *@@@
			 *@@@@
			 *@@@@@ 
			 * */
			
		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++){
//				
//				System.out.print("@");
//			}
			System.out.print(i);	
			System.out.println();
		}
		
		System.out.println();
		
		/*상하반전*/ //감소 식은 외부 포문을 1씩 감소하게 만들어줘야한다.
			
		for(int i = 5; i>0; i--) {
			for(int j = 0; j < i; j++){
			System.out.print("@");
			
			}
			System.out.println();
		
		}
		
		System.out.println();
		
		/*좌우 반전
		 * 
		 *     @
		 *    @@
		 *   @@@
		 *  @@@@
		 * @@@@@
		 * */
		
		
		for(int i = 4; i >= 0 ; i--) {
			for(int j = 0; j < 5; j++) {
			if(i>j) {
				System.out.print(" ");
			}else {
				System.out.print("@");
			}
				
				
			}System.out.println();
			
		}
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("@");
				}
					
					
				}System.out.println();
			
			}
				/*     @
				 *    @@@
				 *   @@@@@
				 *  @@@@@@@
				 * @@@@@@@@@
				 * */
			
			System.out.println();
			
			for (int i = 0; i < 5; i++) {
				for (int j = 4; j > i; j--) {
				System.out.print(" ");
				
				}
				for( int j = 0; j <= i; j++) {
					System.out.print("@");
				}
				
				for(int j =0; j < i; j++)
				{
					System.out.print("@");
				}
				System.out.println();
				
			}
				
			System.out.println();
			
			
			
			//쌤이한거
			
			for(int i = 4; i >= 0; i--) {
				for(int j = 0; j < i ; j++) {
					System.out.print(" ");
				}
				
				for(int j = 0; j <5-i; j++) {
					System.out.print("@");
				}
				for(int j = 0; j < 4-i; j++) {
					System.out.print("@");
				}
				
				System.out.println();
			}
			
		
			
			//쌤이한거
			for(int i = 1; i < 4; i++) {
				for(int j = 0; j <= i ; j++) {
					System.out.print(" ");
				}
				
				for(int j = 0; j < 4-i; j++) {
					System.out.print("@");
				}
				for(int j = 0; j < 3-i; j++) {
					System.out.print("@");
				}
				
				System.out.println();
			}
			
			
			System.out.println();
			
			
			
			
			
			
			
			
			
			
			for(int i = 4; i >= 0; i--) {
				for(int j = 0; j < i ; j++) {
					System.out.print(" ");
				}
				
				for(int j = 0; j <5-i; j++) {
					System.out.print("@");
				}
				for(int j = 0; j < 4-i; j++) {
					System.out.print("@");
				}
				
				System.out.println();
			}
			
			
			//내가 한거
			for(int i = 1; i < 5; i++) {
				for(int j = 0; j < i ; j++) {
					System.out.print(" ");
				}
				
				for(int j = 0; j < 5-i; j++) {
					System.out.print("@");
				}
				for(int j = 0; j < 4-i; j++) {
					System.out.print("@");
				}
				
				System.out.println();
			}
			
			
			
			
				
			
			
			
			
			// for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j <= i; j++) {
//				System.out.print("@");
//			}
//			
//			System.out.println();
//			
//		}
		
		}
		
		}
	
		



