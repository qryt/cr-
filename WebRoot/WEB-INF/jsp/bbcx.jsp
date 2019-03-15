<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->报表查询</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
    <script type="text/javascript" src="ext/ext-all.js"></script>
			    <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" /> 
    <SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
 
  <script type="text/javascript" src="js/changedate.js"></script>

<script type="text/javascript">
function print(){
 var selectedRows = grid.selModel.selections.items;   
if(selectedRows.length==0)
  alert("不能批量打印，请至少选择一项！");
  else{
var str="";
if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("O").checked)
{
if(document.getElementById("C").checked)
str=str+"C,";
if(document.getElementById("U").checked)
str=str+"U,";
if(document.getElementById("O").checked)
str=str+"O,";

document.getElementById("ck").value=str;
   for (var i = 0; i < selectedRows.length; i++) {  
   var row = selectedRows[i]; 
 if(i==0)
  document.getElementById("var").value=row.data['rcbh'];
 else
   document.getElementById("var").value=document.getElementById("var").value+"//"+row.data['rcbh'];
   }
     document.getElementById("form2").action="servlet/printbb";
document.getElementById("form2").submit();
 }
else
alert("至少要选择一项付费方！");
 }

 }

function printqt(){
 var selectedRows = grid.selModel.selections.items;   
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

  document.getElementById("form2").action="servlet/printqtbb";
document.getElementById("form2").submit();
 }
}
function printmsk(){
 var selectedRows = grid.selModel.selections.items;   
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

  document.getElementById("form2").action="servlet/exMskEDI";
document.getElementById("form2").submit();
 }
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
    <td width="1015" height="6"><img src="images/xn_01.gif"></td>
  </tr>
</table>
<table width="1015" height="100%" border="0" cellpadding="0" cellspacing="0"><tr>
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
<td width="10" align="center" class="main_menu_left">&nbsp;</td><td valign="top" style="padding-right:5px;"><table class="table_1"  width="100%"><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;报表查询</td></tr> <tr><td  style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9"  ><legend>查询条件</legend>
<form method="post" action="list.htm?action=listbbcx" id="form1" name="form1">
<table  width="100%" cellpadding="0" cellspacing="0" border="0">
<tr><td align="left"   height="25">&nbsp;&nbsp;船公司:
</td><td><input type="input" class="text" id="cgs" name="cgs" onkeyup="kd('cgs')"  autocomplete="off"  value="${jc.cgs }"/></td><td >箱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:</td><td><input type="input" class="text" id="xh" name="xh" autocomplete="off" value="${jc.xh }" onkeyup="kd('xh')" /></td><td>尺寸:</td><td><select id="cc" name="cc" class="combobox"><option value="">全部</option><option value="20’">20’</option><option value="40’">40’</option><option value="45’">45’</option></select></td>
<td>箱型:</td><td><input type="input" class="text" id="xx" name="xx" value="${jc.xx }" onkeyup="kd('xx')" /></td><td rowspan="10"><input type="button" onfocus="document.getElementById('form1').submit()" class="btn_2k3" value="查询"></td></tr>
<tr><td>&nbsp;&nbsp;进场状态:</td><td><select id="jczt" name="jczt" class="combobox"><option value="">全部</option><option value="好箱">好箱</option><option value="坏箱">坏箱</option></select></td>
<td>进场编号:</td><td><input type="input" id="rcbh" name="rcbh" class="text" value="${jc.rcbh }"/></td>
<td>进场起始日期:</td><td><input type="input" class="text" id="qsrq" name="qsrq" value="<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off" /></td>
<td>进场截止日期:</td><td><input type="input" class="text" id="jzrq" name="jzrq" value="<fmt:formatDate value="${jc.llrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off" /></td>
<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>
</tr>
<tr><td height="25">&nbsp;&nbsp;提单号:</td><td><input type="input" class="text" id="tdh" name="tdh" value="${jc.tdh }"/></td>
<td>离场状态:</td><td><select id="lczt" name="lczt" class="combobox"><option value="">全部</option><option value="进场">进场</option><option value="离场">离场</option></select></td>
<td>确认起始日期:</td><td><input type="input" class="text" id="qrqsrq" name="qrqsrq" value="<fmt:formatDate value="${jc.jcrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off" /></td>
<td>确认截止日期:</td><td><input type="input" class="text" id="qrjzrq" name="qrjzrq" value="<fmt:formatDate value="${jc.llrq }" type="both" pattern="yyyy-MM-dd HH:mm"/>" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" autocomplete="off" /></td>

</tr>
<tr>
<td height="25">&nbsp;&nbsp;是否报废:</td><td><select id="sfbf" name="sfbf" class="combobox"><option value="">全部</option><option value="在用">在用</option><option value="报废">报废</option></select></td>
<td>&nbsp;&nbsp;是否确认:</td><td><select id="sfqr" name="sfqr" class="combobox"><option value="">全部</option><option value="是">是</option><option value="否">否</option></select></td>
<td>&nbsp;&nbsp;是否完工:</td><td><select id="sfwg" name="sfwg" class="combobox"><option value="">全部</option><option value="是">是</option><option value="否">否</option></select></td>
<td>&nbsp;&nbsp;是否结账:</td><td><select id="sfjz" name="sfjz" class="combobox"><option value="">全部</option><option value="是">是</option><option value="否">否</option></select></td>

</tr>
<tr>
<td height="25">&nbsp;&nbsp;作业工人:</td><td><select id="zygr" name="zygr" class="combobox"><option value="">全部</option><option value="一组">一组</option><option value="二组">二组</option><option value="三组">三组</option><option value="四组">四组</option><option value="五组">五组</option><option value="六组">六组</option><option value="七组">七组</option><option value="八组">八组</option></select></td>
</tr>
 
 </table></form>
</fieldset>
<table><tr><td style="height:5px"></td></tr></table>

<table class="table_1" style="width:100%;height:300px;overflow:hidden">
<tr><td height="30"><DIV id="nseer_grid_div"  align="right"><form action="servlet/printqtbb" id="form2" name="form2" method="post">
&nbsp;&nbsp;<input type="checkbox" id="C" value="C" checked>C&nbsp;&nbsp;<input type="checkbox" id="U" value="U" checked>U&nbsp;&nbsp;<input type="checkbox" id="O" value="O" checked>O&nbsp;&nbsp;<input type="hidden" id="var" name="var" value=""><input type="hidden" id="ck" name="ck" value="C,U,O"><INPUT name="button2" type="button" title="报表导出" class="btn_2k3" onclick="print()"   value="报表导出">&nbsp;&nbsp;<INPUT name="button3" type="button" title="其它报表导出" onclick="printqt()" class="btn_2k3"   value="其它报表导出">&nbsp;&nbsp;<INPUT name="button3" type="button" title="马士基EDI导出" onclick="printmsk()" class="btn_2k3"   value="马士基EDI导出"></form></div></td></tr>

<tr><td style="width:100%">
  <script>
    var grid;
    Ext.onReady(function(){ 
        //定义数据二维数组
        var data=[ 
                    ${data}
                 ];
        
      function check(value)
        {
         
               return value;
           
        }
       
        
        //整理数据定义3列的索引为con1,con2,con3
        var ds = new Ext.data.Store({
    proxy: new Ext.data.MemoryProxy(data),
    reader: new Ext.data.ArrayReader({}, [
        {name: 'rcbh'},
        {name: 'cgs'},
        {name: 'xh'},
        {name: 'cc'},
         {name: 'xx'},
        {name: 'jcrq'},
        {name: 'qrrq'},
        {name: 'wgrq'},
        {name: 'hblx'},
         {name: 'qdf'},
          {name: 'tyf'},
           {name: 'dcf'},
            {name: 'gs'},
             {name: 'gsf'},
              {name: 'clf'},
               {name: 'hj'}
    ])
});
        
        //定义勾选框，不需要可不必定义
        var sm = new Ext.grid.CheckboxSelectionModel();
        
        //定义列
        var colM=new Ext.grid.ColumnModel([
            new Ext.grid.RowNumberer(),//增加自动编号，不需要可不必定义
            sm,//勾选框，不需要可不必定义
            {header:'入场编号',dataIndex:'rcbh',width:80,sortable:true,renderer:check},// 生成列，sortable为列排序，不需要设置为false，默认false，renderer为该列增加自定义函数
            {header:'船公司',dataIndex:'cgs',width:60,sortable:true},
            {header:'箱号',dataIndex:'xh',width:90,sortable:true},
            {header:'尺寸',dataIndex:'cc',width:60,sortable:true},
            {header:'箱型',dataIndex:'xx',width:60,sortable:true},
            {header:'进场时间',dataIndex:'jcrq',width:100,sortable:true},
            {header:'确认时间',dataIndex:'qrrq',width:100,sortable:true},
            {header:'完工时间',dataIndex:'wgrq',width:100,sortable:true},
             {header:'货币类型',dataIndex:'hblx',width:60,sortable:true},
              {header:'起吊费',dataIndex:'qdf',width:60,sortable:true},
               {header:'拖运费',dataIndex:'tyf',width:60,sortable:true},
                {header:'堆存费',dataIndex:'dcf',width:60,sortable:true},
                {header:'工时',dataIndex:'gs',width:60,sortable:true},
                {header:'工时费',dataIndex:'gsf',width:60,sortable:true},
                {header:'材料费',dataIndex:'clf',width:60,sortable:true},
                {header:'合计',dataIndex:'hj',width:60,sortable:true}
        ]);
        
        //生成表格
        grid = new Ext.grid.GridPanel({
            renderTo:'show',
            title:"报表查询",
            height:300,
            width:Ext.get("nseer_grid_div").getWidth(), 
            cm:colM,
            sm:sm,
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
document.getElementById("jczt").value="${jc.jczt }";
document.getElementById("lczt").value="${jc.lczt }";
document.getElementById("cc").value="${jc.cc }";
document.getElementById("sfbf").value="${jc.sfbf }";
document.getElementById("sfqr").value="${jc.sfqr }";
document.getElementById("sfwg").value="${jc.sfwg }";
document.getElementById("sfjz").value="${jc.sfjz }";
document.getElementById("zygr").value="${jc.zygr }";
</script>
  </body>
</html>
