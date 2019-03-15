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
 <script type="text/javascript" src="js/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css">
	 

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
 <script type="text/javascript">
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
		 
		 if(row.data['fllx']=="1")
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
			     document.getElementById("form1").action="servlet/printbb";
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
	     document.getElementById("form1").action="servlet/printbb";
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

function zdcx(){
	 
	var win=window.showModalDialog("jczhcx.htm","自定义查询","dialogwidth:500px;dialogheight:350px;center:yes;status:no;scroll:no;help:no");
 
	if(typeof(win)!="undefined")
	{ document.getElementById("condition").value=win;
	 Ext.getCmp("MenuGridPanel").store.reload();
 }else
	 document.getElementById("condition").value="";
	//Ext.getCmp("MenuGridPanel").store.reload();
	}
function xhcx(){
	if(window.event.keyCode==13){
	document.getElementById("condition").value="a.xh like '%"+document.getElementById("xh").value+"%'";
	 Ext.getCmp("MenuGridPanel").store.reload();
	}
}
function xhcx1(){
 
	document.getElementById("condition").value="a.xh like '%"+document.getElementById("xh").value+"%'";
	 Ext.getCmp("MenuGridPanel").store.reload();
 
}
</script>
       
  </head>
  
  <body onload="da();da1();MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');document.getElementById('xh').focus();">
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
<td width="10" align="center" class="main_menu_left">&nbsp;</td> 
<td style="padding-right:5px;" valign="top">
<table class="table_1" id="table_1" style="width:100%;">
 <tr><td   > <form id="form1" method="post" action="list.htm?action=chkpl">
<input type="hidden" id="plqrrq" name="plqrrq">
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
	 var sm = new Ext.grid.CheckboxSelectionModel();
	var store = new Ext.data.Store({
       remoteSort: true,
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
                    {name: 'fllx',mapping:'fllx'}, 
                    {name: 'rcbh',mapping:'rcbh'}, 
                    {name:'cgs',mapping:'cgs'}, 
                    {name:'xz',mapping:'xz'}, 
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
            					 {name: 'hblx',mapping:'hblx'},
            					 {name: 'llr',mapping:'llr'}, 
            					 {name: 'llrq',mapping:'llrq'}, 
            				
            					 {name: 'xxl',mapping:'xxl'}, 
            					 {name: 'bz',mapping:'bz'}, 
            					 {name: 're',mapping:'re'}
               
           ]
       }),
       remoteSort:true
   });

   var grid = new Ext.grid.GridPanel({
	   id:'MenuGridPanel',
	   
       renderTo: 'jc',
       width:Ext.get("table_1").getWidth()+12,
       height:550,
       frame:true,
       title:'进场登记',
       trackMouseOver:false,
		  sm:sm,
       store: store,
//loadMask: {msg:'正在加载数据，请稍侯……'}, 
       columns: [new Ext.grid.RowNumberer({width: 30}),sm,
                 {header:'费率类型',dataIndex:'fllx',width:60,sortable:false,hidden:true}, 
                 {header:'进场编号',dataIndex:'rcbh',width:75,sortable:true,sumcaption:'合计'}, 
                 {header:'箱公司',dataIndex:'cgs',width:50,sortable:true}, 
                 {header:'箱主',dataIndex:'xz',width:50,sortable:true}, 
         	  {header:'箱号',dataIndex:'xh',width:100,sortable:true}, 
         	  {header:'尺寸',dataIndex:'cc',width:40,sortable:true},
         	  {header:'箱型',dataIndex:'xx',width:40,sortable:true}, 
         		{header:'图片',dataIndex:'tpxz',width:40,sortable:true}, 

         	{header:'状态',dataIndex:'jczt',width:50,sortable:true},
         	{header:'提单号',dataIndex:'tdh',width:70,sortable:true},  
         		{header:'进场日期',dataIndex:'jcrq',width:95,sortable:true}, 
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
       tbar:[  <authz:authorize ifAllGranted="PRIV_HTGL">
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
     	  zdcx();
     	  }}, <authz:authorize ifAllGranted="PRIV_HTGL">
           {text:'批量处理',handler:function(){
     		  showpl();
         	  }}, 
               {text:'其它报表导出',handler:function(){
         		  printqt();
             	  }},</authz:authorize>
             	
                 	  '箱号：<input type="text" id="xh" name="xh" onfocus="this.select()" onkeyup="xhcx()" style="text-transform:uppercase;">',
                       {
                           enableToggle: true,
                           text: '查询',
                           cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
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
	                  } <authz:authorize ifAllGranted="PRIV_HTGL">,
	              
	                  {
	                      enableToggle: true,
	                      text: 'EDI导出',
	                      cls: 'x-btn-text-icon details',icon:"images/plugin.gif",
	                      toggleHandler: function(btn, pressed)
	                      {
	                          //动态加重新载数据列表
	                          printmsk();
	                      }
	                  }</authz:authorize>
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
	 
	     
	    
	       Ext.apply(store.baseParams,para);  
	  });

});

</script>
  </body>
</html>
