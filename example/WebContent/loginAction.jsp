<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.test.exam.dao.UserDAO"%>
<%
	request.setCharacterEncoding("UTF-8");
	String uId = request.getParameter("uEmail");
	String uPw = request.getParameter("uPw");
	UserDAO userDAO = new UserDAO();
	boolean result = userDAO.login(uId, uPw);
	userDAO.uClose();
	
if (result) {
	session.setAttribute("uEmail", uId);
	response.sendRedirect("index.jsp");

} else {
	out.println("<script>"
	+"alert('아이디나 비밀번호가 다릅니다');"
	+ "history.back();"
	+ "</script>");
	
}

%>
