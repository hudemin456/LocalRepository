<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'Count_Month.jsp' starting page</title>
    
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
    <table border="1" align="center"  style="text-align: center;">
    		<tr >
    			<td>编号</td>
    			<td>总计</td>
    			<td>年份</td>
    			<td>月份</td>
    			<td>部门</td>
    			<td>操作</td>
    		</tr>
    		
    		<s:iterator value="list" id="b" >
    			<tr>
    				<td>${b.id}</td>
    				<td>￥${b.totalAccount}</td>
    				<td>${b.year}年</td>
    				<td>${b.month}月</td>
    				<td>${b.positionName}</td>
    				<td><a href="#">详情</a></td>
    			</tr>
    		</s:iterator>
    </table>
  </body>
</html>
 