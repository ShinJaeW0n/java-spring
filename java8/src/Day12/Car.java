package Day12;

public class Car { // 클래스는 대문자로 시작!!! 파일명과 동일한 클래스는 public이어야한다. 
	//설계도 도면을 만듦.
							/* 필드 , 객체의 속성 */
			String company = "기아자동차";  //car에다가 값을 초기화
			String model = "쏘울";
			String color = "파랑";
			int maxSpeed = 250;
			int speed = 0;
	
				/*생성자*/
			Car(){ //<= 기본생성자.  생성자를 생성하지 않으면 기본 생성자가 자동으로 작성됩니다.
				//생성자를 만들어주면 기본 생성자는 자동으로 만들어지지않음.
//				this.company = "기아자동차";
//				this.color = "검정";
//				this.maxSpeed = 300;
				this("기아자동차" , "검정" , 300); //이렇게 자기 자신을 호출해서 쓸 수 있다. 코드를 줄일 수 있음.
				
				}
			
			
			//매개변수의 개수와 종류 마음대로 변경할 수 있고 여러 생성자들을 만들어낼 수 있다. 오버로딩
			//생성자는 필요한만큼 중복정의(생성) 할 수 있다.
			
			Car(String company, String col, int maxSpeed){
				this.company = company; //필드 company에 입력해야해서. this.company = car.company
				color = col; //매개변수의 이름은 원하는대로 바꿀 수 있다. 변수의 이름이 다르기 때문에 this가 없어도됨.
				//같은 이름을 사용할때는 필드와 매개변수를 구분해줘야해서 this를 적어줘야함.
				this.maxSpeed = maxSpeed; //이름 똑같이 하고 this를 사용하는 것을 더 많이 선호한다. 걍 이렇게 쓰자.
				//생성한 이후에는 재 생성 할 수 없다. 한 번만 사용가능하다.
				//값을 바꿀려면 도트연산자 . 을 이용해야한다.
			}
			
			Car(String color, int maxSpeed){
				this("기아자동차", color, maxSpeed); //자기 자신을 호출해서, 나 자신을 호출할때는 this를 사용한다. 
			}
			
			Car(int maxSpeed){
				this("기아자동차 " , "검정", maxSpeed);
//				this.company = "기아자동차";
//				this.color = "검정";
//				this.maxSpeed = maxSpeed;
			}
			

			
			
			
			
//			Car(String company, int maxSpeed, String color){
//				}
//			
//			Car(String color, int speed, int maxSpeed){
//				}
//			
//			Car(String company, String color, int maxSpeed, int speed){
//				
//			}
//			
//			//얘는 안된다. 자료형의 형태가 동일하면 중복으로 쓸 수 없다. 자료의 형태가 다르거나 개수가 다르거나 해야 
//			//중복 정의가 된다.!!
////			Car(String color, String company, int maxSpeed){
////				
////			}
//			
//			//얘는 된다. 자료의 형태가 중요하다. ex)int, String 등..
//			Car(int color, String company, int maxSpeed){
//				
//			}
			
				/*메서드 영역*/
			void accel() {
				speed+=10; //this.speed가 더 명확하다.
				if(speed > maxSpeed) {
					speed = maxSpeed;
				
				
				}
				System.out.println("현재 속도: " + speed);
			}
			
			void brake(){
				speed = 0;
				System.out.println("현재 속도: " + speed);
				
			}






}
