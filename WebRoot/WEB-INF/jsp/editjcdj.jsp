<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->进出场登记修改</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	 <style>
	 input{
	 text-transform:uppercase;
	 }
	 </style>
	 <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />
    <link rel="stylesheet" type="text/css" href="ext/resources/css/xtheme-gray.css" />

    <!-- GC -->
 	<!-- LIBS -->
 	<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script>
 	<!-- ENDLIBS -->

    <script type="text/javascript" src="ext/ext-all.js"></script>

    <script type="text/javascript" src="ext/examples/form/states.js"></script>

    <link rel="stylesheet" type="text/css" href="ext/examples/form/combos.css" />

    <!-- Common Styles for the examples -->
      <SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>
  <link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
  
<link rel="stylesheet" type="text/css" href="gt_grid.css" />

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" src="js/gt_msg_cn.js"></script>
<script type="text/javascript" src="js/gt_grid_all.js"></script>
<script language="JavaScript" src="js/calendar_month.js" type="text/JavaScript"></script>
<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<!-- 

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
			{ id : 'shdm'      , header : "损坏代码" , width : 70},
			{ id : 'shlx'      , header : "损坏类型" , width : 70},
				{ id : 'shwz'      , header : "损坏位置" , width : 70},
	{ id : 'shmx'      , header : "损坏描叙" , width : 280},
		{ id : 'xs'      , header : "小时" , width : 60},
		{ id : 'gsf'      , header : "工时费" , width : 60},
		{ id : 'clf'      , header : "材料费" , width : 60 },
		{ id : 'fff'      , header : "付费方" , width : 50 },
		{ id : 'lrr'      , header : "录入人" , width : 50 },
		{ id : 'lrsj'      , header : "录入时间" , width : 70 }
	
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
} -->
<script type="text/javascript" >
function myprint(){
var str="";
if(document.getElementById("C").checked||document.getElementById("U").checked||document.getElementById("W").checked)
{
if(document.getElementById("C").checked)
str=str+"C,";
if(document.getElementById("U").checked)
str=str+"U,";
if(document.getElementById("O").checked)
str=str+"O,";

document.getElementById("print").src="printgjd.htm?bh=<%=request.getParameter("bh") %>&chk="+str;
}else
alert("至少要选择一项！");
}
function expr(){
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
document.getElementById("print").src="servlet/expdf?bh=<%=request.getParameter("bh") %>&chk="+str;
}else
alert("至少要选择一项！");
}
function js(){
var xmlHttp;
if(document.getElementById("ccrq").value!=""){
if(window.ActiveXObject){
 xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
}
 else if (window.XMLHttpRequest) {
 xmlHttp = new XMLHttpRequest();
}
xmlHttp.open("GET","servlet/getDcf?rcbh="+document.getElementById("rcbh").value+"&ccrq="+ctlToPlaceValue.value+"&a"+Math.round(Math.random()*10000),false);
xmlHttp.send(xmlDoc);
if(xmlHttp.readyState==4){
var xmlDoc = xmlHttp.responseText;
 
	document.getElementById("dcf").value=xmlDoc;
	}
	}
}
function addjc(){
if(gf_trim(document.getElementById("cgs").value)=="")
{document.getElementById("me2").innerText="船公司不能为空！";
document.getElementById("cgs").focus();
}
else if(gf_trim(document.getElementById("xh").value)==""){
 document.getElementById("me2").innerText="箱号不能为空！";
document.getElementById("xh").focus();
}
else if(gf_trim(document.getElementById("xx").value)==""){
 document.getElementById("me2").innerText="箱型不能为空！";
document.getElementById("xx").focus();
}
else if(gf_trim(document.getElementById("xxl").value)==""){
 document.getElementById("me2").innerText="箱型类不能为空！";
document.getElementById("xxl").focus();
}
else if(gf_trim(document.getElementById("jcrq").value)==""){
 document.getElementById("me2").innerText="进场日期不能为空！";
document.getElementById("jcrq").focus();
}
else if(document.getElementById("bz").value.length>76){
	document.getElementById("me2").innerText="备注超出了76个字符的最大长度！";
	document.getElementById("bz").focus();
}
else {
converted.setValue(converted.getRawValue());
converted1.setValue(converted1.getRawValue());
document.getElementById('command').submit();
}
}
</script>
<script language="javascript" type="text/javascript">
<!--
// 这里都是公用函数，挺多的...
var
// 获取元素
$ = function(element) {
 return (typeof(element) == 'object' ? element : document.getElementById(element));
},
// 判断浏览器
brower = function() {
 var ua = navigator.userAgent.toLowerCase();
 var os = new Object();
 os.isFirefox = ua.indexOf ('gecko') != -1;
 os.isOpera = ua.indexOf ('opera') != -1;
 os.isIE = !os.isOpera  &&  ua.indexOf ('msie') != -1;
 os.isIE7 = os.isIE  &&  ua.indexOf ('7.0') != -1;
 return os;
},
// 事件操作(可保留原有事件)
eventListeners = [],
findEventListener = function(node, event, handler){
 var i;
 for (i in eventListeners){
  if (eventListeners[i].node == node  &&  eventListeners[i].event == event  &&  eventListeners[i].handler == handler){
   return i;
  }
 }
 return null;
},
myAddEventListener = function(node, event, handler){
 if (findEventListener(node, event, handler) != null){
  return;
 }
 if (!node.addEventListener){
  node.attachEvent('on' + event, handler);
 }else{
  node.addEventListener(event, handler, false);
 }
 eventListeners.push({node: node, event: event, handler: handler});
},
removeEventListenerIndex = function(index){
 var eventListener = eventListeners[index];
 delete eventListeners[index];
 if (!eventListener.node.removeEventListener){
  eventListener.node.detachEvent('on' + eventListener.event,
  eventListener.handler);
 }else{
  eventListener.node.removeEventListener(eventListener.event,
  eventListener.handler, false);
 }
},
myRemoveEventListener = function(node, event, handler){
 var index = findEventListener(node, event, handler);
 if (index == null) return;
 removeEventListenerIndex(index);
},
cleanupEventListeners = function(){
 var i;
 for (i = eventListeners.length; i > 0; i--){
  if (eventListeners[i] != undefined){
   removeEventListenerIndex(i);
  }
 }
};
-->
</script>
<script language="javascript" type="text/javascript">
<!--
/*======================================================
 - statInput 输入限制统计
 - By Mudoo 2008.5
 - 长度超出_max的话就截取...貌似没有更好的办法了
======================================================*/
function statInput(e, _max, _exp) {
 e   = $(e);
 _max  = parseInt(_max);
 _max  = isNaN(_max) ? 0 : _max;
 _exp  = _exp==undefined ? {} : _exp;
 
 if(e==null || _max==0) {
  alert('statInput初始化失败！');
  return;
 }
 
 var
 // 浏览器
 _brower  = brower();
 // 输出对象
 _objMax  = _exp._max==undefined ? null : $(_exp._max),
 _objTotal = _exp._total==undefined ? null : $(_exp._total),
 _objLeft = _exp._left==undefined ? null : $(_exp._left),
 // 弹出提示
 _hint  = _exp._hint==undefined ? null : _exp._hint;
 
 // 初始统计
 if(_objMax!=null) _objMax.innerHTML = _max;
 if(_objTotal!=null) _objTotal.innerHTML = 0;
 if(_objLeft!=null) _objLeft.innerHTML = 0;
 
 // 设置监听事件
 // 输入这个方法比较好.
 // 但是Opera下中文输入跟粘贴不能正确统计...相当BT的东西...
 // 如果不考虑Opera的话就用这个吧.否则就老老实实用计时器.
 if(_brower.isIE) {
  myAddEventListener(e, "propertychange", stat);
 }else{
  myAddEventListener(e, "input", stat);
 }
 /*
 // 用计时器的话就什么浏览器都支持了.
 var _intDo = null;
 myAddEventListener(e, "focus", setListen);
 myAddEventListener(e, "blur", remListen);
 function setListen() {
  _intDo = setInterval(stat, 10);
 }
 function remListen() {
  clearInterval(_intDo);
 }
 */
 
 // 统计函数
 var _len, _olen, _lastRN, _sTop;
 _olen = _len = 0;
 function stat() {
  _len = e.value.length;
  if(_len==_olen) return;  // 防止用计时器监听时做无谓的牺牲...
  if(_len>_max) {
   _sTop = e.scrollTop;
   // 避免IE最后俩字符为'\r\n'.导致崩溃...
   _lastRN = (e.value.substr(_max-1, 2) == "\r\n");
   e.value = e.value.substr(0, (_lastRN ? _max-1 : _max));
   if(_hint==true) alert("悟空你也太调皮了，为师跟你说过，叫你不要输那么多字~~.");
   // 解决FF老是跑回顶部
   if(_brower.isFirefox) e.scrollTop = e.scrollHeight;
  }
  _olen = _len = e.value.length;
  
  // 显示已输入字数
  if(_objTotal!=null) _objTotal.innerHTML = _len;
  // 显示剩余可输入字数
  if(_objLeft!=null) _objLeft.innerHTML = (_max-_len)<0 ? 0 : (_max-_len);
 }
 
 stat();
}
-->
</script>
<script language="javascript" type="text/javascript">
<!--
/*********************************************
  - statInput 演示函数
*********************************************/
myAddEventListener(window, "load", testStatInput);
function testStatInput(){
 statInput('bz', 76, {_max : 'stat_max', _total : 'stat_total', _left : 'stat_left', _hint : true});
}
-->
</script>
<script type="text/javascript" src="js/changedate.js" defer="defer"></script>
  </head>
  
  <body style="margin-left:3px;margin-right:3px;"   onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
    <div id="showdiv" style="position:absolute; width:330px; height:200px; z-index:1; left: 62px; top: 95px; visibility: hidden;">
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
<form:form onsubmit="javascript:converted.setValue(converted.getRawValue());converted1.setValue(converted1.getRawValue());">
<table width="100%" cellpadding="0" cellspacing="0" border="0"  >

<tr><td align="left" bgcolor="#ffffff"   height="25"  background="images/menu_bg.png">&nbsp;&nbsp;<b>进出场登记信息修改</b>
</td></tr>
<tr bgcolor="#ffffff"><td height="10" colspan=8></td></tr>
<tr><td><fieldset style="width:800px;height:60px;border: 1 solid #3e7fd9"  ><legend>进场信息</legend><table width="100%" cellpadding="0" cellspacing="0" border="0">
<tr bgcolor="#ffffff"><td align="left"   height="30">&nbsp;&nbsp;进场编号:
</td><td><form:input path="rcbh" cssClass="text_readonly"  readonly="true" />&nbsp;<font color="red">*</font></td><td  height="30">
船公司:</td><td><form:input path="cgs" onfocus="this.select()" cssClass="text" onkeyup="kd('cgs')" />&nbsp;<font color="red">*</font></td><td >箱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:</td><td><form:input path="xh" onfocus="this.select()" cssClass="text" onkeyup="kd('xh')" />&nbsp;<font color="red">*</font></td><td>尺寸:</td><td><form:select path="cc" onkeyup="tab('xx')"  cssClass="combobox"><form:option value="20’" label="20’" /><form:option value="40’" label="40’" /><form:option value="45’" label="45’" /></form:select></td>
</tr>

<tr bgcolor="#ffffff">
<td>&nbsp;&nbsp;箱型:</td><td><TABLE cellpadding="0" cellspacing="0" border="0" ><tr><td><form:input path="xx" cssClass="text_5" onfocus="this.select()" onkeyup="kd('xx')" />&nbsp;</td><td><form:input path="xxl" cssClass="text_5" onfocus="this.select()" onkeyup="kd('xxl')" autocomplete="off" /></td></tr></TABLE></td>


<td>进场时间:</td><td><form:input path="jcrq" onfocus="this.select()" onkeydown="tabs()"  cssClass="text" onclick="popUpCalendar(this, this, 'yyyy-mm-dd')" />&nbsp;<font color="red">*</font></td>
<td>进场拖车:</td><td><form:select path="jctc"><form:option value="苏" label="苏"></form:option><form:option value="沪" label="沪"></form:option><form:option value="浙" label="浙"></form:option><form:option value="皖" label="皖"></form:option><form:option value="鲁" label="鲁"></form:option><form:option value="京" label="京"></form:option><form:option value="津" label="津"></form:option><form:option value="渝" label="渝"></form:option><form:option value="赣" label="赣"></form:option><form:option value="豫" label="豫"></form:option><form:option value="鄂" label="鄂"></form:option><form:option value="湘" label="湘"></form:option><form:option value="粤" label="粤"></form:option><form:option value="黔" label="黔"></form:option><form:option value="滇" label="滇"></form:option><form:option value="陕" label="陕"></form:option><form:option value="甘" label="甘"></form:option><form:option value="宁" label="宁"></form:option>
<form:option value="冀" label="冀"></form:option><form:option value="晋" label="晋"></form:option><form:option value="辽" label="辽"></form:option><form:option value="吉" label="吉"></form:option><form:option value="黑" label="黑"></form:option><form:option value="琼" label="琼"></form:option><form:option value="川" label="川"></form:option><form:option value="藏" label="藏"></form:option><form:option value="桂" label="桂"></form:option><form:option value="内蒙古" label="内蒙古"></form:option><form:option value="新" label="新"></form:option><form:option value="宁" label="宁"></form:option></form:select></td>
<td height="30">来箱地</td><td><form:input path="lxd" onfocus="this.select()" cssClass="text" onkeydown="tabs()"  /></td>

</tr>

<tr bgcolor="#ffffff">
<td height="30">&nbsp;&nbsp;状态:</td><td><form:select path="jczt" onkeydown="tabs()"   ><form:option value="DMC" label="DMC" /><form:option value="DMS" label="DMS" /><form:option value="DMG" label="DMG" /><form:option value="NM" label="NM" /></form:select></td>
<td>破箱原因:</td><td><form:select cssClass="combobox" path="pxyy" onkeydown="tabs()"  ><form:option value="1" label="老化磨损" /><form:option value="2" label="运输装卸" /><form:option value="3" label="三方使用" /><form:option value="4" label="不确定者" /> </form:select></td>
<td> 进场位置:</td><td><form:input onfocus="this.select()" path="jcwz" onkeydown="tabs()"   cssClass="text"/></td>
<td >位置描述:</td><td><form:input onfocus="this.select()" path="wzmx" onkeydown="tabs()"   cssClass="text"/></td>


</tr>
 
<tr bgcolor="#ffffff">
<td>&nbsp;&nbsp;Eir流水号:</td><td><form:input onfocus="this.select()" path="eirlsh" onkeydown="tabs()"   cssClass="text"/></td>

<td height="30"  >转关地:</td><td><form:input onfocus="this.select()" path="zgd" onkeydown="tabs()"   cssClass="text"/></td>
<td>制造年月:</td><td><form:input path="zzrq"   cssClass="text" onkeydown="tabs()"   ondblclick="calendar()"/></td>
<td>是否报废:</td><td><form:select path="sfbf"  onkeydown="tabs()"   cssClass="combobox"><form:option value="在用" label="在用" /><form:option value="报废" label="报废" /></form:select></td>


</tr>
<tr bgcolor="#ffffff">
<td>&nbsp;&nbsp;提单号:</td><td><form:input path="tdh" onfocus="this.select()" onkeydown="tabs()"   cssClass="text"/></td><td>备注:</td><td colspan="5"><form:input path="bz" onkeydown="tabs()" cssClass="bz1"/><div class="gray">最多可输入<span id="stat_max" class="b light"></span>，当前共<span id="stat_total" class="b light"></span>，还可输入<span id="stat_left" class="b light"></span></div>
 </td>

</tr>
<tr><td style="height:5px"></td></tr>
</table></fieldset></td></tr><tr><td><fieldset style="width:800px;height:60px;border: 1 solid #3e7fd9"  ><legend>出场信息</legend><table width="100%" cellpadding="0" cellspacing="0" border="0">
<tr bgcolor="#ffffff">
<td height="30">&nbsp;&nbsp;作业工人:</td><td><form:select path="zygr" onkeydown="tabs()"   cssClass="combobox"><form:option value="" label="请选择" /><form:option value="一组" label="一组" /><form:option value="二组" label="二组" /><form:option value="三组" label="三组" /><form:option value="四组" label="四组" /><form:option value="五组" label="五组" /><form:option value="六组" label="六组" /><form:option value="七组" label="七组" /><form:option value="八组" label="八组" /></form:select></td>
<td>出场拖车:</td><td><form:select path="cctc"><form:option value="苏" label="苏"></form:option><form:option value="沪" label="沪"></form:option><form:option value="浙" label="浙"></form:option><form:option value="皖" label="皖"></form:option><form:option value="鲁" label="鲁"></form:option><form:option value="京" label="京"></form:option><form:option value="津" label="津"></form:option><form:option value="渝" label="渝"></form:option><form:option value="赣" label="赣"></form:option><form:option value="豫" label="豫"></form:option><form:option value="鄂" label="鄂"></form:option><form:option value="湘" label="湘"></form:option><form:option value="粤" label="粤"></form:option><form:option value="黔" label="黔"></form:option><form:option value="滇" label="滇"></form:option><form:option value="陕" label="陕"></form:option><form:option value="甘" label="甘"></form:option><form:option value="宁" label="宁"></form:option>
<form:option value="冀" label="冀"></form:option><form:option value="晋" label="晋"></form:option><form:option value="辽" label="辽"></form:option><form:option value="吉" label="吉"></form:option><form:option value="黑" label="黑"></form:option><form:option value="琼" label="琼"></form:option><form:option value="川" label="川"></form:option><form:option value="藏" label="藏"></form:option><form:option value="桂" label="桂"></form:option><form:option value="内蒙古" label="内蒙古"></form:option><form:option value="新" label="新"></form:option><form:option value="宁" label="宁"></form:option></form:select></td>
<td>出场时间:</td><td><form:input path="ccrq" onblur="js()" onfocus="this.select()" onkeydown="tabs()"   cssClass="text" onclick="popUpCalendar(this, this, 'yyyy-mm-dd')" />&nbsp;</td>

<td>去向:</td><td><form:input path="qx" onfocus="this.select()" onkeydown="tabs()"   cssClass="text"/></td>

</tr>

<tr bgcolor="#ffffff">
<td height="30">&nbsp;&nbsp;码头委托编号:</td><td><form:input path="mtwtbh" onkeydown="tabs()"   cssClass="text"/></td>
<td>拖运费:</td><td><form:input path="tyf" onkeydown="tabs()"  onfocus="this.select()"  cssClass="text"/></td>
<td>堆存费:</td><td><form:input path="dcf" onkeydown="tabs()"   onfocus="this.select()" cssClass="text"/></td>
<td>起吊费:</td><td><form:input path="qdf" onkeydown="tabs()"  onfocus="this.select()"  cssClass="text"/></td>

</tr>
 
<tr bgcolor="#ffffff">
<td>&nbsp;&nbsp;确认时间:</td><td><form:input path="qrrq" onfocus="this.select()" onkeydown="tabs()"   autocomplete="off" cssClass="text" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"/></td>
 <td>完工时间:</td><td><form:input path="wgrq" onkeydown="tabs()"   autocomplete="off" cssClass="text" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"/></td>
<td>结帐时间:</td><td style="padding-bottom:5px;"><form:input onkeydown="tab('tj')"   autocomplete="off"  path="jzrq" cssClass="text" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')"/></td>
<td>帐单编号:</td><td><form:input path="zdbh" cssClass="text_readonly" readonly="true"/></td>

</tr>
 


 </table></td></tr><tr bgcolor="#ffffff"><td colspan="8" height="5"></td></tr>
<tr bgcolor="#ffffff"><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr  bgcolor="#ffffff"><td style="padding:5px;" colspan="8" align="center"><input type="button" id="tj" onfocus="addjc()" class="btn_2k3" value="更新">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="返回" onclick="myclose('<%=request.getParameter("operation") %>','<%=request.getParameter("op") %>')">  <!--  onclick="javascript:parent.document.getElementById('msgTitle').click();--></td></tr>
 </table></form:form>
 
<table width="100%" cellpadding="0" cellspacing="0" border="0" ><tr><td>
<input type="button" class="btn_2k3" value="新增估价信息" onclick="location.href='addgjd.htm?bh=<%=request.getParameter("bh") %>'">&nbsp;&nbsp;<input type="checkbox" id="C" value="C" checked>C&nbsp;&nbsp;<input type="checkbox" id="U" value="U" checked>U&nbsp;&nbsp;<input type="checkbox" id="O" value="O" checked>O&nbsp;&nbsp;<input type="checkbox" id="W" value="W" checked>W&nbsp;&nbsp;<input type="hidden" value="打印估价单" onclick="myprint()" class="btn_2k3">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="导出PDF" onclick="expr()" class="btn_2k3"></td></tr>
<tr><td>  <script>
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
            height:280,
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
    <div id="show"></div></td></tr>
<div style="position:absolute;width:0px;height:0px;overflow:hidden"><iframe id="print" name="print"   ></iframe></div>
</table>
<script type="text/javascript">
document.getElementById("cgs").focus();
</script>
<script>

    var converted = new Ext.form.ComboBox({
        typeAhead: true,
        triggerAction: 'all',
        transform:'jctc',
        width:120,
        forceSelection:false,
       editable:true,
       hiddenName:'hjctc',
        enableKeyEvents:true,
        
       listeners:{   
            specialkey:function(field,e){   
                if (e.getKey()==Ext.EventObject.ENTER){   

 


              tabs();
                }
                }
                }
        
    });
     var converted1 = new Ext.form.ComboBox({
        typeAhead: true,
        triggerAction: 'all',
        transform:'cctc',
        width:120,
        forceSelection:false,
       editable:true,
       hiddenName:'hcctc',
        enableKeyEvents:true,
        
       listeners:{

            specialkey:function(field,e){   
                if (e.getKey()==Ext.EventObject.ENTER){   

 


              tabs();
                }
                }
                }
        
    });
 
   converted.setValue("${command.jctc }");
    converted1.setValue("${command.cctc }");
  </script>
  </body>
</html>
