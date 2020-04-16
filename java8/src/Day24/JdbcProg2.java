package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

			//jdbc db가져오기 예제-3

				//프로그래스
public class JdbcProg2 {
	public static void main(String[] args) { //3306포트로 접속하겠다.  //유니코드를쓸거다.
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?useUnicode=true"
				//언어는 utf8을 쓰겠다.					//시간대는 한국껄로
			+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스에 접속했습니다!");
			System.out.println("<<학생명단>>");
			System.out.println("[학번]\t\t[이름]");
													//sex와 address 데이터만 불러온다.
			String sql = "SELECT * FROM student Where sex=? && address=?";
			con = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			pstmt = con.prepareStatement(sql);
				//sex와 address는 문자열이니 string을 불러온다.
			pstmt.setString(1, "M"); //jdbc는 자바가 0으로 시작하는것과 다르게 1부터 시작. "F"넣으면 여자만, "M"넣으면 남자만 나옴.
			pstmt.setString(2, "Seoul");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
	

