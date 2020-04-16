package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

		//jdbc 예제 -1
public class JdbcConprog {
		public static void main(String[] args) { //3306포트로 접속하겠다.  //유니코드를쓸거다.
			String jdbc_url = "jdbc:mysql://localhost:3306/my_database?useUnicode=true"
					//언어는 utf8을 쓰겠다.					//시간대는 한국껄로
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(jdbc_url, "root", "yt1234");
				System.out.println("데이터베이스에 접속했습니다!");
				con.close();
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException: " + e.getMessage());
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
			
		}
}
