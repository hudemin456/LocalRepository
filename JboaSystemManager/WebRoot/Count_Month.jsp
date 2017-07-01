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
    			<td>总计</td>
    			<td>年份</td>
    			<td>月份</td>
    			<td>部门</td>
    			<td>操作</td>
    		</tr>
    		
    		<s:iterator value="list_month" id="c" step="i">
    			<tr>
    				<td>￥${c[0]}</td>
    				<td>${c[1]}年</td>
    				<td>${c[2]}月</td>
    				<td>${c[3]}</td>
    				<td><a href="#">详情</a></td>
    			</tr>
    		</s:iterator>
    </table>
  </body>
</html>
 