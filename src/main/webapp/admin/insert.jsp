<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<h1>메뉴추가</h1>
		
		<form action="./insertCtrl.jsp" method="post">
			<input type="hidden" name="userid" value="${userid}" />
			<fieldset>
				<legend>내용입력</legend>
				
				<table>
	                <tbody>
	                     <tr>
	                         <th scope="row"><label for="name">메뉴 이름</label></th>
	                         <td>
	                             <input type="text" id="name" name="name" />
	                         </td>
	                     </tr>
	                     <tr>
	                         <th scope="row"><label for="price"></label>메뉴 가격</th>
	                         <td><input type="text" id="price" name="price" /></td>
	                     </tr>
	                              
	                </tbody>  
				</table>
			</fieldset>
			<p><button>메뉴등록</button></p>
		</form>
	</div>
</body>
</html>