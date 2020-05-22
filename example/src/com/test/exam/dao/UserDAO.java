package com.test.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.test.exam.vo.UserBean;

public class UserDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//생성자
	public UserDAO() {
	
		try {
			Context init;
			init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/exam");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void uClose() {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null)conn.close();

			} catch (SQLException e) {
			
				e.printStackTrace();
			}
	}
	
	public int join(UserBean userBean) {
		String sql = "insert into user values (?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userBean.getuName()); //입력받은 유저 아이디
			pstmt.setString(2, userBean.getuEmail());
			pstmt.setString(3, userBean.getuPw());
			pstmt.setString(4, userBean.getuMobile());
			pstmt.setString(5, userBean.getuCp1());
			pstmt.setString(6, userBean.getuGender());
			pstmt.setString(7, userBean.getuBirth());
			pstmt.setString(8, userBean.getuEmailok());
			pstmt.setString(9, userBean.getuCpok());
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return -1; //오류 났을 때
		
	}
		public boolean login(String uEmail, String uPw) {
			String sql = "select uEmail ,uPw from user wherer uEmail = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, uEmail); //입력받은 유저 아이디
				rs = pstmt.executeQuery();
				if(rs.next()) {
					String  dbPw = rs.getString(1);
					return uPw.contentEquals(dbPw);
				}
				
				}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return false; //오류 났을 때
		}
	
	
}
