<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->用户修改</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
  <script type="text/javascript" src="js/changedate.js"></script>
<link rel="stylesheet" type="text/css" href="gt_grid.css" />

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" src="js/gt_msg_cn.js"></script>
<script type="text/javascript" src="js/gt_grid_all.js"></script>
<script language="JavaScript" src="js/calendar_month.js" type="text/JavaScript"></script>
<script type="text/javascript">
function showjs(){
document.getElementById("fid").src="list.htm?action=listjs&id=<%=request.getParameter("bh")%>";
document.getElementById("showdiv").style.visibility="visible";
}
function showqx(){
	document.getElementById("fid").src="list.htm?action=listqx&id=<%=request.getParameter("bh")%>";
	document.getElementById("showdiv").style.left=50;
	document.getElementById("showdiv").style.visibility="visible";
	}
</script>
  </head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');document.getElementById('xm').focus()">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
<div id="showdiv" style="position:absolute; width:160px; height:250px; z-index:1; left: 160px; top: 50px; visibility: hidden;">
      <iframe     style="position:absolute;z-index:-1;width:129%;height:e­xpression(this.nextSibling.offsetHeight);top:e­xpression(this.nextSibling.offsetTop);left:e­xpression(this.nextSibling.offsetLeft);"   frameborder="0">
        </iframe>
      <table width="129%" height="78" border="0" cellpadding="0" cellspacing="1" bgcolor="0099ff">
      <tr>
 <TD height="8" bgcolor="#0099FF" onMouseDown="this.style.cursor='move';this.style.backgroundColor='#0066cc'" onMouseUp="this.style.cursor='';this.style.backgroundColor='#0099ff';" id="moveTd" onMouseOut="this.style.cursor='';this.style.backgroundColor='#0099ff';" >
<div align="right"><IMG src="images\close.gif" alt="点击关闭层" width="13" height="13" style="cursor:hand" onclick="MM_showHideLayers('showdiv','','hide')">
            </div>
		</td>
      </tr>
      <tr>
        <td bgcolor="#FFFFFF"><iframe  width="100%" height="280" scrolling="no" frameborder="1" id="fid" name="fid" src="list.htm?id=&action=listsh"></iframe></td>
      </tr>
    </table>
  </div>
</div>
<table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;修改个人信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;">
<form:form >
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td align="left"   height="25">&nbsp;&nbsp;姓名: 
</td><td><form:input path="xm" cssClass="text" onfocus="this.select()"   onkeydown="tabs()" autocomplete="off" /></td></tr>
 <tr><td align="left"   height="25">&nbsp;&nbsp;角色: 
</td><td><form:textarea path="jsmc" readonly="true" />&nbsp;<input type="button" class="btn_2k3" onclick="showjs()" value="添加角色"> 
 </td></tr>
 <tr><td align="left"   height="25">&nbsp;&nbsp;权限范围: 
</td><td><form:textarea path="qxfw" readonly="true" />&nbsp;<input type="button" class="btn_2k3" onclick="showqx()" value="添加权限"> 
 </td></tr>

 
 <tr>
 
 <td height="10"></td></tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="submit" id="submit" class="btn_2k3" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="myclose('r','<%=request.getParameter("op") %>')"> </td></tr>


 </table></form:form>
 
<table><tr><td style="height:5px"></td></tr></table></td></tr>

</table>

  </body>
</html>
