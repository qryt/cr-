<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->出场登记</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="gt_grid.css" />
  <script type="text/javascript" src="js/changedate.js"></script>
<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<link rel="stylesheet" type="text/css" href="gt_grid.css" />

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" src="js/gt_msg_cn.js"></script>
<script type="text/javascript" src="js/gt_grid_all.js"></script>
<script type="text/javascript" >
// 教程中的代码就写在这个区域里.
var data1 = [
${data}];

var dsConfig= {
	data : data1 ,

	fields :[
		{name : 'cz'       }, 
		{name : 'rcbh'      },
		{name : 'xh'      },
		{name : 'cc'       },
		{name : 'xx'       },
		{name : 'zzrq'       },
		{name : 'cgs'       },
		{name : 'jctc'       },
		{name : 'lxd'       },
		{name : 'jczt'       },
		{name : 'jcwz'       },
		{name : 'wzmx'       },
		{name : 'eirlsh'       },
		{name : 'zgd'       },
		{name : 'sfbf'       },
		{name : 'jcrq'       } 
	]
};

var colsConfig = [

		{ id : 'cz'      , header : "操作" , width : 50 },
		{ id : 'rcbh'      , header : "进场编号" , width : 100},
		{ id : 'xh'      , header : "箱号" , width : 100},
		{ id : 'cc'      , header : "尺寸" , width : 100},
		{ id : 'xx'      , header : "箱型" , width : 100},
		{ id : 'zzrq'      , header : "制造年月" , width : 100 },
		{ id : 'cgs'      , header : "船公司" , width : 100 },
		{ id : 'jctc'      , header : "进场拖车" , width : 100 },
		{ id : 'lxd'      , header : "来箱地" , width : 100 },
		{ id : 'jczt'      , header : "进场状态" , width : 100 },
		{ id : 'jcwz'      , header : "进场位置" , width : 100 },
		{ id : 'wzmx'      , header : "位置描述" , width : 100 },
		{ id : 'eirlsh'      , header : "EIR流水号" , width : 100 },
		{ id : 'zgd'      , header : "转关地" , width : 100 },
		{ id : 'sfbf'      , header : "是否报废" , width : 100 },
		{ id : 'jcrq'      , header : "进场时间" , width : 110 }
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

function add(){
window.location.href="addjcdj.htm";
}
</script>
  </head>
  
  <body onload="da();da1()">
<table width="1024" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="1024" height="55" background="images/topbg.gif" align="right" class="login_title"><table><tr><td><table><tr><td style="color:#ffffff">当前用户:&nbsp;&nbsp;<authz:authentication operation="username"/></td></tr><tr><td><label id="aa" style="color:#ffffff"></label></td></tr></table></td><td width=180>&nbsp;</td><td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='editPwd.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/user.gif" width=32 border=0 title="修改密码"></div></td></tr><tr><td style="color:#ffffff">修改密码</td></tr></table></td><td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='j_acegi_logout'" style="CURSOR: hand"><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/exit.gif" width=32 border=0 title="退出系统"></div></td></tr><tr><td style="color:#ffffff">退出系统</td></tr></table></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr></table></td>
  </tr>
</table>
<table width="1024" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="1024" height="6"><img src="images/xn_01.gif"></td>
  </tr>
</table>
<table width="1024" height="100%" border="0" cellpadding="0" cellspacing="0"><tr>
<td  width="143"    background="images/menu_bg.png" valign="top" align="right"   class="main_left"><table border="0" cellpadding="0" cellspacing="1"  width="141" height="195" style="border-bottom:1px solid #b3d1fb;border-left:1px solid #b3d1fb;border-right:1px solid #b3d1fb;overflow:hidden"><tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;堆存管理</td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addArt.htm" class="ho">进场登记</a></td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addArt.htm" class="ho">出场登记</a></td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addArt.htm" class="ho">组合查询</a></td></tr>
<tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;修理管理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">估价单生成</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">修箱确认</a></td></tr>

<tr><td bgcolor="#ffffff" align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="j_acegi_logout" class="ho">组合查询</a></td></tr>


<tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统管理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">箱型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">船公司设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">堆存费率设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">修理费率设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">损坏信息设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="editPwd.htm" class="ho">用户管理</a></td></tr>


</table></td>
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top" ><table class="table_1"  width="100%"><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;出场登记</td></tr><tr><td height=10></td></tr><tr><td  style="padding:5px;"><fieldset style="width:800px;height:60px;border: 1 solid #3e7fd9"  ><legend>查询条件</legend>
<form method="post" action="list.htm?action=findjcdj" id="form1" name="form1">
<table  width="800" cellpadding="0" cellspacing="0" border="0">
<tr><td align="left"   height="25">&nbsp;&nbsp;进场编号:
</td><td><input type="input" id="rcbh" name="rcbh" class="text" value="${jc.rcbh }"/></td><td >箱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:</td><td><input type="input" class="text" id="xh" name="xh" value="${jc.xh }"/></td><td>尺寸:</td><td><input type="input" id="cc" name="cc" class="text" value="${jc.cc }"/></td>
<td>箱型:</td><td><input type="input" class="text" id="xx" name="xx" value="${jc.xx }"/></td><td rowspan="10"><input type="submit" class="btn_2k3" value="查询"></td></tr>
<tr><td>&nbsp;&nbsp;进场状态:</td><td><input type="input" class="text" id="jczt" name="jczt" value="${jc.jczt }"/></td>
<td>船公司:</td><td><input type="input" class="text" id="cgs" name="cgs" value="${jc.cgs }"/></td>
<td>起始日期:</td><td><input type="input" class="text" id="qsrq" name="qsrq" value="<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" onclick="popUpCalendar(this, this, 'yyyy-mm-dd')" /></td>
<td>截止日期:</td><td><input type="input" class="text" id="jzrq" name="jzrq" value="<fmt:formatDate value="${jc.llrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" onclick="popUpCalendar(this, this, 'yyyy-mm-dd')" /></td>
<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>
</tr>
<tr><td>&nbsp;&nbsp;提单号:</td><td><input type="input" class="text" id="tdh" name="tdh" value="${jc.tdh }"/></td>
<td>离场状态:</td><td><input type="input" class="text" id="lczt" name="lczt" value="${jc.lczt }"/></td>
<td>是否报废:</td><td><input type="input" class="text" id="sfbf" name="sfbf" value="${jc.sfbf }"/></td>
 
</tr>
<tr><td height="10"></td></tr>
 </table></form>
</fieldset>
<table><tr><td style="height:5px"></td></tr></table>
<table class="table_1" style="width:800px;height:350px;overflow:hidden">
<tr><td style="width:800px">
  <div style="width:800px;height:350px;overflow:hidden">
<div id="grid1_container" style="width:800px;height:350px;overflow:hidden">
</div> </div>
</td></tr>
<tr><td><INPUT name="button2" type="button" title="新建进场信息" class="btn_2k3" onClick="add();" value="新建进场信息"></td></tr>
</table></td></tr>

</table>

  </body>
</html>
