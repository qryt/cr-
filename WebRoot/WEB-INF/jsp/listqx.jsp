<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>角色选择</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
.STYLE3 {font-size: 14px}
.sty2{
background: #FFEEDD;

border: 1px solid #D21033;
}
.sty1{
background: #FFFFFF;
height:20px;
text-align:center;
cursor:hand;
}
.title{
font-size:14px;
color:#3d4f7f;
}
.btn_2k3 {
 BORDER-RIGHT: #002D96 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #002D96 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#FFFFFF, EndColorStr=#9DBCEA); BORDER-LEFT: #002D96 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #002D96 1px solid
}
.kk{
background:lightgreen;
color:red;
height:20px;
text-align:center;
cursor:hand;
}
.kk1{
background:#ffffff;
color:#000000;
height:20px;
text-align:center;
cursor:hand;
}

-->
</style>
<STYLE type=text/css>
  BODY {MARGIN: 0px;
  }
  </style>
  <script type="text/javascript" src="js/jquery-1.2.6.js"></script>
<script type="text/javascript">
function setcolor(OBJID){
 
if(OBJID.className=="kk"){
OBJID.className="kk1";
}
else{
OBJID.className="kk";

}
}
 
$(document).ready(function() {

$("#qr").click(function(){
var str="";
for(i=0;i<$(".kk").length;i++)
{
str=str+$(".kk")[i].innerText+",";
}
parent.document.getElementById("qxfw").value=str;
parent.document.getElementById("showdiv").style.visibility="hidden";
})
})
 $(document).ready(function() {

$("#all_qr").click(function(){
var count=$(".kk1").length;
for(var j=0;j<count;j++)
{

if($(".kk1")[0].className=="kk1")
$(".kk1")[0].className="kk";
}
 
})
})
</script>
</head>
  
  <body >
 <table border="0"  cellspacing="1" cellpadding="0"  height="22" width="200" bgcolor="#0099ff">
 <tr  ><td  background="images/headerbg.gif"  class="title" align="center"><b>选择权限</b>&nbsp;<input type="button"  id="qr" name="qr" class="btn_2k3" value="确定">&nbsp;<input type="button"  id="all_qr" name="all_qr" class="btn_2k3" value="全选"></td></tr>
  
 </table>   
 
  <div style="height:253px;overflow-y:auto;margin:0px;padding:0px;">
  <table border="0"   cellspacing="1" cellpadding="0"   width="180" bgcolor="#0099ff">
	
     <c:forEach items="${role}" var="TJs">
      <tr onClick="setcolor(this)"   class="${TJs.color }"> 
            <td>${TJs.RCaption }</td>
       
          </tr>
     </c:forEach>
</table></div>
   
    
  

  </body>
</html>
