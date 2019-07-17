<%@page contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	String applicationPath = basePath + "/" + "application";
%>
 	<link rel="stylesheet" type="text/css" media="all" href="abc/css1/ioa.css" />
	<script type="text/javascript" src="abc/jquery-2.1.4.min.js"></script>
<html>
<body>
<script type="text/javascript">
$(document).ready(function(){
	//合同图片
	$("#conimg").blur(function(){
		var conimg=$("#conimg").val();
		if(conimg==""){
			$("#span1").text("请添加图片！");
			document.getElementById("span1").style.display="";
		}else{
			document.getElementById("span1").style.display="none";
		}
	})
	//合同名字
	$("#contitle").blur(function(){
		var contitle=$("#contitle").val();
		if(contitle==""){
			$("#span2").text("请输入合同名字！");
			document.getElementById("span2").style.display="";
		}else{
			document.getElementById("span2").style.display="none";
		}
	})
	//合同内容
	$("#condetails").blur(function(){
		var condetails=$("#condetails").val();
		if(condetails==""){
			$("#span3").text("请输入合同内容！");
			document.getElementById("span3").style.display="";
		}else{
			document.getElementById("span3").style.display="none";
		}
	})
	//合同时间
	$("#condate").blur(function(){
		var condate=$("#condate").val();
		if(condate==""){
			$("#span4").text("请输入合同时间！");
			document.getElementById("span4").style.display="";
		}else{
			document.getElementById("span4").style.display="none";
		}
	})
	//合同状态
/*	$("#constatus").blur(function(){
		var constatus=$("#constatus").val();
		if(constatus==""){
			$("#span5").text("请输入合同状态！");
			document.getElementById("span5").style.display="";
		}else{
			document.getElementById("span5").style.display="none";
		}
	})
	//客户名字
	$("#conclient").blur(function(){
		var conclient=$("#conclient").val();
		if(conclient==""){
			$("#span6").text("请输入客户名字！");
			document.getElementById("span6").style.display="";
		}else{
			document.getElementById("span6").style.display="none";
		}
	})
	//员工名字
	$("#conuser").blur(function(){
		var conuser=$("#conuser").val();
		if(conuser==""){
			$("#span7").text("请输入员工名字！");
			document.getElementById("span7").style.display="";
		}else{
			document.getElementById("span7").style.display="none";
		}
	})*/
	
	
})



function fromSubmit(){
	if(document.addForm.conimg.value==""
			 || document.addForm.contitle.value==""
			 || document.addForm.condetails.value==""
			 || document.addForm.condate.value==""
			 || document.addForm.constatus.value==""
			 || document.addForm.conclient.value==""
			 || document.addForm.conuser.value==""){
		alert("请输入完整信息！");
		return false;
	}else{
		return true;
	}
}

</script>

 
		<head>
			<title>添加医生信息</title>
		</head>

		<form action="addContractController" method="post" name="addForm" id="addForm" onsubmit="return fromSubmit()">

			<table width="100%" border="0" cellspacing="0" cellpadding="0"
				class="pad5">
				<tr>
					<td valign="top" align="left" class="pad5">
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							class="dqbg margb5">
							<tr>
								<td width="2%" align="right" class="pad05">
									<img src="abc/img2.gif" width="16" height="16">
								</td>
								<td width="98%" align="left" class="lan13b">
									合同管理 > 添加合同
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellpadding="1" cellspacing="1"
							class="table-border margb5">
							<tr>
								<td width="14%" align="right" class="COLLECTION">
									照片？：
								</td>
								<td width="36%" align="left" class="even padl5">
									<input type=text name="conimg" id="conimg" maxlength="32"
										class=inputnormal value="">
									<font color="red" id="span1">*</font>
								</td>
							</tr>

							<tr>
								<td width="14%" align="right" class="COLLECTION">
									合同名字：
								</td>
								<td width="36%" align="left" class="even padl5">
									<input type=text name="contitle" id="contitle" maxlength="32"
										class="inputnormal" value="">
									<font color="red" id="span2">*</font>
								</td>
							</tr>
							<tr>

								<td width="14%" align="right" class="COLLECTION">
									详情：
								</td>
								<td width="36%" align="left" class="even padl5">
									<input type=text name="condetails" id="condetails" maxlength="32" class="inputnormal"
										value="">
									<font color="red" id="span3">*</font>
								</td>
							</tr>
							<tr>
								<td width="14%" align="right" class="COLLECTION">
									合同时间：
								</td>
								<td width="36%" align="left" class="even padl5">
									<input type=text name="condate" id="condate" maxlength="32" class="inputnormal"
										value="">
									<font color="red" id="span4">*</font>
								</td>
							</tr>
							<tr>
								<td width="14%" align="right" class="COLLECTION">
									合同状态：
								</td>
								<td width="36%" align="left" class="even padl5">
									<select name="constatus" id="constatus" maxlength="32" class="inputnormal"
									 onchange="this.options[this.selectedIndex].innerText">
										<option value="0">未完成</option>
										<option value="1">已完成</option>
										<option value="2">已归档</option>
									</select>
								<!-- <font color="red" id="span5">*</font> -->
								</td>
							</tr>
							<tr>

								<td width="14%" align="right" class="COLLECTION">
									合同所属客户：
								</td>
								<td width="36%" align="left" class="even padl5">
									<select name="conclient" id="conclient" maxlength="32" class="inputnormal"
									 onchange="this.options[this.selectedIndex].innerText">
										<option value="1">熊</option>
										<option value="2">熊大</option>
										<option value="3">熊二</option>
									</select>
								<!-- <font color="red" id="span6">*</font> -->
								</td>
							</tr>
							</tr>
							<tr>

								<td width="14%" align="right" class="COLLECTION">
								合同所属员工：
								</td>
								<td width="36%" align="left" class="even padl5">
									<select name="conuser" id="conuser" maxlength="32" class="inputnormal"
									 onchange="this.options[this.selectedIndex].innerText">
										<option value="1">熊</option>
										<option value="2">熊大</option>
										<option value="3">熊二</option>
									</select>
								<!-- 	<font color="red" id="span7">*</font> -->
								</td>
							</tr> 
						 
					 
							
						</table>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="50%" align="right" class="padr5">
									<button id="addContract" class="button" name="button">保存</button>								</td>
								<td width="50%" align="left" class="padl5">
									<input name="button1" type="button" class="button"
										onClick="history.go(-1);" value="返 回">
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>







		</form>


		<br>
		<br>
		<br>
		<br>

	</body>
</html>
