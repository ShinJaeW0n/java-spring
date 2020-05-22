<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="css/join.css" />
<title>회원가입</title>
</head>
<body>
	<section>
	<div class = "container">
	<form name = "joinForm" action = "joinAction.do" method = "post">
	<p><small>*은 필수입력 항목 입니다.</small></p>
	<hr />
	
	
		<div>
			<div><label><span>* </span>이름</label></div>
			<div><input type = "text" name = "uName" id="name" /></div>
		</div>
	
	
		
		<div>
			<div><label><span>* </span>회원 아이디(이메일)</label></div>
			<div><input type = "email" name = "uEmail" autocomplete="on"/><button type = "button">중복확인</button></div>
		</div>
	
		
		
		<div>
			<div><label><span>* </span>비밀번호</label></div>
			<div><input type = "password" name = "uPw" id = "pw" autocapitalize="off"/><small> 영문 또는 영문/숫자의 조합 (6~11자 이내)</small></div>
		</div>
	
		
		
		<div>
			<div><label><span>* </span>비밀번호 확인</label></div>
			<div><input type = "password" name = "uPw" id = "pwck" /><small> 비밀번호 확인을 위해 다시 한번 입력해주세요.</small></div>
		</div>
		
		
	
		<div>
			<div><label><span>* </span>이동통신사</label></div>
			<div>
			<select name = "uMobile">
			<option value = "SKT">SKT</option>
			<option value = "KT">KT</option>
			<option value = "UPLUS">LG U+</option>
			<option value = "others">알뜰폰(기타)</option>
			</select>
			</div>
		</div>
		
		<div>
			<div><label><span>* </span>휴대전화 번호</label></div>
			<div>
			<input type = "text" name = "uCp1" size="3" maxlength="3" autocomplete="off"/>
			 - <input type = "text" name = "uCp2" size="3" maxlength="4" autocomplete="off"/> 
			 - <input type = "text" name = "uCp3" size="3" maxlength="4" autocomplete="off"/>
			</div>
		</div>
		
		<div>
			<div><label><span>* </span>성별</label></div>
			<div>
			<input type = "radio" name = "uGender" value = "M" id = "uGender1" checked="checked"/>남성
			<input type = "radio" name = "uGender" value = "F" id = "uGender2" />여성
			</div>
		</div>
	
		<div>
			<div><label><span>* </span>생년월일</label></div>
			<div><input type = "date" name = "uBirth" /></div>
		</div>
		
		<div>
			<div><label>이메일 수신 동의</label></div>
			<div>
			<input type = "radio" name = "uEmailok" value = "ok" checked="checked"/><label for = "ok">수신함</label>
			<input type = "radio" name = "uEmailok" value = "no" /><label for = "no">수신안함</label>
			</div>
		</div>
		
		<div>
			<div><label>SMS 수신 동의</label></div>
			<div>
			<input type = "radio" name = "uCpok" value = "pOk" checked="checked"/><label for = "uOK">수신함</label>
			<input type = "radio" name = "uCpok" value = "pNo" /><label for = "uNO">수신안함</label>
			</div>
		</div>	
	
		
		<div>
			<button type = "submit">회원가입</button>
		</div>
		</form>
	</div>
	</section>
	
	<script src ="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="js/index1.js"></script>
</body>
</html>