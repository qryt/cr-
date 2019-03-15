function isInteger(objID) {
var regu = /^[-]{0,1}[0-9]{1,}$/;
return regu.test(objID);
}
function isFloat1(objID) {
var regu = /^[0-9]+(.[0-9]{1})?$/;
return regu.test(objID);
}
 
/*$(document).ready(function(){
$(".main_menu_left").click(function() {
    if ($(this).hasClass("main_menu_left")) {
      $(".main_left").hide();
       if(document.getElementById("divme")!=null&&typeof(document.getElementById("divme"))!="undefined")
      
     document.getElementById("divme").style.width=988;  
   
     if(document.getElementById("nseergrid")!=null&&typeof(document.getElementById("nseergrid"))!="undefined")
     document.getElementById("nseergrid").style.width="988px";
      $(".main_menu_left").addClass("main_menu_right");
      $(".main_menu_left").removeClass("main_menu_left");
     
  }
  else{
      $(".main_left").show();
      if(document.getElementById("divme")!=null&&typeof(document.getElementById("divme"))!="undefined")
document.getElementById("divme").style.width=850;
  if(document.getElementById("nseergrid")!=null&&typeof(document.getElementById("nseergrid"))!="undefined")
 document.getElementById("nseergrid").style.width="850px";

      $(".main_menu_right").addClass("main_menu_left");
      $(".main_menu_right").removeClass("main_menu_right");
   
  } 
  })
  $(".tab").eq(0).click(function(){
	  if (document.readyState=="complete") 
 document.getElementById("t1").src= "adddcfl.htm?bh="+Ext.get("mybh").getValue();
  })
   $(".tab").eq(1).click(function(){
	  if (document.readyState=="complete") 
 document.getElementById("t2").src= "addxlfl.htm?bh="+Ext.get("mybh").getValue();
  })
    $(".tab").eq(2).click(function(){
	  if (document.readyState=="complete") 
 document.getElementById("t3").src= "addxlfl2.htm?bh="+Ext.get("mybh").getValue();
  })
 
  });*/
$(document).ready(function(){
	if(null!=$(".tab")){
$(".tab").eq(0).click(function(){
	  if (document.readyState=="complete") 
 document.getElementById("t1").src= "adddcfl.htm?bh="+Ext.get("mybh").getValue();
  })
   $(".tab").eq(1).click(function(){
	  if (document.readyState=="complete") 
 document.getElementById("t2").src= "addxlfl.htm?bh="+Ext.get("mybh").getValue();
  })
    $(".tab").eq(2).click(function(){
	  if (document.readyState=="complete") 
 document.getElementById("t3").src= "addxlfl2.htm?bh="+Ext.get("mybh").getValue();
  })
	}});

  function delArt(id){
  if(window.confirm("确认要删除吗？")){
  window.location.href="listArt.htm?id="+id+"&action=delArt";
  }
  }
function da(){
var objDate=new Date();//创建一个日期对象表示当前时间
var year=objDate.getFullYear();
var month=objDate.getMonth()+1;    //getMonth返回的月份是从0开始的，因此要加1
var date=objDate.getDate();
var day=objDate.getDay();
var time=objDate.getTime();
var hours=objDate.getHours()
var minutes=objDate.getMinutes()
var seconds=objDate.getSeconds()

if(minutes<=9)
minutes="0"+minutes
if(seconds<=9)
seconds="0"+seconds

document.getElementById("aa").innerHTML=year+'年'+month+'月'+date+'日'+' 星期'+'日一二三四五六'.charAt(new Date().getDay())+' '+hours+':'+minutes+':'+seconds;
 }
function da1(){
setInterval("da()",1000);
}
function re_jcrq(){
     var od=new Date();//创建一个日期对象表示当前时间
var year=od.getFullYear();
var month=od.getMonth()+1;    //getMonth返回的月份是从0开始的，因此要加1
var date=od.getDate();
var day=od.getDay();

var hours=od.getHours();
var minutes=od.getMinutes();
if(minutes<=9)
minutes="0"+minutes;
 return year+"-"+month+"-"+date+" "+hours+":"+minutes;
}
function deljcdj(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){

winModal("list.htm?bh="+bh+"&action=deljcsuccess","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delgjd(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
    Ext.Ajax.request
    ({
        url: 'list.htm?bh='+bh+'&action=delgjd',
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
                window.location.reload(); 
            }
            else 
            {
                alert("删除失败！");
            }
        },
        failure:function(){alert("删除出现异常，可以查看日志了解详细信息！");}   
    });  
}
}
function delgjd2(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
	  Ext.Ajax.request
	    ({
	        url: 'list.htm?bh='+bh+'&action=delgjd2',
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
	                window.location.reload(); 
	            }
	            else 
	            {
	                alert("删除失败！");
	            }
	        },
	        failure:function(){alert("删除出现异常，可以查看日志了解详细信息！");}   
	    });  
window.location.reload();
}
}
function delxx(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delxx","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}

function delxxl(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delxxl","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delyh(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delyh","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delwzdm(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delwzdm","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delcgs(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delcgs","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function deldcfl(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=deldcfl","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delxlfl(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delxlfl","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delxlfl2(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delxlfl2","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function clone(bh,flag){
if(window.confirm("确实要克隆本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=clonecgs","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delrole(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delrole","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function delshlx(bh,flag){
if(window.confirm("确实要删除本条记录吗？")){
winModal("list.htm?bh="+bh+"&action=delshlxsuccess","删除信息");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function hy(bh,flag){
if(window.confirm("确实还原初始化密码为000吗？")){
winModal("list.htm?bh="+bh+"&action=hy","还原密码");
if(flag=="s")
document.getElementById("form1").submit();
else if(flag=="r")
window.location.reload();
}
}
function myclose(flag,op){

if(op=="n")
window.close();
else{
if(flag=="s")
	//window.opener.document.location.reload();
	window.opener.Ext.getCmp("MenuGridPanel").store.reload();
else if(flag=="r")
window.opener.document.location.reload();
	//window.opener.Ext.getCmp("MenuGridPanel").store.reload();
window.close();
}
}
function winModal(url,title){
window.showModalDialog(url,title,"dialogwidth:300px;dialogheight:150px;center:yes;status:no;scroll:no;help:no");
}
 function sAlert(url){ 
   var msgw,msgh,bordercolor; 
   msgw=500;//提示窗口的宽度 
   msgh=400;//提示窗口的高度 
   titleheight=25 //提示窗口标题高度 
   bordercolor="#336699";//提示窗口的边框颜色 
   titlecolor="#99CCFF";//提示窗口的标题颜色 
    
   var sWidth,sHeight; 
   sWidth=document.body.offsetWidth; 
   sHeight=screen.height; 
   var bgObj=document.createElement("div"); 
   bgObj.setAttribute('id','bgDiv'); 
   bgObj.style.position="absolute"; 
   bgObj.style.top="0"; 
   bgObj.style.background="#777"; 
   bgObj.style.filter="progid:DXImageTransform.Microsoft.Alpha(style=3,opacity=25,finishOpacity=75"; 
   bgObj.style.opacity="0.6"; 
   bgObj.style.left="0"; 
   bgObj.style.width=sWidth + "px"; 
   bgObj.style.height=sHeight + "px"; 
   bgObj.style.zIndex = "10000"; 
   document.body.appendChild(bgObj); 
    
   var msgObj=document.createElement("div") 
   msgObj.setAttribute("id","msgDiv"); 
   msgObj.setAttribute("align","center"); 
   msgObj.style.background="white"; 
   msgObj.style.border="1px solid " + bordercolor; 
      msgObj.style.position = "absolute"; 
            msgObj.style.left = "350px"; 
            msgObj.style.top = "100px"; 
            msgObj.style.font="12px/1.6em Verdana, Geneva, Arial, Helvetica, sans-serif"; 
            msgObj.style.marginLeft = "-225px" ; 
            msgObj.style.marginTop = -75+document.documentElement.scrollTop+"px"; 
            msgObj.style.width = msgw + "px"; 
            msgObj.style.height =msgh + "px"; 
            msgObj.style.textAlign = "center"; 
            msgObj.style.lineHeight ="25px"; 
            msgObj.style.zIndex = "10001"; 
    
     var title=document.createElement("h4"); 
     title.setAttribute("id","msgTitle"); 
     title.setAttribute("align","right"); 
     title.style.margin="0"; 
     title.style.padding="3px"; 
     title.style.background=bordercolor; 
     title.style.filter="progid:DXImageTransform.Microsoft.Alpha(startX=20, startY=20, finishX=100, finishY=100,style=1,opacity=75,finishOpacity=100);"; 
     title.style.opacity="0.75"; 
     title.style.border="1px solid " + bordercolor; 
     title.style.height="18px"; 
     title.style.font="12px Verdana, Geneva, Arial, Helvetica, sans-serif"; 
     title.style.color="white"; 
     title.style.cursor="pointer"; 
     title.innerHTML="关闭"; 
     title.onclick=function(){ 
          document.body.removeChild(bgObj); 
                document.getElementById("msgDiv").removeChild(title); 
                document.body.removeChild(msgObj); 
                } 
     document.body.appendChild(msgObj); 
     document.getElementById("msgDiv").appendChild(title); 
     var txt=document.createElement("mydiv"); 
     txt.style.margin="1em 0" 
     txt.setAttribute("id","msgTxt"); 
     txt.innerHTML="<iframe src='"+url+"' width='100%' height='100%'></iframe>"; 
           document.getElementById("msgDiv").appendChild(txt); 
            } 
 //模拟google          
/*var line = 0;
       
        function del(){
            if($("#newDiv")){
                $("#newDiv").remove();
                line = -1;
            }
        }
   
        $(document).ready(function(){
            //文本框失去焦点时层消失
            $(document.body).click(function(){
                del();
            });
         
            $("#xh").keydown(function(){
                // 38 上  40下 13 回车
                if($("#newDiv")){
				
                    if(event.keyCode == 40){
                
					line = (line == $("table tbody tr").length ? 0 : line + 1);
					
                        $("table tbody tr").eq(line)
                            .css("backgroundColor", "blue")
                            .css("color", "white");//若按向下键，第一行背景为绿，字体为白
                        $("table tbody tr").eq(line < 0 ? 0 : line - 1)//若按向下键，若line小于0，第一行背景为白，字体为黑，若不小于0，其上一行背景为白，字体为黑。
                            .css("backgroundColor", "white")
                            .css("color", "black");
                        //若按向下键，若line==总长度，则line=0;否则，line=line+1;
                    }else if(event.keyCode == 38){
                        line = (line == -1 ? $("table tbody tr").length-1: line - 1);//若向上键，若line==0,line=总长度，否则line=line-1;
                        $("table tbody tr").eq(line)
                            .css("backgroundColor", "blue")
                            .css("color", "white");   
							         //line行背景为蓝，字体为白。
                        $("table tbody tr").eq(line > $("table tbody tr").length-2 ? 0 : line + 1)
                            .css("backgroundColor", "white")
                            .css("color", "black");
                    }else if(event.keyCode == 13){
                        $("#xh").val($("table tbody tr").eq(line).find("td").eq(0).html());
                        del();
                    }
                    return false;
                }   
            });
       
            $("#xh").bind("propertychange", function(){
                del();
           
                var top = $("#xh").offset().top;
                var left = $("#xh").offset().left;
                var newDiv = $("<div/>").width($("#xh").width() + 6)
                    .css("position", "absolute")
                    .css("backgroundColor", "white")
                    .css("left", left-2)
                    .css("top", top + $("#xh").height() + 5)
                    .css("border", "1px solid #7f9db9")
                    .attr("id", "newDiv");
                   
                var table = $("<table width='100%' bgcolor='b3d1fb'/>")
                    .attr("cellpadding", "0")
                    .attr("cellspacing", "1");
                 
                $.post("servlet/ShowXh?id="+$("#xh").val()+"&a"+Math.round(Math.random()*10000), {key: $("#xh").val()}, function(xml){
                    $(xml).find("results > result").each(function(){
                        var xh = $(this).attr("xh");
                        var cgs = $(this).attr("cgs");
                 
                        var tr = $("<tr/>").css("cursor", "pointer").mouseout(function(){
                            $(this).css("backgroundColor", "white").css("color", "black");
                        }).mouseover(function(){
                            $(this).css("backgroundColor", "blue").css("color", "white");
                        }).click(function(){
                            $("#xh").val($(this).find("td").eq(0).html());
                           
                            del();
                        });
                        var td1 = $("<td/>").html(xh).css("fontSize", "12px")
                            .css("margin", "5 5 5 5");
                        var td2 = $("<td/>").html(cgs)
                            .attr("align", "right").css("fontSize", "12px")
                            .css("color", "green").css("margin", "5 5 5 5");
                       
                        tr.append(td1).append(td2);
                        table.append(tr);
                        newDiv.append(table);
                    });
                });
               
                $(document.body).append(newDiv);
               
                if($("#xh").val() == ""){
                    $("#newDiv").remove();
                }               
            });
        });*/
//过滤层
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
function MM_showHideLayers() { //v6.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) if ((obj=MM_findObj(args[i]))!=null) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
    //if(v=='hidden')document.getElementById('fid').src='about:blank';
    obj.visibility=v; }
}
function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_dragLayer(objName,x,hL,hT,hW,hH,toFront,dropBack,cU,cD,cL,cR,targL,targT,tol,dropJS,et,dragJS) { //v4.01
  //Copyright 1998 Macromedia, Inc. All rights reserved.
  var i,j,aLayer,retVal,curDrag=null,curLeft,curTop,IE=document.all,NS4=document.layers;
  var NS6=(!IE&&document.getElementById), NS=(NS4||NS6); if (!IE && !NS) return false;
  retVal = true; if(IE && event) event.returnValue = true;
  if (MM_dragLayer.arguments.length > 1) {
    curDrag = MM_findObj(objName); if (!curDrag) return false;
    if (!document.allLayers) { document.allLayers = new Array();
      with (document) if (NS4) { for (i=0; i<layers.length; i++) allLayers[i]=layers[i];
        for (i=0; i<allLayers.length; i++) if (allLayers[i].document && allLayers[i].document.layers)
          with (allLayers[i].document) for (j=0; j<layers.length; j++) allLayers[allLayers.length]=layers[j];
      } else {
        if (NS6) { var spns = getElementsByTagName("span"); var all = getElementsByTagName("div");
          for (i=0;i<spns.length;i++) if (spns[i].style&&spns[i].style.position) allLayers[allLayers.length]=spns[i];}
        for (i=0;i<all.length;i++) if (all[i].style&&all[i].style.position) allLayers[allLayers.length]=all[i];
    } }
    curDrag.MM_dragOk=true; curDrag.MM_targL=targL; curDrag.MM_targT=targT;
    curDrag.MM_tol=Math.pow(tol,2); curDrag.MM_hLeft=hL; curDrag.MM_hTop=hT;
    curDrag.MM_hWidth=hW; curDrag.MM_hHeight=hH; curDrag.MM_toFront=toFront;
    curDrag.MM_dropBack=dropBack; curDrag.MM_dropJS=dropJS;
    curDrag.MM_everyTime=et; curDrag.MM_dragJS=dragJS;
    curDrag.MM_oldZ = (NS4)?curDrag.zIndex:curDrag.style.zIndex;
    curLeft= (NS4)?curDrag.left:(NS6)?parseInt(curDrag.style.left):curDrag.style.pixelLeft;
    if (String(curLeft)=="NaN") curLeft=0; curDrag.MM_startL = curLeft;
    curTop = (NS4)?curDrag.top:(NS6)?parseInt(curDrag.style.top):curDrag.style.pixelTop;
    if (String(curTop)=="NaN") curTop=0; curDrag.MM_startT = curTop;
    curDrag.MM_bL=(cL<0)?null:curLeft-cL; curDrag.MM_bT=(cU<0)?null:curTop-cU;
    curDrag.MM_bR=(cR<0)?null:curLeft+cR; curDrag.MM_bB=(cD<0)?null:curTop+cD;
    curDrag.MM_LEFTRIGHT=0; curDrag.MM_UPDOWN=0; curDrag.MM_SNAPPED=false; //use in your JS!
    document.onmousedown = MM_dragLayer; document.onmouseup = MM_dragLayer;
    if (NS) document.captureEvents(Event.MOUSEDOWN|Event.MOUSEUP);
  } else {
    var theEvent = ((NS)?objName.type:event.type);
    if (theEvent == 'mousedown') {
      var mouseX = (NS)?objName.pageX : event.clientX + document.body.scrollLeft;
      var mouseY = (NS)?objName.pageY : event.clientY + document.body.scrollTop;
      var maxDragZ=null; document.MM_maxZ = 0;
      for (i=0; i<document.allLayers.length; i++) { aLayer = document.allLayers[i];
        var aLayerZ = (NS4)?aLayer.zIndex:parseInt(aLayer.style.zIndex);
        if (aLayerZ > document.MM_maxZ) document.MM_maxZ = aLayerZ;
        var isVisible = (((NS4)?aLayer.visibility:aLayer.style.visibility).indexOf('hid') == -1);
        if (aLayer.MM_dragOk != null && isVisible) with (aLayer) {
          var parentL=0; var parentT=0;
          if (NS6) { parentLayer = aLayer.parentNode;
            while (parentLayer != null && parentLayer.style.position) {
              parentL += parseInt(parentLayer.offsetLeft); parentT += parseInt(parentLayer.offsetTop);
              parentLayer = parentLayer.parentNode;
          } } else if (IE) { parentLayer = aLayer.parentElement;
            while (parentLayer != null && parentLayer.style.position) {
              parentL += parentLayer.offsetLeft; parentT += parentLayer.offsetTop;
              parentLayer = parentLayer.parentElement; } }
          var tmpX=mouseX-(((NS4)?pageX:((NS6)?parseInt(style.left):style.pixelLeft)+parentL)+MM_hLeft);
          var tmpY=mouseY-(((NS4)?pageY:((NS6)?parseInt(style.top):style.pixelTop) +parentT)+MM_hTop);
          if (String(tmpX)=="NaN") tmpX=0; if (String(tmpY)=="NaN") tmpY=0;
          var tmpW = MM_hWidth;  if (tmpW <= 0) tmpW += ((NS4)?clip.width :offsetWidth);
          var tmpH = MM_hHeight; if (tmpH <= 0) tmpH += ((NS4)?clip.height:offsetHeight);
          if ((0 <= tmpX && tmpX < tmpW && 0 <= tmpY && tmpY < tmpH) && (maxDragZ == null
              || maxDragZ <= aLayerZ)) { curDrag = aLayer; maxDragZ = aLayerZ; } } }
      if (curDrag) {
        document.onmousemove = MM_dragLayer; if (NS4) document.captureEvents(Event.MOUSEMOVE);
        curLeft = (NS4)?curDrag.left:(NS6)?parseInt(curDrag.style.left):curDrag.style.pixelLeft;
        curTop = (NS4)?curDrag.top:(NS6)?parseInt(curDrag.style.top):curDrag.style.pixelTop;
        if (String(curLeft)=="NaN") curLeft=0; if (String(curTop)=="NaN") curTop=0;
        MM_oldX = mouseX - curLeft; MM_oldY = mouseY - curTop;
        document.MM_curDrag = curDrag;  curDrag.MM_SNAPPED=false;
        if(curDrag.MM_toFront) {
          eval('curDrag.'+((NS4)?'':'style.')+'zIndex=document.MM_maxZ+1');
          if (!curDrag.MM_dropBack) document.MM_maxZ++; }
        retVal = false; if(!NS4&&!NS6) event.returnValue = false;
    } } else if (theEvent == 'mousemove') {
      if (document.MM_curDrag) with (document.MM_curDrag) {
        var mouseX = (NS)?objName.pageX : event.clientX + document.body.scrollLeft;
        var mouseY = (NS)?objName.pageY : event.clientY + document.body.scrollTop;
        newLeft = mouseX-MM_oldX; newTop  = mouseY-MM_oldY;
        if (MM_bL!=null) newLeft = Math.max(newLeft,MM_bL);
        if (MM_bR!=null) newLeft = Math.min(newLeft,MM_bR);
        if (MM_bT!=null) newTop  = Math.max(newTop ,MM_bT);
        if (MM_bB!=null) newTop  = Math.min(newTop ,MM_bB);
        MM_LEFTRIGHT = newLeft-MM_startL; MM_UPDOWN = newTop-MM_startT;
        if (NS4) {left = newLeft; top = newTop;}
        else if (NS6){style.left = newLeft; style.top = newTop;}
        else {style.pixelLeft = newLeft; style.pixelTop = newTop;}
        if (MM_dragJS) eval(MM_dragJS);
        retVal = false; if(!NS) event.returnValue = false;
    } } else if (theEvent == 'mouseup') {
      document.onmousemove = null;
      if (NS) document.releaseEvents(Event.MOUSEMOVE);
      if (NS) document.captureEvents(Event.MOUSEDOWN); //for mac NS
      if (document.MM_curDrag) with (document.MM_curDrag) {
        if (typeof MM_targL =='number' && typeof MM_targT == 'number' &&
            (Math.pow(MM_targL-((NS4)?left:(NS6)?parseInt(style.left):style.pixelLeft),2)+
             Math.pow(MM_targT-((NS4)?top:(NS6)?parseInt(style.top):style.pixelTop),2))<=MM_tol) {
          if (NS4) {left = MM_targL; top = MM_targT;}
          else if (NS6) {style.left = MM_targL; style.top = MM_targT;}
          else {style.pixelLeft = MM_targL; style.pixelTop = MM_targT;}
          MM_SNAPPED = true; MM_LEFTRIGHT = MM_startL-MM_targL; MM_UPDOWN = MM_startT-MM_targT; }
        if (MM_everyTime || MM_SNAPPED) eval(MM_dropJS);
        if(MM_dropBack) {if (NS4) zIndex = MM_oldZ; else style.zIndex = MM_oldZ;}
        retVal = false; if(!NS) event.returnValue = false; }
      document.MM_curDrag = null;
    }
    if (NS) document.routeEvent(objName);
  } return retVal;
}
//键盘事件
var i=1;
var bvv=false;
var oldvalue;
var linker;
function window.confirm(str)
{

    execScript("n = msgbox('"+ str +"', 257, '提示')", "vbscript");

  return(n == 1);

}


function kd(text)
{var sp;

if(text=="xh"){
linker="&action=listxh";
}
else 
if(text=="xx"){
linker="&action=listxx";
}
else
 if(text=="xxl"){
linker="&action=listxxl";
}
else
if(text=="shlx"){
linker="&action=listshlx";
}
else
if(text=="cgs"){
linker="&action=listcgs";

}
else
if(text=="bjmc"){
linker="&action=listbjmc&bh="+document.getElementById("bh").value+"&xlff="+document.getElementById("xlff").value;
}
else
if(text=="xlff"){
linker="&action=listxlff&bh="+document.getElementById("bh").value;
}
else
 if(text=="c"){
linker="&action=listc&bh="+document.getElementById("bh").value+"&bjmc="+document.getElementById("bjmc").value+"&xlff="+document.getElementById("xlff").value;
}
else
if(text=="k"){
linker="&action=listk&bh="+document.getElementById("bh").value+"&bjmc="+document.getElementById("bjmc").value+"&xlff="+document.getElementById("xlff").value+"&c="+document.getElementById("c").value;
}
else
 if(text=="lx"){
linker="&action=listlx&bh="+document.getElementById("bh").value+"&bjmc="+document.getElementById("bjmc").value+"&xlff="+document.getElementById("xlff").value+"&c="+document.getElementById("c").value+"&k="+document.getElementById("k").value;
}
else
 if(text=="shdm"){
linker="&action=listsh&bh="+document.getElementById("bh").value;

}
 else
	 if(text=="shwz"||text=="wzdm"){
	linker="&action=listwz&bh="+document.getElementById("bh").value;

	}
 
if((document.getElementById(text).value!=oldvalue)||(document.getElementById(text).value==oldvalue)||(window.event.keyCode==13)||(window.event.keyCode==34)||(window.event.keyCode==33)||(window.event.keyCode==37)||(window.event.keyCode==38)||(window.event.keyCode==39)||(window.event.keyCode==40)||(window.event.keyCode==16))
{
	if(text=="xh"||(text=="shwz"||text=="wzdm")&&document.getElementById(text).value.length>2)
		MM_showHideLayers('showdiv','','hide');
		else
		MM_showHideLayers('showdiv','','show');

	
if(window.event.keyCode==13)
{


i=1;
 


if((text=="shwz"||text=="wzdm")&&gf_trim(document.getElementById(text).value.length)>2)
{

if(gf_trim(document.getElementById(text).value.length)==4){
if(null!=document.getElementById("shmx")&&typeof(document.getElementById("shmx"))!="undefined")
document.getElementById("shmx").focus();
else
 document.getElementById("xlff").focus();
}
else{
alert("损坏位置必须为4位字符！");
return false;}

}else
if(typeof(document.fid.d0)!="undefined"){
sp=document.fid.d0.value.split("|");
if(text=="xh"){
if(sp[0]!=""){
//document.getElementById("xh").value=sp[0];
if(sp[6]==""){	
if(!chkcntrno(document.getElementById("xh").value,0))
{if(confirm('箱号格式不符合国际标准!最近一次进场时间为'+sp[7]+'，但未出场，需要继续录入吗！'))
	document.getElementById("cc").focus();
}else
{ 
if(confirm('最近一次进场时间为'+sp[7]+'，但未出场，需要继续录入吗！'))
	document.getElementById("cc").focus();
}//document.getElementById("cc").focus();
return false;
}else{
	if(confirm('最近一次进场时间为'+sp[7]+'，出场时间为'+sp[6]+'，需要继续录入吗！'))
		document.getElementById("cc").focus();	
}
}else{
	document.getElementById("cc").focus();	
}

}
 
if(text=="cgs"&&typeof(document.getElementById("jc"))!="undefined"&&document.getElementById("jc")!=null){
if(document.getElementById("jc").value=="1"&&sp[3]=="2")
{
document.location.href="addjc2.htm?id="+sp[0];
}
if(document.getElementById("jc").value=="2"&&sp[3]=="1")
{
document.location.href="addjc.htm?id="+sp[0];
}
}

rvalue(text,sp);


}else{
 if(text=="xh"){
 if(!chkcntrno(document.getElementById("xh").value,0))
 {  
	 if(confirm("箱号格式不符合国际标准,还要继续吗？"))
document.getElementById("cc").focus();
 }
 else
	 document.getElementById("cc").focus(); 
 }
 if(text=="xx"){
var Ids=document.getElementById(text).value;
	 Ext.Ajax.request({method:'POST',url:'list.htm?action=checkxx',
		 params:{xx:Ids},
		 success: function(response, options) {    
		   //获取响应的json字符串    
		 
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 
		 
		   if(responseArray.success==true){    
			   document.getElementById("xxl").focus();
		   }    
		   else{    
			   alert("不存在该箱型！");   
		   }    
		   }    
		   });   	

//	 alert("不存在该箱型！");
	 
//document.getElementById("xxl").focus();
 }
else if(text=="xxl"){
	var Ids=document.getElementById(text).value;
Ext.Ajax.request({method:'POST',url:'list.htm?action=checkxxl',
	 params:{xxl:Ids},
	 success: function(response, options) {    
	   //获取响应的json字符串    
	 
	   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 
	 
	   if(responseArray.success==true){    
		   document.getElementById("jcrq").focus();
	   }    
	   else{    
		   alert("不存在该箱型类！");   
	   }    
	   }    
	   });   	
//document.getElementById("jcrq").focus();
}
else if(text=="cgs"){
	var Ids=document.getElementById(text).value;
	Ext.Ajax.request({method:'POST',url:'list.htm?action=checkcgs',
		 params:{xx:Ids},
		 success: function(response, options) {    
		   //获取响应的json字符串    
		 
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 
		 
		   if(responseArray.success==true){    
			   document.getElementById("xh").focus();
		   }    
		   else{    
			   alert("不存在该船公司！");   
		   }    
		   }    
		   });   	
//document.getElementById("xh").focus();
}
else if(text=="shdm"){
	alert("不存在该损坏代码！");
//document.getElementById("shwz").focus();
}
else if(text=="shlx"){
	alert("不存在该损坏位置！");
	//if(null!=document.getElementById("shdm")&&typeof(document.getElementById("shdm"))!="undefined")
	//document.getElementById("shdm").focus();
	//if(null!=document.getElementById("wzdm")&&typeof(document.getElementById("wzdm"))!="undefined")
		//document.getElementById("wzdm").focus();
		
	}
return false;
}
MM_showHideLayers('showdiv','','hide');
}
else
if(window.event.keyCode==107||window.event.keyCode==187)
{
bvv=true;
return false;
}
else
if(window.event.keyCode==34)
{
try
{if(i<parseInt(document.fid.si.value))
{
if(i==0)
i=1;
++i;

fr('list.htm?pageNo='+i+'&id='+document.getElementById(text).value+linker+"&pager.offset="+(i-1)*10);
}
}
catch(err){
++i;
fr('list.htm?pageNo='+i+'&id='+document.getElementById(text).value+linker+"&pager.offset="+(i-1)*10);
}
}
else
if(window.event.keyCode==33&&i>1)
{--i;
fr('list.htm?pageNo='+i+'&id='+document.getElementById(text).value+linker+"&pager.offset="+(i-1)*10);
}
else
if((window.event.keyCode==48||window.event.keyCode==96)&&bvv==true)
{
sp=document.fid.d0.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==49||window.event.keyCode==97)&&bvv==true)
{
sp=document.fid.d1.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==50||window.event.keyCode==98)&&bvv==true)
{

sp=document.fid.d2.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

bvv=false;
i=1;
return false;
}
else
if((window.event.keyCode==51||window.event.keyCode==99)&&bvv==true)
{
sp=document.fid.d3.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==52||window.event.keyCode==100)&&bvv==true)
{
sp=document.fid.d4.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==53||window.event.keyCode==101)&&bvv==true)
{
sp=document.fid.d5.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==54||window.event.keyCode==102)&&bvv==true)
{
sp=document.fid.d6.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==55||window.event.keyCode==103)&&bvv==true)
{
sp=document.fid.d7.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==56||window.event.keyCode==104)&&bvv==true)
{
sp=document.fid.d8.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==57||window.event.keyCode==105)&&bvv==true)
{
sp=document.fid.d9.value.split("|");
rvalue(text,sp);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
fr("list.htm?id="+document.getElementById(text).value+linker);
oldvalue=document.getElementById(text).value;
//show();
}

}
 
function fr(url)
{
document.all.fid.src=url;
}
function   ff(x,n){
    return     x.toFixed(n);
  }
//   不舍只入
  function   gg(x,n){
    return     (x+5.0*Math.pow(10.0,-n-1)).toFixed(n);
  }
  //   只舍不入
  function   hh(x,n){
    return     (x-5.0*Math.pow(10.0,-n-1)).toFixed(n);
  }
  function winopen(url){
 // var ScreenWidth = screen.availWidth-10;
 var ScreenWidth=810;
    var ScreenHeight = screen.availHeight-80;
window.open(url, '', 'left=100, top=0, Width=' + ScreenWidth +', height=' + ScreenHeight + ', resizable=yes, scrollbars=no, status=yes, toolbar=no, menubar=no, location=no')

  }
    function fullopen(url){
 // var ScreenWidth = screen.availWidth-10;
 var ScreenWidth=screen.availWidth-60;
    var ScreenHeight = screen.availHeight-60;
window.open(url, '', 'left=20, top=0, Width=' + ScreenWidth +', height=' + ScreenHeight + ', resizable=yes, scrollbars=yes, status=yes, toolbar=no, menubar=no, location=no')

  }
    function winopen1(url){
 // var ScreenWidth = screen.availWidth-10;
 var ScreenWidth=700;
    var ScreenHeight = 450;
window.open(url, '', 'left=200, top=100, Width=' + ScreenWidth +', height=' + ScreenHeight + ', resizable=yes, scrollbars=no, status=yes, toolbar=no, menubar=no, location=no')

  }
    function winopen2(url){
 // var ScreenWidth = screen.availWidth-10;
 var ScreenWidth=500;
    var ScreenHeight = 400;
window.open(url, '', 'left=250, top=150, Width=' + ScreenWidth +', height=' + ScreenHeight + ', resizable=yes, scrollbars=no, status=yes, toolbar=no, menubar=no, location=no')

  }
  function rvalue(text,sp){
      
  if(text=="xh"){
/*document.getElementById("xh").value=sp[0];
document.getElementById("xx").value=sp[1];
if(null!=document.getElementById("xxl")&&typeof(document.getElementById("xxl"))!="undefined")
document.getElementById("xxl").value=sp[5];
document.getElementById("cc").value=sp[2];
//document.getElementById("cgs").value=sp[3];
if(null!=document.getElementById("zzrq")&&typeof(document.getElementById("zzrq"))!="undefined")
document.getElementById("zzrq").value=sp[4];
if(null!=document.getElementById("cc")&&typeof(document.getElementById("cc"))!="undefined")
document.getElementById("cc").focus();
//if(null!=document.getElementById("rcbh")&&typeof(document.getElementById("rcbh"))!="undefined")
//document.getElementById("rcbh").focus();

//if(!chkcntrno(sp[0],0))
//alert('箱号格式不符合国际标准！') ;
  */
  }
  else if(text=="xx"){
   document.getElementById("xx").value=sp[0];
   if(null!=document.getElementById("xxl")&&typeof(document.getElementById("xxl"))!="undefined")
  document.getElementById("xxl").focus();
  }
   else if(text=="xxl"){
   document.getElementById("xxl").value=sp[0];
   if(null!=document.getElementById("jcrq")&&typeof(document.getElementById("jcrq"))!="undefined")
  document.getElementById("jcrq").focus();
  }
  else if(text=="shlx"){
   document.getElementById("shlx").value=sp[0];
 
 
 
if(null!=document.getElementById("shdm")&&typeof(document.getElementById("shdm"))!="undefined")
//converted.focus();
document.getElementById("shdm").focus();
if(null!=document.getElementById("wzdm")&&typeof(document.getElementById("wzdm"))!="undefined")
	//converted.focus();
	document.getElementById("wzdm").focus();
   //if(null!=document.getElementById("bjmc")&&typeof(document.getElementById("bjmc"))!="undefined")
//document.getElementById("bjmc").focus();
  }
  else if(text=="shwz"){
	 
	  document.getElementById("shwz").value=sp[0];
	 if(document.getElementById("shwz").length==4)
	  document.getElementById("shmx").focus();
	 else
		 document.getElementById("shwz").focus();
	  // tabs();

	//if(null!=document.getElementById("shmx")&&typeof(document.getElementById("shmx"))!="undefined")
	//converted.focus();
//	document.getElementById("shmx").focus();
	 
	   //if(null!=document.getElementById("bjmc")&&typeof(document.getElementById("bjmc"))!="undefined")
	//document.getElementById("bjmc").focus();
	  }
  else if(text=="wzdm"){
		 
	  document.getElementById("wzdm").value=sp[0];
	 
	  // tabs();

	//if(null!=document.getElementById("shmx")&&typeof(document.getElementById("shmx"))!="undefined")
	//converted.focus();
//	document.getElementById("shmx").focus();
	 
	   //if(null!=document.getElementById("bjmc")&&typeof(document.getElementById("bjmc"))!="undefined")
	//document.getElementById("bjmc").focus();
	  }
  else if(text=="shdm"){
   document.getElementById("shdm").value=sp[0];
   document.getElementById("shmx").value=sp[1];
document.getElementById("sl").value="1";
document.getElementById("xs").value=sp[2];
document.getElementById("xsl").value=sp[2];
document.getElementById("gsf").value=ff(sp[3]*sp[2],2);
document.getElementById("gsfl").value=sp[3];
document.getElementById("clf").value=sp[4];
document.getElementById("clfl").value=sp[4]; 
   document.getElementById("shwz").focus();
  }
    else if(text=="cgs"){
   document.getElementById("cgs").value=sp[0];
   
 if(null!=document.getElementById("xh")&&typeof(document.getElementById("xh"))!="undefined")
document.getElementById("xh").focus();
 
  }
    else if(text=="bjmc"){

    
    document.getElementById("bjmc").value=sp[0];
    if(null!=document.getElementById("c")&&typeof(document.getElementById("xlff"))!="undefined")
document.getElementById("c").focus();
    } else if(text=="xlff"){

    
    document.getElementById("xlff").value=sp[0];
    if(null!=document.getElementById("bjmc")&&typeof(document.getElementById("bjmc"))!="undefined")
document.getElementById("bjmc").focus();
    }
    else if(text=="c"){

    
    document.getElementById("c").value=sp[0];
    if(null!=document.getElementById("k")&&typeof(document.getElementById("k"))!="undefined")
document.getElementById("k").focus();
    }
        else if(text=="k"){

    
    document.getElementById("k").value=sp[0];
    if(null!=document.getElementById("lx")&&typeof(document.getElementById("lx"))!="undefined")
document.getElementById("lx").focus();
    }
    else if(text=="lx"){


 document.getElementById("lx").value=sp[0];

document.getElementById("gs").value=sp[1];
document.getElementById("gsf").value=sp[2];
document.getElementById("clf").value=sp[3];
document.getElementById("sl").value="1";
document.getElementById("xsl").value=sp[1];
document.getElementById("gsfl").value=sp[4];
document.getElementById("clfl").value=sp[3];
document.getElementById("xlmx").value=sp[5];
 if(null!=document.getElementById("sl")&&typeof(document.getElementById("sl"))!="undefined")
document.getElementById("sl").focus();
    }
  }
  function tab(key){
  if(window.event.keyCode==13){
document.getElementById(key).focus();
  
  }
  }
  function cul(){
  if(document.getElementById("xsl").value!="0") 
  document.getElementById("xs").value=ff(document.getElementById("xsl").value*document.getElementById("sl").value,2);
   if(document.getElementById("gsfl").value!="0") 
  document.getElementById("gsf").value=ff(document.getElementById("gsfl").value*document.getElementById("xs").value,2);
    if(document.getElementById("clfl").value!="0") 
   document.getElementById("clf").value=ff(document.getElementById("clfl").value*document.getElementById("sl").value,2);
 
  }
     function cu2(){
 if(document.getElementById("gsfl").value!="0") 
  document.getElementById("gsf").value=ff(document.getElementById("gsfl").value*document.getElementById("xs").value,2);
    if(document.getElementById("clfl").value!="0") 
   document.getElementById("clf").value=ff(document.getElementById("clfl").value*document.getElementById("sl").value,2);
 
  }
      function cul2(){
 if(document.getElementById("xsl").value!="0") 
  document.getElementById("gs").value=ff(document.getElementById("xsl").value*document.getElementById("sl").value,2);
   if(document.getElementById("gsfl").value!="0") 
  document.getElementById("gsf").value=ff(document.getElementById("gsfl").value*document.getElementById("gs").value,2);
    if(document.getElementById("clfl").value!="0") 
   document.getElementById("clf").value=ff(document.getElementById("clfl").value*document.getElementById("sl").value,2);

  }
  function culgs(){
  if(document.getElementById("gsfl").value!="0") 
  document.getElementById("gsf").value=ff(document.getElementById("gsfl").value*document.getElementById("gs").value,2);
  
  }
  function   sel(obj,num){   
  var   rng=obj.createtextrange()   
  rng.movestart("character",rng.text.length-num);   
  rng.select();   
  }   
  function   sel(obj,num){   
  var   rng=obj.createtextrange()   
  rng.movestart("character",rng.text.length-num);   
  rng.select();   
  }   
  function tabs(){
  if(event.keyCode==13)event.keyCode=9;
  }
  function resizeme(){
  if($(".main_left").is(':visible'))
document.getElementById("divme").style.width=855;
  else
  document.getElementById("divme").style.width=1000;

  }
    function resizeme1(){
  document.getElementById("divme").style.width=800;

  }
  function su1(){
document.getElementById("command").submit();
  }
   function mysu(){
 document.getElementById("form1").submit();
 }
 function plqr(lx){

var v=parent.document.getElementById("var").value;
var sp=v.split("|");


  if(sp.length==0)
  alert("不能批量处理，请至少选择一项！")
  else{
  if(lx=="plqrrq")
   if( document.getElementById(lx).value!=""){

	   Ext.Ajax.request({    
url:'list.htm?action=chkpl&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

success: function(response, options) {    
//获取响应的json字符串    
var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

if(responseArray.success==true){    
 //parent.Ext.getCmp("MenuGridPanel").store.reload();
 //parent.MM_showHideLayers('showdiv','','hide');
	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";

	   alert('处理成功！');
}    
else{    
	
  alert('处理失败，请与开发人员联系！');        
}    
}    
});   
//parent.document.getElementById(lx).value=document.getElementById(lx).value;
// parent.document.getElementById("form1").action="list.htm?action=chkpl&flag=qr";
// parent.document.getElementById("form1").submit(); 
 }
 else
 {
 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
 alert("请输入批量日期！");
 }
 if(lx=="pltdh")
   if( document.getElementById(lx).value!=""){
	   Ext.Ajax.request({    
		   url:'list.htm?action=chktdh&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		  //  parent.Ext.getCmp("MenuGridPanel").store.reload();
		  //  parent.MM_showHideLayers('showdiv','','hide');
		   	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
		   	alert('处理成功！');
		   	}    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 }
 else
 {
 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
 document.getElementById("btn_tdhqr").disabled=false;
 alert("请输入批量提单号！");
 }
 if(lx=="plbz")
   if( document.getElementById(lx).value!=""){
	   Ext.Ajax.request({    
		   url:'list.htm?action=chkbz&flag=qr&'+lx+'='+encodeURI(document.getElementById(lx).value)+"&var="+encodeURI(parent.document.getElementById('var').value)+"&sql="+encodeURI(parent.document.getElementById('condition').value),    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		  //  parent.Ext.getCmp("MenuGridPanel").store.reload();
		    //parent.MM_showHideLayers('showdiv','','hide');
		   	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
	 
alert('处理成功！');
		   	}    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });    
 
 }
 else
 {
 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
 document.getElementById("plbz").style.disabled="false";
 document.getElementById("btn_bzqr").disabled=false;			  
 alert("请选择班组名称！");
 }
 if(lx=="plfsrq")
	   if( document.getElementById(lx).value!=""){
		    
		   Ext.Ajax.request({    
			   url:'list.htm?action=chkfs&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

			   success: function(response, options) {    
			   //获取响应的json字符串    
			   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

			   if(responseArray.success==true){    
			  //  parent.Ext.getCmp("MenuGridPanel").store.reload();
			 //   parent.MM_showHideLayers('showdiv','','hide');
			    	document.getElementById("divDisable").style.display="none";
	document.getElementById("divload").style.display="none";

	alert('处理成功！');
			   	}    
			   else{    
			     alert('处理失败，请与开发人员联系！');        
			   }    
			   }    
			   });   
		   
	 }
	 else
	 {
	 		document.getElementById("divDisable").style.display="none";
	document.getElementById("divload").style.display="none";
	 alert("请输入发送时间！");
	 }
 if(lx=="plwgrq")
   if( document.getElementById(lx).value!=""){
	   Ext.Ajax.request({    
		   url:'list.htm?action=chkwg&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		  //  parent.Ext.getCmp("MenuGridPanel").store.reload();
		 //   parent.MM_showHideLayers('showdiv','','hide');
		    	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";

alert('处理成功！');
		   	}    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
	   
 }
 else
 {
 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
 alert("请输入完工时间！");
 }
 if(lx=="plccrq")
	   if( document.getElementById(lx).value!=""){
		   Ext.Ajax.request({    
			   url:'list.htm?action=chkcc&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

			   success: function(response, options) {    
			   //获取响应的json字符串    
			   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

			   if(responseArray.success==true){    
			   // parent.Ext.getCmp("MenuGridPanel").store.reload();
			   // parent.MM_showHideLayers('showdiv','','hide');
  	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
			   	alert('处理成功！');
			   	}    
			   else{    
			     alert('处理失败，请与开发人员联系！');        
			   }    
			   }    
			   });   
		   
	 }
	 else
	 {
	 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
	 alert("请输入出场时间！");
	 }
 if(lx=="pljzrq")
   if( document.getElementById(lx).value!=""){
	   Ext.Ajax.request({    
		   url:'list.htm?action=chkjz&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		 //   parent.Ext.getCmp("MenuGridPanel").store.reload();
		   // parent.MM_showHideLayers('showdiv','','hide');
		  	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
		   	alert('处理成功！');
		    }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
 else
 {
 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
 alert("请输入结账时间！");
 }
 
  if(lx=="pledirq")
   if( document.getElementById(lx).value!=""){
	   Ext.Ajax.request({    
		   url:'list.htm?action=chkedi&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		 //   parent.Ext.getCmp("MenuGridPanel").store.reload();
		   // parent.MM_showHideLayers('showdiv','','hide');
		  	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
		   	alert('处理成功！');
		    }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
 else
 {
 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
 alert("请输EDI发送日期！");
 }
 
  if(lx=="pldc")
  {
	  if( document.getElementById(lx).value!=""){
		 
		   Ext.Ajax.request({    
			   url:'list.htm?action=chkpldc&flag=qr&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

			   success: function(response, options) {    
			   //获取响应的json字符串    
			   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

			   if(responseArray.success==true){    
			  //  parent.Ext.getCmp("MenuGridPanel").store.reload();
			  //  parent.MM_showHideLayers('showdiv','','hide');
			 	document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
			   	alert('处理成功！');
			   }    
			   else{    
			     alert('处理失败，请与开发人员联系！');        
			   }    
			   }    
			   });   
	 
	 }
	 else
	 {
	 		document.getElementById("divDisable").style.display="none";
document.getElementById("divload").style.display="none";
	 alert("请输入转入时间！");
}
  
  }
 }
 }
 function plqx(lx){
var v=parent.document.getElementById("var").value;
var sp=v.split("|");


  if(sp.length==0)
  alert("不能批量取消确认日期，请至少选择一项！")
  else {
  if(lx=="plqrrq")
 {
	   Ext.Ajax.request({    
		   url:'list.htm?action=chkqr&flag=qx&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		    parent.Ext.getCmp("MenuGridPanel").store.reload();
		    parent.MM_showHideLayers('showdiv','','hide');
		   }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 }
  else
   if(lx=="pltdh")
 {
	   Ext.Ajax.request({    
		   url:'list.htm?action=chktdh&flag=qx&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		    parent.Ext.getCmp("MenuGridPanel").store.reload();
		    parent.MM_showHideLayers('showdiv','','hide');
		   }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
   else if(lx=="plbz")
 {
 	   Ext.Ajax.request({    
		   url:'list.htm?action=chkbz&flag=qx&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    
		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		    parent.Ext.getCmp("MenuGridPanel").store.reload();
		    parent.MM_showHideLayers('showdiv','','hide');
		   }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
   else  if(lx=="plfsrq")
   { 	   Ext.Ajax.request({    
	   
  		   url:'list.htm?action=chkfs&flag=qx&'+lx+'='+document.getElementById(lx).value+'&var='+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

  		   success: function(response, options) {    
  		   //获取响应的json字符串    
  		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

  		   if(responseArray.success==true){    
  		    parent.Ext.getCmp("MenuGridPanel").store.reload();
  		    parent.MM_showHideLayers('showdiv','','hide');
  		   }   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
    else  if(lx=="plwgrq")
 { 	   Ext.Ajax.request({    
		   url:'list.htm?action=chkwg&flag=qx&'+lx+'='+document.getElementById(lx).value+'&var='+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		    parent.Ext.getCmp("MenuGridPanel").store.reload();
		    parent.MM_showHideLayers('showdiv','','hide');
		   }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
    else  if(lx=="plccrq")
    { 	   Ext.Ajax.request({    
   		   url:'list.htm?action=chkcc&flag=qx&'+lx+'='+document.getElementById(lx).value+'&var='+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

   		   success: function(response, options) {    
   		   //获取响应的json字符串    
   		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

   		   if(responseArray.success==true){    
   		    parent.Ext.getCmp("MenuGridPanel").store.reload();
   		    parent.MM_showHideLayers('showdiv','','hide');
   		   }    
   		   else{    
   		     alert('处理失败，请与开发人员联系！');        
   		   }    
   		   }    
   		   });   
    
    }
    
      else  if(lx=="pledirq")
    { 	   Ext.Ajax.request({    
   		   url:'list.htm?action=chkedi&flag=qx&'+lx+'='+document.getElementById(lx).value+'&var='+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

   		   success: function(response, options) {    
   		   //获取响应的json字符串    
   		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

   		   if(responseArray.success==true){    
   		    parent.Ext.getCmp("MenuGridPanel").store.reload();
   		    parent.MM_showHideLayers('showdiv','','hide');
   		   }    
   		   else{    
   		     alert('处理失败，请与开发人员联系！');        
   		   }    
   		   }    
   		   });   
    
    }
    
    
    else
     if(lx=="pljzrq")
 {
  	   Ext.Ajax.request({    
		   url:'list.htm?action=chkjz&flag=qx&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		    parent.Ext.getCmp("MenuGridPanel").store.reload();
		    parent.MM_showHideLayers('showdiv','','hide');
		   }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   
 
 }
     else
  if(lx=="pldc")
 {
	  Ext.Ajax.request({    
		   url:'list.htm?action=chkpldc&flag=qx&'+lx+'='+document.getElementById(lx).value+"&var="+parent.document.getElementById('var').value+"&sql="+parent.document.getElementById('condition').value,    

		   success: function(response, options) {    
		   //获取响应的json字符串    
		   var responseArray = Ext.util.JSON.decode(response.responseText);                                                 

		   if(responseArray.success==true){    
		    parent.Ext.getCmp("MenuGridPanel").store.reload();
		    parent.MM_showHideLayers('showdiv','','hide');
		   }    
		   else{    
		     alert('处理失败，请与开发人员联系！');        
		   }    
		   }    
		   });   

 }
 }
 }
 function gf_trim(as_string)
{
   while(as_string.length > 0 && as_string.indexOf(" ")==0) as_string = as_string.substr(1);
   while(as_string.length > 0 && as_string.lastIndexOf(" ")==(as_string.length-1)) as_string = as_string.substr(0,as_string.length-1);
   return as_string;
}
//集装箱箱号验证
//功能：验证集装箱箱号：
//参数：
//   as_cntrno 是否符合国际标准，
//返回值：True 符合国际标准或强行通过(特殊箱号)
//举例：gf_chkcntrno( 'TEXU2982987', 0 )     
function chkcntrno(as_cntrno,ai_choice)
{
 var fi_ki;
 var fi_numsum;
 var fi_nummod;
 var fai_num = new Array(11);
 var fb_errcntrno=false;

 if (as_cntrno==null) return true; //null不进行验证
 if (gf_trim(as_cntrno)=="") return true; //空不进行验证
 
 if (as_cntrno.length == 11)   //国际标准为11位，最后一位是校验位，若不是11位肯定不是标准箱
{ for(fi_ki=1;fi_ki<=11;fi_ki++)
   fai_num[fi_ki] = 0;
  for(fi_ki=1;fi_ki<=4;fi_ki++)     //根据国际标准验证法则处理箱号前面的4个英文字母
 {
   fch_char=as_cntrno.charAt(fi_ki-1).toUpperCase();
   switch(true)
{ case (fch_char=="A"):{fai_num[fi_ki] = 10;break;}
    case (fch_char>="V" && fch_char<="Z"):{fai_num[fi_ki] = fch_char.charCodeAt() - 52;break;}
    case (fch_char>="L" && fch_char<="U"):{fai_num[fi_ki] = fch_char.charCodeAt() - 53;break;}
    default:{fai_num[fi_ki] = fch_char.charCodeAt() - 54;break;}
   }
  }
  for(fi_ki=5;fi_ki<=11;fi_ki++)
{  fch_char=as_cntrno.charAt(fi_ki-1);
   fai_num[fi_ki] = parseInt(fch_char); //ctype((mid(as_cntrno, fi_ki, 1)), integer)
      }
  fi_numsum = 0
  
  for(fi_ki=1;fi_ki<=10;fi_ki++)
{ 
   fi_sqr = 1;
   for(i=1;i<fi_ki;i++)
   {fi_sqr *=2;}
   fi_numsum += fai_num[fi_ki] * fi_sqr;
  }

  if (as_cntrno.substr(0,4) == "HLCU") fi_numsum = fi_numsum - 2; //hapaq lloyd的柜号与国际标准相差2
  fi_nummod = fi_numsum % 11;
  if (fi_nummod == 10) fi_nummod = 0;
  if (fi_nummod == fai_num[11]) fb_errcntrno = true;
  return fb_errcntrno;
 }else{
    return fb_errcntrno;
 }  
} 
function mykd(cgs,row,obj){
var linker,sp;
--row;

if(gf_trim(cgs)!=""){
if(obj.name=="shdm"){
linker="&action=listshdm&cgs="+document.getElementById("cgs").value+"&row="+row;
}
else
if(obj.name=="shlx"){
linker="&action=listshlx1"+"&row="+row;
}
else
if(obj.name=="shwz"){
linker="&action=listshwz1"+"&row="+row;
}
else if(obj.name=="bjmc"){
linker="&action=listbjmc1&cgs="+document.getElementById("cgs").value+"&xlff="+document.getElementsByName("xlff")[row].value+"&row="+row;

}
else if(obj.name=="xlff"){
linker="&action=listxlff1&cgs="+document.getElementById("cgs").value+"&row="+row;
} 
else if(obj.name=="c"){
linker="&action=listc1&cgs="+document.getElementById("cgs").value+"&bjmc="+document.getElementsByName("bjmc")[row].value+"&xlff="+document.getElementsByName("xlff")[row].value+"&row="+row;
} 
else if(obj.name=="k"){
linker="&action=listk1&cgs="+document.getElementById("cgs").value+"&bjmc="+document.getElementsByName("bjmc")[row].value+"&xlff="+document.getElementsByName("xlff")[row].value+"&c="+document.getElementsByName("c")[row].value+"&row="+row;
} 
else if(obj.name=="lx"){
linker="&action=listlx1&cgs="+document.getElementById("cgs").value+"&bjmc="+document.getElementsByName("bjmc")[row].value+"&xlff="+document.getElementsByName("xlff")[row].value+"&c="+document.getElementsByName("c")[row].value+"&k="+document.getElementsByName("k")[row].value+"&row="+row;
} 

if((obj.value!=oldvalue)||(obj.value==oldvalue)||(window.event.keyCode==13)||(window.event.keyCode==34)||(window.event.keyCode==33)||(window.event.keyCode==37)||(window.event.keyCode==38)||(window.event.keyCode==39)||(window.event.keyCode==40)||(window.event.keyCode==16)){
if(obj.name=="shwz"&&obj.value.length>2)
MM_showHideLayers('showdiv','','hide');
else
MM_showHideLayers('showdiv','','show');

if(window.event.keyCode==13)
{
MM_showHideLayers('showdiv','','hide');
i=1;
if(obj.name=="shwz"&&gf_trim(obj.value.length)>2)
{
if(gf_trim(obj.value.length)==4){
if(typeof(document.getElementsByName("xlff")[row])!="undefined")
document.getElementsByName("xlff")[row].focus();
else
 document.getElementsByName("sl")[row].focus();
}
else
 document.getElementById("me2").innerText="损坏位置必须为4位字符！";
}else
if(typeof(document.fid.d0)!="undefined"){
sp=document.fid.d0.value.split("|");

ravalue(obj.name,sp,row);


}else{


}
}
else
if(window.event.keyCode==107||window.event.keyCode==187)
{
bvv=true;
return false;
}
else
if(window.event.keyCode==34)
{
try
{if(i<parseInt(document.fid.si.value))
{
if(i==0)
i=1;
++i;

fr('list.htm?pageNo='+i+'&id='+obj.value+linker+"&pager.offset="+(i-1)*10);
}
}
catch(err){
++i;
fr('list.htm?pageNo='+i+'&id='+obj.value+linker+"&pager.offset="+(i-1)*10);
}
}
else
if(window.event.keyCode==33&&i>1)
{--i;
fr('list.htm?pageNo='+i+'&id='+obj.value+linker+"&pager.offset="+(i-1)*10);
}
else
if((window.event.keyCode==48||window.event.keyCode==96)&&bvv==true)
{
sp=document.fid.d0.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==49||window.event.keyCode==97)&&bvv==true)
{
sp=document.fid.d1.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==50||window.event.keyCode==98)&&bvv==true)
{

sp=document.fid.d2.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

bvv=false;
i=1;
return false;
}
else
if((window.event.keyCode==51||window.event.keyCode==99)&&bvv==true)
{
sp=document.fid.d3.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==52||window.event.keyCode==100)&&bvv==true)
{
sp=document.fid.d4.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==53||window.event.keyCode==101)&&bvv==true)
{
sp=document.fid.d5.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==54||window.event.keyCode==102)&&bvv==true)
{
sp=document.fid.d6.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==55||window.event.keyCode==103)&&bvv==true)
{
sp=document.fid.d7.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==56||window.event.keyCode==104)&&bvv==true)
{
sp=document.fid.d8.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
if((window.event.keyCode==57||window.event.keyCode==105)&&bvv==true)
{
sp=document.fid.d9.value.split("|");
ravalue(obj.name,sp,row);
MM_showHideLayers('showdiv','','hide');

i=1;
bvv=false;
return false;
}
else
fr("list.htm?id="+obj.value+linker);
oldvalue=obj.value;

//show();


}
}else{
alert("船公司不能为空！");
document.getElementById("cgs").focus();
}
}
function ravalue(text,sp,row){
if(text=="shdm"){
document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("shmx")[row].value=sp[1];
document.getElementsByName("sl")[row].value="1";
document.getElementsByName("xs")[row].value=sp[2];
document.getElementsByName("xsl")[row].value=sp[2];
document.getElementsByName("gsf")[row].value=ff(sp[3]*sp[2],2);
document.getElementsByName("gsfl")[row].value=sp[3];
document.getElementsByName("clf")[row].value=sp[4];
document.getElementsByName("clfl")[row].value=sp[4]; 
   document.getElementsByName("shwz")[row].focus();
}
else if(text=="shlx"){
 
document.getElementsByName(text)[row].value=sp[0];

	 if(null!=document.getElementsByName("shwz")[row]&&typeof(document.getElementsByName("shwz")[row])!="undefined")
		document.getElementsByName("shwz")[row].focus();
	 if(null!=document.getElementsByName("shdm")[row]&&typeof(document.getElementsByName("shdm")[row])!="undefined")
			document.getElementsByName("shdm")[row].focus();
 
}
else if(text=="shwz"){

document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("shwz")[row].focus();
}
else if(text=="bjmc"){
document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("c")[row].focus();
}
else if(text=="xlff"){
document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("bjmc")[row].focus();
} 
else if(text=="c"){
document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("k")[row].focus();
}
else if(text=="k"){
document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("lx")[row].focus();
}
else if(text=="lx"){
document.getElementsByName(text)[row].value=sp[0];
document.getElementsByName("xs")[row].value=sp[1];
document.getElementsByName("gsf")[row].value=sp[2];
document.getElementsByName("clf")[row].value=sp[3];
document.getElementsByName("sl")[row].value="1";
document.getElementsByName("xsl")[row].value=sp[1];
document.getElementsByName("gsfl")[row].value=sp[4];
document.getElementsByName("clfl")[row].value=sp[3];
document.getElementsByName("xlmx")[row].value=sp[5];
 if(null!=document.getElementsByName("sl")[row]&&typeof(document.getElementsByName("sl")[row])!="undefined")
document.getElementsByName("sl")[row].focus();
 
}    
}
function mycu1(obj,row){
row=row-1;
if(obj.name=="sl"){
  if(document.getElementsByName("xsl")[row].value!="0") 
  document.getElementsByName("xs")[row].value=ff(document.getElementsByName("xsl")[row].value*document.getElementsByName("sl")[row].value,2);
}  if(document.getElementsByName("gsfl")[row].value!="0") 
  document.getElementsByName("gsf")[row].value=ff(document.getElementsByName("gsfl")[row].value*document.getElementsByName("xs")[row].value,2);
    if(document.getElementsByName("clfl")[row].value!="0") 
   document.getElementsByName("clf")[row].value=ff(document.getElementsByName("clfl")[row].value*document.getElementsByName("sl")[row].value,2);
 
}
function mycu2(obj,row){
row=row-1;
if(obj.name=="sl"){
if(document.getElementsByName("xsl")[row].value!="0") 
  document.getElementsByName("xs")[row].value=ff(document.getElementsByName("xsl")[row].value*document.getElementsByName("sl")[row].value,2);
}

if(document.getElementsByName("gsfl")[row].value!="0") 
  document.getElementsByName("gsf")[row].value=ff(document.getElementsByName("gsfl")[row].value*document.getElementsByName("xs")[row].value,2);
    if(document.getElementsByName("clfl")[row].value!="0") 
   document.getElementsByName("clf")[row].value=ff(document.getElementsByName("clfl")[row].value*document.getElementsByName("sl")[row].value,2);

}
function showModal(url){
window.showModalDialog("url","","dialogwidth:300px;dialogheight:150px;center:yes;status:no;scroll:no;help:no");
}
function   cc()   
{   
    var   e   =   event.srcElement;   
    var   r   =e.createTextRange();   
    r.moveStart('character',e.value.length);   
    r.collapse(true);   
    r.select();   
} 


function down(str){
	document.getElementById("form1").action="zwtxx/"+str;
	document.getElementById("form1").submit();
}