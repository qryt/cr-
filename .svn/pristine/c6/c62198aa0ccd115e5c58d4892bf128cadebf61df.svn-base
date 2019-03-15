<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->箱公司设置</title>
    
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
<script type="text/javascript" >
// 教程中的代码就写在这个区域里.
var data1 = [
${data}];

var dsConfig= {
	data : data1 ,

	fields :[
	    {name : 'czfs'       }, 
		{name : 'gsdm'       }, 
		{name : 'gsmc'      },
		{name : 'ywmc'      },
		{name : 'lxdh'      },
		{name : 'cz'      },
		{name : 'fzr'      },
		{name : 'email'      },
        {name : 'hblx'      },
		{name : 'gsfl'      }, 
		{name : 'lgsmc'      },
		{name : 'lywmc'      },
		{name : 'llxdh'      },
		{name : 'ywmc'      },
		{name : 'lgsdz'      },
		{name : 'lfzr'      },
		{name : 'lemail'      }
	             
	]
};

var colsConfig = [
{ id : 'czfs'      , header : "操作" , width : 100 },
		{ id : 'gsdm'      , header : "公司代码" , width : 100 },
		{ id : 'gsmc'      , header : "公司名称" , width : 100},
		{ id : 'ywmc'      , header : "英文名称" , width : 100},
		{ id : 'lxdh'      , header : "联系电话" , width : 100},
		{ id : 'cz'      , header : "传真" , width : 100},
		{ id : 'fzr'      , header : "负责人" , width : 100},
		{ id : 'email'      , header : "E-MAIL" , width : 100},
				{ id : 'hblx'      , header : "货币类型" , width : 100},
		{ id : 'gsfl'      , header : "工时费率" , width : 100},  
		{ id : 'lgsmc'      , header : "本公司名称" , width : 100},
		{ id : 'lywmc'      , header : "本公司英文名称" , width : 100},
		{ id : 'llxdh'      , header : "本公司联系电话" , width : 100},
		{ id : 'lcz'      , header : "本公司传真" , width : 100},
		{ id : 'lgsdz'      , header : "本公司地址" , width : 100},
		{ id : 'lfzr'      , header : "本公司负责人" , width : 100},
		{ id : 'lemail'      , header : "本公司E-MAIL" , width : 100}
           
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

</script>
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
    <td width="1018" height="6"><img src="images/xn_01.gif"></td>
  </tr>
</table>
<table width="1018" height="100%" border="0" cellpadding="0" cellspacing="0"><tr>
<td  width="143"    background="images/menu_bg.png" valign="top" align="right"   class="main_left"><table border="0" cellpadding="0" cellspacing="1"  width="141" height="195" style="border-bottom:1px solid #b3d1fb;border-left:1px solid #b3d1fb;border-right:1px solid #b3d1fb;overflow:hidden"><tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;堆存管理</td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="list.htm?action=jcdj" class="ho">进出场登记</a></td></tr>
<!--  
 <tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;批量处理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="pl.htm" class="ho">批量录入处理</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="pldc.htm" class="ho">批量堆存费处理</a></td></tr>
  <tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;报表处理</td></tr>
  <tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="bbcx.htm" class="ho">报表查询</a></td></tr>
  --> 
<tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统管理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxx.htm" class="ho">箱型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxxl.htm" class="ho">箱型类设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addwzdm.htm" class="ho">位置代码设置</a></td></tr>

<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addshlx.htm" class="ho">损坏类型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addcgs.htm" class="ho">船公司设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addyh.htm" class="ho">用户管理</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addrole.htm" class="ho">角色管理</a></td></tr>


</table></td>
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top"  style="padding-right:5px"><table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;添加公司信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><form:form ><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>箱公司信息</legend>

<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td align="left"   height="25">&nbsp;&nbsp;公司代码:
</td><td><form:input path="gsdm" cssClass="text" onfocus="this.select()" onkeydown="tabs()"   autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td >箱主:</td><td><form:input path="xz" cssClass="text" onkeydown="tabs()" /></td>

<td >公司名称:</td><td><form:input path="gsmc" cssClass="text" onkeydown="tabs()" /></td><td>英文名称:</td><td><form:input path="ywmc" cssClass="text"  onkeydown="tabs()" /></td>

</tr>
<tr>
<td >&nbsp;&nbsp;联系电话:</td><td><form:input path="lxdh" cssClass="text" onkeydown="tabs()" /></td>

<td >传真:</td><td><form:input path="cz" cssClass="text" onkeydown="tabs()" /></td>
<td >负责人:</td><td><form:input path="fzr" cssClass="text" onkeydown="tabs()" /></td>
<td >E-MAIL:</td><td><form:input path="email" cssClass="text" onkeydown="tabs()" /></td>
</tr>
<tr>
<td  height="25">&nbsp;&nbsp;货币类型:</td><td><form:select path="hblx" cssClass="combobox" onkeydown="tabs()"><form:option value="￥" label="￥" /><form:option value="$" label="$" /></form:select></td>

<td >工时费率:</td><td><form:input path="gsfl" cssClass="text" onkeydown="tabs()" /></td>
<td>费率类型:</td><td><form:select path="fllx" cssClass="combobox" onkeydown="tabs()"><form:option value="1" label="1" /><form:option value="2" label="2" /></form:select></td>

</tr>
<tr><td height="10"></td></tr>
</table>
</fieldset>
<fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>本公司信息</legend>
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr>
<td >&nbsp;&nbsp;公司代码:</td><td><form:input path="lgsdm" cssClass="text" onkeydown="tabs()" /></td>

<td >公司名称:</td><td><form:input path="lgsmc" cssClass="text" onkeydown="tabs()" /></td>

<td >英文名称:</td><td><form:input path="lywmc" cssClass="text" onkeydown="tabs()" /></td>
<td >联系电话:</td><td><form:input path="llxdh" cssClass="text" onkeydown="tabs()" /></td>
</tr><tr>
<td >&nbsp;&nbsp;传真:</td><td><form:input path="lcz" cssClass="text" onkeydown="tabs()" /></td>

<td >公司地址:</td><td><form:input path="lgsdz" cssClass="text" onkeydown="tabs()" /></td>
<td >负责人:</td><td><form:input path="lfzr" cssClass="text" onkeydown="tabs()" /></td>
<td >E-MAIL:</td><td><form:input path="lemail" cssClass="text" onkeydown="tabs()" /></td>

</tr>
<tr><td height="10"></td></tr>
</table>
</fieldset>
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="submit" id="submit" class="btn_2k3" value="新增船公司">&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>


 </table></form:form>
<table><tr><td style="height:5px"></td></tr></table><table class="table_1">
<tr><td style="width:100%;overflow:hidden;">
  <div  onclick=" resizeme()" id="divme" style="width:100%;height:250px;overflow:hidden">
<div id="grid1_container" style="width:100%;height:250px;overflow:hidden">
</div> </div>
</td></tr>
</table></td></tr>
</table>
<script type="text/javascript">
document.getElementById("gsdm").focus();
</script>
  </body>
</html>
