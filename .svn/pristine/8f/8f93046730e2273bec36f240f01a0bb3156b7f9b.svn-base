<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>
<%
SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
String dd=df.format(new Date());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <title>集装箱修理管理系统->批量处理</title>
    
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
<script type="text/javascript">
function divload(){
document.getElementById("divDisable").style.display="block";
document.getElementById("divload").style.display="block";
}
</script>
  </head>
  
  <body>
<div id="divDisable" style="display: none;width:expression(document.body.offsetWidth);height:expression(document.body.offsetHeight); z-index: 1000; position: absolute;left: 0px; top: 0px;filter:alpha(opacity=50); background-color:#333333"></div>
<div id="divload" style="display: none;z-index: 1000;position: absolute;top: 100px;left:expression((body.clientWidth-350)/2);" ><table width="350" cellpadding="0" cellspacing="3" bgcolor="#2D95e6">
<tr><td align="center" valign="middle" height="100" bgcolor="#ffffff"><img alt="" src="images/ajax-loader.gif" style="vertical-align:middle;" /> 系统正在处理，请稍候...</td>
</tr>
</table></div>  
 <table border=0 cellpadding="0" cellspacing="0" bgcolor="#c6e7ff">
   <tr bgcolor="#ffffff"><td height="30">修理确认时间：</td><td><input type="input" class="text" style="vertical-align:top" id="plqrrq" name="plqrrq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  value="<%=dd %>" >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;plqr('plqrrq');" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('plqrrq')" value="批量取消"></td></tr>
   <tr bgcolor="#ffffff"><td height="30">提单号：</td><td><input type="input" class="text" style="vertical-align:top" id="pltdh" name="pltdh"   autocomplete="off"  ></td><td width="100" align="center"><input type="button" id="btn_tdhqr" name="btn_tdhqr" onclick="this.disabled=true;divload();plqr('pltdh')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('pltdh')" value="批量取消"></td></tr>
     <tr bgcolor="#ffffff"><td height="30">作业班组：</td><td><select id="plbz" name="plbz" class="combobox"><option value="">请选择</option><option value="一组">一组</option><option value="二组">二组</option><option value="三组">三组</option><option value="四组">四组</option><option value="五组">五组</option><option value="六组">六组</option><option value="七组">七组</option><option value="八组">八组</option></select></td><td width="100" align="center"><input type="button" id="btn_bzqr" name="btn_bzqr" onclick="this.disabled=true;divload();plqr('plbz')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('plbz')" value="批量取消"></td></tr>
    <tr bgcolor="#ffffff"><td height="30">发送时间：</td><td><input type="input" class="text" value="<%=dd %>" style="vertical-align:top" id="plfsrq" name="plfsrq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;divload();plqr('plfsrq')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('plfsrq')" value="批量取消"></td></tr>
  
      <tr bgcolor="#ffffff"><td height="30">完工时间：</td><td><input type="input" class="text" value="<%=dd %>" style="vertical-align:top" id="plwgrq" name="plwgrq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;divload();plqr('plwgrq')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('plwgrq')" value="批量取消"></td></tr>
  <tr bgcolor="#ffffff"><td height="30">出场时间：</td><td><input type="input" class="text" value="<%=dd %>" style="vertical-align:top" id="plccrq" name="plccrq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;divload();plqr('plccrq')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('plccrq')" value="批量取消"></td></tr>       
<tr bgcolor="#ffffff"><td height="30">结账时间：</td><td><input type="input" class="text" value="<%=dd %>" style="vertical-align:top" id="pljzrq" name="pljzrq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;divload();plqr('pljzrq')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('pljzrq')" value="批量取消"></td></tr>
<tr bgcolor="#ffffff"><td height="30">堆存转入时间：</td><td><input type="input" class="text"  value="<%=dd %>" style="vertical-align:top" id="pldc" name="pldc" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;divload();plqr('pldc')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('pldc')" value="批量取消"></td></tr>
<tr bgcolor="#ffffff"><td height="30">EDI发送日期：</td><td><input type="input" class="text" value="<%=dd %>" style="vertical-align:top" id="pledirq" name="pledirq" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off"  >&nbsp;&nbsp;</td><td width="100" align="center"><input type="button" onclick="this.disabled=true;divload();plqr('pledirq')" value="批量确认"  onmouseover=this.className='btn3_mouseover' onmouseout=this.className='btn3_mouseout' onmousedown=this.className='btn3_mousedown' onmouseup=this.className='btn3_mouseup' class="SUBMIT_STYLE1"></td><td width="100" align="center"><input type="button" class="btn_2k3" onclick="this.disabled=true;divload();plqx('pledirq')" value="批量取消"></td></tr>
   
   </table>
  </body>
</html>
