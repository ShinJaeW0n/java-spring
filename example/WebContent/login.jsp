<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	
    request.setCharacterEncoding("UTF-8");
	if(session.getAttribute("userId") != null) {
		out.println("<script>");
		out.println("alert('이미 로그인 되었습니다.');");
		out.println("location.href='main.jsp';");
		out.println("</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/login.css" />
<title>로그인</title>
</head>
<body>
	<section>
		<h2>로그인</h2>
		<form name = "login" action = "loginAction.do" method= "post">
			<div class= "container">
				<div><input type = "text" placeholder ="아이디(이메일)" name = "uId" required="required" autocomplete="off"/></div>
				<div><input type = "password" placeholder ="비밀번호" name = "uPw" required="required" autocomplete="off"/></div>
				<div><button type = "submit">로그인</button></div>
			</div>
		</form>
	</section>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

	

</body>
</html>