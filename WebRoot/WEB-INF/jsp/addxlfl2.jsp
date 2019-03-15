<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->修理费率2</title>
    
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
     
<script type="text/javascript">
function addxlfl(){
document.getElementById("command").submit();
}
function expr(){
document.getElementById("fid").src="servlet/printxlfl2?bh=<%=request.getParameter("bh") %>"
}
function zdcx(){
 
var win=window.showModalDialog("zhcx.htm","自定义查询","dialogwidth:500px;dialogheight:350px;center:yes;status:no;scroll:no;help:no");

if(win)
{document.getElementById("condition").value=win;
 }else
 document.getElementById("condition").value="";
  Ext.getCmp("MenuGridPanel").store.load({params:{start:0, limit:10}}); 
 //Ext.getCmp("MenuGridPanel").store.reload();
}
</script>
<style type="text/css">
table{
margin:0px;
overflow:auto;
}
</style>
  </head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');">
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
<table width="100%" border="0" cellpadding="0" cellspacing="0">
<tr><td style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>修理费率2</legend>
<form:form >
<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td align="left"   height="25"><input type="hidden" id="condition" name="condition" value="">&nbsp;&nbsp;类型:
</td><td><form:input path="lx"  cssClass="text" onfocus="this.select()" onkeydown="tabs()"   autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td >部件名称:</td><td><form:input path="bjmc"  cssClass="text" onkeydown="tabs()" />&nbsp;<font color="red">*</font></td>
<td>修理方法:</td><td><form:input path="xlff" cssClass="text"  onkeydown="tabs()" />&nbsp;<font color="red">*</font></td>
<td>长:</td><td><form:input path="c" cssClass="text"  onkeydown="tabs()" />&nbsp;<font color="red">*</font></td>
</tr>
<tr><td align="left"   height="25">&nbsp;&nbsp;宽:
</td><td><form:input path="k"  cssClass="text" onfocus="this.select()" onkeydown="tabs()"   autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td >修理描叙:</td><td><form:input path="xlmx" cssClass="text_3" onkeydown="tabs()" /></td>
<td>工时:</td><td><form:input path="gs" cssClass="text"  onkeydown="tabs()" /></td>
<td>材料费:</td><td><form:input path="clf" cssClass="text"  onkeydown="tabs()" /></td>
</tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
</table></form:form>
</fieldset><table>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="button" id="sub1" onclick="addxlfl()" class="btn_2k3" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" id="sub2" onclick="expr()" class="btn_2k3" value="导出费率2">
&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" id="myco" onclick="zdcx()"   class="btn_2k3" value="自定义查询"></td></tr>

</table><table  class="table_1">
<tr><td style="width:100%;overflow:hidden;">
  <div id="xlfl2grid"></div>
</td></tr>
</table> 
<script type="text/javascript" defer="defer">
Ext.onReady(function(){

 

var cm = new Ext.grid.ColumnModel([ 
    new Ext.grid.RowNumberer(), 
   
        {header:'操作',dataIndex:'cz',width:60,sortable:false}, 
        {header:'类型',dataIndex:'lx',width:60,sortable:true}, 
        {header:'部件名称',dataIndex:'bjmc',width:70,sortable:true}, 
	  {header:'修理方法',dataIndex:'xlff',width:70,sortable:true}, 
	  {header:'长',dataIndex:'c',width:60,sortable:true}, 
	{header:'宽',dataIndex:'k',width:60,sortable:true}, 
	{header:'修理描叙',dataIndex:'xlmx',width:180,sortable:true}, 
	{header:'工时',dataIndex:'gs',width:60,sortable:true}, 
	{header:'材料费',dataIndex:'clf',width:60,sortable:true} 
    ]); 
    cm.defaultSortable = true; 
var ds = new Ext.data.Store({ 
        proxy: new Ext.data.HttpProxy({url:'servlet/showxlfl2?bh=<%=request.getParameter("bh")%>'}), 
        reader: new Ext.data.JsonReader({ 
                totalProperty: 'totalProperty', 
                root: 'root' 
    }, 
    [ 
        {name: 'cz',mapping:'cz'}, 
        {name: 'lx',mapping:'lx'}, 
        {name:'bjmc',mapping:'bjmc'}, 
        {name: 'xlff',mapping:'xlff'}, 
					 {name: 'c',mapping:'c'}, 
					 {name: 'k',mapping:'k'}, 
					 {name: 'xlmx',mapping:'xlmx'}, 
					 {name: 'gs',mapping:'gs'}, 
					 {name: 'clf',mapping:'clf'}
    ]), 
    remoteSort:true 
    
    }); 


    var grid = new Ext.grid.GridPanel({ 
    id:'MenuGridPanel',
    el: 'xlfl2grid', 
    title:'修理费率2列表', 
    width:800, 
    height:260, 
    trackMouseOver:false, 
   loadMask: {msg:'正在加载数据，请稍侯……'}, 
    store:ds, 
    cm: cm, 
   
    bbar: new Ext.PagingToolbar({ 
            pageSize: 10, 
            store: ds, 
            displayInfo: true, 
            displayMsg: '当前显示 {0} - {1}条记录 /共 {2}条记录', 
            emptyMsg: "No topics to display" 
        }) 
}); 
  ds.on('beforeload', function(store) {
     var para = {sql:''};
     para.sql = Ext.get('condition').getValue();
 
     
    
       Ext.apply(store.baseParams,para);  
  });
  grid.render(); 

   
 
    ds.load({params:{start:0, limit:10}}); 
  
    
});

</script>

  </body>
</html>
