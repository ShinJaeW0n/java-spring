package Day16;

import java.util.Arrays;

public class WildCardEx{
		public static void registerCourse(Course<?> course) {
			System.out.println(course.getName() + "수강생: " 
			+ Arrays.toString(course.getStudents()));
			//배열을 문자열로 바꾸는것.
			}
		
		public static void registerCourseStudent(Course<Student> studentCourse) {
			System.out.println(studentCourse.getName() + "수강생: "
				+ Arrays.toString(studentCourse.getStudents()));
		
		}
		
		public static void registerCourseWorker(Course<? super Worker> course) {
			System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
		
		}
		
		public static void main(String[] args) {
			Person person = new Person("일반인");
			Worker worker = new Worker("직장인");
			Student student = new Student("학생");
			HighStudent highStudent = new HighStudent("고등학생");
			 
			Course<Person> per = new Course<>("일반인코스", 5);
			per.add(person);
			per.add(worker);
			per.add(student);
			per.add(highStudent);
		
			
			registerCourse(per);
		//	registerCourseStudent(perSonCourse); //<-학생을 취상위로 해야해서 학생은 입력이 안된다.
			registerCourseWorker(per);
		
	
			Course<Student> studentCourse = new Course<Student>("학생코스" , 5);
		//	studentCourse.add(person);
		//	studentCourse.add(worker);
			studentCourse.add(student);
			studentCourse.add(highStudent);
	
			registerCourse(studentCourse);
			registerCourseStudent(studentCourse);
		//	registerCourseWorker(studentCourse);
			System.out.println();
			
			Course<Worker> WorkerCourse = new Course<Worker>("직장인코스" , 5);
			
	//		WorkerCourse.add(person);
			WorkerCourse.add(worker);
	//		WorkerCourse.add(student);
	//		WorkerCourse.add(highStudent);
			
			registerCourse(WorkerCourse);
	//		registerCourseStudent(WorkerCourse);
			registerCourseWorker(WorkerCourse);
	
		}
	}
	
	
	

