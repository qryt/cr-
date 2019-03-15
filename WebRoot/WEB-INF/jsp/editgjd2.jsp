<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->估价单管理</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
		<style>
	 input{
	 text-transform:uppercase;
	 }
	 </style>
 <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />
    <link rel="stylesheet" type="text/css" href="ext/resources/css/xtheme-gray.css" />

    <!-- GC -->
 	<!-- LIBS -->
 	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
 	<!-- ENDLIBS -->

    <script type="text/javascript" src="ext/ext-all.js"></script>

    <script type="text/javascript" src="ext/examples/form/states.js"></script>

    <link rel="stylesheet" type="text/css" href="ext/examples/form/combos.css" />

    <!-- Common Styles for the examples -->
     <SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>
 
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
 function mytj(){

 document.getElementById('command').submit();
 }
 </script>
  </head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');document.getElementById('shlx').focus()">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
<div id="showdiv" style="position:absolute; width:330px; height:250px; z-index:1; left: 160px; top: 180px; visibility: hidden;">
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
        <td bgcolor="#FFFFFF"><iframe  width="100%" height="215" scrolling="no" frameborder="1" id="fid" name="fid" src="about:blank"></iframe></td>
      </tr>
    </table>
  </div>
</div>
<table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;修改估价单信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>估价单信息</legend>
<form:form  >
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr>

<td align="left"   height="25">&nbsp;&nbsp;损坏类型: 
</td><td><form:input path="shlx" cssClass="text" onfocus="this.select()" onkeyup="kd('shlx')"   autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td align="left"   height="25">位置代码: 
</td><td><form:input path="wzdm" cssClass="text" onkeyup="kd('wzdm')"  autocomplete="off"/></td>
<td align="left"   height="25">修理方法: 
</td><td><form:input path="xlff" cssClass="text" onfocus="this.select()"  onkeyup="kd('xlff')"   autocomplete="off" /></td>


</tr>
<tr>
<td >&nbsp;&nbsp;部件名称:</td><td><form:input path="bjmc" cssClass="text"  onkeyup="kd('bjmc')" onfocus="this.select()" />&nbsp;<font color="red">*</font></td>

<td>长:</td><td><form:input path="c" onkeyup="kd('c')" cssClass="text"    onfocus="this.select()" /></td>
<td >宽:</td><td><form:input path="k" cssClass="text_3"  onkeyup="kd('k')" /></td>

</tr>
<tr>
<td >&nbsp;&nbsp;类型:</td><td><form:input path="lx" cssClass="text" onkeyup="kd('lx')" onfocus="this.select()" /></td>
<td>数量:</td><td><form:input path="sl" cssClass="text"  onblur="cul2()"  onfocus="this.select()" onkeydown="tabs()" /></td>
<td >工时:</td><td><form:input path="gs" cssClass="text_3" onblur="culgs()" onkeydown="tabs()" onfocus="this.select()"  /></td>

</tr>
<tr>
<td >&nbsp;&nbsp;工时费:</td><td><form:input path="gsf" cssClass="text" onkeydown="tabs()"  onfocus="this.select()" /></td>
<td>材料费:</td><td><form:input path="clf" cssClass="text" onkeydown="tabs()"  onfocus="this.select()" /></td>
<td >付费方:</td><td><form:select path="fff" onkeydown="tabs()" cssClass="combobox"><form:option value="C" label="C"/><form:option value="U" label="U"/><form:option value="O" label="O"/><form:option value="W" label="W"/></form:select></td>
 
</tr>

<tr><td height="25">&nbsp;&nbsp;修理描述:</td><td colspan="5"><form:input path="xlmx"   cssClass="text_4" onkeydown="tabs()" /></td>

</tr>
 <tr><td height="10"></td></tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="button" id="tj" onfocus="mytj()"   class="btn_2k3" value="更新">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="myclose('r','<%=request.getParameter("op") %>')"></td></tr>


 </table></form:form>
 <input type="hidden" id="bh" name="bh" value="<%=request.getParameter("bh") %>">
 <input type="hidden" id="gsfl" name="gsfl" value="${gsfl }">
 <input type="hidden" id="xsl" name="xsl" value="${gs }">
  <input type="hidden" id="clfl" name="clfl" value="${clf }">
</fieldset><table><tr><td style="height:5px"></td></tr></table></td></tr>

</table>

  </body>
</html>
