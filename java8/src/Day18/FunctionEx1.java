package Day18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

			//function2
public class FunctionEx1 {
										//추가 삭제 안되는 리스트.
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96), 
			new Student("신용권", 95, 93)
			
			); 
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student)+" ");
		}
		System.out.println();
	
	}
	
	
	public static void printInt(ToIntFunction<Student>function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student)+ " "); //student(String)를 int로 변환.
		}
		System.out.println();
	}
	
	
		public static void main(String[] args) {
				System.out.println("[학생이름]");
				printString(t -> t.getName());	//t는 student 객체
		
		
				System.out.println("[영어점수]");
				printInt(t -> t.getEnglishScore());
		
				
				System.out.println("[수학점수]");
				printInt(t -> t.getMathScore());
	
		
	
			}
	
		}


		
