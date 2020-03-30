package Day12;

public class CarEx { //실행영역
		public static void main(String[] args) {
						//Car에서 생성자가 이미 만들어졌기 때문에 값을 넣어줘야함.
			Car myCar = new Car("쌍용자동차", "노랑", 350); //Car 객체생성(인스턴스instance) , 카멜기법으로 변수명 설정해줌.
			//객체는 따로따로 저장되는 공간이다.
			
			System.out.println("데이터 입력 전"); //car에다가 값을 초기화해준 값.
			System.out.println(myCar.company);
			System.out.println(myCar.maxSpeed); //int는 값이 정해지지 않으면 0임.
			
			
			myCar.company = "현대자동차"; //myCar의 속성만! 이렇게 변하는 것임.
			myCar.model = "아반떼";
			myCar.color = "은색";
			myCar.maxSpeed = 300;
			myCar.speed = 100;
			
			System.out.println("데이터 입력 후");
			System.out.println(myCar.company);
			System.out.println(myCar.maxSpeed);
			
							//기본생성자로 생성을 해서 ()에 아무것도 적어주지 않아도됨.
			Car yourCar = new Car(); //새로운 객체를 생성하면 원래 설계도대로 만들어짐.
			
			System.out.println(yourCar.company);
			System.out.println(yourCar.maxSpeed);
			
//			int num1 = 10;
//			int num2 = 10;
//			num1 = 100;
//			//num1만 100으로 변경되고 num2는 변경한적이 없기에 그대로 10이다.
			
			System.out.println("생성자 예제");
			
			//클래스가 아닌 각각의 객체에 저장되는 것이다.
			Car c1 = new Car();
			System.out.println(c1.company);
			System.out.println(c1.model);
			System.out.println(c1.color);
			System.out.println(c1.maxSpeed);
			System.out.println(c1.speed);
			
			Car c2 = new Car(250);
			System.out.println(c2.model);
			System.out.println(c2.company);
			System.out.println(c2.color);
			System.out.println(c2.maxSpeed);
			System.out.println(c2.speed);
			
			Car c3 = new Car("파랑" , 350);
			System.out.println(c3.model);
			System.out.println(c3.company);
			System.out.println(c3.color);
			System.out.println(c3.maxSpeed);
			System.out.println(c3.speed);
			
			System.out.println("==================");
			
			c3.accel(); //메서드 호출.
			c3.speed = 325; //10이 더해짐
			c3.accel(); //맥스스피드를 넘어가게되면 맥스 스피로 고정되게 했기 때문에 350에 멈춤.
			c3.accel();
			c3.accel();
			c3.accel();
			c3.accel();
			c3.brake();
		}
}
