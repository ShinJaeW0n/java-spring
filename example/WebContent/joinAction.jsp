<%@page import="com.mysql.cj.util.DnsSrv.SrvRecord"%>
<%@page import="com.test.exam.vo.UserBean"%>
<%@page import="com.test.exam.dao.UserDAO"%>

<%
	request.setCharacterEncoding("UTF-8");
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userBean" class="com.test.exam.vo.UserBean" scope="page" />
<jsp:setProperty name="userBean" property="uName" param = "uName"/>
<jsp:setProperty name="userBean" property="uEmail" param = "uEmail"/>
<jsp:setProperty name="userBean" property="uPw" param = "uPw"/>
<jsp:setProperty name="userBean" property="uMobile" param = "uMobile"/>
<jsp:setProperty name="userBean" property="uGender" param = "uGender"/>
<jsp:setProperty name="userBean" property="uBirth" param = "uBirth"/>
<jsp:setProperty name="userBean" property="uEmailok" param = "uEmailok"/>
<jsp:setProperty name="userBean" property="uCpok" param = "uCpok"/>
    

<%
//	UserBean userBean = new UserBean();
//	userBean.setuEmail(request.getParameter("uId"));
	
	String numbers = request.getParameter("Ucp1") + "-" + request.getParameter("Ucp2")+ "-" + request.getParameter("Ucp3");
	userBean.setUcp1(numbers);
	UserDAO userDAO = new UserDAO();
	int result = userDAO.join(userBean);
	
		userDAO.uClose();
	
	if(result != -1){
		session.setAttribute("userId", userBean.getuEmail());
		response.sendRedirect("index.jsp");
		userDAO.uClose(); //메모리 누수 제거 코드.
	}else{
		out.println("<script>" 
		+"alert('회원가입에 실패하였습니다. 동일한 오류가 지속될 시 관리자에게 연락바랍니다.');" 
		+ "history.back();" 
		+ "</script>");
		
	}
	
%>