<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'Boss.jsp' starting page</title>
    
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
   		<a href="findById.action">查看报销单</a>

  <a href="#">查看请假</a>
  
  
     <table>
    	<tr>
    		<td>编号</td>
    		<td>填报日期</td>
    		<td>填报人</td>
    		<td>总金额</td>
    		<td>状态</td>
    		<td>待处理人</td>
    		<td>操作</td>
    	</tr>
    	
    	<s:iterator value="list" id="b">
    		<tr>
    		<td>${b.id}</td>
    		<td>${b.createTime}</td>
    		<td>${b.sysEmployeeByCreateSn.name}</td>
    		<td>${b.totalAccount}</td>
    		<td>${b.status}</td>
    		<td>${ b.sysEmployeeByNextDealSn.name}</td>
    		<td><c:if test="${b.status=='已提交'}"><a href="Post?id=${b.id}">通过</a>&nbsp<a href="Manager_Details?id=${b.id}">详情</a></c:if></td>
    	</tr>
    	</s:iterator>
    </table>
  </body>
</html>
