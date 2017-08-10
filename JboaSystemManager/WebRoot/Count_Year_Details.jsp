<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'Count_Year_Details.jsp' starting page</title>
    
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
   <a href="excel?id=${id}">导出报表</a>
  	<table align="center" border="1">
  		<tr>
  			<td>编号</td>
  			<td>报销人</td>
  			<td>报销总额</td>
  			<td>年份</td>
  			<td>部门</td>
  		</tr>
  		<s:iterator value="list" id="d" >
	  		<tr>
	  			<td>${d.id}</td>
	  			<td>${d.name}</td>
	  			<td>￥${d.money}</td>
	  			<td>${d.year}年</td>
	  			<td>${d.positionName}</td>
	  		</tr>
	  		
	  		
  		</s:iterator>
  		<tr>
	  			<td></td>
	  			<td>总计</td>
	  			<td>￥${sum}</td>
	  		</tr>
  	</table>
  </body>
</html>
