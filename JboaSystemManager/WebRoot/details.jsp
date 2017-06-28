<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'details.jsp' starting page</title>
    
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
  	<h3>基本信息</h3>
   <table>
   
   	<s:iterator value="b" id="details">
   	<tr>
   		<td>编号：${b.id} &nbsp&nbsp</td> 
   		<td>填写人：${b.sysEmployeeByCreateSn.name}&nbsp&nbsp</td>
   		<td>部门：${b.sysEmployeeByCreateSn.sysDepartment.name}&nbsp&nbsp</td>
   		<td>职位：${b.sysEmployeeByCreateSn.sysPosition.nameCn}&nbsp&nbsp</td>
   	</tr>
   	
   	<tr>
   		<td>总金额：${b.totalAccount} &nbsp&nbsp</td> 
   		<td>填报时间：${b.createTime}&nbsp&nbsp</td>
   		<td>状态：${b.status}&nbsp&nbsp</td>
   		<td>待处理人：${b.sysEmployeeByNextDealSn.name}&nbsp&nbsp</td>
   	</tr>
   	<tr>
   		<th><hr><th>
   	</tr>
   	
   	<tr>
   		<td>项目类别</td>
   		<td>项目金额</td>
   		<td>费用说明</td>
   	</tr>
   	<s:iterator value="set" id="details">
   		<tr>
   			<td>${details.item }</td>
   			<td>${details.account }</td>
   			<td>${details.des }</td>
   		</tr>
   	</s:iterator>
   	
   	</s:iterator>
  	<tr>
   		<th><hr><th>
   	</tr>
   <tr>
   	<td><a href="findById.action">返回</a></td>
   </tr>
   
   </table>
  </body>
</html>
