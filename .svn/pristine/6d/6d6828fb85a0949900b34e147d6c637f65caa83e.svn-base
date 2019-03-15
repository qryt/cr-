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
<!-- 
<script type="text/javascript" >
// 教程中的代码就写在这个区域里.
var data1 = [
${data}];

var dsConfig= {
	data : data1 ,

	fields :[
		{name : 'cz'       }, 
				{name : 'shdm'      },
		{name : 'shlx'      },
		{name : 'shwz'      },

		{name : 'shmx'      },
		{name : 'sl'       },
		{name : 'xs'       },
		{name : 'gsf'       },
		{name : 'clf'       },
		{name : 'fff'       },
		{name : 'lrr'       },
		{name : 'lrsj'       }
	 
	]
};

var colsConfig = [

		{ id : 'cz'      , header : "操作" , width : 50 },
			{ id : 'shdm'      , header : "损坏代码" , width : 60},
		
		{ id : 'shlx'      , header : "损坏类型" , width : 60},
		{ id : 'shwz'      , header : "损坏位置" , width : 60},
	{ id : 'shmx'      , header : "损坏描叙" , width : 280},
		{ id : 'sl'      , header : "数量" , width : 40},
		{ id : 'xs'      , header : "工时" , width : 40},
		{ id : 'gsf'      , header : "工时费" , width : 70},
		{ id : 'clf'      , header : "材料费" , width : 70 },
		{ id : 'fff'      , header : "付费方" , width : 50 },
		{ id : 'lrr'      , header : "录入人" , width : 50 },
		{ id : 'lrsj'      , header : "录入时间" , width : 90 }
	
];

var gridConfig={

	id : "grid1",
	
	dataset : dsConfig ,

	columns : colsConfig ,

	container : 'grid1_container', 

	toolbarPosition : 'bottom',

	toolbarContent : 'nav | goto | pagesize | reload | state' ,

	pageSize : 40 ,
	
	pageSizeList : [40,60,80,100]

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
function bl(){
var sp;
if(document.getElementById("showdiv").style.visibility="visible"){
sp=document.fid.d0.value.split("|");
rvalue("shdm",sp);
MM_showHideLayers('showdiv','','hide');

}
}
</script> -->
  </head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');document.getElementById('shlx').focus()">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
<div id="showdiv" style="position:absolute; width:400px; height:250px; z-index:1; left: 180px; top: 184px; visibility: hidden;">
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
<table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;添加损坏信息</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><fieldset style="width:800px;height:60px;border: 1 solid #3e7fd9;" ><legend>损坏信息</legend>
<form:form >
<table width="800" cellpadding="0" cellspacing="0" border="0" >
<tr>

<td align="left"   height="25">&nbsp;&nbsp;损坏类型: 
</td><td><form:input path="shlx" cssClass="text" onkeyup="kd('shlx')" autocomplete="off" />&nbsp;<font color="red">*</font></td>
<td align="left"   height="25">损坏代码: 
</td><td><form:input path="shdm" cssClass="text" onkeyup="kd('shdm')"   autocomplete="off" />&nbsp;<font color="red">*</font></td>

<td >损坏位置:</td><td>
<form:input path="shwz" cssClass="text" onkeyup="kd('shwz')" autocomplete="off"  />
</td>

<td >损坏描述:</td><td><form:input path="shmx" cssClass="text_3"  onkeydown="tabs()" /></td>
</tr>

<tr>
<td height="25">&nbsp;&nbsp;数量:</td><td><form:input path="sl" cssClass="text" onkeydown="tabs()" onblur="cul()" onfocus="this.select()" /></td>
<td>工时:</td><td><form:input path="xs" cssClass="text"  onkeydown="tabs()" onblur="cu2()" onfocus="this.select()" /></td>
<td>工时费:</td><td><form:input path="gsf" cssClass="text"  onkeydown="tabs()" onfocus="this.select()" /></td>

<td>材料费:</td><td><form:input path="clf" cssClass="text"  onkeydown="tabs()" onfocus="this.select()" /></td>
 </tr>
 <tr><td height="25">&nbsp;&nbsp;付费方:</td><td><form:select onkeydown="tabs()"  path="fff" cssClass="combobox"><form:option value="O" label="O"/><form:option value="C" label="C"/><form:option value="U" label="U"/><form:option value="W" label="W"/></form:select></td>
 </tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="button"  onfocus="document.getElementById('command').submit()" class="btn_2k3" value="添加">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="javascript:location.href='editjcdj.htm?bh=<%=request.getParameter("bh") %>&operation=s&op=n'"></td></tr>


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
                        				{name : 'shlx'      },
                        		{name : 'shdm'      },
                        		{name : 'shwz'      },

                        		{name : 'shmx'      },
                        		{name : 'sl'       },
                        		{name : 'xs'       },
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
            {header:'损坏类型',dataIndex:'shlx',width:60,sortable:true},
            {header:'损坏代码',dataIndex:'shdm',width:60,sortable:true},
            {header:'损坏位置',dataIndex:'shwz',width:60,sortable:true},
            {header:'损坏描叙',dataIndex:'shmx',width:200,sortable:true},
            {header:'数量',dataIndex:'sl',width:60,sortable:true},
            {header:'小时',dataIndex:'xs',width:60,sortable:true},
            {header:'工时费',dataIndex:'gsf',width:60,sortable:true},
             {header:'材料费',dataIndex:'clf',width:60,sortable:true},
              {header:'付费方',dataIndex:'fff',width:60,sortable:true},
               {header:'录入人',dataIndex:'lrr',width:60,sortable:true},
                {header:'录入时间',dataIndex:'lrsj',width:100,sortable:true}
               
        ]);
        
        //生成表格
        grid = new Ext.grid.GridPanel({
            renderTo:'show',
            title:"估价单",
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
 
  </body>
</html>
