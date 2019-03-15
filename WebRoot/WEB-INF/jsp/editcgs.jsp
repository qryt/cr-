<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->编辑船公司信息</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
<link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />
     
    <!-- GC -->
 	<!-- LIBS -->
 	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
 	<!-- ENDLIBS -->
	    <script type="text/javascript" src="ext/ext-all.js"></script>	
	
<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
  <script type="text/javascript" src="js/changedate.js"></script>

    <SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>
  <script type="text/javascript" src="local/webfxlayout.js"></script>
  <script type="text/javascript" src="js/tabpane.js"></script>
 
<link id="luna-tab-style-sheet" type="text/css" rel="stylesheet" href="css/luna/tab.css" disabled="disabled" />
<link id="webfx-tab-style-sheet" type="text/css" rel="stylesheet" href="css/tab.webfx.css" disabled="disabled" />
<link id="winclassic-tab-style-sheet" type="text/css" rel="stylesheet" href="css/tab.winclassic.css"  disabled="disabled" />
<script language="JavaScript" src="js/calendar_month.js" type="text/JavaScript"></script>
<style type="text/css">

.dynamic-tab-pane-control .tab-page {
	height:		400px;
}

.dynamic-tab-pane-control .tab-page .dynamic-tab-pane-control .tab-page {
	height:		100px;
}

html, body {
	background:	ThreeDFace;
	margin:0px;
}



/* over ride styles from webfxlayout */



.dynamic-tab-pane-control h2 {
	text-align:	center;
	width:		auto;
}

.dynamic-tab-pane-control h2 a {
	display:	inline;
	width:		auto;
}

.dynamic-tab-pane-control a:hover {
	background: transparent;
}
table{
margin:0px;
overflow:auto;
}


</style>

<script type="text/javascript">
//<![CDATA[
function setLinkSrc( sStyle ) {
	document.getElementById( "luna-tab-style-sheet" ).disabled = sStyle != "luna";
	document.getElementById( "webfx-tab-style-sheet" ).disabled = sStyle != "webfx"
	document.getElementById( "winclassic-tab-style-sheet" ).disabled = sStyle != "winclassic"
	
	document.documentElement.style.background = 
	document.body.style.background = sStyle == "webfx" ? "white" : "ThreeDFace";	
}

setLinkSrc( "webfx" );

//]]>
</script>
</head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');setLinkSrc('webfx')">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
<div id="showdiv" style="position:absolute; width:330px; height:250px; z-index:1; left: 180px; top: 184px; visibility: hidden;">
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
        <td bgcolor="#FFFFFF" ><iframe  width="100%" height="215" scrolling="no" frameborder="1" id="fid" name="fid" src="about:blank" style="margin:0px" align="left"></iframe></td>
      </tr>
    </table>
  </div>
</div>
<table width="100%" border="0" cellpadding="0" cellspacing="0" > 
<tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;添加公司信息</td></tr>
<tr><td  >
<form:form >
<fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>船公司信息</legend>
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td align="left"   height="25"><input type="hidden" name="mybh" id="mybh" value="<%=request.getParameter("bh") %>">&nbsp;&nbsp;公司代码:
</td><td><form:input path="gsdm" cssClass="text" onfocus="this.select()" onkeydown="tabs()"   autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td >箱主:</td><td><form:input path="xz" cssClass="text" onkeydown="tabs()" /></td>

<td >公司名称:</td><td><form:input path="gsmc" cssClass="text2" onkeydown="tabs()" /></td>
</tr>
<tr>
<td>英文名称:</td><td><form:input path="ywmc" cssClass="text2"  onkeydown="tabs()" /></td>

<td >联系电话:</td><td><form:input path="lxdh" cssClass="text2" onkeydown="tabs()" /></td>
<td >传真:</td><td><form:input path="cz" cssClass="text2" onkeydown="tabs()" /></td>
</tr>
<tr>
<td >负责人:</td><td><form:input path="fzr" cssClass="text2" onkeydown="tabs()" /></td>

<td >E-MAIL:</td><td><form:input path="email" cssClass="text2" onkeydown="tabs()" /></td>
<td >货币类型:</td><td><form:select path="hblx" cssClass="combobox" onkeydown="tabs()"><form:option value="￥" label="￥" /><form:option value="$" label="$" /></form:select></td>
</tr>
<tr><td >工时费率:</td><td><form:input path="gsfl" cssClass="text2" onkeydown="tabs()" /></td>
</tr>
<tr><td height="5"></td></tr>
</table>
</fieldset>
<fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>本公司信息</legend>
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr>
<td >&nbsp;&nbsp;公司代码:</td><td><form:input path="lgsdm" cssClass="text" onkeydown="tabs()" /></td>

<td >公司名称:</td><td><form:input path="lgsmc" cssClass="text2" onkeydown="tabs()" /></td>

<td >英文名称:</td><td><form:input path="lywmc" cssClass="text2" onkeydown="tabs()" /></td>
</tr>
<tr>
<td >&nbsp;&nbsp;联系电话:</td><td><form:input path="llxdh" cssClass="text2" onkeydown="tabs()" /></td>

<td >传真:</td><td><form:input path="lcz" cssClass="text2" onkeydown="tabs()" /></td>
<td >负责人:</td><td><form:input path="lfzr" cssClass="text2" onkeydown="tabs()" /></td>

</tr>
<tr>
<td >&nbsp;&nbsp;E-MAIL:</td><td><form:input path="lemail" cssClass="text2" onkeydown="tabs()" /></td>

<td >公司地址:</td><td><form:input path="lgsdz" cssClass="text2" onkeydown="tabs()" /></td>
<td>费率类型:</td><td><form:select path="fllx" cssClass="combobox" onkeydown="tabs()"><form:option value="1" label="1" /><form:option value="2" label="2" /></form:select></td>
</tr>
<tr><td height="2"></td></tr>
</table>
</fieldset>
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr ><td  colspan="8" align="center"><input type="submit" id="submit" class="btn_2k3" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="myclose('r','<%=request.getParameter("op") %>')"></td></tr>
</table></form:form>
 </td></tr></table>

<script type="text/javascript">
document.getElementById("gsdm").focus();

</script>


<div class="tab-pane" id="tabPane1">

<script type="text/javascript">
tp1 = new WebFXTabPane( document.getElementById( "tabPane1" ) );
//tp1.setClassNameTag( "dynamic-tab-pane-control-luna" );
//alert( 0 )
</script>

	<div class="tab-page" style="padding:0px" id="tabPage1">
		<h2 class="tab" >堆存费率&nbsp;</h2>
		
		<script type="text/javascript">tp1.addTabPage( document.getElementById( "tabPage1" ) );</script>
		
<iframe src="adddcfl.htm?bh=<%=request.getParameter("bh") %>" id="t1" width="100%" height="400" frameborder="0" align="left"></iframe>
	
	</div>

	<div class="tab-page" id="tabPage2" style="padding:0px">
		<h2 class="tab" >修理费率1&nbsp;</h2>
		
		<script type="text/javascript">tp1.addTabPage( document.getElementById( "tabPage2" ) );</script>
	<iframe src="about:blank" id="t2" width="100%" height="400" frameborder="0" align="left"></iframe>
	</div>
		<div class="tab-page" id="tabPage3" style="padding:0px">
		<h2 class="tab" >修理费率2&nbsp;</h2>
		
		<script type="text/javascript">tp1.addTabPage( document.getElementById( "tabPage3" ) );</script>
	<iframe src="about:blank" id="t3" width="100%" height="400" frameborder="0" align="left"></iframe>
	</div>
	</div>
	<script type="text/javascript">
//<![CDATA[

setupAllTabs();

//]]>
</script>

  </body>
</html>
