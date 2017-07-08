<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
  
  <a href="findById.action">查看报销单</a>
  <a href="save_BizClaimVocher.jsp">添加报销单</a>
  <a href="#">申请请假</a>
  <a href="#">查看请假</a>
  <a href="Count_Month">报销单月度统计</a>
  <a href="Count_Year">报销单年度统计</a>
  
    	<table border="1" align="center">
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
    		<td>
    			<c:if test="${b.status=='已打回'}"><a href="details?id=${b.id}&status=lalalala">修改</a>&nbsp</c:if><a href="details?id=${b.id}&status=h">详情</a>
    		</td>
    		
    		
    	</tr>
    	</s:iterator>
    </table>
  </body>
</html>
