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
    
    <title>My JSP 'Details_update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script>

$(function(){
	$("#del").live("click",function(){
		$(this).parent().parent().remove();
	});
});

$(function(){
	$("#add").live("click",function(){
		var item=$(this).parent().prev().prev().prev().children().val();
		var money=$(this).parent().prev().prev().children().val();
		var des=$(this).parent().prev().children().val();

		$("#index").after("<tr><td><input type='hidden' name='item' value='"+item+"'>"
		+item+"</td><td><input type='hidden' value='"
		+money+"' name='money'>"+money+"</td><td><input type='hidden' value='"
		+des+"' name='des'>"+des+"</td><td><a id='del' >✖</a></td></tr>");
		
		
	});
});

</script>

  </head>
  
  <body>
    <h3>基本信息</h3>
    <form action="Details_submit" method="post">
    	<input type="hidden" value="${b.id}" name="id"/>
	<input type="hidden" value="${b.id}" name="b1.id"/>
   <table>
   
   
   	<tr>
   		<td>编号：${b.id} &nbsp&nbsp</td> 
   		<td><input type="hidden"  name="b1.sysEmployeeByCreateSn.name">填写人：${b.sysEmployeeByCreateSn.name}&nbsp&nbsp</td>
   		<td>部门：${b.sysEmployeeByCreateSn.sysDepartment.name}&nbsp&nbsp</td>
   		<td>职位：${b.sysEmployeeByCreateSn.sysPosition.nameCn}&nbsp&nbsp</td>
   	</tr>
   	<tr>
   		<td>总金额：<input type="text" value="${b.totalAccount}" name="b1.totalAccount">&nbsp&nbsp</td> 
   		<td><input type="hidden"  name="b1.createTime">填报时间：${b.createTime}&nbsp&nbsp</td>
   		<td><input type="hidden"  name="b1.status">状态：${b.status}&nbsp&nbsp</td>
   		<td><input type="hidden"  name="b1.sysEmployeeByNextDealSn.name">待处理人：${b.sysEmployeeByNextDealSn.name}&nbsp&nbsp</td>
   	</tr>
   	<tr>
   		<th colspan="4"><hr><th>
   	</tr>
   	
   	<tr>
   		<td>项目类别</td>
   		<td>项目金额</td>
   		<td>费用说明</td>
   		<td>操作</td>
   	</tr>
   	<s:iterator value="set" id="details">
   
   		<tr>
   			<td><input type="hidden" value="${details.item }" name="item">${details.item}</td>
   			<td><input type="hidden" value="${details.account }" name="money">${details.account }</td>
   			<td><input type="hidden" value="${details.des }" name="des">${details.des }</td>
   			<td><a id="del" >✖</a></td>
   		</tr>
   	</s:iterator>
   	<tr id="index"></tr>
   		<tr>
   			<td><select>
						<option>交通费</option>
						<option>礼品费</option>
						<option>餐饮费</option>
						<option>住宿费</option>
						<option>服务费</option>
						<option>其他费用</option>
				</select></td>
   			<td><input type="text"></td>
   			<td><input type="text"></td>
   			<td><a id="add" >➕</a></td>
   		</tr>
   	
 	
  	<tr>
   		<th colspan="4"><hr><th>
   	</tr>
   <tr>
   	<td><input type="submit" value="保存"></td>
   	<td><input type="button" value="提交" onclick="window.location.href='submit?id=${b.id}'"></td>
   	<td><input type="button" value="返回" onclick="window.location.href='findById.action'"></td>
   	
   </tr>
   
   <tr>
   		<th colspan="4"><hr><th>
   	</tr>
   	
   	<tr>
   		<td>事由：<input type="text" value="${b.event}" name="b1.event" ><td>
   	</tr>
   </table>
   
   </form>
  </body>
</html>
