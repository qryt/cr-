document.write("<div id=meizzCalendarLayerMonth style='position: absolute; z-index:9999;width: 144; height: 61; display: none'>");
   document.write("<iframe name=meizzCalendarIframeMonth scrolling=no frameborder=0 width=100% height=61px></iframe></div>");
   //date和datetime的大小
   document.write("<div id=meizzCalendarLayer style='position: absolute; z-index:9999;width: 144px; height: 193px; display: none'>");
   document.write("<iframe name=meizzCalendarIframe scrolling=no frameborder=0 width=144px height=193px></iframe></div>");




function writeIframe()
{
   //头部
    var strIframe = "<html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'><style>"+
    "*{font-size: 12px; font-family: 宋体}"+
    ".bg{  color: "+ WebCalendar.lightColor +"; cursor: default; background-color: "+ WebCalendar.darkColor +";}";
    if(WebCalendar.display_type!="month"){
        strIframe +="table#tableMain{ width: 142; height: 180;}";
    }
    strIframe +="table#tableTime{ width: 142; height: 180;}"+
    "table#tableWeek td{ color: "+ WebCalendar.lightColor +";}"+
    "table#tableDay  td{ font-weight: bold;}"+
    "td#meizzYearHead, td#meizzYearMonth，td#meizzHour,td#meizzMinute,td#meizzmeizzSecond{color: "+ WebCalendar.wordColor +"}"+
    ".out { text-align: center; border-top: 1px solid "+ WebCalendar.DarkBorder +"; border-left: 1px solid "+ WebCalendar.DarkBorder +";"+
    "border-right: 1px solid "+ WebCalendar.lightColor +"; border-bottom: 1px solid "+ WebCalendar.lightColor +";}"+
    ".over{ text-align: center; border-top: 1px solid #FFFFFF; border-left: 1px solid #FFFFFF;"+
    "border-bottom: 1px solid "+ WebCalendar.DarkBorder +"; border-right: 1px solid "+ WebCalendar.DarkBorder +"}"+
    "input{ border: 1px solid "+ WebCalendar.darkColor +"; padding-top: 1px; height: 18; cursor: hand;"+
    "       color:"+ WebCalendar.wordColor +"; background-color: "+ WebCalendar.btnBgColor +"}"+
    "</style></head><body onselectstart='return false' style='margin: 0px' oncontextmenu='return false'><form name=meizz>";

    //javascript函数区
    if (WebCalendar.drag){
    strIframe += "<scr"+"ipt language=javascript>"+
    "var drag=false, cx=0, cy=0, o = parent.WebCalendar.calendar; function document.onmousemove(){"+
    "if(parent.WebCalendar.drag && drag){if(o.style.left=='')o.style.left=0; if(o.style.top=='')o.style.top=0;"+
    "o.style.left = parseInt(o.style.left) + window.event.clientX-cx;"+
    "o.style.top  = parseInt(o.style.top)  + window.event.clientY-cy;}}"+
    "function document.onkeydown(){ switch(window.event.keyCode){  case 27 : parent.hiddenCalendar(); break;"+
    "case 37 : parent.prevM(); break; case 38 : parent.prevY(); break; case 39 : parent.nextM(); break; case 40 : parent.nextY(); break;"+
    "case 84 : document.forms[0].today.click(); break;} window.event.keyCode = 0; window.event.returnValue= false;}"+
    "function dragStart(){cx=window.event.clientX; cy=window.event.clientY; drag=true;}</scr"+"ipt>"
    }
    //年月选择区域
    strIframe +=
    " <select name=tmpYearSelect  onblur='parent.hiddenSelect(this)' style='z-index:1;position:absolute;top:3;left:18;display:none'"+
    " onchange='parent.WebCalendar.thisYear =this.value; parent.hiddenSelect(this); parent.writeCalendar();'></select>"+
    " <select name=tmpMonthSelect onblur='parent.hiddenSelect(this)' style='z-index:1; position:absolute;top:3;left:74;display:none'"+
    " onchange='parent.WebCalendar.thisMonth=this.value; parent.hiddenSelect(this); parent.writeCalendar();'></select>"+

    " <table id=tableMain class=bg border=0 cellspacing=2 cellpadding=0>"+
    " <tr><td width=140 height=19 bgcolor='"+ WebCalendar.lightColor +"'>"+
    " <table width=140 id=tableHead border=0 cellspacing=1 cellpadding=0><tr align=center>"+
    " <td width=15 height=19 class=bg title='向前翻 1 月&#13;快捷键：←' style='cursor: hand' onclick='parent.prevM()'><b>&lt;</b></td>"+
    " <td width=60 id=meizzYearHead  title='点击此处选择年份' onclick='parent.funYearSelect(parseInt(this.innerText, 10))'"+
    " onmouseover='this.bgColor=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    " onmouseout='this.bgColor=parent.WebCalendar.lightColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
    " <td width=50 id=meizzYearMonth title='点击此处选择月份' onclick='parent.funMonthSelect(parseInt(this.innerText, 10))'"+
    " onmouseover='this.bgColor=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    " onmouseout='this.bgColor=parent.WebCalendar.lightColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
    " <td width=15 class=bg title='向后翻 1 月&#13;快捷键：→' onclick='parent.nextM()' style='cursor: hand'><b>&gt;</b></td></tr></table>"+
    " </td></tr>"+
    "<tr><td height=20><table id=tableWeek border=1 width=140 cellpadding=0 cellspacing=0 ";
    if(WebCalendar.drag){
       strIframe += "onmousedown='dragStart()' onmouseup='drag=false' onmouseout='drag=false'";
    }
    if(WebCalendar.display_type!="month"){
       strIframe +=
       " borderColorLight='"+ WebCalendar.darkColor +"' borderColorDark='"+ WebCalendar.lightColor +"'>"+
       " <tr align=center><td height=20>日</td><td>一</td><td>二</td><td>三</td><td>四</td><td>五</td><td>六</td></tr></table>"+
       " </td></tr><tr><td valign=top width=140 bgcolor='"+ WebCalendar.lightColor +"'>"+
       " <table id=tableDay height=120 width=140 border=0 cellspacing=1 cellpadding=0>";
    }
    for(var x=0; x<5; x++){
       strIframe += "<tr>";
       for(var y=0; y<7; y++)
          strIframe += "<td class=out id='meizzDay"+ (x*7+y) +"'></td>"; strIframe += "</tr>";
    }
    strIframe += "<tr>";
    if(WebCalendar.display_type!="month"){
       for(var x=35; x<39; x++)
          strIframe += "<td class=out id='meizzDay"+ x +"'></td>";
    }
    //关闭按钮
    if(WebCalendar.display_type!="month"){
       strIframe +=
       " <td colspan=3 class=out title='"+ WebCalendar.regInfo +"'><input style=' background-color: "+
         WebCalendar.btnBgColor +";cursor: hand; padding-top: 4px; width: 100%; height: 100%; border: 0' onfocus='this.blur()'"+
       " type=button value='&nbsp; &nbsp; 关闭' onclick='parent.hiddenCalendar()'></td></tr></table>";
    }
    if(WebCalendar.display_type=="month"){
       strIframe +=
       " <td class=out ><input style=' background-color: "+
            WebCalendar.btnBgColor +";cursor: hand; padding-top: 0px; width: 68px; height: 18px; border: 0' '"+
       " type=button value='确 定' id='ok' onclick='parent.returnDate();parent.document.getElementById(\"sfbf\").focus()'></td>"+
       " <td class=out title='"+ WebCalendar.regInfo +"' ><input style=' background-color: "+
         WebCalendar.btnBgColor +";cursor: hand; padding-top: 0px; width: 68px; height: 18px; border: 0' onfocus='this.blur()'"+
       " type=button value='关 闭' onclick='parent.hiddenCalendar()'></td></tr></table>";

   }
   if(WebCalendar.display_type!="month"){
     strIframe += "<tr><td height=20 width=140 bgcolor='"+ WebCalendar.lightColor +"'>";
   }
   //最下面一行
   if(WebCalendar.display_type=="date"){
       strIframe += " <table border=0 cellpadding=1 cellspacing=0 width=140>"+
       " <tr><td><input name=prevYear title='向前翻 1 年&#13;快捷键：↑' onclick='parent.prevY()' type=button value='&lt;&lt;'"+
       " onfocus='this.blur()' style='meizz:expression(this.disabled=parent.WebCalendar.thisYear==1000)'><input"+
       " onfocus='this.blur()' name=prevMonth title='向前翻 1 月&#13;快捷键：←' onclick='parent.prevM()' type=button value='&lt;&nbsp;'>"+
       " </td><td align=center><input name=today type=button value='Today' onfocus='this.blur()' style='width: 50' title='当前日期&#13;快捷键：T'"+
       " onclick=\"parent.returnDate(new Date().getDate() +'/'+ (new Date().getMonth() +1) +'/'+ new Date().getFullYear())\">"+
       " </td><td align=right><input title='向后翻 1 月&#13;快捷键：→' name=nextMonth onclick='parent.nextM()' type=button value='&nbsp;&gt;'"+
       " onfocus='this.blur()'><input name=nextYear title='向后翻 1 年&#13;快捷键：↓' onclick='parent.nextY()' type=button value='&gt;&gt;'"+
       " onfocus='this.blur()' style='meizz:expression(this.disabled=parent.WebCalendar.thisYear==9999)'></td></tr></table>"+
       " </td></tr><table>";
  }
 /**
 * 加上时间输入框 yuexiuyi 2003-10-25
 */
   if(WebCalendar.display_type=="datetime"){
       strIframe +=
       " <select name=tmpHourSelect  onblur='parent.hiddenSelect(this)' style='z-index:1;position:absolute;top:173;left:0;display:none'"+
       " onchange='parent.WebCalendar.thisHour = this.value; parent.hiddenSelect(this); parent.writeCalendar();'></select>"+
      " <select name=tmpMinuteSelect onblur='parent.hiddenSelect(this)' style='z-index:3;position:absolute;top:173;left:70;display:none'"+
      " onchange='parent.WebCalendar.thisMinute = this.value; parent.hiddenSelect(this); parent.writeCalendar();'></select>"+
	  //+
      // " <select name=tmpSecondSelect onblur='parent.hiddenSelect(this)' //style='z-index:2;position:absolute;top:173;left:90;display:none'"+
       //" onchange='parent.WebCalendar.thisSecond = this.value; parent.hiddenSelect(this); parent.writeCalendar();'></select>"+

      " <table border=0 cellpadding=1 cellspacing=0 width=140><tr>"+
      " <td align=left width=70 id=meizzHour  title='点击此处选择小时' onclick='parent.funHourSelect(parseInt(this.innerText, 10))'"+
      " onmouseover='this.bgColor=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
      " onmouseout='this.bgColor=parent.WebCalendar.lightColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
      " <td align=left width=70 id=meizzMinute title='点击此处选择分钟' onclick='parent.funMinuteSelect(parseInt(this.innerText, 10))'"+
      " onmouseover='this.bgColor=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
      " onmouseout='this.bgColor=parent.WebCalendar.lightColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
     //" <td align=left width=45 id=meizzSecond title='点击此处选择秒' onclick='parent.funSecondSelect(parseInt(this.innerText, 10))'"+
    // " onmouseover='this.bgColor=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    // " onmouseout='this.bgColor=parent.WebCalendar.lightColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
      "</tr></table>";
   }
   strIframe +="</td></tr>";
   strIframe +="<table></form></body></html>";

   with(WebCalendar.iframe)
    {
        document.writeln(strIframe);
        document.close();
        if(WebCalendar.display_type!="month"){
          for(var i=0; i<39; i++)
           {
               WebCalendar.dayObj[i] = eval("meizzDay"+ i);
               WebCalendar.dayObj[i].onmouseover = dayMouseOver;
               WebCalendar.dayObj[i].onmouseout  = dayMouseOut;
               WebCalendar.dayObj[i].onclick     = returnDate;
           }
        }
    }

}

function WebCalendar() //初始化日历的设置
{
     
	this.regInfo    = "WEB Calendar ver 3.0&#13;烟台海颐软件股份有限公司&#13;关闭的快捷键：[Esc]";
    //this.regInfo    = "WEB Calendar ver 3.0&#13;作者：meizz(梅花雪疏影横斜)&#13;网站：http://www.meizz.com/&#13;关闭的快捷键：[Esc]";
    //this.regInfo   += "&#13;&#13;Ver 2.0：walkingpoison(水晶龙)&#13;Ver 1.0：meizz(梅花雪疏影横斜)";
    this.daysMonth  = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    this.day        = new Array(39);            //定义日历展示用的数]组
    this.dayObj     = new Array(39);            //定义日期展示控件数组
    this.dateStyle  = null;                     //保存格式化后日期数组
    this.objExport  = null;                     //日历回传的显示控件
    this.eventSrc   = null;                     //日历显示的触发控件
    this.inputDate  = null;                     //转化外的输入的日期(d/m/yyyy)
    this.thisYear   = new Date().getFullYear(); //定义年的变量的初始值
    this.thisMonth  = new Date().getMonth()+ 1; //定义月的变量的初始值
    this.thisDay    = new Date().getDate();     //定义日的变量的初始值
    this.thisHour   = new Date().getHours();                     //定义年的变量的初始值
    this.thisMinute = new Date().getMinutes();                     //定义年的变量的初始值
    this.thisSecond = new Date().getSeconds();                     //定义年的变量的初始值
    this.display_type ="month";  //date是日期显示格式，datetime是日期时间显示格式，month是月份显示格式
    this.today      = this.thisDay +"/"+ this.thisMonth   +"/"+ this.thisYear;   //今天(d/m/yyyy)
    this.iframe     = window.frames("meizzCalendarIframe"); //日历的 iframe 载体
    this.calendar   = getObjectById("meizzCalendarLayer"); //日历的层
    this.dateReg    = "";           //日历格式验证的正则式
    this.yearFall   = 50;           //定义年下拉框的年差值
    this.format     = "yyyy-mm-dd"; //回传日期的格式
    this.timeShow   = false;         //是否返回时间
    this.drag       = false;        //是否允许拖动
    this.darkColor  = "#0000D0";    //控件的暗色
    this.lightColor = "#FFFFFF";    //控件的亮色
    this.btnBgColor = "#E6E6FA";    //控件的按钮背景色
    this.wordColor  = "#000080";    //控件的文字颜色
    this.wordDark   = "#DCDCDC";    //控件的暗文字颜色
    this.dayBgColor = "#F5F5FA";    //日期数字背景色
    this.todayColor = "#FF0000";    //今天在日历上的标示背景色
    this.DarkBorder = "#D4D0C8";    //日期显示的立体表达色
}

WebCalendar = new WebCalendar();
function calendar() //主调函数
{
   
	var e = window.event.srcElement;   writeIframe();
    var o = WebCalendar.calendar.style; WebCalendar.eventSrc = e;
	if (arguments.length == 0) WebCalendar.objExport = e;
    else WebCalendar.objExport = eval(arguments[0]);

    WebCalendar.iframe.tableWeek.style.cursor = WebCalendar.drag ? "move" : "default";
	var t = e.offsetTop,  h = e.clientHeight, l = e.offsetLeft, p = e.type;
	while (e = e.offsetParent){t += e.offsetTop; l += e.offsetLeft;}
    o.display = ""; WebCalendar.iframe.document.body.focus();
    var cw = WebCalendar.calendar.clientWidth, ch = WebCalendar.calendar.clientHeight;
    var dw = document.body.clientWidth, dl = document.body.scrollLeft, dt = document.body.scrollTop;
    
    if (document.body.clientHeight + dt - t - h >= ch) o.top = (p=="image")? t + h : t + h + 6;
    else o.top  = (t - dt < ch) ? ((p=="image")? t + h : t + h + 6) : t - ch;
    if (dw + dl - l >= cw) o.left = l; else o.left = (dw >= cw) ? dw - cw + dl : dl;
/*
    if  (WebCalendar.display_type=="date") WebCalendar.dateReg = /^(\d{1,4})(-|\/|.)(\d{1,2})\2(\d{1,2})$/;
    if (WebCalendar.display_type=="month") WebCalendar.dateReg=/^([0-9]{4}|[0-9]{2})-([0-9]{1,2})$/;
	if (WebCalendar.display_type=="datetime")
	 WebCalendar.dateReg = /^(\d{1,4})(-|\/|.)(\d{1,2})\2(\d{1,2}) (\d{1,2}):(\d{1,2}):(\d{1,2})$/;

    try{
        if (WebCalendar.objExport.value.trim() != ""){
	
            WebCalendar.dateStyle = WebCalendar.objExport.value.trim().match(WebCalendar.dateReg);
			alert(WebCalendar.dateStyle);
            if (WebCalendar.dateStyle == null)
            {
                WebCalendar.thisYear   = new Date().getFullYear();
                WebCalendar.thisMonth  = new Date().getMonth()+ 1;
                WebCalendar.thisDay    = new Date().getDate();
                alert("原文本框里的日期有错误！\n可能与你定义的显示时分秒有冲突！");
                writeCalendar(); return false;
            }
            else
            {
                WebCalendar.thisYear   = parseInt(WebCalendar.dateStyle[1], 10);
                WebCalendar.thisMonth  = parseInt(WebCalendar.dateStyle[3], 10);
                WebCalendar.thisDay    = parseInt(WebCalendar.dateStyle[4], 10);
				
                WebCalendar.inputDate  = parseInt(WebCalendar.thisDay, 10) +"/"+ parseInt(WebCalendar.thisMonth, 10) +"/"+ 
                parseInt(WebCalendar.thisYear, 10); writeCalendar();
            }
        }  else writeCalendar();
    }  catch(e){writeCalendar();}*/
	writeCalendar();
}
function funMonthSelect() //月份的下拉框
{
    var m = isNaN(parseInt(WebCalendar.thisMonth, 10)) ? new Date().getMonth() + 1 : parseInt(WebCalendar.thisMonth);
    var e = WebCalendar.iframe.document.forms[0].tmpMonthSelect;
    for (var i=1; i<13; i++) e.options.add(new Option(i +"月", i));
    e.style.display = ""; e.value = m; e.focus();
}
function funYearSelect() //年份的下拉框
{
    var n = WebCalendar.yearFall;
    var e = WebCalendar.iframe.document.forms[0].tmpYearSelect;
    var y = isNaN(parseInt(WebCalendar.thisYear, 10)) ? new Date().getFullYear() : parseInt(WebCalendar.thisYear);
        y = (y <= 1000)? 1000 : ((y >= 9999)? 9999 : y);
    var min = (y - n >= 1000) ? y - n : 1000;
    var max = (y + n <= 9999) ? y + n : 9999;
        min = (max == 9999) ? max-n*2 : min;
        max = (min == 1000) ? min+n*2 : max;
    for (var i=min; i<=max; i++) e.options.add(new Option(i +"年", i));
    e.style.display = ""; e.value = y; e.focus();
}
function funHourSelect()//小时的下拉框
{
    var m = isNaN(parseInt(WebCalendar.thisHour, 10)) ? new Date().getHours() : parseInt(WebCalendar.thisHour);
    var e = WebCalendar.iframe.document.forms[0].tmpHourSelect;
    for (var i=0; i<24; i++) e.options.add(new Option(i +" 时", i));
    e.style.display = "";
	
    e.value = m;
    e.focus();

}
function funMinuteSelect()//分钟的下拉框
{
    var m = isNaN(parseInt(WebCalendar.thisMinute, 10)) ? new Date().getMinutes() : parseInt(WebCalendar.thisMinute);
    var e = WebCalendar.iframe.document.forms[0].tmpMinuteSelect;
    for (var i=0; i<60; i++) e.options.add(new Option(i +" 分", i));
    e.style.display = "";
    e.value = m;
    e.focus();

}
function funSecondSelect()//秒的下拉框
{
    var m = isNaN(parseInt(WebCalendar.thisSecond, 10)) ? new Date().getSeconds() : parseInt(WebCalendar.thisSecond);
    var e = WebCalendar.iframe.document.forms[0].tmpSecondSelect;
    for (var i=0; i<60; i++) e.options.add(new Option(i +" 秒", i));
    e.style.display = "";
    e.value = m;
    e.focus();

}
function prevM()  //往前翻月份
{
    WebCalendar.thisDay = 1;
    if (WebCalendar.thisMonth==1)
    {
        WebCalendar.thisYear--;
        WebCalendar.thisMonth=13;
    }
    WebCalendar.thisMonth--; writeCalendar();
}
function nextM()  //往后翻月份
{
    WebCalendar.thisDay = 1;
    if (WebCalendar.thisMonth==12)
    {
        WebCalendar.thisYear++;
        WebCalendar.thisMonth=0;
    }
    WebCalendar.thisMonth++; writeCalendar();
}
function prevY(){WebCalendar.thisDay = 1; WebCalendar.thisYear--; writeCalendar();}//往前翻 Year
function nextY(){WebCalendar.thisDay = 1; WebCalendar.thisYear++; writeCalendar();}//往后翻 Year
function hiddenSelect(e){for(var i=e.options.length; i>-1; i--)e.options.remove(i); e.style.display="none";}
function getObjectById(id){
    if(document.all){
     return(eval("document.all."+ id));
    }
     return(eval(id));
}
function hiddenCalendar(){
   getObjectById("meizzCalendarLayer").style.display = "none";
   getObjectById("meizzCalendarLayerMonth").style.display = "none";
}
function appendZero(n){return(("00"+ n).substr(("00"+ n).length-2));}//日期自动补零程序
//function String.prototype.trim(){return this.replace(/(^\s*)|(\s*$)/g,"");}
function dayMouseOver()
{
    this.className = "over";
    this.style.backgroundColor = WebCalendar.darkColor;
    if(WebCalendar.day[this.id.substr(8)].split("/")[1] == WebCalendar.thisMonth)
    this.style.color = WebCalendar.lightColor;
}
function dayMouseOut()
{
    this.className = "out"; var d = WebCalendar.day[this.id.substr(8)], a = d.split("/");
    this.style.removeAttribute('backgroundColor');
    if(a[1] == WebCalendar.thisMonth && d != WebCalendar.today)
    {
        if(WebCalendar.dateStyle && a[0] == parseInt(WebCalendar.dateStyle[4], 10))
        this.style.color = WebCalendar.lightColor;
        this.style.color = WebCalendar.wordColor;
    }
}
function writeCalendar() //对日历显示的数据的处理程序
{
   
	var y = WebCalendar.thisYear;
	
    var m = WebCalendar.thisMonth;

    var d = WebCalendar.thisDay;
    var h = WebCalendar.thisHour;
    var mi = WebCalendar.thisMinute;
    var s = WebCalendar.thisSecond;
    WebCalendar.daysMonth[1] = (0==y%4 && (y%100!=0 || y%400==0)) ? 29 : 28;
    if (!(y<=9999 && y >= 1000 && parseInt(m, 10)>0 && parseInt(m, 10)<13 && parseInt(d, 10)>0)){
        alert("对不起，你输入了错误的日期！");
        WebCalendar.thisYear   = new Date().getFullYear();
        WebCalendar.thisMonth  = new Date().getMonth()+ 1;
        WebCalendar.thisDay    = new Date().getDate(); }
    y = WebCalendar.thisYear;
    m = WebCalendar.thisMonth;
    d = WebCalendar.thisDay;

    WebCalendar.iframe.meizzYearHead.innerText  = y +" 年";
    WebCalendar.iframe.meizzYearMonth.innerText = parseInt(m, 10) +" 月";

    if(WebCalendar.display_type=="datetime"){
        WebCalendar.iframe.meizzHour.innerText = parseInt(h, 10) +" 时";///
        WebCalendar.iframe.meizzMinute.innerText = parseInt(mi, 10) +" 分";
      //  WebCalendar.iframe.meizzSecond.innerText = parseInt(s, 10) +" 秒";
    }
    WebCalendar.daysMonth[1] = (0==y%4 && (y%100!=0 || y%400==0)) ? 29 : 28; //闰年二月为29天
    var w = new Date(y, m-1, 1).getDay();
    var prevDays = m==1  ? WebCalendar.daysMonth[11] : WebCalendar.daysMonth[m-2];
    for(var i=(w-1); i>=0; i--) //这三个 for 循环为日历赋数据源（数组 WebCalendar.day）格式是 d/m/yyyy
    {
        WebCalendar.day[i] = prevDays +"/"+ (parseInt(m, 10)-1) +"/"+ y;
        if(m==1) WebCalendar.day[i] = prevDays +"/"+ 12 +"/"+ (parseInt(y, 10)-1);
        prevDays--;
    }
    for(var i=1; i<=WebCalendar.daysMonth[m-1]; i++) WebCalendar.day[i+w-1] = i +"/"+ m +"/"+ y;
    for(var i=1; i<39-w-WebCalendar.daysMonth[m-1]+1; i++)
    {
        WebCalendar.day[WebCalendar.daysMonth[m-1]+w-1+i] = i +"/"+ (parseInt(m, 10)+1) +"/"+ y;
        if(m==12) WebCalendar.day[WebCalendar.daysMonth[m-1]+w-1+i] = i +"/"+ 1 +"/"+ (parseInt(y, 10)+1);
    }
  if(WebCalendar.display_type!="month"){
    for(var i=0; i<39; i++)    //这个循环是根据源数组写到日历里显示
    {
        var a = WebCalendar.day[i].split("/");
        WebCalendar.dayObj[i].innerText    = a[0];
        WebCalendar.dayObj[i].title        = a[2] +"-"+ appendZero(a[1]) +"-"+ appendZero(a[0]);
        WebCalendar.dayObj[i].bgColor      = WebCalendar.dayBgColor;
        WebCalendar.dayObj[i].style.color  = WebCalendar.wordColor;
        if ((i<10 && parseInt(WebCalendar.day[i], 10)>20) || (i>27 && parseInt(WebCalendar.day[i], 10)<12))
            WebCalendar.dayObj[i].style.color = WebCalendar.wordDark;
        if (WebCalendar.inputDate==WebCalendar.day[i])    //设置输入框里的日期在日历上的颜色
        {WebCalendar.dayObj[i].bgColor = WebCalendar.darkColor; WebCalendar.dayObj[i].style.color = WebCalendar.lightColor;}
        if (WebCalendar.day[i] == WebCalendar.today)      //设置今天在日历上反应出来的颜色
        {WebCalendar.dayObj[i].bgColor = WebCalendar.todayColor; WebCalendar.dayObj[i].style.color = WebCalendar.lightColor;}
    }
  }

}

function returnDate() //根据日期格式等返回用户选定的日期
{
    var displayMode = WebCalendar.display_type;
    if(WebCalendar.objExport)
    {
      var returnValue;
      var a ;
      var d;
      var flag;
      if (displayMode !="month"){
          a = (arguments.length==0) ? WebCalendar.day[this.id.substr(8)].split("/") : arguments[0].split("/");
          d = WebCalendar.format.match(/^(\w{4})(-|\/)(\w{1,2})\2(\w{1,2})$/);
          if(d==null){alert("你设定的日期输出格式不对！\r\n\r\n请重新定义 WebCalendar.format ！"); return false;}
          flag = d[3].length==2 || d[4].length==2; //判断返回的日期格式是否要补零
          returnValue = flag ? a[2] +d[2]+ appendZero(a[1]) +d[2]+ appendZero(a[0]) : a[2] +d[2]+ a[1] +d[2]+ a[0];
      }
      var inputYearObject;
      var inputMonthObject;
      var inputYearValue;
      var inputMonthValue;
      inputYearObject = WebCalendar.iframe.document.getElementById("meizzYearHead");
      inputYearValue = inputYearObject.innerText;
      inputYearValue = inputYearValue.substr(0,inputYearValue.length-2);

      inputMonthObject = WebCalendar.iframe.document.getElementById("meizzYearMonth");
      inputMonthValue = inputMonthObject.innerText;
      inputMonthValue = inputMonthValue.substr(0,inputMonthValue.length-2);
      var inputHourObject;
      var inputHourValue;
      var inputMinuteObject;
      var inputMinuteValue;
      var inputSecondObject;
      var inputSecondValue;
      if (displayMode =="datetime"){
         inputHourObject = WebCalendar.iframe.document.getElementById("meizzHour");
         inputHourValue = inputHourObject.innerText;
         inputHourValue = inputHourValue.substr(0,inputHourValue.length-2);

         inputMinuteObject = WebCalendar.iframe.document.getElementById("meizzMinute");
         inputMinuteValue = inputMinuteObject.innerText;
         inputMinuteValue = inputMinuteValue.substr(0,inputMinuteValue.length-2);

        // inputSecondObject = WebCalendar.iframe.document.getElementById("meizzSecond");
        // inputSecondValue = inputSecondObject.innerText;
        // inputSecondValue = inputSecondValue.substr(0,inputSecondValue.length-2);
      }
        if(WebCalendar.timeShow)
        {
            var h = new Date().getHours(), m = new Date().getMinutes();// s = new Date().getSeconds();
            returnValue += flag ? " "+ appendZero(h) +":"+ appendZero(m)  : " "+  h  +":"+ m ;
        }
        /**show*///取得显示时间
        if (displayMode =="date"){
           returnValue = returnValue.trim().substr(0,10);//
        }
        if (displayMode =="datetime"){
           returnValue = returnValue.trim().substr(0,10)+" "+appendZero(inputHourValue)+":"+appendZero(inputMinuteValue);//+":"+appendZero(inputSecondValue);
           //returnValue = returnValue.trim().substr(0,19);//
        }
        if (displayMode =="month"){
           returnValue = inputYearValue+"-"+appendZero(inputMonthValue);//
        }
        /**send to web server *///取得隐藏上传时间
        var destElementName = WebCalendar.objExport.name;
        var delim = destElementName.indexOf("_MASK");
        if (delim > 0) {
           // “_MASK”以前的加“_MASK”以后的
           destElementName= destElementName.substring(0,delim ) + destElementName.substring(delim+5,destElementName.length);
         }
        var destElementId = window.document.getElementById(destElementName);
	var originalValue = destElementId.value;
        /**send to web server */
        if (displayMode =="date"){
           destElementId.value = returnValue+" 00:00:00.0";
           WebCalendar.objExport.value = returnValue;
        }
        if (displayMode =="datetime"){
           destElementId.value = returnValue+".0";
           WebCalendar.objExport.value = returnValue;
        }
        if (displayMode =="month"){
           destElementId.value = returnValue+"-01 00:00:00.0";
           WebCalendar.objExport.value = returnValue;
        }
        hiddenCalendar();
	//如果时间值发生变化，相应onchange事件
	//if(originalValue!=destElementId.value){
	//alert(destElementId.value);
	//  destElementId.onchange();
	//}
    }
}

/*function document.onclick()
{
    if(WebCalendar.eventSrc != window.event.srcElement)
     hiddenCalendar();
}*/