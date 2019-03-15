<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->进出场登记</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
 <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />
     
    <!-- GC -->
 	<!-- LIBS -->
 	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
 	<!-- ENDLIBS -->
	    <script type="text/javascript" src="ext/ext-all.js"></script>	
	    <script type="text/javascript" src="ext/examples/ux/BufferView.js"></script>
	   	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"  ></script>
<link rel="stylesheet" type="text/css" href="css/style.css">
	 

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
 <script type="text/javascript"  >
function add(){
window.location.href="addjcdj.htm";
}
function addjc(){
fullopen("addjc.htm?op=n");
}
function editjc(){
	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;  
	 if(selectedRows.length==0)
		 alert("请您选择要编辑的项！");
	 else if(selectedRows.length==1){
		 var row = selectedRows[0]; 
		 
		 if(row.data['fl_type']=="1")
			winopen("editjcdj.htm?bh="+row.data['rcbh']+"&operation=s&op=n");
		 else
			 winopen("editjcdj2.htm?bh="+row.data['rcbh']+"&operation=s&op=n"); 
		 }
	 else{
		 alert("您的编辑项不能超过一项！");
	 }

}
function showpl(){
	
	   var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
	if(selectedRows.length==0){
		if(confirm("由于没有选择任何一项，故将对所有查询项目进行处理，确实要批量处理吗？"))
		{document.getElementById("var").value="";
		
			document.getElementById("fid").src="plsel.htm";
			  document.getElementById("showdiv").style.width="370px";
			 MM_showHideLayers('showdiv','','show');
			}
	  }
	  else{

	   for (var i = 0; i < selectedRows.length; i++) {  
	   var row = selectedRows[i]; 
	 if(i==0)
	  document.getElementById("var").value=row.data['rcbh'];
	 else
	   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
	   }
	 document.getElementById("fid").src="plsel.htm";
	  document.getElementById("showdiv").style.width="370px";
	 MM_showHideLayers('showdiv','','show');
	 }
	 }
function printqt(){
	 var selectedRows =Ext.getCmp("MenuGridPanel").selModel.selections.items;   
	if(selectedRows.length==0)
	  alert("不能批量打印，请至少选择一项！");
	  else{


	   for (var i = 0; i < selectedRows.length; i++) {  
	   var row = selectedRows[i]; 
	 if(i==0)
	  document.getElementById("var").value=row.data['rcbh'];
	 else
	   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
	   }

	  document.getElementById("form1").action="servlet/printqtbb";
	document.getElementById("form1").submit();
	 }
	}
function print(){
	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
		var str="";
		document.getElementById("start_date").value=Ext.get("date_start").dom.value;
		document.getElementById("end_date").value=Ext.get("date_end").dom.value;
			if(selectedRows.length==0){
			if(confirm("由于没有选择任何一项，故将导出所有查询项目，确实到导出吗？"))
			{
				if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
				{
				if(document.getElementById("C").checked)
				str=str+"C,";
				if(document.getElementById("U").checked)
				str=str+"U,";
				if(document.getElementById("O").checked)
				str=str+"O,";
				if(document.getElementById("W").checked)
					str=str+"W,";

				document.getElementById("ck").value=str;
				
				document.getElementById("var").value="";
			    
			}else{
			document.getElementById("ck").value="";
			} 
			 document.getElementById("form1").action="servlet/printbb";
			 	document.getElementById("form1").submit(); }
			}
	  else{

	if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
	{
	if(document.getElementById("C").checked)
	str=str+"C,";
	if(document.getElementById("U").checked)
	str=str+"U,";
	if(document.getElementById("O").checked)
	str=str+"O,";
	if(document.getElementById("W").checked)
		str=str+"W,";
	

	document.getElementById("ck").value=str;
	   for (var i = 0; i < selectedRows.length; i++) {  
	   var row = selectedRows[i]; 
	 if(i==0)
	  document.getElementById("var").value=row.data['rcbh'];
	 else
	   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
	   }
	     document.getElementById("form1").action="servlet/printbb";
	document.getElementById("form1").submit();
	 }
	else
	alert("至少要选择一项付费方！");
	 }

	 }
	 function printtd(){
	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
		var str="";
		document.getElementById("start_date").value=Ext.get("date_start").dom.value;
		document.getElementById("end_date").value=Ext.get("date_end").dom.value;
			if(selectedRows.length==0){
			if(confirm("由于没有选择任何一项，故将导出所有查询项目，确实到导出吗？"))
			{
				if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
				{
				if(document.getElementById("C").checked)
				str=str+"C,";
				if(document.getElementById("U").checked)
				str=str+"U,";
				if(document.getElementById("O").checked)
				str=str+"O,";
				if(document.getElementById("W").checked)
					str=str+"W,";

				document.getElementById("ck").value=str;
				
				document.getElementById("var").value="";
			     document.getElementById("form1").action="servlet/Printtdbb";
			 	document.getElementById("form1").submit();
			}  }
			}
	  else{

	if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
	{
	if(document.getElementById("C").checked)
	str=str+"C,";
	if(document.getElementById("U").checked)
	str=str+"U,";
	if(document.getElementById("O").checked)
	str=str+"O,";
	if(document.getElementById("W").checked)
		str=str+"W,";
	

	document.getElementById("ck").value=str;
	   for (var i = 0; i < selectedRows.length; i++) {  
	   var row = selectedRows[i]; 
	 if(i==0)
	  document.getElementById("var").value=row.data['rcbh'];
	 else
	   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
	   }
	     document.getElementById("form1").action="servlet/Printtdbb";
	document.getElementById("form1").submit();
	 }
	else
	alert("至少要选择一项付费方！");
	 }

	 }
function printplgjd(){
	var str="";
	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   

	if(selectedRows.length==0){
if(confirm("由于没有选择任何一项，故将导出所有查询项目，确实到导出吗？"))
{if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
	{
	if(document.getElementById("C").checked)
	str=str+"C,";
	if(document.getElementById("U").checked)
	str=str+"U,";
	if(document.getElementById("O").checked)
	str=str+"O,";
	if(document.getElementById("W").checked)
		str=str+"W,";

	document.getElementById("ck").value=str;
	document.getElementById("var").value="";
document.getElementById("form1").action="servlet/showpl";
document.getElementById("form1").submit();
}  }}
	  else{
	
	if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
	{
	if(document.getElementById("C").checked)
	str=str+"C,";
	if(document.getElementById("U").checked)
	str=str+"U,";
	if(document.getElementById("O").checked)
	str=str+"O,";
	if(document.getElementById("W").checked)
		str=str+"W,";

	document.getElementById("ck").value=str;
	   for (var i = 0; i < selectedRows.length; i++) {  
	   var row = selectedRows[i]; 
	 if(i==0)
	  document.getElementById("var").value=row.data['rcbh'];
	 else
	   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
	   }
	 }
	document.getElementById("form1").action="servlet/showpl";
	document.getElementById("form1").submit();
	 }

	 }
function printmsk(){
		 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
		 if(selectedRows.length==0){
				if(confirm("由于没有选择任何一项，故将导出所有查询项目，确实到导出吗？"))
				{if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
				{
					if(document.getElementById("C").checked)
					str=str+"C,";
					if(document.getElementById("U").checked)
					str=str+"U,";
					if(document.getElementById("O").checked)
					str=str+"O,";
					if(document.getElementById("W").checked)
						str=str+"W,";
					 var row = selectedRows[0]; 
					   if(row.data['cgs']!="MSK"){
						   alert("选项中含有不是马士基的集装箱，不能EDI导出！")
						   	return false;
						   	}
					document.getElementById("ck").value=str;
					document.getElementById("var").value="";
					 document.getElementById("form1").action="servlet/exMskEDI";
					 document.getElementById("form1").submit();
					 	
				}
					}
		   }
		   else{
			   var str="";
				if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
				{
				if(document.getElementById("C").checked)
				str=str+"C,";
				if(document.getElementById("U").checked)
				str=str+"U,";
				if(document.getElementById("O").checked)
				str=str+"O,";
				if(document.getElementById("W").checked)
					str=str+"W,";
				

				document.getElementById("ck").value=str;
				   for (var i = 0; i < selectedRows.length; i++) {  
				   var row = selectedRows[i]; 
				   if(row.data['cgs']!="MSK"){
					   alert("选项中含有不是马士基的集装箱，不能EDI导出！")
					   	return false;
					   	}
				 if(i==0)
				  document.getElementById("var").value=row.data['rcbh'];
				 else
				   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
				   }

		   document.getElementById("form1").action="servlet/exMskEDI";
		 document.getElementById("form1").submit();
				 }
				else
				alert("至少要选择一项付费方！");
				 }
		 }

function printsitc(){
	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
	 if(selectedRows.length==0){
			if(confirm("由于没有选择任何一项，故将导出所有查询项目，确实到导出吗？"))
			{if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
			{
				if(document.getElementById("C").checked)
				str=str+"C,";
				if(document.getElementById("U").checked)
				str=str+"U,";
				if(document.getElementById("O").checked)
				str=str+"O,";
				if(document.getElementById("W").checked)
					str=str+"W,";
				 var row = selectedRows[0]; 
				   if(row.data['cgs']!="SITC"){
					   alert("选项中含有不是SITC的集装箱，不能EDI导出！")
					   	return false;
					   	}
				document.getElementById("ck").value=str;
				document.getElementById("var").value="";
				 document.getElementById("form1").action="servlet/exSitcEDI";
				 document.getElementById("form1").submit();
				 	
			}
				}
	   }
	   else{
		   var str="";
			if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
			{
			if(document.getElementById("C").checked)
			str=str+"C,";
			if(document.getElementById("U").checked)
			str=str+"U,";
			if(document.getElementById("O").checked)
			str=str+"O,";
			if(document.getElementById("W").checked)
				str=str+"W,";
			

			document.getElementById("ck").value=str;
			   for (var i = 0; i < selectedRows.length; i++) {  
			   var row = selectedRows[i]; 
			   if(row.data['cgs']!="SITC"){
				   alert("选项中含有不是SITC的集装箱，不能EDI导出！")
				   	return false;
				   	}
			 if(i==0)
			  document.getElementById("var").value=row.data['rcbh'];
			 else
			   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
			   }

	   document.getElementById("form1").action="servlet/exSitcEDI";
	 document.getElementById("form1").submit();
			 }
			else
			alert("至少要选择一项付费方！");
			 }
	 }
	 
	 
	 
	 function printoocl(){
	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
	 if(selectedRows.length==0){
			if(confirm("由于没有选择任何一项，故将导出所有查询项目，确实到导出吗？"))
			{if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
			{
				if(document.getElementById("C").checked)
				str=str+"C,";
				if(document.getElementById("U").checked)
				str=str+"U,";
				if(document.getElementById("O").checked)
				str=str+"O,";
				if(document.getElementById("W").checked)
					str=str+"W,";
				 var row = selectedRows[0]; 
				   if(row.data['cgs']!="OOCL"){
					   alert("选项中含有不是OOCL的集装箱，不能EDI导出！")
					   	return false;
					   	}
				document.getElementById("ck").value=str;
				document.getElementById("var").value="";
				 document.getElementById("form1").action="servlet/exOoclEDI";
				 document.getElementById("form1").submit();
				 	
			}
				}
	   }
	   else{
		   var str="";
			if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
			{
			if(document.getElementById("C").checked)
			str=str+"C,";
			if(document.getElementById("U").checked)
			str=str+"U,";
			if(document.getElementById("O").checked)
			str=str+"O,";
			if(document.getElementById("W").checked)
				str=str+"W,";
			

			document.getElementById("ck").value=str;
			   for (var i = 0; i < selectedRows.length; i++) {  
			   var row = selectedRows[i]; 
			   if(row.data['cgs']!="OOCL"){
				   alert("选项中含有不是OOCL的集装箱，不能EDI导出！")
				   	return false;
				   	}
			 if(i==0)
			  document.getElementById("var").value=row.data['rcbh'];
			 else
			   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
			   }

	   document.getElementById("form1").action="servlet/exOoclEDI";
	 document.getElementById("form1").submit();
			 }
			else
			alert("至少要选择一项付费方！");
			 }
	 }
	 
	 
	 function printiri(){

	 var selectedRows = Ext.getCmp("MenuGridPanel").selModel.selections.items;   
					if(selectedRows.length==0)
		 alert("请您选择要编辑的项！");
		 else{
		 
		        var str="";
				if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked||document.getElementById("W").checked)
				{
				if(document.getElementById("C").checked)
				str=str+"C,";
				if(document.getElementById("U").checked)
				str=str+"U,";
				if(document.getElementById("O").checked)
				str=str+"O,";
				if(document.getElementById("W").checked)
					str=str+"W,";
				document.getElementById("ck").value=str;
				  
			   for (var i = 0; i < selectedRows.length; i++) {  
			   row = selectedRows[i]; 
			  if(i==0)
			  document.getElementById("var").value=row.data['rcbh'];
			  else
			  document.getElementById("var").value=document.getElementById("var").value+","+row.data['rcbh'];
			   }

 window.location.href="list.htm?action=printgiri&date_start="+Ext.get("date_start").dom.value+"&date_end="+Ext.get("date_end").dom.value+"&var="+encodeURI(document.getElementById("var").value)+"&ck="+encodeURI(document.getElementById("ck").value);

	 
	 }
	 
	} 

	 
function zdcx(){
	 
	var win=window.showModalDialog("jczhcx.htm","自定义查询","dialogwidth:500px;dialogheight:350px;center:yes;status:no;scroll:no;help:no");
 
	if(typeof(win)!="undefined")
	{ document.getElementById("condition").value=encodeURI(win);
	 Ext.getCmp("MenuGridPanel").store.reload();
 }else
	 document.getElementById("condition").value="";
	//Ext.getCmp("MenuGridPanel").store.reload();
	}
function xhcx(){
	if(window.event.keyCode==13){
	document.getElementById("condition").value="xh like '%"+encodeURI(document.getElementById("xh").value)+"%'";
	 Ext.getCmp("MenuGridPanel").store.reload();
	}
}
function xhcx1(){
 
	document.getElementById("condition").value="xh like '%"+encodeURI(document.getElementById("xh").value)+"%'";
	 Ext.getCmp("MenuGridPanel").store.reload();
 
}}
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
<div align="right"><IMG src="images\close.gif" alt="点击关闭层" width="13" height="13" style="cursor:hand" onclick="MM_showHideLayers('showdiv','','hide');Ext.getCmp('MenuGridPanel').store.reload()">
            </div>
		</td>
      </tr>
      <tr>
        <td bgcolor="#FFFFFF"><iframe  width="100%" height="315" scrolling="no" frameborder="1" id="fid" name="fid" src="about:blank"></iframe></td>
      </tr>
    </table>
  </div>
</div>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="100%" height="55" background="images/topbg.gif" align="right" class="login_title"><table><tr><td><table><tr><td style="color:#ffffff">当前用户:&nbsp;&nbsp;<authz:authentication operation="username"/></td></tr><tr><td><label id="aa" style="color:#ffffff"></label></td></tr></table></td><td width=280>&nbsp;</td>
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
    <td width="100%" height="6"><img src="images/xn_01.gif"></td>
  </tr>
</table>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
<td  width="143"    background="images/menu_bg.png" valign="top" align="right"   class="main_left"><table border="0" cellpadding="0" cellspacing="1"  width="141" height="50" style="border-bottom:1px solid #b3d1fb;border-left:1px solid #b3d1fb;border-right:1px solid #b3d1fb;overflow:hidden"><tr><td class="main_menu_top" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;堆存管理</td></tr>
<tr bgcolor="#ffffff"><td align="left"  class="main_menu_td">&nbsp;&nbsp;<img src="images/anti_spam.gif" style="vertical-align:middle ">&nbsp;&nbsp;<a href="list.htm?action=jcdj" class="ho">进出场登记</a></td></tr>

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
<td width="10" align="center" class="main_menu_left">&nbsp;</td> 
<td style="padding-right:5px;" valign="top">
<table class="table_1" id="table_1" style="width:100%;">
 <tr><td   > <form id="form1" method="post" action="list.htm?action=chkpl">
<input type="hidden" id="plqrrq" name="plqrrq">
<input type="hidden" id="start_date" name="start_date">
<input type="hidden" id="end_date" name="end_date">
<input type="hidden" id="pltdh" name="pltdh">
<input type="hidden" id="plbz" name="plbz">
<input type="hidden" id="plwgrq" name="plwgrq">
<input type="hidden" id="pljzrq" name="pljzrq"><input type="hidden" id="condition" name="condition"><input type="hidden" id="var" name="var">
<input type="hidden" id="ck" name="ck" value="C,U,O,W,">
</form></td>
</tr>

<tr><td style="width:100%" >
<div id="jc"></div> 

</td></tr>
</table></td></tr>

</table>
<script type="text/javascript">
Ext.onReady(function(){
	var newHeight = document.body.scrollHeight  ; 
	 var sm = new Ext.grid.CheckboxSelectionModel();
	var store = new Ext.data.Store({
        
       baseParams: {lightWeight:true,ext: 'js'},
 
       autoLoad: {params:{start:0, limit:100}},
       
       proxy: new Ext.data.ScriptTagProxy({
           url: 'servlet/showJc'
       }),

       reader: new Ext.data.JsonReader({
           root: 'root',
           totalProperty: 'totalProperty',
           idProperty: 'threadid',
           fields: [
                    {name: 'fl_type',mapping:'fl_type'}, 
                    {name: 'rcbh',mapping:'rcbh'}, 
                    {name:'cgs',mapping:'cgs'}, 
                    {name:'box_owner',mapping:'box_owner'}, 
                    {name: 'xh',mapping:'xh'}, 
            					 {name: 'cc',mapping:'cc'}, 
            					 {name: 'xx',mapping:'xx'}, 
            					 {name: 'tpxz',mapping:'tpxz'}, 
            					 {name: 'jczt',mapping:'jczt'}, 
            					 {name: 'tdh',mapping:'tdh'}, 
            					 {name: 'zzrq',mapping:'zzrq'}, 
            					 {name: 'jctc',mapping:'jctc'}, 
            					 {name: 'lxd',mapping:'lxd'}, 
            					 {name: 'jcwz',mapping:'jcwz'}, 
            					 {name: 'wzmx',mapping:'wzmx'}, 
            					 {name: 'eirlsh',mapping:'eirlsh'}, 
            					 {name: 'zgd',mapping:'zgd'}, 
            					 {name: 'sfbf',mapping:'sfbf'}, 
            					 {name: 'zygr',mapping:'zygr'}, 
            					 {name: 'zdbh',mapping:'zdbh'}, 
            					 {name: 'jcrq',mapping:'jcrq'}, 
            					  {name: 'fsrq',mapping:'fsrq'}, 
            					 {name: 'qrrq',mapping:'qrrq'}, 
            					 {name: 'wgrq',mapping:'wgrq'}, 
            					 {name: 'ccrq',mapping:'ccrq'}, 
            					 {name: 'jzrq',mapping:'jzrq'}, 
            					 {name: 'qdf',mapping:'qdf'}, 
            					 {name: 'tyf',mapping:'tyf'}, 
            					 {name: 'dcf',mapping:'dcf'}, 
            					 {name: 'ts',mapping:'ts'}, 
            					 {name: 'gs',mapping:'gs'}, 
            					 {name: 'gsf',mapping:'gsf'}, 
            					 {name: 'clf',mapping:'clf'}, 
            					 {name: 'hj',mapping:'hj'}, 
            					 {name: 'hb_type',mapping:'hb_type'},
            					 {name: 'llr',mapping:'llr'}, 
            					 {name: 'llrq',mapping:'llrq'}, 
            				
            					 {name: 'xxl',mapping:'xxl'}, 
            					 {name: 'bz',mapping:'bz'}, 
            					 {name: 're',mapping:'re'}
               
           ]
       }),
       remoteSort:true,
                 sortInfo:{field:'jcrq', direction:'DESC'}
   });
	var dsPQ=new Ext.data.JsonStore({ 
		   data:[], 
		   fields:["idx","relation","leftParenthesis","fieldname","operator","value","rightParenthesis"]  
		}); 
		var fieldsDef = new Ext.data.JsonStore({ 
		    fields: ['value','text','type','data'], 
		    data:[ 
		        {value:'rcbh',text:'进场编号',type:'string'}, 
        {value:'cgs',text:'船公司',type:'string'}, 
        {value:'box_owner',text:'箱主',type:'string'}, 
        {value:'xh',text:'箱号',type:'string'}, 
        {value:'cc',text:'尺寸',type:'lookup',data:[['20’','20’'],['40’','40’'],['45’','45’']]},
        {value:'xx',text:'箱型',type:'string'}, 
        {value:'xxl',text:'箱型类',type:'string'},
        {value:'jczt',text:'状态',type:'lookup',data:[['DMC','DMC'],['DMS','DMS'],['DMG','DMG'],['NM','NM']]},
        {value:'tdh',text:'提单号',type:'string'},
        {value:'jcrq',text:'进场日期',type:'date'},
        {value:'fsrq',text:'发送日期',type:'date'},
        {value:'qrrq',text:'确认日期',type:'date'},
        {value:'wgrq',text:'完工日期',type:'date'},
        {value:'ccrq',text:'出场日期',type:'date'},
        {value:'jzrq',text:'结账日期',type:'date'},
        {value:'qdf',text:'起吊费',type:'float'},
        {value:'tyf',text:'拖运费',type:'float'},
        {value:'dcf',text:'堆存费',type:'float'},
        {value:'ts',text:'堆存天数',type:'int'},
        {value:'gs',text:'工时',type:'float'},
        {value:'gsf',text:'工时费',type:'float'},
        {value:'clf',text:'材料费',type:'float'},
        {value:'hj',text:'合计',type:'float'},
        {value:'cur_type',text:'货币类型 ',type:'lookup',data:[['$','$'],['￥','￥']]},
        
        {value:'zzrq',text:'制造日期',type:'string'},
        {value:'jctc',text:'进场拖车',type:'string'},
       
        {value:'lxd',text:'来箱地',type:'string'},
        {value:'jcwz',text:'进场位置',type:'string'},
        {value:'wzmx',text:'位置描叙',type:'string'},
        {value:'eirlsh',text:'EIR流水号',type:'string'},
        {value:'zgd',text:'转关地',type:'string'},
        {value:'sfbf',text:'是否报废',type:'lookup',data:[['在用','在用'],['报废','报废']]},
        {value:'zygr',text:'作业工人',type:'lookup',data:[['一组','一组'],['二组','二组'],['三组','三组'],['四组','四组'],['五组','五组'],['六组','六组'],['七组','七组'],['八组','八组']]},
        {value:'zdbh',text:'帐单编号',type:'string'},
               {value:'llr',text:'录入人',type:'string'},
        {value:'llrq',text:'录入日期',type:'date'}
		] 
		}); 


		var numericOp = datetimeOp = new Ext.data.SimpleStore({ 
		    fields: ['value','text'], 
		    data : [['=','='],['<>','<>'],['<','<'],['<=','<='],['>','>'],['>=','>='],['is null','空白'],['is not null','非空白']] 
		}); 
		var stringOp = new Ext.data.SimpleStore({ 
		    fields: ['value','text'], 
		    data : [['=','='],['<>','<>'],['<','<'],['>','>'], 
		    ["like '|%'",'以...开头'],["like '%|'",'以...结尾'],["like '%|%'",'包含字符'],["not like '%|%'",'不包含字符'], 
		    ['is null','空白'],['is not null','非空白']] 
		}); 
		var lookupOp = booleanOp = new Ext.data.SimpleStore({ 
		    fields: ['value','text'], 
		    data : [['=','='],['<>','<>'],['is null','空白'],['is not null','非空白']] 
		}); 

		var objGridTextEditor = new Ext.grid.GridEditor(new Ext.form.TextField()); 
		//var objGridMemoEditor = new Ext.grid.GridEditor(new Ext.form.TextArea()); 
		var objGridDateEditor = new Ext.grid.GridEditor(new Ext.form.DateField({format:'Y-m-d'})); 
		var objGridIntegerEditor = new Ext.grid.GridEditor(new Ext.form.NumberField({allowBlank:false,allowNegative:false,allowDecimals:false})); 
		var objGridFloatEditor = new Ext.grid.GridEditor(new Ext.form.NumberField({allowBlank:false,allowNegative:false})); 
		var objGridBooleanEditor = new Ext.grid.GridEditor(new Ext.form.ComboBox({ 
		    store: [[true,'是'],[false,'否']], 
		    mode: 'local', 
		    
		    triggerAction: 'all', 
		    allowBlank: false, 
		    editable: false, 
		    forceSelection: true, 
		    blankText:'请选择...' 
		})); 
		var objGridLookupEditor; 

		function fileListChange(field,newValue,oldValue){ 
		    //alert(field); 
		} 
		function findRecordValue(store,prop, propValue,field){ 
		var record; 
		if(store.getCount() > 0){ 
		store.each(function(r){ 
		if(r.data[prop] == propValue){ 
		record = r; 
		return false; 
		} 
		}); 
		} 

		return record ? record.data[field] : ''; 
		} 
		function displayOperator(v){ 
		    switch(v){ 
		        case 'is null': return '空白'; 
		        case 'is not null': return '非空白'; 
		        case "like '|%'": return '以...开头'; 
		        case "like '%|'": return '以...结尾'; 
		        case "like '%|%'": return '包含字符'; 
		        case "not like '%|%'": return '不包含字符'; 
		        default: return v; 
		    } 
		} 
		function displayValue(v, params, record){ 
		    var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
		    var operator = record.get('operator'); 
		    if (operator=='is null'||operator=='is not null') return ''; 
		    switch(dataType){ 
		        case 'date': return v ? v.dateFormat('Y-m-d'): ''; 
		        case 'boolean': return (v?'是':'否'); 
		        case 'lookup': var data = findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'); 
		            for (var i=0; i<data.length; i++) 
		                if (v==data[i][0]) return data[i][1]; 
		            //return data[v] + ','+data[v,0]+','+data[0,0]; 
		            //return data[v,0]+','+data[0,0]; 
		        /*case 'string': 
		        case 'int': 
		        case 'float':*/ 
		        default: return v; 
		    } 
		} 

		var qRowData = Ext.data.Record.create([ 
		    {name:'idx',type:'int'}, 
		    {name:'relation',type:'string'}, 
		    {name:'leftParenthesis',type:'string'}, 
		    {name:'fieldname',type:'string'}, 
		    {name:'operator',type:'string'}, 
		    {name:'value',type:'string'}, 
		    {name:'rightParenthesis',type:'string'} 
		]); 

		var colM=new Ext.grid.ColumnModel([ 
		    { 
		        header:"关系", 
		        dataIndex:"relation", 
		        width:50, 
		        renderer: function(v){return (v=='and'?'并且':'或者')}, 
		        editor:new Ext.form.ComboBox({  
		            store: [['and','并且'],['or','或者']], 
		              triggerAction: 'all',  
	            valueField: 'value', 
	            displayField: 'text', 
	            editable: false 
		        }) 
		    },{ 
		        header:"括号", 
		        dataIndex:"leftParenthesis", 
		        width:40, 
		        editor:new Ext.form.ComboBox({ 
		            store: ['(','((','((','(((','(((('], 
		            mode: 'local', 
		            triggerAction: 'all', 
		            valueField: 'value', 
		            displayField: 'text', 
		            editable: false 
		        }) 
		    },{ 
		        header:"字段名", 
		        dataIndex:"fieldname", 
		        width:130, 
		        //renderer: function(v, params, record){return record.data['fieldname']}, 
		        renderer: function(v){return findRecordValue(fieldsDef,'value',v,'text');}, 
		        editor:new Ext.form.ComboBox({ 
		            store: fieldsDef, 
		            mode: 'local', 
		            triggerAction: 'all', 
		            valueField: 'value', 
		            displayField: 'text', 
		            editable: false, 
		            listeners:{change:fileListChange} 
		        }) 
		    },{ 
		        header:"运算符", 
		        width:80, 
		        dataIndex:"operator", 
		        renderer: displayOperator 
		    },{ 
		        header:"内容", 
		        dataIndex:"value", 
		        width:130, 
		        renderer: displayValue 
		    },{ 
		        header:"括号", 
		        width:40, 
		        dataIndex:"rightParenthesis", 
		        editor:new Ext.form.ComboBox({ 
		            store: [')','))',')))','))))'], 
		            mode: 'local', 
		            triggerAction: 'all', 
		            valueField: 'value', 
		            displayField: 'text', 
		            editable: false 
		        }) 
		    } 
		]); 

		var grdDPQuery = new Ext.grid.EditorGridPanel({ 
		    height:500, 
		    width:490, 
		    
		    cm:colM, 
		    sm:new Ext.grid.RowSelectionModel({singleSelect:false}), 
		    store:dsPQ, 
		    region:'center', 
		    border: false, 
		    enableColumnMove: false, 
		    enableHdMenu: false, 
		    loadMask: {msg:'加载数据...'}, 
		    clicksToEdit:1, 
		    tbar:[ 
		        {text:'添加',handler:function(){ 
		                var count = dsPQ.getCount(); 
		                var r = new qRowData({idx:dsPQ.getCount(),relation:'and',leftParenthesis:'',fieldname:'',operator:'=',value:'',rightParenthesis:''}); 
		                dsPQ.commitChanges(); 
		                dsPQ.insert(count,r); 
		            } 
		        }, 
		        {text:'删除',handler:function(){ 
		                //store = grid.getStore(); 
		                var selections = grdDPQuery.getSelectionModel().getSelections(); 
		                for(var i = 0; i < selections.length; i++){  
		                    dsPQ.remove(selections[i]);  
		                } 
		            } 
		        }, 
		        {text:'全部清除',handler:function(){dsPQ.removeAll();}}
		      	    ], 
		    listeners: { 
		        afteredit: function(e){ 
		            if (e.column==2/*e.field=='fieldname'*/){ 
		                var oldDataType = findRecordValue(fieldsDef,'value',e.originalValue,'type'); 
		                var newDataType = findRecordValue(fieldsDef,'value',e.value,'type'); 
		                if (oldDataType!=newDataType){ 
		                    e.record.set('operator', '='); 
		                    e.record.set('value', ''); 
		                } 
		                //e.grid.colModel.setEditor(1, new Ext.grid.GridEditor(new Ext.form.DateField({format:'Y年m月d日'}))); 
		            } 
		        }, 
		        cellclick: function(grid, rowIndex, columnIndex, e){ 
		            if (columnIndex!=3&&columnIndex!=4) return; 
		            var record = grid.getStore().getAt(rowIndex);  // Get the Record 
		            var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
		            if (dataType=='') return;//未选定字段，退出 
		            if (columnIndex==3){//绑定运算符 
		                var grdEditor = grid.colModel.getCellEditor(columnIndex,rowIndex); 
		                if (grdEditor) grdEditor.destroy(); 
		                var _store; 
		                switch(dataType){ 
		                    case 'string': _store = stringOp; break; 
		                    case 'date': _store = datetimeOp; break; 
		                    case 'boolean': _store = booleanOp; break; 
		                    case 'int': 
		                    case 'float': _store = numericOp; break; 
		                    case 'lookup': _store = lookupOp; break; 
		                } 
		                grdEditor = new Ext.form.ComboBox({ 
		                    store: _store, 
		                    mode: 'local', 
		                    triggerAction: 'all', 
		                    valueField: 'value', 
		                    displayField: 'text', 
		                    editable: false 
		                }) 
		                grid.colModel.setEditor(columnIndex, new Ext.grid.GridEditor(grdEditor)); 
		            } 
		            else if (columnIndex==4){//绑定编辑器 
		                var operator = record.get('operator'); 
		                if (operator=='is null'||operator=='is not null'){ 
		                    grid.colModel.setEditor(columnIndex, null); 
		                    return; 
		                } 
		                var grdEditor; 
		                switch(dataType){ 
		                    case 'string': grdEditor = objGridTextEditor; break; 
		                    case 'date': grdEditor = objGridDateEditor; break; 
		                    case 'boolean': grdEditor = objGridBooleanEditor; break; 
		                    case 'int': grdEditor = objGridIntegerEditor; break; 
		                    case 'float': grdEditor = objGridFloatEditor; break; 
		                    case 'lookup':  
		                        if (objGridLookupEditor) objGridLookupEditor.destroy(); 
		                        objGridLookupEditor = new Ext.grid.GridEditor(new Ext.form.ComboBox({ 
		                            store: findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'), 
		                            mode: 'local', 
		                            readOnly: true, 
		                            triggerAction: 'all', 
		                            allowBlank: false, 
		                            editable: false, 
		                            forceSelection: true, 
		                            blankText:'请选择...' 
		                        })); 
		                        grdEditor = objGridLookupEditor; 
		                        break; 
		                } 
		                if (grid.colModel.getCellEditor(columnIndex,rowIndex)!=grdEditor){ 
		                    grid.colModel.setEditor(columnIndex, grdEditor); 
		                } 
		            } 
		        } 
		    } 
		}); 

		function checkFilter(grid){ 
		    var n = grid.store.getCount(); 
		    var leftPLen = 0; 
		    var rightPLen = 0; 
		    for (var i=0; i<n; i++){ 
		        var record = grid.store.getAt(i); 
		        if (record.get('fieldname')==''){ 
		            grid.getSelectionModel().selectRow(i); 
		            Ext.Msg.alert("错误", "请选择查询字段。"); 
		            return false; 
		        } 
		        leftPLen += record.get('leftParenthesis').length; 
		        rightPLen += record.get('rightParenthesis').length; 
		        switch(record.get('operator')){ 
		            case "like '|%'": 
		            case "like '%|'": 
		            case "like '%|%'": 
		            case "not like '%|%'": 
		                if (record.get('value')==''){ 
		                    grid.getSelectionModel().selectRow(i); 
		                    Ext.Msg.alert("错误", "请输入内容。"); 
		                    return false; 
		                } 
		            case '=': 
		            case '<>': 
		            case '<': 
		            case '>': 
		            case '<=': 
		            case '>=': 
		                var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
		                if ((dataType=='lookup'||dataType=='date')&&record.get('value')==''){ 
		                    grid.getSelectionModel().selectRow(i); 
		                    Ext.Msg.alert("错误", "请输入内容。"); 
		                    return false; 
		                } 
		        } 
		    } 
		    if (leftPLen!=rightPLen){ 
		        Ext.Msg.alert("错误", "左括号与右括号数量不匹配，请检查。"); 
		        return false; 
		    } 
		    return true; 
		} 
		function getFilter(grid){ 
		    if (!checkFilter(grid)) return ""; 
		    var s = []; 
		    var n = grid.store.getCount(); 
		    for (var i=0; i<n; i++){ 
		        var record = grid.store.getAt(i); 
		        if (i>0) s.push(record.get('relation')); 
		        s.push(record.get('leftParenthesis')); 
		        s.push(record.get('fieldname')); 
		        var operator = record.get('operator'); 
		        switch(operator){ 
		            case "like '|%'": 
		            case "like '%|'": 
		            case "like '%|%'": 
		            case "not like '%|%'": 
		                s.push(operator.replace(/\|/g, record.get('value').replace(/\'/g,"''").replace(/%/g,"!%")));//for sql server 
		                break; 
		            case "is null": 
		            case "is not null": 
		                s.push(operator); 
		                break; 
		            default: 
		                s.push(operator); 
		                var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
		                switch(dataType){ 
		                    case 'lookup': 
		                        var d = findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'); 
		                        if (typeof d[0][0] !='string'){ 
		                            s.push(record.get('value')); 
		                            break; 
		                        } 
		                    case 'string': 
		                        s.push("'" + record.get('value').replace(/\'/g,"''") + "'"); 
		                        break; 
		                    case 'date': 
		                        s.push("'" + record.get('value').dateFormat('Y-m-d') + "'"); 
		                        break; 
		                    case 'boolean': 
		                        s.push(record.get('value')?"1":"0");//for sql server 
		                        break; 
		                    default: 
		                        s.push(record.get('value')); 
		                        break; 
		                } 
		                break; 
		        } 
		        s.push(record.get('rightParenthesis')); 
		    } 
		    return s.join(' ');    
		} 
		function getFilterText(grid){ 
		    if (!checkFilter(grid)) return ""; 
		    var s = []; 
		    var n = grid.store.getCount(); 
		    for (var i=0; i<n; i++){ 
		        var record = grid.store.getAt(i); 
		        if (i>0) s.push(record.get('relation')=='and'?'并且':'或者'); 
		        s.push(record.get('leftParenthesis')); 
		        s.push(findRecordValue(fieldsDef,'value',record.get('fieldname'),'text')); 
		        var operator = record.get('operator'); 
		        switch(operator){ 
		            case "like '|%'": 
		                s.push("以"); 
		                s.push('"' + record.get('value') + '"'); 
		                s.push("开头"); 
		                break; 
		            case "like '%|'": 
		                s.push("以"); 
		                s.push('"' + record.get('value') + '"'); 
		                s.push("结尾"); 
		                break; 
		            case "like '%|%'": 
		                s.push("包含字符"); 
		                s.push('"' + record.get('value') + '"'); 
		                break; 
		            case "not like '%|%'": 
		                s.push("不包含字符"); 
		                s.push('"' + record.get('value') + '"'); 
		                break; 
		            case "is null": 
		                s.push("等于 空白"); 
		                break; 
		            case "is not null": 
		                s.push("等于 非空白"); 
		                break; 
		            default: 
		                s.push(operator); 
		                var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
		                switch(dataType){ 
		                    case 'lookup': 
		                        var d = findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'); 
		                        for (var j=0; j<d.length; j++) 
		                            if (record.get('value')==d[j][0]){ 
		                                s.push('"'+d[j][1]+'"'); 
		                                break; 
		                            } 
		                        break; 
		                    case 'string': 
		                        s.push('"' + record.get('value') + '"'); 
		                        break; 
		                    case 'date': 
		                        s.push(record.get('value').dateFormat('Y-m-d')); 
		                        break; 
		                    case 'boolean': 
		                        s.push(record.get('value')?"是":"否"); 
		                        break; 
		                    default: 
		                        s.push(record.get('value')); 
		                        break; 
		                } 
		                break; 
		        } 
		        s.push(record.get('rightParenthesis')); 
		    } 
		    return s.join(' ');    
		} 
			var win=new Ext.Window({
			id:'win',
			width:550,
			title:'自定义查询',
			height:350,
			layout:'fit',
		     modal:true,
			closeAction:'hide',
			items:grdDPQuery,
			buttons:[{text:'确定',
			handler: function(){
				// frames["user_page"].selPeople();
				//hashMap.Set("name","John Smith");   
				//alert(hashMap.Get("name"));
					grdDPQuery.stopEditing();
				if(checkFilter(grdDPQuery)){document.getElementById("condition").value=getFilter(grdDPQuery);
				  win.hide();
				store.reload();
				}

				
			}
			
			},{text:'关闭',
			handler: function(){
		                        win.hide();
		                    }
			}]
			
		                  });
   var grid = new Ext.grid.GridPanel({
	   id:'MenuGridPanel',
	   
       renderTo: 'jc',
       width:Ext.get("table_1").getWidth()+12,
       height:newHeight-120,
       frame:true,
       title:'进场登记',
       trackMouseOver:false,
		  sm:sm,
       store: store,
//loadMask: {msg:'正在加载数据，请稍侯……'}, 
       columns: [new Ext.grid.RowNumberer({width: 30}),sm,
                 {header:'费率类型',dataIndex:'fl_type',width:60,sortable:false,hidden:true}, 
                 {header:'进场编号',dataIndex:'rcbh',width:75,sortable:true,sumcaption:'合计'}, 
                 {header:'箱公司',dataIndex:'cgs',width:50,sortable:true}, 
                 {header:'箱主',dataIndex:'box_owner',width:50,sortable:true}, 
         	  {header:'箱号',dataIndex:'xh',width:100,sortable:true}, 
         	  {header:'尺寸',dataIndex:'cc',width:40,sortable:true},
         	  {header:'箱型',dataIndex:'xx',width:40,sortable:true}, 
         		{header:'图片',dataIndex:'tpxz',width:40,sortable:true}, 

         	{header:'状态',dataIndex:'jczt',width:50,sortable:true},
         	{header:'提单号',dataIndex:'tdh',width:70,sortable:true},  
         		{header:'进场日期',dataIndex:'jcrq',width:95,sortable:true}, 
         			{header:'发送日期',dataIndex:'fsrq',width:95,sortable:true}, 
         	{header:'确认日期',dataIndex:'qrrq',width:95,sortable:true}, 
         	{header:'完工日期',dataIndex:'wgrq',width:95,sortable:true}, 
         	{header:'出场日期',dataIndex:'ccrq',width:95,sortable:true}, 
         	{header:'结账日期',dataIndex:'jzrq',width:95,sortable:true},
         	{header:'作业工人',dataIndex:'zygr',width:60,sortable:true},  
         	{header:'起吊费',dataIndex:'qdf',width:60,sortable:true}, 
         	{header:'拖运费',dataIndex:'tyf',width:60,sortable:true}, 
         	{header:'堆存费',dataIndex:'dcf',width:60,sortable:true}, 
         	{header:'堆存天数',dataIndex:'ts',width:60,sortable:true}, 
         	{header:'工时',dataIndex:'gs',width:60,sortable:true}, 
         	{header:'工时费',dataIndex:'gsf',width:60,sortable:true}, 
         	{header:'材料费',dataIndex:'clf',width:60,sortable:true}, 
         	{header:'合计',dataIndex:'hj',width:60,sortable:true}, 
         	{header:'货币类型',dataIndex:'hblx',width:60,sortable:true}, 
         	{header:'制造日期',dataIndex:'zzrq',width:60,sortable:true}, 
         	{header:'进场拖车',dataIndex:'jctc',width:60,sortable:true}, 
         	{header:'来箱地',dataIndex:'lxd',width:60,sortable:true}, 
         	{header:'进场位置',dataIndex:'jcwz',width:60,sortable:true}, 
         	{header:'位置描叙',dataIndex:'wzmx',width:60,sortable:true}, 
         	{header:'EIR流水号',dataIndex:'eirlsh',width:60,sortable:true}, 
         	{header:'转关地',dataIndex:'zgd',width:60,sortable:true}, 
         	{header:'是否报废',dataIndex:'sfbf',width:60,sortable:true}, 

         	{header:'帐单编号',dataIndex:'zdbh',width:70,sortable:true}, 
         	
         	{header:'录入人',dataIndex:'llr',width:60,sortable:true}, 
         	{header:'录入日期',dataIndex:'llrq',width:95,sortable:true}, 
         	{header:'箱型类',dataIndex:'xxl',width:50,sortable:true}, 
         	{header:'备注',dataIndex:'bz',width:250,sortable:true}, 
         	{header:'处理结果',dataIndex:'re',width:250,sortable:true} 
],
       tbar:[  <authz:authorize ifAnyGranted="PRIV_HTGL,PRIV_OPERATOR">
       {text:'添加',handler:function(){ 
     	  addjc();   
           } 
       }, 
       {text:'修改',handler:function(){ 
     	  editjc();  
           } 
       }, 
       {text:'删除',handler:function(){ 
           var rows = Ext.getCmp("MenuGridPanel").selModel.selections.items;
     
           if(!(rows.length>=1))
           {alert("至少要选择一项！");
               //Ext.Msg.alert("提示消息","请至少选择一行数据然后才能够删除。<br/>如果需要单行删除并需要确认，请选择[删除]按钮！<br/>暂时不支持该功能！");
               return false;
           }
        if( confirm("确实要进行删除这"+rows.length+"项吗？"))
       {
                   var Ids = "";
                   for(var i=0;i<rows.length;i++)
                   {
               
                       Ids += rows[i].data["rcbh"] + ",";//获取批量删除所需要的ID
                   }

                   Ext.Ajax.request
                   ({
                       url: 'servlet/delJcdj',//批量删除
                       params:{bh:Ids},
                       success: function(response, options) 
                       {
                           var res = Ext.util.JSON.decode(response.responseText);
                         
                           if(res.success=="")
                           {
                               alert("出现异常，可以查看日志了解详细信息！");
                               return;
                           }
                           else if(res.success=="1")
                           {
                               alert("删除成功！");
                               Ext.getCmp("MenuGridPanel").store.reload();
                           }
                           else 
                           {
                               alert("批量删除失败！");
                           }
                       },
                       failure:function(){alert("批量删除出现异常，可以查看日志了解详细信息！");}   
                   });  
               }
           } 
       }, </authz:authorize>
   {text:'自定义查询',handler:function(){
     	 win.show(); 
     	  }}, <authz:authorize ifAnyGranted="PRIV_HTGL,PRIV_OPERATOR">
           {text:'批量处理',handler:function(){
     		  showpl();
         	  }}, 
               {text:'其它报表导出',handler:function(){
         		  printqt();
             	  }},</authz:authorize>
             	
                 	  '箱号：<input type="text" id="xh" name="xh" onfocus="this.select()" onkeyup="xhcx()" style="text-transform:uppercase;">',
                      '-',
' 开始日期： ',{

    format:'Y-m-d',

    name: 'date_start',

    id: 'date_start',

    xtype: 'datefield',

     listeners: {

    /*     'blur' : function () {

           var date_start = Ext.get('date_start').dom.value;

          date_end = date_start;

        Ext.get('date_end').dom.value = date_end

          return;        

         }*/

},

value:new Date(${year}-1,${month},${day})

   },' 结束日期： ',{

    format:'Y-m-d',

    name: 'date_end',

    id: 'date_end',

    xtype: 'datefield',

    value:new Date(${year},${month},${day})

   }, {
                           enableToggle: true,
                           text: '查询',
                           cls: 'x-btn-text-icon details',icon:"images/infofind.gif",
                           toggleHandler: function(btn, pressed)
                           {
                               //动态加重新载数据列表
                             xhcx1();
                           }
                       }
   
   ], 
	    bbar: new Ext.PagingToolbar({
		    store: store,
		    pageSize:100,
		    displayInfo:true,
	        items:[
	                  '<input type="checkbox" id="C" value="C" checked>C&nbsp;&nbsp;<input type="checkbox" id="U" value="U" checked>U&nbsp;&nbsp;<input type="checkbox" id="O" value="O" checked>O&nbsp;&nbsp;<input type="checkbox" id="W" value="W" checked>W',
	 {
	                      enableToggle: true,
	                      text: '估价单打印',
	                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
	                      toggleHandler: function(btn, pressed)
	                      {
	                          //动态加重新载数据列表
	                        printplgjd();
	                      }
	                  },
	                  {
	                      enableToggle: true,
	                      text: '报表导出',
	                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
	                      toggleHandler: function(btn, pressed)
	                      {
	                          //动态加重新载数据列表
	                       print();
	                      }
	                  } ,
	                  {
	                      enableToggle: true,
	                      text: '提单报表导出',
	                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
	                      toggleHandler: function(btn, pressed)
	                      {
	                          //动态加重新载数据列表
	                       printtd();
	                      }
	                  } <authz:authorize ifAnyGranted="PRIV_HTGL,PRIV_OPERATOR">,
	              
	                  {
	                      enableToggle: true,
	                      text: 'MSK-EDI导出',
	                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
	                      toggleHandler: function(btn, pressed)
	                      {
	                          //动态加重新载数据列表
	                          printmsk();
	                      }},
	                      {
		                      enableToggle: true,
		                      text: 'SITC-EDI导出',
		                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
		                      toggleHandler: function(btn, pressed)
		                      {
		                          //动态加重新载数据列表
		                          printsitc();
		                      }
	                  },
	                      {
		                      enableToggle: true,
		                      text: 'OOCL-EDI导出',
		                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
		                      toggleHandler: function(btn, pressed)
		                      {
		                          //动态加重新载数据列表
		                          printoocl();
		                      }
	                  }
	                  ,
	                      {
		                      enableToggle: true,
		                      text: 'IRI估价表导出',
		                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
		                      toggleHandler: function(btn, pressed)
		                      {
		                          //动态加重新载数据列表
		                          printiri();
		                      }
	                  }
	                  </authz:authorize>
	                  ]
	    }),
	
	    view: new Ext.ux.BufferView({
		    // custom row height
		    rowHeight: 20,
		    // render rows as they come into viewable area.
		    scrollDelay: true
		  // forceFit:true,scrollOffset:1, emptyText:EXTLang.reportNoRecordsFound

	    })
   });


   // render functions
   store.on('beforeload', function(store) {
	     var para = {sql:''};
	     para.sql = Ext.get('condition').getValue();
	 	para.date_start=Ext.get("date_start").dom.value;
	para.date_end=Ext.get("date_end").dom.value;
	     
	    
	       Ext.apply(store.baseParams,para);  
	  });
   Ext.get('xh').dom.focus();
});

</script>
  </body>
</html>
