<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>My JSP 'save_BizClaimVocher.jsp' starting page</title>

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
	$(function() {

		$("#add")
				.live(
						"click",
						function() {
							$("#index")
									.after(
											"<tr><td><select name='item'>"
													+ "<option>交通费</option>"
													+ "<option>礼品费</option>"
													+ "<option>餐饮费</option>"
													+ "<option>住宿费</option>"
													+ "<option>服务费</option>"
													+ "<option>其他费用</option>"
													+ "</select></td><td><input type='text' name='money'></td><td><input type='text' name='des'></td>"
													+ "<td><label id='add'>添加</label></td></tr>");
						});
	});
</script>


</head>

<body>
	<form action="add" method="post">
		<table>
			<tr>
				<td>填写人：${name1}</td>
			</tr>
			<tr>
				<td>所在部门：${department}</td>
			</tr>
			<tr>
				<td>总金额：<input type="text" name="totalAccount"></td>
				<td>事由：<input type="text" name="event"></td>
			</tr>

			<tr>
				<td>项目类型</td>
				<td>项目金额</td>
				<td>费用说明</td>
				<td>操作</td>
			</tr>
			<tr id="index">
				<td><select name="item">
						<option>交通费</option>
						<option>礼品费</option>
						<option>餐饮费</option>
						<option>住宿费</option>
						<option>服务费</option>
						<option>其他费用</option>
				</select></td>

				<td><input type="text" name="money"></td>
				<td><input type="text" name="des"></td>
				<td><label id="add">添加</label></td>
			</tr>

			<tr>
				<td><input type="submit" value="确认新增"></td>
			</tr>
		</table>
	</form>
</body>
</html>
