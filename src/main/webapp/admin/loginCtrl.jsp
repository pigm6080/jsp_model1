<%@page import="model.userDTO"%>
<%@page import="srv.UserService"%>
<%@page import="ioc.Factory"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

	<%
	
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	
	Map<String,String> logininfo = new HashMap<String,String>();
	logininfo.put("userid", userid);
	logininfo.put("password",password);
	
	
	UserService userSrv = Factory.INSTANCE.getUserSrv();
	userDTO dto = userSrv.getOne(logininfo);
	System.out.println(dto);

	if(dto!=null){
		session.setAttribute("userid", dto.getUserid());
		session.setAttribute("name", dto.getName());
		
		System.out.printf("로그인성공");
		response.sendRedirect("./admin.jsp");
	}else{
		
		System.out.printf("로그인실패");
		
		response.sendRedirect(".././index.jsp");
		
	}
	
	
	%>