package Day18;

public class MyFuncEx {

		public int outField = 10;
		
		//중첩클래스
		class Inner{
			int inField = 20;
			
			void method() {
				//람다식
				MyFunc fi = () ->{
					System.out.println("outField: " + outField );//제일 가까이 있는 outField
					System.out.println("outField: " + MyFuncEx.this.outField + "\n" );//MyFuncEx에 속해있는 outField
					System.out.println("inField: " + inField );//제일 가까이 있는 inField
					System.out.println("inField: " + this.inField + "\n" ); //this-나자신이 속해있는
													
				};
				fi.method();
				
				
				MyFunc fi2 = new MyFunc() { //익명구현객체. 인스턴스.
					
					@Override
					public void method() {
						System.out.println("outField: " + outField );
						System.out.println("outField: " + MyFuncEx.this.outField + "\n" );
						System.out.println("inField: " + inField );
						System.out.println("inField: " + Inner.this.inField + "\n" );  
										//람다는 메소드다. 
					} 					//this.inField <- 여기서 this는 fi2라는 객체가 되는 것이다.
						
					
				};
			}
		}
		
}
