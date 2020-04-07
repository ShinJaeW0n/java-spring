package Day18;

public class FunctionalEx {

				public static void main(String[] args) {
					Functional f1 = new Functional() {
						
						public void method() {
							
							System.out.println("f1 익명구현객체로 메소드호출");
							
						}
					};
					
					f1.method();
					
					Functional f2 = () -> {
						
						System.out.println("f2람다식으로 메소드호출");
					
					};
					f2.method();
					
					Functional f3 = () -> System.out.println("f3람다식으로 메소드호출"); 
					f3.method();
				}
	
}
