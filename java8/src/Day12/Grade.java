package Day12;

public class Grade {

	//필드
	
	int kor , eng, mat;
	
	
	//생성자
	
	Grade (int kor, int eng, int mat) {
		
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	//메소드  //매개변수가 없다.
	int avg () { 
		int sum = kor + eng + mat; 
		return sum/3;
	}
	
}
