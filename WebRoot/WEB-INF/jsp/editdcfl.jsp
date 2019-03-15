<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->修改堆存费率信息</title>
    
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
  </head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');document.getElementById('cc').focus()">
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
        <td bgcolor="#FFFFFF"><iframe  width="100%" height="215" scrolling="no" frameborder="1" id="fid" name="fid" src="list.htm?id=&action=listsh"></iframe></td>
      </tr>
    </table>
  </div>
</div>
<table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;修改堆存费率信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>进场信息</legend>
<form:form >
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td align="left"   height="25">&nbsp;&nbsp;尺寸: 
</td><td><form:select path="cc" cssClass="combobox" onkeydown="tabs()"><form:option value="20’" label="20’" /><form:option value="40’" label="40’" /><form:option value="45’" label="45’" /></form:select> </td>
<td >箱型:</td><td><form:input path="xx" cssClass="text" onkeydown="tabs()" /></td>
</tr><tr><td>货币类型:</td><td><form:select path="hblx" cssClass="combobox" onkeydown="tabs()"><form:option value="￥" label="￥" /><form:option value="$" label="$" /></form:select></td>
<td>起吊费:</td><td><form:input path="qdf" cssClass="text" onkeydown="tabs()"  onfocus="this.select()" /></td></tr>

<tr><td>&nbsp;&nbsp;拖运费:</td><td><form:input path="tyf" onkeydown="tabs()"   onfocus="this.select()" cssClass="text"/>&nbsp;</td>
<td>堆存费率:</td><td><form:input path="dcfl" onkeydown="tabs()" cssClass="text"/></td>
 </tr>
 <tr><td>&nbsp;&nbsp;包干堆存费:</td><td><form:input path="bgdcf" onkeydown="tabs()"   onfocus="this.select()" cssClass="text"/>&nbsp;</td>
<td></td><td></td>
 </tr>
 <tr><td height="10"></td></tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="submit" id="submit" class="btn_2k3" value="更新">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="myclose('r','<%=request.getParameter("op") %>')"></td></tr>


 </table></form:form>

</fieldset><table><tr><td style="height:5px"></td></tr></table></td></tr>

</table>

  </body>
</html>
