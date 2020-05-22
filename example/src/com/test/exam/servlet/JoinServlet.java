package com.test.exam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.exam.dao.UserDAO;
import com.test.exam.vo.UserBean;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/joinAction.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		UserBean userBean = new UserBean();
		userBean.setuName(request.getParameter("uName"));
		userBean.setuEmail(request.getParameter("uEamil"));
		userBean.setuPw(request.getParameter("uPw"));
		userBean.setuGender(request.getParameter("uGender"));
		userBean.setuBirth(request.getParameter("uBirth"));
		userBean.setuEmailok(request.getParameter("uEamilOk"));
		userBean.setuCpok(request.getParameter("uCpok"));
	
		  String numbers = request.getParameter("uCp1") + "-" + request.getParameter("uCp2") + "-" + request.getParameter("uCp3");
	         userBean.setuCp1(numbers);
	         UserDAO userDAO = new UserDAO();
	         int result = userDAO.join(userBean);
	         userDAO.uClose();
	         HttpSession session = request.getSession();
	         PrintWriter out = response.getWriter();
	         
	         if(result != -1) {
	            session.setAttribute("userId", userBean.getuEmail());
	            response.sendRedirect("index.jsp");
	         } else{
	            out.println("<script>" 
	            + "alert('회원가입에 실패하였습니다. 동일한 오류가 지속 될 시에는 관리자에게 연락바랍니다.');" 
	            + "history.back();"
	            + "</script>");
	         }
	   }
	}
