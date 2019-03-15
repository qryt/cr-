<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->估价单管理</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<style>
	 input{
	 text-transform:uppercase;
	 }
	 </style>
 <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />

    <!-- GC -->
 	<!-- LIBS -->
 	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
 	<!-- ENDLIBS -->

    <script type="text/javascript" src="ext/ext-all.js"></script>

    <script type="text/javascript" src="ext/examples/form/states.js"></script>

    <link rel="stylesheet" type="text/css" href="ext/examples/form/combos.css" />

    <!-- Common Styles for the examples -->
     	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
 
<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" >
// 教程中的代码就写在这个区域里.

function bl(){
var sp;
if(document.getElementById("showdiv").style.visibility="visible"){
sp=document.fid.d0.value.split("|");
rvalue("lx",sp);
MM_showHideLayers('showdiv','','hide');

}
}
</script>
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
<table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;添加估价信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><fieldset style="width:800px;height:60px;border: 1 solid #3e7fd9;" ><legend>估价信息</legend>
<form:form >
<table width="800" cellpadding="0" cellspacing="0" border="0" >
<tr><td align="left"   height="25">&nbsp;&nbsp;损坏类型: 
</td><td><form:input path="shlx" cssClass="text"  onfocus="this.select();"   onkeyup="kd('shlx')"  autocomplete="off" />&nbsp;<font color="red">*</font></td>

<td align="left"   height="25"  >损坏位置: 
</td><td><TABLE><tr><td><form:input path="wzdm" cssClass="text"  onfocus="cc()"   onkeyup="kd('wzdm')"  autocomplete="off"/></td><td>&nbsp;<font color="red">*</font></td></tr></TABLE> </td>

<td >修理方法:</td><td><form:input path="xlff"  onfocus="this.select()"  cssClass="text;"  onkeyup="kd('xlff')" autocomplete="off"  />&nbsp;<font color="red">*</font></td>

<td >部件名称:</td><td><form:input path="bjmc"  onfocus="this.select();"  onkeyup="kd('bjmc')"  cssClass="text"   autocomplete="off" />&nbsp;<font color="red">*</font></td>

</tr>

<tr>

<td align="left"   height="25">&nbsp;&nbsp;长: 
</td><td><form:input path="c" cssClass="text"  onfocus="this.select();"  onkeyup="kd('c')" autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td >宽:</td><td><form:input path="k" cssClass="text"  onfocus="this.select()"   onkeyup="kd('k')" autocomplete="off"  />&nbsp;<font color="red">*</font></td>
<td align="left"   height="25">类型: 
</td><td><form:input path="lx" cssClass="text"  onfocus="this.select()"  onkeyup="kd('lx')"  autocomplete="off" />&nbsp;<font color="red">*</font></td>

<td >数量:</td><td><form:input path="sl" onblur="cul2()"  onfocus="this.select();"  cssClass="text_3;"  onkeydown="tabs()" /></td>
</tr>

<tr>
<td height="25">&nbsp;&nbsp;工时:</td><td><form:input path="gs" cssClass="text"  onkeydown="tabs()" onblur="culgs()" onfocus="this.select()" /></td>
<td>工时费:</td><td><form:input path="gsf"   cssClass="text"  onkeydown="tabs()" onfocus="this.select()" /></td>

<td>材料费:</td><td><form:input path="clf" cssClass="text"  onkeydown="tabs()" onfocus="this.select()" /></td>
 <td >付费方:</td><td><form:select path="fff" onkeydown="tabs()" cssClass="combobox"><form:option value="C" label="C"/><form:option value="U" label="U"/><form:option value="O" label="O"/><form:option value="W" label="W"/></form:select></td>
 
 </tr>
  <tr><td>&nbsp;&nbsp;修理描叙:</td><td colspan="7"><form:input path="xlmx" onkeydown="tabs()"  onfocus="this.select()"  cssClass="text_4"/></td></tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="button"  onfocus="document.getElementById('command').submit()" class="btn_2k3" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="javascript:location.href='editjcdj2.htm?bh=<%=request.getParameter("bh") %>&operation=s&op=n'"></td></tr>


 </table></form:form>
 <input type="hidden" id="bh" name="bh" value="<%=request.getParameter("bh") %>">
 <input type="hidden" id="gsfl" name="gsfl" value="0">
 <input type="hidden" id="xsl" name="xsl" value="0">
  <input type="hidden" id="clfl" name="clfl" value="0">
</fieldset><table><tr><td style="height:5px"></td></tr></table><table class="table_1">
<tr><td style="width:800px">
 <script>
    var grid;
    Ext.onReady(function(){ 
        //定义数据二维数组
        var data=[ 
                    ${data}
                 ];
        

        
        //整理数据定义3列的索引为con1,con2,con3
        var ds = new Ext.data.Store({
    proxy: new Ext.data.MemoryProxy(data),
    reader: new Ext.data.ArrayReader({}, [
                                      	{name : 'cz'       }, 
                        				{name : 'wzdm'      },
                        		{name : 'lx'      },
                        		{name : 'shlx'      },

                        		{name : 'xlff'      },
                        		{name : 'bjmc'       },
                        		{name : 'xlmx'       },
                        		{name : 'c'       },
                        		{name : 'k'       },
                        		{name : 'sl'       },
                        		{name : 'gs'       },
                        		{name : 'gsf'       },
                        		{name : 'clf'       },
                        		{name : 'fff'       },
                        		{name : 'lrr'       },
                        		{name : 'lrsj'       }
    ])
});
        
        //定义勾选框，不需要可不必定义
      //  var sm = new Ext.grid.CheckboxSelectionModel();
        
        //定义列
        var colM=new Ext.grid.ColumnModel([
            new Ext.grid.RowNumberer(),//增加自动编号，不需要可不必定义
          //  sm,//勾选框，不需要可不必定义
            {header:'操作',dataIndex:'cz',width:50,sortable:true},// 生成列，sortable为列排序，不需要设置为false，默认false，renderer为该列增加自定义函数
            {header:'损坏类型',dataIndex:'shlx',width:55,sortable:true},
             {header:'损坏位置',dataIndex:'wzdm',width:55,sortable:true},
            {header:'类型',dataIndex:'lx',width:40,sortable:true},
            {header:'修理方法',dataIndex:'xlff',width:60,sortable:true},
            {header:'部件名称',dataIndex:'bjmc',width:60,sortable:true},
            {header:'长',dataIndex:'c',width:50,sortable:true},
            {header:'宽',dataIndex:'k',width:50,sortable:true},
            {header:'修理描叙',dataIndex:'xlmx',width:200,sortable:true},
            {header:'数量',dataIndex:'sl',width:40,sortable:true},
            {header:'工时',dataIndex:'gs',width:60,sortable:true},
            {header:'工时费',dataIndex:'gsf',width:60,sortable:true},
             {header:'材料费',dataIndex:'clf',width:60,sortable:true},
              {header:'付费方',dataIndex:'fff',width:60,sortable:true},
               {header:'录入人',dataIndex:'lrr',width:60,sortable:true},
                {header:'录入时间',dataIndex:'lrsj',width:100,sortable:true}
               
        ]);
        
        //生成表格
        grid = new Ext.grid.GridPanel({
            renderTo:'show',
            title:"估价单2",
            height:450,
            width:800, 
            cm:colM,
          //  sm:sm,
            store:ds,
             bbar: new Ext.PagingToolbar({
     
        store: ds,
        displayInfo: true,
        displayMsg: '显示第 {0} 条到 {1} 条记录，一共 {2} 条',
        emptyMsg: "没有记录"
})
}); 

  ds.load(); 
    
    });
   
    
    </script>
    <div id="show"></div>
</td></tr>
</table></td></tr>

</table>
 <script type="text/javascript">
document.getElementById("shlx").focus();
</script>
  </body>
</html>
