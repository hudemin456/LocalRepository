<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <a href="insertFaqs">新增</a>
  			<table border="1">
  				<tr>
  					<td>编号</td>
  					<td>标题</td>
  					<td>创建时间</td>
  					<td>分类</td>
  					<td>操作</td>
  				</tr>
  				<c:forEach items="${sessionScope.all }" var="item">
  					<tr>
  						<td>${item.fid }</td>
  						<td>${item.title }</td>
  						<td>${item.createdate }</td>
  						<td>${item.c.cname }</td>
  						<td><a href="deleteFaqs?fid=${item.fid }">删除</a></td>
  					</tr>
  				</c:forEach>
  				
  			</table>
  			<a href="findAll?page=1">首页</a>
  			<a href="findAll?page=${page-1 }">上一页</a>
  			${page }页
  			<a href="findAll?page=${page+1 }">下一页</a>
  			<a href="findAll?page=${countpage }">尾页</a>
  </body>
</html>
