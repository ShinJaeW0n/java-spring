package Day16;

public class Key {
			
			public int number;
	
			public Key (int number) {
				this.number = number;
			}

			@Override
			public boolean equals(Object obj) {
				if(obj instanceof Key) {
					Key compareKey = (Key) obj;
					
					//둘다 int이기 때문에 값 비교를 한다.
					if(this.number == compareKey.number) {
						return true;
				}
				
			
				}
				return false;
			}
				

//			@Override
//			public int hashCode() {
//			
//				return number;
//			}
//			
//			
			
			
			@Override
			public String toString() {
			
				return "key 객체에 저장된 number: " + number;
			}
			
			
}
		

