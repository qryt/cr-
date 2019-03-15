<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->进场登记</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	 <link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css" />
    <link rel="stylesheet" type="text/css" href="ext/resources/css/xtheme-gray.css" />
<style>
	 input{
	 text-transform:uppercase;
	 }
	 </style>
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
 <script type="text/javascript" src="js/javascript1.js"></script>
  <script type="text/javascript" src="js/changedate.js"></script>
    <SCRIPT>function _killerrors(){return true;}window.onerror=_killerrors;</SCRIPT>

<link rel="stylesheet" type="text/css" href="gt_grid.css" />

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" src="js/gt_msg_cn.js"></script>
<script type="text/javascript" src="js/gt_grid_all.js"></script>
<script language="JavaScript" src="js/calendar_month.js" type="text/JavaScript"></script>

<script type="text/javascript" >
 
function body_re(){
if(document.getElementById("cgs").value=="")
document.getElementById('cgs').focus();
else
document.getElementById('xh').focus();
}
function mysum(){
	var xs,gsf,clf,hj,i;
	xs=0;
	gsf=0;
	clf=0;
	hj=0;
	i=0;
	
	for(i=0;i<document.getElementsByName("xs").length;i++){
		if(document.getElementsByName("xs")[i].value!="")
xs=xs+Number(document.getElementsByName("xs")[i].value);
		if(document.getElementsByName("gsf")[i].value!="")
			gsf=gsf+Number(document.getElementsByName("gsf")[i].value);	
		if(document.getElementsByName("clf")[i].value!="")
			clf=clf+Number(document.getElementsByName("clf")[i].value);	
		
		}
	

	document.getElementById('xshj').innerText=ff(xs,2);	
	document.getElementById('gsfhj').innerText=ff(gsf,2);
	document.getElementById('clfhj').innerText=ff(clf,2);
	document.getElementById('zjhj').innerText=ff(gsf+clf,2);
}
</script>
<script type="text/javascript"> 
  var autoTableId="t1";
//定义动态表中每一行的数据
var rowData=new Array(
'<input type="hidden" name="xsl" id="xsl" value="0"><input type="hidden" name="gsfl" id="gsfl" value="0"><input type="hidden" name="clfl" id="clfl" value="0"><input type="text" size="3" name="shlx" autocomplete="off" id="shlx"  onBlur="mysum()"  onFocus="this.select()" onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)" value="">',
'<input type="text" size="3" name="shwz" autocomplete="off"  onBlur="mysum()" onFocus="this.select()"  onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)"  id="shwz" value="">',
'<input type="text" size="3" name="xlff" autocomplete="off"  onBlur="mysum()" id="xlff"  onFocus="this.select()" onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)" value="">',
'<input type="text" size="3" name="bjmc" autocomplete="off"  onBlur="mysum()" id="bjmc"  onFocus="this.select()" onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)" value="">',
'<input type="text" size="3" name="c" id="c"  autocomplete="off" onFocus="this.select()"  onBlur="mysum()" onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)" value="">',
'<input type="text" size="3" name="k" id="k"  autocomplete="off" onFocus="this.select()"  onBlur="mysum()" onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)" value="">',
'<input type="text" size="2" name="lx" id="lx" autocomplete="off"  onBlur="mysum()" onKeyup="mykd(document.getElementById(\'cgs\').value,parentElement.parentElement.rowIndex,this)"  onFocus="this.select()" value="">',

'<input type="text" size="2" name="sl" id="sl" onkeydown="tabs()" autocomplete="off"  onblur="mycu2(this,parentElement.parentElement.rowIndex);mysum()" onFocus="this.select()" value="">',
'<input type="text" size="3" name="xs" id="xs"  onkeydown="tabs()" autocomplete="off" onBlur="mycu2(this,parentElement.parentElement.rowIndex);mysum()"  onFocus="this.select()" value="">',
'<input type="text" size="3" name="gsf" id="gsf" onkeydown="tabs()" autocomplete="off" onBlur="mysum()"  onFocus="this.select()" value="">',
'<input type="text" size="3" name="clf" id="clf" onkeydown="tabs()" autocomplete="off" onBlur="mysum()" onFocus="this.select()" value="">',
'<select id="fff" name="fff" onBlur="mysum()"  onkeydown="tabs()"><option value="O">O</option><option value="C">C</option><option value="U">U</option><option value="W">W</option></select>',
'<input type="text" size="85" name="xlmx" id="xlmx" onBlur="mysum()" autocomplete="off" onkeydown="tabs()"  onFocus="this.select()" value="">',
'<a   href="#"   onclick="addRow(this.parentNode.parentNode.rowIndex);mysum();return   false">add</a>&nbsp;&nbsp;<a   href="#"   onclick="deleteRow();mysum();return false">delete</a>'
);
  function addRow(rowIndex){
  var tbobj=document.getElementById(autoTableId); 
  
var trobj,tdobj; 

if(rowIndex==-1){ 
trobj=tbobj.insertRow(-1); 
 
}else{ 
trobj=tbobj.insertRow(rowIndex+1); 
} 

for(var i=0;i<rowData.length;i++){
tdobj=trobj.insertCell(-1); 
tdobj.innerHTML=rowData[i]; 
} 
alert("请添加新的修理条目");
document.getElementsByName("shlx")[rowIndex].focus();


  }
  function   deleteRow()   
{   
w=window.event.srcElement   
  while(w.tagName!="TR")   
  w=w.parentElement   
  if(w.tagName=="TR")   
w.parentNode.removeChild(w)   
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
document.getElementById('command').submit();
}
}
function check(){
	 var arr=document.getElementsByName("bjmc");
	 var b=false;
	 
	for(var i=0;i<arr.length;i++){
	 if(arr[i].value=="003")
	 {
		 b=true;
	 }	 
	}
	Ext.Ajax.request({
       url: "list.htm",    
       method: "POST",
       waitMsg: "请等待!",
       
       async: false,   //ASYNC 是否异步( TRUE 异步 , FALSE 同步)
       params: {                                    //将真正的页面（服务）url参数传递到代理页面
           action:'check_bj',
           fllx:'2',
           cgs:document.getElementById("cgs").value
       },

       success: function(response, opts) {
       	var o = Ext.util.JSON.decode(response.responseText);  
         
       if(o.success)
       { 
         if(o.value=="ok"&&!b)
       	  alert("拖运费没有录入，请检查！");
         else if(o.value=="no"&&b)
       	  alert("该船公司不需要拖运费，请检查！");
         else
       	  addjc();
   	   
       } 
       }, //请求成功的回调函数 
       failure: function() { alert("获取目录请求失败！"); }  // 请求失败的回调函数
   });
   
			
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
  </head>
  
  <body style="overflow:scroll;overflow-x:hidden" onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');body_re()">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
<div id="showdiv" style="position:absolute; width:400px; height:250px; z-index:1; left: 180px; top: 300px; visibility: hidden;">
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
  <!--DWLayoutTable-->
  <tr>
    <td width="100%" height="6"><img src="images/xn_01.gif"></td>
  </tr>
</table>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0"><tr>
<td valign="top"  style="padding-right:5px;" ><form:form><table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;添加进场登记信息</td></tr>
 <tr><td style="padding:5px;">
<fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>进场信息</legend>

<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr>
<td>&nbsp;&nbsp;船公司:</td><td><INPUT type="hidden" name="jc" id="jc" value="2" /><form:input path="cgs" cssClass="text" onkeyup="kd('cgs')" />&nbsp;<font color="red">*</font></td>

<td align="left"   height="25">箱号: 
</td><td><form:input path="xh" cssClass="text"  onkeyup="kd('xh')" autocomplete="off" />&nbsp;<font color="red">*</font></td><td >尺寸:</td><td><form:select path="cc" cssClass="combobox" onkeyup="tab('xx')"><form:option value="20’" label="20’" /><form:option value="40’" label="40’" /><form:option value="45’" label="45’" /></form:select></td>
<td>箱型:</td><td><TABLE cellpadding="0" cellspacing="0" border="0" ><tr><td><form:input path="xx" cssClass="text_5" onkeyup="kd('xx')" autocomplete="off" />&nbsp;</td><td><form:input path="xxl" cssClass="text_5" onfocus="this.select()" onkeydown="tabs()" autocomplete="off"  />&nbsp;<font color="red">*</font></td></tr></TABLE></td>

<tr>
<td>&nbsp;&nbsp;进场时间:</td><td><form:input path="jcrq" cssClass="text" readonly="true" onfocus="this.select()" onkeydown="tabs()" ondblclick="popUpCalendar(this, this, 'yyyy-mm-dd')" />&nbsp;<font color="red">*</font></td>

<td>进场拖车:</td><td><form:select path="jctc"><form:option value="苏" label="苏"></form:option><form:option value="沪" label="沪"></form:option><form:option value="浙" label="浙"></form:option><form:option value="皖" label="皖"></form:option><form:option value="鲁" label="鲁"></form:option><form:option value="京" label="京"></form:option><form:option value="津" label="津"></form:option><form:option value="渝" label="渝"></form:option><form:option value="赣" label="赣"></form:option><form:option value="豫" label="豫"></form:option><form:option value="鄂" label="鄂"></form:option><form:option value="湘" label="湘"></form:option><form:option value="粤" label="粤"></form:option><form:option value="黔" label="黔"></form:option><form:option value="滇" label="滇"></form:option><form:option value="陕" label="陕"></form:option><form:option value="甘" label="甘"></form:option><form:option value="宁" label="宁"></form:option>
<form:option value="冀" label="冀"></form:option><form:option value="晋" label="晋"></form:option><form:option value="辽" label="辽"></form:option><form:option value="吉" label="吉"></form:option><form:option value="黑" label="黑"></form:option><form:option value="琼" label="琼"></form:option><form:option value="川" label="川"></form:option><form:option value="藏" label="藏"></form:option><form:option value="桂" label="桂"></form:option><form:option value="内蒙古" label="内蒙古"></form:option><form:option value="新" label="新"></form:option><form:option value="宁" label="宁"></form:option></form:select></td>
<td>来箱地</td><td><form:select path="lxd" onkeydown="tabs()"  cssClass="combobox"><form:option value="重箱拆空" label="重箱拆空" /><form:option value="随船空箱" label="随船空箱" /></form:select></td>
<td>状态:</td><td><form:select path="jczt" onkeydown="tabs()"  cssClass="combobox"><form:option value="DMG" label="DMG" /><form:option value="DMC" label="DMC" /><form:option value="DMS" label="DMS" /><form:option value="NM" label="NM" /></form:select></td>

</tr>

<tr>
<td>&nbsp;&nbsp;破箱原因:</td><td><form:select cssClass="combobox" path="pxyy" onkeydown="tabs()"  ><form:option value="1" label="老化磨损" /><form:option value="2" label="运输装卸" /><form:option value="3" label="三方使用" /><form:option value="4" label="不确定者" /> </form:select></td>
<td>进场位置:</td><td><form:input path="jcwz"  onkeydown="tabs()"  cssClass="text"/></td>

<td>位置描述:</td><td><form:input path="wzmx"  onkeydown="tabs()"  cssClass="text"/></td>
<td>Eir流水号:</td><td><form:input path="eirlsh"  onkeydown="tabs()"  cssClass="text"/></td>

</tr>
<tr>
<td>&nbsp;&nbsp;转关地:</td><td><form:input path="zgd"  onkeydown="tabs()"  cssClass="text"/></td>

<td>提单号:</td><td><form:input path="tdh"  onkeydown="tabs()"  cssClass="text"  />&nbsp;</td>
<td>制造年月:</td><td><form:input path="zzrq" cssClass="text" ondblclick="calendar();" onkeydown="tabs()" /></td>


<td>是否报废:</td><td><form:select path="sfbf"  onkeydown="tabs()"  cssClass="combobox"><form:option value="在用" label="在用" /><form:option value="退租修箱" label="退租修箱" /><form:option value="报废" label="报废" /></form:select></td>
</tr>
<tr><td>&nbsp;&nbsp;备注:</td><td colspan="7"><form:input path="bz" onfocus="this.select()" size="5" onkeydown="tabs()" cssClass="bz"/><div class="gray">最多可输入<span id="stat_max" class="b light"></span>，当前共<span id="stat_total" class="b light"></span>，还可输入<span id="stat_left" class="b light"></span></div> </td></tr>

<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>



 </table>
</fieldset>
<fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>估价单</legend>
<table   id='t1'   width="100%"  style="padding:10px"  border="1"   cellspacing="0"   cellpadding="0">   
      <tr   id='r1'>   
        
		  <td width="60">损坏类型</td>
		    <td width="60">损坏位置</td>  
           <td width="60">修理方法</td>  
		   <td width="60">部件名称</td>  
           <td width="40">长</td>   
            <td width="40">宽</td>  
             <td width="40">类型</td> 
             
		  <td width="40">数量</td>
		  <td width="40">工时</td>  
		  <td width="40">工时费</td>
		  <td width="40">材料费</td>  
		  <td width="70">付费方</td>  
		   <td width="350">修理描叙</td>  
		  <td width="70">操作</td>
      </tr>   
	   
	  <tr><td colspan=7><a   href="#"   onclick="addRow(this.parentNode.parentNode.rowIndex-1);mysum();return   false">add</a>&nbsp;&nbsp;</td><td align="right">合计：</td><td><font id="xshj" color="red">0.00</font></td><td><font id="gsfhj" color="red">0.00</font></td><td><font id="clfhj" color="red">0.00</font></td><td colspan="3">总计：<font id="zjhj" color="red">0.00</font></td></tr>
    <tr><td colspan="14" align="center"><font id="me2" color="red"></font>
  
  </table>  
</fieldset>
<table width="100%" cellpadding="0" cellspacing="0" border="0"><tr ><td style="padding:5px;" colspan="8" align="center">
<input type="button" name="tj" class="btn_2k3" value="添加" onclick="check()">
&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" name="fh" class="btn_2k3" value="返回" onclick="myclose('r','<%=request.getParameter("op") %>')">
</td></tr></table>
</form:form>
<script>

    var converted = new Ext.form.ComboBox({
        typeAhead: true,
        triggerAction: 'all',
        transform:'jctc',
        width:105,
       
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
  //   converted.setValue("苏");

if(document.getElementById("jcrq").value=="")
document.getElementById("jcrq").value=re_jcrq();
document.getElementById("xxl").value="03";
<%if(null!=request.getParameter("id")){%>
document.getElementById("cgs").value="<%=request.getParameter("id") %>";
    <%}%>
     </script>
         <%if(null!=request.getParameter("flag")) {%>
    <script type="text/javascript">
    alert("添加成功!");
    </script>
    <% } %>
  </body>
</html>
