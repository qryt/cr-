<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->密码修改</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>


  </head>
  
  <body onload="da();da1();">
<table width="1024" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="1024" height="55" background="images/topbg.gif" align="right" class="login_title"><table><tr><td><table><tr><td style="color:#ffffff">当前用户:&nbsp;&nbsp;<authz:authentication operation="username"/></td></tr><tr><td><label id="aa" style="color:#ffffff"></label></td></tr></table></td><td width=180>&nbsp;</td>
    <td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='main.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
            height=32 src="images/folder_home.gif" width=32 border=0 title="返回主页"></div></td></tr><tr><td style="color:#ffffff">返回主页</td></tr></table></td>
    <td onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#8CBDEF'" onclick="javascript:window.location.href='editPwd.htm'" style="CURSOR: hand" ><table width="60px"><tr><td><div align="center"><IMG 
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
<table width="1024" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
<td  width="143"    background="images/menu_bg.png" valign="top" align="right"   class="main_left"><table border="0" cellpadding="0" cellspacing="1"  width="141" height="50" style="border-bottom:1px solid #b3d1fb;border-left:1px solid #b3d1fb;border-right:1px solid #b3d1fb;overflow:hidden"><tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;堆存管理</td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="jcdj.htm" class="ho">进出场登记</a></td></tr>

 <authz:authorize ifAllGranted="PRIV_HTGL">
<tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统管理</td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxx.htm" class="ho">箱型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addxxl.htm" class="ho">箱型类设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addwzdm.htm" class="ho">位置代码设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addshlx.htm" class="ho">损坏类型设置</a></td></tr>
<tr><td bgcolor="#ffffff" align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif"  style="vertical-align:middle ">&nbsp;&nbsp;<a href="addcgs.htm" class="ho">船公司设置</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addyh.htm" class="ho">用户管理</a></td></tr>
<tr><td bgcolor="#ffffff"  align="left" class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="addrole.htm" class="ho">角色管理</a></td></tr>
</authz:authorize>

</table></td>
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top">
<form:form>
 <table class="table_1"  >
 <tr><td colspan="2" background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;修改密码</td></tr><tr>
 <tr><td height="20">&nbsp;</td></tr>
 <tr><td align="center">
 <table border=1 width="300">
 <TR>
<TD colspan="2" align="center" noWrap  bgcolor="#eee8aa" class=TableData>
个人信息
</TD>
 
      </TR>
  <TR>
        <TD   noWrap  bgcolor="#FFFFFF" class=TableData  ><div align="right"><B>用户名：</B></div></TD>
        <TD   bgcolor="#FFFFFF" class=TableData><strong>${username }<input type="hidden" id="zh" name="zh" value="${username }"/></strong></TD>
      </TR>
	  <TR>
        <TD noWrap  bgcolor="#FFFFFF" class=TableData><div align="right">原密码：</div></TD>
        <TD bgcolor="#FFFFFF" class=TableData><INPUT  type="password"
      name="oldmm" class=BigStatic id="oldmm" size=20 maxLength=20  >        </TD>
      </TR>
	  <TR>
        <TD noWrap  bgcolor="#FFFFFF" class=TableData><div align="right">新密码：</div></TD>
        <TD bgcolor="#FFFFFF" class=TableData><INPUT class=BigStatic type="password"   maxLength=20 size=20 
      name="mm" id="mm">
 </TD>
      </TR>
<TR>
        <TD noWrap   bgcolor="#FFFFFF" class=TableData><div align="right">确认新密码：</div></TD>
        <TD bgcolor="#FFFFFF" class=TableData><INPUT class=BigStatic type="password"  maxLength=20 size=20 
      name="mm1" id="mm1">
</TD>
      </TR>

 <TR>
        <TD colspan="2" align="center" noWrap  bgcolor="#FFFFFF" class=TableData>  <div align="center">
  <INPUT name="submit" type=submit class=BigButton value=保存修改>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <INPUT name="button" type=button class=BigButton onClick="location='/cr/main.htm'" value=关闭>
    </div> 
         </TD>
 
      </TR>
<TR>
        <TD colspan="2" align="center" noWrap  bgcolor="#FFFFFF" class=TableData><font color="red"><form:errors path="*"/></font></TD>
 
      </TR>
</TABLE>
</td></tr></table>
 
	<br>
	<br>

  

</form:form>
</td></tr></table>
 
  </body>
</html>
