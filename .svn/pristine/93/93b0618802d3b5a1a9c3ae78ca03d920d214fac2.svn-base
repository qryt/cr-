<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->批量完工确认</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
   <script type="text/javascript" src="js/changedate.js"></script>
 <STYLE>.nseerGround {
	Z-INDEX: -1; LEFT: 1%; WIDTH: 98%; POSITION: absolute; HEIGHT: 100%
}
.div_handbook {
	LEFT: 1%; WIDTH: 98%; POSITION: absolute
}
FORM {
	MARGIN: 0px
}
.resizeDivClass {
	Z-INDEX: 1; ; LEFT: expression(this.parentElement.offsetWidth-1); WIDTH: 2px; CURSOR: e-resize; POSITION: relative; BACKGROUND-COLOR: #dedbd6
}
A:visited {
	TEXT-DECORATION: none
}
A:active {
	TEXT-DECORATION: none
}
A:hover {
	TEXT-DECORATION: underline overline
}
A:link {
	TEXT-DECORATION: none
}
.t {
	LINE-HEIGHT: 1.4
}
BODY {
	SCROLLBAR-FACE-COLOR: #f1f1f1; FONT-SIZE: 9pt; MARGIN: 0px; SCROLLBAR-HIGHLIGHT-COLOR: #f1f1f1; SCROLLBAR-SHADOW-COLOR: buttonface; SCROLLBAR-3DLIGHT-COLOR: buttonhighlight; FONT-FAMILY: 宋体
}
TD {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
DIV {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
FORM {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
OPTION {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
P {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
TD {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
BR {
	FONT-SIZE: 9pt; FONT-FAMILY: 宋体
}
.gray {
	FILTER: gray; CURSOR: hand
}
.style3 {
	FONT-WEIGHT: bold; FONT-SIZE: 16px
}
.TABLE_STYLE11 {
	BORDER-RIGHT: 1px solid; BORDER-TOP: 1px solid; BORDER-LEFT: 1px solid; WIDTH: 95%; BORDER-BOTTOM: 1px solid; BORDER-COLLAPSE: collapse
}
.TABLE_STYLE1 {
	BORDER-RIGHT: 1px solid; BORDER-TOP: 1px solid; BORDER-LEFT: 1px solid; WIDTH: 95%; BORDER-BOTTOM: 1px solid; BORDER-COLLAPSE: collapse
}
.TABLE_STYLE2 {
	WIDTH: 95%
}
.TABLE_STYLE3 {
	WIDTH: 100%
}
.TABLE_STYLE4 {
	WIDTH: 95%
}
.TABLE_STYLE5 {
	BORDER-RIGHT: 1px solid; BORDER-TOP: 1px solid; BORDER-LEFT: 1px solid; WIDTH: 95%; BORDER-BOTTOM: 1px solid; BORDER-COLLAPSE: collapse
}
.TABLE_STYLE6 {
	WIDTH: 820px
}
.TABLE_STYLE7 {
	BORDER-RIGHT: 1px solid; BORDER-TOP: 1px solid; BORDER-LEFT: 1px solid; WIDTH: 100%; BORDER-BOTTOM: 1px solid; BORDER-COLLAPSE: collapse
}
.ALL-STYLE {
	BORDER-RIGHT: #dedbd6 1px ridge; BORDER-TOP: #dedbd6 1px ridge; BORDER-LEFT: #dedbd6 1px ridge; BORDER-BOTTOM: #dedbd6 1px ridge
}
.TR_STYLE1 {
	
}
.TR_STYLE2 {
	
}
.style8 {
	COLOR: #000066
}
.TD_HANDBOOK_STYLE1 {
	VERTICAL-ALIGN: top; WIDTH: 100%; COLOR: #0000ff
}
.TD_STYLE1 {
	BACKGROUND-IMAGE: url(/erp/images/line7.gif)
}
.TD_STYLE2 {
	border-spacing: 1px
}
.TD_STYLE3 {
	
}
.TD_STYLE4 {
	
}
.TD_STYLE5 {
	
}
.TD_STYLE6 {
	
}
.TD_STYLE7 {
	BACKGROUND-IMAGE: url(/erp/images/line4.gif)
}
.TD_STYLE8 {
	
}
.SUBMIT_STYLE1 {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.BUTTON_STYLE1 {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.RESET_STYLE1 {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.RADIO_STYLE1 {
	
}
.CHECKBOX_STYLE1 {
	
}
.SELECT_STYLE1 {
	WIDTH: 100%
}
.SELECT_STYLE2 {
	WIDTH: 100%
}
.TEXTAREA_STYLE1 {
	WIDTH: 100%
}
.DIV_STYLE1 {
	FLOAT: right; VERTICAL-ALIGN: top
}
.DIV_STYLE2 {
	VERTICAL-ALIGN: top
}
.INPUT_STYLE1 {
	WIDTH: 100%
}
.INPUT_STYLE3 {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BORDER-LEFT: 0px; WIDTH: 100%; BORDER-BOTTOM: #000000 1px solid
}
.INPUT_STYLE4 {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BORDER-LEFT: 0px; WIDTH: 100%; BORDER-BOTTOM: 0px
}
.INPUT_STYLE5 {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BORDER-LEFT: 0px; WIDTH: 100%; BORDER-BOTTOM: 0px; BACKGROUND-COLOR: #ffffcc
}
.FILE_STYLE1 {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.btn3_mouseout {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.btn3_mouseover {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.btn3_mousedown {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
.btn3_mouseup {
	BORDER-RIGHT: #7ebf4f 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #7ebf4f 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#B3D997); BORDER-LEFT: #7ebf4f 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #7ebf4f 1px solid
}
</STYLE>
<SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>
<SCRIPT src="js/nseergrid.js" type=text/javascript></SCRIPT>
<LINK href="css/nseer.css" type=text/css rel=stylesheet>

<SCRIPT src="js/niceforms.js" type=text/javascript></SCRIPT>


<SCRIPT language=javascript>
if (window.attachEvent)window.attachEvent("onload",function(){document.all('LoadProcess_head').style.visibility ="hidden";document.all('mengban_head').style.visibility = "hidden";document.all('ifra_head').style.visibility = "hidden";});
if (window.addEventListener)window.addEventListener("load",function(){document.all('LoadProcess_head').style.visibility = "hidden";document.all('mengban_head').style.visibility = "hidden";document.all('ifra_head').style.visibility = "hidden";},false)
 function sel(a){

  o=document.getElementsByName(a);

  for(i=1;i<o.length;i++){
  o[i].checked=event.srcElement.checked;

}
 }
 function plqr(){
var k=document.all.chk;
var j=0;
var id="";
 for(i=k.length-1;i>=1;i--){
if(k[i].checked){
j++;
id=k[i].value;
}
}
  if(j==0)
  alert("不能批量处理，请至少选择一项！")
  else if( document.getElementById("plwgrq").value!=""){
 document.getElementById("form1").action="list.htm?action=chkwg&flag=qr";
 document.getElementById("form1").submit(); 
 }
 else
 {
 alert("请输入完工日期！");
 }
 }
 function plqx(){
 var k=document.all.chk;
var j=0;
var id="";
 for(i=k.length-1;i>=1;i--){
if(k[i].checked){
j++;
id=k[i].value;
}
}
  if(j==0)
  alert("不能批量取消，请至少选择一项！")
  else {
 document.getElementById("form1").action="list.htm?action=chkwg&flag=qx";
 document.getElementById("form1").submit(); 
 }
 }
</SCRIPT>

<STYLE>.mengban_head {
	Z-INDEX: 10; FILTER: alpha(opacity=10); LEFT: 0px; VISIBILITY: visible; WIDTH: 100%; POSITION: absolute; TOP: 0px; HEIGHT: 50px; BACKGROUND-COLOR: #84acff
}
</STYLE>

  </head>
  
  <body onload="da();da1();MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');">
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
        <td bgcolor="#FFFFFF"><iframe  width="100%" height="215" scrolling="no" frameborder="1" id="fid" name="fid" src="about:blank"></iframe></td>
      </tr>
    </table>
  </div>
</div>
 <form id="form1" method="post" action="list.htm?action=chkwg">
<table width="1020" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="1020" height="55" background="images/topbg.gif" align="right" class="login_title"><table><tr><td><table><tr><td style="color:#ffffff">当前用户:&nbsp;&nbsp;<authz:authentication operation="username"/></td></tr><tr><td><label id="aa" style="color:#ffffff"></label></td></tr></table></td><td width=180>&nbsp;</td>
    <td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='main.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/folder_home.gif" width=32 border=0 title="返回主页"></div></td></tr><tr><td style="color:#ffffff">返回主页</td></tr></table></td>
    <td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='editPwd.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/user.gif" width=32 border=0 title="修改密码"></div></td></tr><tr><td style="color:#ffffff">修改密码</td></tr></table></td><td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='j_acegi_logout'" style="CURSOR: hand"><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/exit.gif" width=32 border=0 title="退出系统"></div></td></tr><tr><td style="color:#ffffff">退出系统</td></tr></table></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr></table></td>
  </tr>
</table>
<table width="1020" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="1020" height="6"><img src="images/xn_01.gif"></td>
  </tr>
</table>
<table width="1020" height="100%" border="0" cellpadding="0" cellspacing="0"><tr>
<td  width="143"    background="images/menu_bg.png" valign="top" align="right"   class="main_left"><table border="0" cellpadding="0" cellspacing="1"  width="141" height="195" style="border-bottom:1px solid #b3d1fb;border-left:1px solid #b3d1fb;border-right:1px solid #b3d1fb;overflow:hidden"><tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;堆存管理</td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="jcdj.htm" class="ho">进出场登记</a></td></tr>
 <tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批量处理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="plxlqr.htm" class="ho">批量修理确认</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="pltdh.htm" class="ho">批量提单号指定</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="plbz.htm" class="ho">批量班组指定</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="plwg.htm" class="ho">批量完工确认</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="pljz.htm" class="ho">批量结账确认</a></td></tr>
  <tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;报表处理</td></tr>
  <tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="bbcx.htm" class="ho">报表查询</a></td></tr>
 
<tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统管理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxx.htm" class="ho">箱型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addshlx.htm" class="ho">损坏类型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addcgs.htm" class="ho">船公司设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addyh.htm" class="ho">用户管理</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addrole.htm" class="ho">角色管理</a></td></tr>


</table></td>
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top" style="padding-right:5px;"><table class="table_1"  width="100%"><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;批量完工处理</td></tr> <tr><td  style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9"  ><legend>查询条件</legend>
<table  width="100%" cellpadding="0" cellspacing="0" border="0">
<tr><td align="left"   height="25">&nbsp;&nbsp;船公司:
</td><td><input type="text" class="text" id="cgs" name="cgs" onkeyup="kd('cgs')" autocomplete="off" value="${jc.cgs }"/></td><td >箱&nbsp;&nbsp;&nbsp;&nbsp;号:</td><td><input type="text" class="text" id="xh" name="xh" onkeyup="kd('xh')" autocomplete="off" value="${jc.xh }"/></td><td>尺寸:</td><td><select id="cc" name="cc" class="combobox"><option value="">全部</option><option value="20’">20’</option><option value="40’">40’</option><option value="45’">45’</option></select></td>
<td>箱型:</td><td><input type="text" class="text" onkeyup="kd('xx')" autocomplete="off" id="xx" name="xx" value="${jc.xx }"/></td><td rowspan="10"><input type="button" onclick="mysu()" class="btn_2k3" value="查询"></td></tr>
<tr><td>&nbsp;&nbsp;进场状态:</td><td><select id="jczt" name="jczt" class="combobox"><option value="">全部</option><option value="好箱">好箱</option><option value="坏箱">坏箱</option></select></td>
<td>进场编号:</td><td><input type="text" id="rcbh" name="rcbh" class="text" value="${jc.rcbh }"/></td>
<td>进场起始日期:</td><td><input type="text" class="text" id="qsrq" name="qsrq" value="<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"   /></td>
<td>进场截止日期:</td><td><input type="text" class="text" id="jzrq" name="jzrq" value="<fmt:formatDate value="${jc.llrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"   /></td>
 </tr>
<tr><td height="25">&nbsp;&nbsp;提单号:</td><td><input type="text" class="text" id="tdh" name="tdh" value="${jc.tdh }"/></td>
<td>离场状态:</td><td><select id="lczt" name="lczt" class="combobox"><option value="">全部</option><option value="进场">进场</option><option value="离场">离场</option></select></td>
<td>确认起始日期:</td><td><input type="text" class="text" id="qrqsrq" name="qrqsrq" value="<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"  /></td>
<td>确认截止日期:</td><td><input type="text" class="text" id="qrjzrq" name="qrjzrq" value="<fmt:formatDate value="${jc.llrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"   /></td>

</tr>
<tr>
<td height="25">&nbsp;&nbsp;是否报废:</td><td><select id="sfbf" name="sfbf" class="combobox"><option value="">全部</option><option value="在用">在用</option><option value="报废">报废</option></select></td>
<td>是否确认:</td><td><select id="sfqr" name="sfqr" class="combobox"><option value="">全部</option><option value="是">是</option><option value="否">否</option></select></td>
<td>是否完工:</td><td><select id="sfwg" name="sfwg" class="combobox"><option value="">全部</option><option value="是">是</option><option value="否">否</option></select></td>
<td>是否结账:</td><td><select id="sfjz" name="sfjz" class="combobox"><option value="">全部</option><option value="是">是</option><option value="否">否</option></select></td>

</tr>
<tr>
<td height="25">&nbsp;&nbsp;作业工人:</td><td><select id="zygr" name="zygr" class="combobox"><option value="">全部</option><option value="一组">一组</option><option value="二组">二组</option><option value="三组">三组</option><option value="四组">四组</option><option value="五组">五组</option><option value="六组">六组</option><option value="七组">七组</option><option value="八组">八组</option></select></td>
</tr>
<tr><td height="10"></td></tr>
 </table> 
</fieldset>

<table><tr><td style="height:5px"></td></tr></table>
<table class="table_1" style="width:100%;height:300px;overflow:hidden">
<tr><td style="width:100%">


<div >
<div style="BORDER-bottom: #12d608 1px solid;" align="left" width="100%"   >
<DIV id="nseer_grid_div"  align="right"><table><tr><td>完工时间：<input type="input" class="text" style="vertical-align:top" id="plwgrq" name="plwgrq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;<input type="button" onclick="plqr()" value="批量完工确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1">&nbsp;&nbsp;<input type="button" class="btn_2k3" onclick="plqx()" value="批量完工取消"></td></tr></table></DIV>

<SCRIPT type=text/javascript>
function id_link(link){
document.location.href=link;
}
var nseer_grid = new nseergrid();
nseer_grid.callname = "nseer_grid";
nseer_grid.title_alt="确认完工项目";
nseer_grid.parentNode = nseer_grid.$("nseer_grid_div");
nseer_grid.columns =[ {name: '<input type="checkbox" value="0"  class="CHECKBOX_STYLE1" name=chk  id=chk onclick=sel(\"chk\") > '},
                        {name: '入场编号'},
                       {name: '船公司'},
					   {name: '箱号'},
	                   {name: '尺寸'},
	                   {name: '箱型'},
	                   {name: '确认时间'},
	                   {name: '作业工人'},
	                   {name: '完工时间'}
	                 
                  ]
nseer_grid.column_width=[40,100,80,100,100,80,120,80,120];

nseer_grid.data = [
${data}
['']];
nseer_grid.init();

</SCRIPT>

<DIV id=drag_div></DIV>
<DIV id=point_div_t></DIV>
<DIV id=point_div_b></DIV>
 </div>
</div>
<SCRIPT>function _nseer_pageVali(o){if(isNaN(parseInt(o.value))){o.value='';}else{o.value=''+parseInt(o.value);}}
document.getElementById("nseer_grid_div").style.left=0+"px";
</SCRIPT>

 <div  onclick=" resizeme()" id="divme"  style="width:100%;height:400px; "></div>
</td></tr>
 </table>

 </td></tr>

</table>

<script type="text/javascript">
document.getElementById("nseergrid").style.width="855px";
document.getElementById("jczt").value="${jc.jczt }";
document.getElementById("lczt").value="${jc.lczt }";
document.getElementById("cc").value="${jc.cc }";
document.getElementById("sfbf").value="${jc.sfbf }";
document.getElementById("sfqr").value="${jc.sfqr }";
document.getElementById("sfwg").value="${jc.sfwg }";
document.getElementById("sfjz").value="${jc.sfjz }";
document.getElementById("zygr").value="${jc.zygr }";
</script>
</td></tr></table></form> 
  </body>
</html>
