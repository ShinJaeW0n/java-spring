package Day14;

public class DmbCellPhone extends CellPhone {
			
			int channel;
			
			//생성자가 이렇게 하나라도 있으면 디폴트 생성자가 생기지 않는다.
			DmbCellPhone(String model, String color, int chennel) {
				this.model = model; //부모의 필드도 가질 수 있다.
				this.color = color;
				this.channel = chennel;
			}


				void turnOndmb() {
					System.out.println("DMB를 켭니다.");
				}
				
				void turnOffdmb() {
					System.out.println("DMB를 끕니다.");
				}
				
				void setChannel(int channel) {
					this.channel = channel;
					System.out.println(channel + "으로 채널을 변경합니다.");
				}

}
