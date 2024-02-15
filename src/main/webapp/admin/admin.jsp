<%@page import="ioc.Factory"%>
<%@page import="srv.MenuService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%
	
	MenuService menuSrv = Factory.INSTANCE.getMenuSrv();
	request.setAttribute("list", menuSrv.findAll());

%>
<!DOCTYPE html>
<html>
<head>
	<style>
		td{text-align: center;padding:15px;}
		#btn{border: 3px solid black;}
	</style>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<div id = "wrap">
		<h1>${name }님의 관리자 페이지</h1>
		
		<table>
			<thead>
				<tr>
					<th scope="col">메뉴id</th>
					<th scope="col">메뉴명</th>
					<th scope="col">가격</th>
					<th scope="col">팔린갯수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.menuid}</td>
						<td>${dto.name}</td>
						<td>${dto.price}</td>
						<td>${dto.cnt}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<p><a id="btn" href="./insert.jsp">메뉴 추가</a></p>
		
	</div>
</body>
</html>