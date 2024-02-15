<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<div id= "wrap">
		<h1>로그인</h1>
		
		<form action="./loginCtrl.jsp" method="post">
			<fieldset>
				<legend>로그인창</legend>
				<ul>
					<li>
						<label for="userid">아이디</label>
						<input type="text" id="userid" name="userid" />
					</li>
					<li>
						<label for="password">비밀번호</label>
						<input type="text" id="password" name="password" />
					</li>
				</ul>		
			</fieldset>
			<p><button>확인</button></p>
		</form>
	</div>
</body>
</html>