<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
<title>메인 페이지</title>
	<style>
		*{
			list-style:none;
			text-decoration:none;
			background-color:#ffffff;
			
		}
		
		body{
			width: 1200px;
			margin: auto;
		}
		
		.container1{
			width: 1200px;
			height: 300px; 
			background-color: #FFD9EC;
			margin-top: 50px;
			
		}
		
		.con{
			float: left;
			
		}

		.con #con1{
			width : 360px;
			height: 300px; 
		}
		
		.con #con2{
			width: 420px;
			height: 300px;
			margin: 0 30px auto;
			align-content: center;
			
		}
		
		.con a #con3{
			width: 360px;
			height : 300px;
		}
		
		.ffooter{
			width: 1200px;
			height: 300px; 
			margin-top: 50px;
		}
		
		.foot{
			float: left;
		}
		
		.foot a #foot1{
			width: 200px;
			height: 200px;
			
		}
		
		.foot #foot2{
			width: 200px;
			height: 100px;
			margin : 0 20px auto;
		}
		
		.foot #foot2 p{
			clear:both;
			text-align: center;
		}
		
		.foot #foot3{
			width: 100px;
			height: 100px;
		}
		

	
		
	
		
	</style>

</head>
<body>
	
		<nav class="navbar navbar-expand-sm ml-auto pt-5">
		<h1>JUST 쇼핑몰</h1>	
 			<div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto pr-3">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         TOP
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">블라우스</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">셔츠</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">티</a>
        </div>
      </li>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          아우터
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">자켓</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">코트</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">가디건</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">머플러</a>
        </div>
      </li>
      
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          아우터
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">자켓</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">코트</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">가디건</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">머플러</a>
        </div>
      </li>
      
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          아우터
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">자켓</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">코트</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">가디건</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">머플러</a>
        </div>
      </li>
      
    </ul>
    
  </div>
</nav>

<div id="slide" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#slide" data-slide-to="0" class="active"></li>
    <li data-target="#slide" data-slide-to="1"></li>
    <li data-target="#slide" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="imgs/horse.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="imgs/palm.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="imgs/summer.jpg" class="d-block w-100" alt="...">
    </div>
  </div>
  <a class="carousel-control-prev" href="#slide" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#slide" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<!-- <div class = "footer"> -->
<!-- 	<h3>공지사항</h3> -->
<!-- 	<ul class = "notice"> -->
<!-- 		<li class = "noti"><a href = "#">장기간 휴업</a></li> -->
<!-- 		<li class = "noti"><a href = "#">두 달뒤 업무 재개</a></li> -->
<!-- 		<li class = "noti"><a href = "#">삐용삐용</a></li> -->
<!-- 	</ul> -->

<!-- </div> -->

<div class = "container1">
	<div class = "con">
		<img src="imgs/main1.jpg" alt="..." id ="con1" >
	</div>
	
	<div class = "con">
		<img src="imgs/yog.jpg" alt="..." id ="con2" >
	</div>

	<div class = "con">
		<a href = "#"><img src="imgs/duck.jpg"  id ="con3"></a>
	</div>
	
	</div>

<div class = "ffooter">	
<div class = "footer">
	
	<div class = "foot">
		<a href = "#"><img src="imgs/amazon.png" id = "foot1"></a>
	</div>
	
	<div class = "foot">
		<img src="imgs/cc.jpg" alt="..."  id = "foot2">
		<p>저작권</p>
	</div>

	<div class = "foot">
		<a href = "#"><img src="imgs/in.png" alt="..."  id = "foot3"></a>
	</div>
</div>
</div>
	

<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	
		
	
	
	
	<script>
	$(document).on('mouseover', '.nav-link dropdown-toggle', function () {
    $('.dropdown-menu').slideDown(200);
	});
	</script>




</body>
</html>