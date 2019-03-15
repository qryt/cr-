<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->进场登记</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	 <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />
    <link rel="stylesheet" type="text/css" href="ext/resources/css/xtheme-gray.css" />
<style>
	 input{
	 text-transform:uppercase;
	 }
	 </style>
    <!-- GC -->
 	<!-- LIBS -->
 	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
 	<!-- ENDLIBS -->

    <script type="text/javascript" src="ext/ext-all.js"></script>

    <script type="text/javascript" src="ext/examples/form/states.js"></script>

    <link rel="stylesheet" type="text/css" href="ext/examples/form/combos.css" />
    <SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>

    <!-- Common Styles for the examples -->
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
  <script type="text/javascript" src="js/changedate.js"></script>
<link rel="stylesheet" type="text/css" href="gt_grid.css" />

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" src="js/gt_msg_cn.js"></script>
<script type="text/javascript" src="js/gt_grid_all.js"></script>
<script language="JavaScript" src="js/calendar_month.js" type="text/JavaScript"></script>
<script type="text/javascript" >
// 教程中的代码就写在这个区域里.
var data1 = [
${data}];

var dsConfig= {
	data : data1 ,

	fields :[
		{name : 'cz'       }, 
		{name : 'rcbh'      },
		{name : 'cgs'       },
		{name : 'xh'      },
		{name : 'cc'       },
		{name : 'xx'       },
		{name : 'zzrq'       },
		
		{name : 'jctc'       },
		{name : 'lxd'       },
		{name : 'jczt'       },
		{name : 'jcwz'       },
		{name : 'wzmx'       },
		{name : 'eirlsh'       },
		{name : 'zgd'       },
		{name : 'sfbf'       },
		{name : 'jcrq'       },
		{name : 'lrr'       },
		{name : 'lrrq'       } 
	]
};

var colsConfig = [

		{ id : 'cz'      , header : "操作" , width : 50 },
		{ id : 'rcbh'      , header : "进场编号" , width : 100},
			{ id : 'cgs'      , header : "船公司" , width : 100 },
		{ id : 'xh'      , header : "箱号" , width : 100},
		{ id : 'cc'      , header : "尺寸" , width : 100},
		{ id : 'xx'      , header : "箱型" , width : 100},
		{ id : 'zzrq'      , header : "制造年月" , width : 100 },
	
		{ id : 'jctc'      , header : "进场拖车" , width : 100 },
		{ id : 'lxd'      , header : "来箱地" , width : 100 },
		{ id : 'jczt'      , header : "进场状态" , width : 100 },
		{ id : 'jcwz'      , header : "进场位置" , width : 100 },
		{ id : 'wzmx'      , header : "位置描述" , width : 100 },
		{ id : 'eirlsh'      , header : "EIR流水号" , width : 100 },
		{ id : 'zgd'      , header : "转关地" , width : 100 },
		{ id : 'sfbf'      , header : "是否报废" , width : 100 },
		{ id : 'jcrq'      , header : "进场时间" , width : 110 },
		{ id : 'lrr'      , header : "录入人" , width : 60 },
		{ id : 'lrrq'      , header : "录入日期" , width : 110 }
];

var gridConfig={

	id : "grid1",
	
	dataset : dsConfig ,

	columns : colsConfig ,

	container : 'grid1_container', 

	toolbarPosition : 'bottom',

	toolbarContent : 'nav | goto | pagesize | reload | state' ,

	pageSize : 10 ,
	
	pageSizeList : [5,10,15,20]

};
var mygrid=new GT.Grid( gridConfig );
GT.Utils.onLoad( GT.Grid.render(mygrid) );
function doFilter() {
	var filterInfo=[
	{
		fieldName : GT.Util.getValue("f_fieldName1"),
		logic : GT.Util.getValue("f_logic1"),
		value : GT.Util.getValue("f_value1")
	}
	]
	var grid=GT.$grid("grid1");

	// 不要隐藏不符合过滤条件的行
	//grid.onlyFilterRecords=false;
	// 返回符合过滤条件的行行号(数组);
	var rowNOs=grid.filterGrid(filterInfo);
	// 然后可以针对这些行做一些自定义的处理 例如 着色 
}
function body_re(){
if(document.getElementById("cgs").value=="")
document.getElementById('cgs').focus();
else
document.getElementById('cc').focus();
}
function addjc(){
if(gf_trim(document.getElementById("cgs").value)=="")
{document.getElementById("me2").innerText="船公司不能为空！";
document.getElementById("cgs").focus();
}
else if(gf_trim(document.getElementById("xh").value)==""){
 document.getElementById("me2").innerText="箱号不能为空！";
document.getElementById("xh").focus();
}
else if(gf_trim(document.getElementById("xx").value)==""){
 document.getElementById("me2").innerText="箱型不能为空！";
document.getElementById("xx").focus();
}
else if(gf_trim(document.getElementById("xxl").value)==""){
 document.getElementById("me2").innerText="箱型类不能为空！";
document.getElementById("xxl").focus();
}
else if(gf_trim(document.getElementById("jcrq").value)==""){
 document.getElementById("me2").innerText="进场日期不能为空！";
document.getElementById("jcrq").focus();
}
else {
converted.setValue(converted.getRawValue());
document.getElementById('command').submit();
}
}
</script>
  </head>
  
  <body onload="da();da1();MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');body_re()">
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
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="pl.htm" class="ho">批量录入处理</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="pldc.htm" class="ho">批量堆存费处理</a></td></tr>
  <tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;报表处理</td></tr>
  <tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="bbcx.htm" class="ho">报表查询</a></td></tr>
 
<tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统管理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxx.htm" class="ho">箱型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxxl.htm" class="ho">箱型类设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addwzdm.htm" class="ho">位置代码设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addshlx.htm" class="ho">损坏类型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addcgs.htm" class="ho">船公司设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addyh.htm" class="ho">用户管理</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addrole.htm" class="ho">角色管理</a></td></tr>


</table></td>
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top"  style="padding-right:5px;" ><form:form onsubmit="javascript:converted.setValue(converted.getRawValue());"><table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;添加进场登记信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>进场信息</legend>

<table width="800" cellpadding="0" cellspacing="0" border="0" >
<tr><td>&nbsp;&nbsp;船公司:</td><td><form:input path="cgs" cssClass="text" onkeyup="kd('cgs')" autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td align="left"   height="25">箱号: 
</td><td><form:input path="xh" cssClass="text" onfocus="this.select()"  onkeyup="kd('xh')"   autocomplete="off" />&nbsp;<font color="red">*</font></td><td >尺寸:</td><td><form:select path="cc" cssClass="combobox" onkeyup="tab('xx')"><form:option value="20’" label="20’" /><form:option value="40’" label="40’" /><form:option value="45’" label="45’" /></form:select></td>
<td>箱型:</td><td><TABLE cellpadding="0" cellspacing="0" border="0" ><tr><td><form:input path="xx" cssClass="text_5" onkeyup="kd('xx')" autocomplete="off" />&nbsp;</td><td><form:input path="xxl" cssClass="text_5" onfocus="this.select()" onkeyup="kd('xxl')" autocomplete="off"  />&nbsp;<font color="red">*</font></td></tr></TABLE></td>


<tr>
<td>&nbsp;&nbsp;进场时间:</td><td><form:input path="jcrq" cssClass="text" onfocus="this.select()" onkeydown="tabs()" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" />&nbsp;<font color="red">*</font></td>

<td>进场拖车:</td><td><form:select path="jctc"><form:option value="苏" label="苏"></form:option><form:option value="沪" label="沪"></form:option><form:option value="浙" label="浙"></form:option><form:option value="皖" label="皖"></form:option><form:option value="鲁" label="鲁"></form:option><form:option value="京" label="京"></form:option><form:option value="津" label="津"></form:option><form:option value="渝" label="渝"></form:option><form:option value="赣" label="赣"></form:option><form:option value="豫" label="豫"></form:option><form:option value="鄂" label="鄂"></form:option><form:option value="湘" label="湘"></form:option><form:option value="粤" label="粤"></form:option><form:option value="黔" label="黔"></form:option><form:option value="滇" label="滇"></form:option><form:option value="陕" label="陕"></form:option><form:option value="甘" label="甘"></form:option><form:option value="宁" label="宁"></form:option>
<form:option value="冀" label="冀"></form:option><form:option value="晋" label="晋"></form:option><form:option value="辽" label="辽"></form:option><form:option value="吉" label="吉"></form:option><form:option value="黑" label="黑"></form:option><form:option value="琼" label="琼"></form:option><form:option value="川" label="川"></form:option><form:option value="藏" label="藏"></form:option><form:option value="桂" label="桂"></form:option><form:option value="内蒙古" label="内蒙古"></form:option><form:option value="新" label="新"></form:option><form:option value="宁" label="宁"></form:option></form:select></td>
<td>来箱地</td><td><form:input path="lxd" onkeydown="tabs()"  cssClass="text"/></td>
<td>进场状态:</td><td><form:select path="jczt" onkeydown="tabs()"  cssClass="combobox"><form:option value="坏箱" label="坏箱" /><form:option value="好箱" label="好箱" /></form:select>&nbsp;<form:select path="pxyy" onkeydown="tabs()"  ><form:option value="1" label="1" /><form:option value="2" label="2" /><form:option value="3" label="3" /><form:option value="4" label="4" /> </form:select></td>

</tr>
<tr><td>&nbsp;&nbsp;进场位置:</td><td><form:input path="jcwz"  onkeydown="tabs()"  cssClass="text"/></td>

<td>位置描述:</td><td><form:input path="wzmx"  onkeydown="tabs()"  cssClass="text"/></td>
<td>Eir流水号:</td><td><form:input path="eirlsh"  onkeydown="tabs()"  cssClass="text"/></td>
<td>转关地:</td><td><form:input path="zgd"  onkeydown="tabs()"  cssClass="text"/></td>

</tr>
<tr>
<td>&nbsp;&nbsp;提单号:</td><td><form:input path="tdh"  onkeydown="tabs()"  cssClass="text"  />&nbsp;</td>
<td>制造年月:</td><td><form:input path="zzrq" cssClass="text" ondblclick="calendar();" onkeydown="tabs()" /></td>


<td>是否报废:</td><td><form:select path="sfbf"  onkeydown="tabs()"  cssClass="combobox"><form:option value="在用" label="在用" /><form:option value="报废" label="报废" /></form:select></td>
</tr>
<tr><td colspan="8" style="color:red" align="center" id="me2">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center">
<input type="button" name="tj" class="btn_2k3" value="添加" onfocus="converted.setValue(converted.getRawValue());document.getElementById('command').submit()">
&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" name="fh" class="btn_2k3" value="返回" onclick="javascript:location.href='jcdj.htm'">
</td></tr>


 </table>
</fieldset></form:form><table><tr><td style="height:5px"></td></tr></table><table class="table_1">
<tr><td  style="width:100%">
  <div onclick=" resizeme()" id="divme"  style="width:100%;height:250px;overflow:hidden">
<div id="grid1_container" style="width:100%;height:250px;overflow:hidden">
</div> </div>
</td></tr>
</table></td></tr>

</table>
<script>

    var converted = new Ext.form.ComboBox({
        typeAhead: true,
        triggerAction: 'all',
        transform:'jctc',
        width:105,
       
        forceSelection:false,
       editable:true,
       hiddenName:'hjctc',
        enableKeyEvents:true,
        
       listeners:{   
            specialkey:function(field,e){   
                if (e.getKey()==Ext.EventObject.ENTER){   

 


              tabs();
                }
                }
                }
        
    });
  //   converted.setValue("苏");

if(document.getElementById("jcrq").value=="")
document.getElementById("jcrq").value=re_jcrq();
document.getElementById("xxl").value="03";
     </script>
  </body>
</html>
