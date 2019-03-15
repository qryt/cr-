<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <title></title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
  <link rel="stylesheet" type="text/css" href="css/styles.css" />
  <script type='text/javascript' src='/cr/dwr/engine.js'></script>
   <script type='text/javascript' src='/cr/dwr/util.js'></script>
  <script type='text/javascript' src='/cr/dwr/interface/myService.js'></script>
   <script type="text/javascript" src="js/ValidCheck.js"></script>
  <script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
<script type="text/javascript" src="js/data.js"></script>
 
</head>
 
<body onload="init();da();da1()">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="100%" height="55" background="images/topbg.gif" align="right" class="login_title"><table><tr><td><table><tr><td style="color:#ffffff">当前用户:&nbsp;&nbsp;yu</td></tr><tr><td><label id="aa" style="color:#ffffff"></label></td></tr></table></td><td width=180>&nbsp;</td>
    <td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='main.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/folder_home.gif" width=32 border=0 title="返回主页"></div></td></tr><tr><td style="color:#ffffff">返回主页</td></tr></table></td>
    <td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='editPwd.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/user.gif" width=32 border=0 title="修改密码"></div></td></tr><tr><td style="color:#ffffff">修改密码</td></tr></table></td><td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='j_acegi_logout'" style="CURSOR: hand"><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/exit.gif" width=32 border=0 title="退出系统"></div></td></tr><tr><td style="color:#ffffff">退出系统</td></tr></table></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr></table></td>
  </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="100%" height="5"><img src="images/xn_01.gif" style="height:5px;width:100%"></td>
  </tr>
</table>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0"><tr>
<td  width="143"    background="images/menu_bg.png" valign="top" align="right"   class="main_left"><table border="0" cellpadding="0" cellspacing="1"  width="141" height="195" style="border-bottom:1px solid #b3d1fb;border-left:1px solid #b3d1fb;border-right:1px solid #b3d1fb;overflow:hidden"><tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;堆存管理</td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="jcdj.htm" class="ho">进出场登记</a></td></tr>
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
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top"  style="padding-right:5px">
<div id="statusDiv"  name="statusDiv" style="position:absolute;border:1px solid #6595d6;color:red;width:250px;height:40px;left:450px;display:none;background-color:#c6d3f7;top:200px;padding-top: 24px;padding-bottom: 24px;" align="center"  ></div>
<table width="100%"   border="0" align="center" cellpadding="0" cellspacing="1" class="title"><tr height="28" ><td colspan="2">数据字典管理</td></tr><tr class="tbody1">
<td valign="top">
<table align="center" width="700" style="padding-left:3px" valign="middle" cellSpacing="1" cellPadding="0" border="0" bgcolor="#A9C5E9">
<tr bgcolor="#ffffff"><td colspan="6" height="28" background="images/bt09.gif" >数据字典</td></tr>

<tr bgcolor="#ffffff"><td id="data_div" ></td><td></td><td id="detail_div"></td></tr>
<tr bgcolor="#ffffff">
<td>编号:<input type="hidden" id="data_id" name="data_id"><input type="text" id="se_id" style="width:20px" disabled name="se_id">&nbsp;&nbsp;名称：<input type="text" id="data_name" name="data_name">&nbsp;&nbsp;<a onClick="adddata()" style="cursor:hand;color=#0000ff">添加</a> <a onClick="editdata()" style="cursor:hand;color=#0000ff">修改</a> <a onClick="deldata()" style="cursor:hand;color=#0000ff">删除</a> </td>
<td ></td>
<td>编号:<input type="hidden" id="detail_id" name="detail_id"><input type="text" id="se_id1" style="width:20px" disabled name="se_id1">&nbsp;&nbsp;名称：<input type="text" id="detail_name"   name="detail_name">&nbsp;&nbsp;<a onClick="adddetail()" style="cursor:hand;color=#0000ff">添加</a> <a onClick="editdetail()" style="cursor:hand;color=#0000ff">修改</a> <a onClick="deldetail()" style="cursor:hand;color=#0000ff">删除</a> </td>
</tr>
</table> 

</td>
</tr>
</table>
</td></tr>
</table>

 
  
  </body>
</html>
