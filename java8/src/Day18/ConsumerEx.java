package Day18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

		public static void main(String[] args) {
			Consumer<String> consumer = t -> System.out.println(t + "8");
			consumer.accept("java");
			
			BiConsumer<String, String> bigconsumer = (t, u) -> System.out.println(t + u);
			bigconsumer.accept("java", "8");
		
			DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
			doubleConsumer.accept(8.0);
			
						//오브젝트는 타입을 정해줘야함.
			ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
			objIntConsumer.accept("java", 8);
			
		}
	
}
