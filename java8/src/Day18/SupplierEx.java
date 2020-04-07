package Day18;

import java.util.function.IntSupplier;

public class SupplierEx {
		public static void main(String[] args) {
			IntSupplier intSupplier = () -> {
				int num = (int)(Math.random()*6)+1;
				return num;
			};
		
				int num = intSupplier.getAsInt(); //리턴값이 int여야한다.
				System.out.println("눈의 수: " + num);
		}
}
