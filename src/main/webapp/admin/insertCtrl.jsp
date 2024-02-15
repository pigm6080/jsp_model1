<%@page import="ioc.Factory"%>
<%@page import="srv.MenuService"%>
<%@page import="model.menuDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	int price = Integer.valueOf(request.getParameter("price"));
	
	menuDTO dto = new menuDTO();
	dto.setName(name);
	dto.setPrice(price);
	
	MenuService menuSrv = Factory.INSTANCE.getMenuSrv();
	
	if(menuSrv.save(dto)==1){
		System.out.print("등록완료되었습니다.");
	}else{
		System.out.print("등록실패");
	}
	
	response.sendRedirect("./admin.jsp");
	

%>