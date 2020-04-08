package Day19;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ConstructorReferenceEx {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member1 :: new;
		Member1 member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member1 :: new;
		Member1 member2 = function2.apply("Ω≈√µªÁ", "angel");
		
		
	}
	
}
