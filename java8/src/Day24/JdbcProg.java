package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

			//jdbc db가져오기 예제-2

				//프로그래스
public class JdbcProg {
	public static void main(String[] args) { //3306포트로 접속하겠다.  //유니코드를쓸거다.
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?useUnicode=true"
				//언어는 utf8을 쓰겠다.					//시간대는 한국껄로
			+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		
		
		String sql = "SELECT * FROM student";
		try( //try에 매개변수를 넣어주면 자동으로 오토클로즈됨. close 안해줘도됨.
			Connection con = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스에 접속했습니다!");
			System.out.println("<<학생명단>>");
			System.out.println("[학번]\t\t[이름]");
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
	

