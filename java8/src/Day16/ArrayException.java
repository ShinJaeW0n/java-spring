package Day16;


			//예외처리
public class ArrayException {						//무조건 throws 뒤에 s 붙여줘야함!!
			public static void main(String[] args) /*throws ArithmeticException*/ {
				exceptionTest(); //static은 객체 안만들어도됨. 자바는 예외처리를 무조건 해줘야함.
				
				}
						//얘가 디폴트였으면 퍼블릭 구문에서 객체를 만들어줘서 메소드를 호출해줘야한다.
			static void exceptionTest() {
					int[] arr = new int[3];
					try {
					
					arr[2] = 100; //3은 없다. 0 1 2 이기 때문에. //여기서 예외가 발생하면 바로 catch로 넘어간다.
					System.out.println(arr[2]); //윗 줄에서 예외가 발생하면 이 출력문은 거치치 않고 바로 catch구문으로 넘어간다.
					
					//객체를 만들어서 던져라. , 강제적으로 예외를 발생시키려면 객체를 생성해서 throw합니다.
//					throw new ArrayIndexOutOfBoundsException(); // <- 얘를 주석처리하면 catch 구문이 출력되지 않는다.
					}
					//상황에 맞는 예외를 호출해야한다. 아무것도 모르겠을땐 모든 예외의 부모인 Exception을 호출한다.
					//catch 구문은 예외가 발생해야지만 출력된다.
					 catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { //저렇게 한번에 묶어서도 사용할 수 있다.
						System.out.println("숫자 연산이 불가능합니다.");
					}
//					catch(ArrayIndexOutOfBoundsException e) {
//						System.out.println("배열은 범위를 넘어서 사용할 수 없습니다.");
//					}
					catch(Exception e) { //스위치에서 디폴트를 제일 위로 올리면 밑에애들은 사용할 수 없는 거처럼, 모든 것을 처리해버리기 때문에 밑에 애들이 할 것이 없음.
						System.out.println("발생된 모든 예외를 처리합니다."); //Exception은 모든 예외를 처리해버리기 때문에 가장 마지막에 사용해야함.
						e.printStackTrace(); // <- 어디가 잘못되었는지 정보를 알려준다.
					}	finally {	//<- 예외와 상관없이 무조건 실행되는 구간. 생략가능. catch구간이 실행되고 finally 까지 실행이 된다. 
						System.out.println("finally 구간입니다.");
					}
			
					
					
					//Thread.sleep(1000) <- 을 쓰려면 밑에처럼.
					try {
						Thread.sleep(1000);	//예외처리 없이는 실행이 불가능한 코드다.
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
			}

			}
