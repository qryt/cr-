<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->报表打印选择</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/jquery-1.2.6.js"></script>
 <script type="text/javascript" src="js/javascript.js"></script>
  <script type="text/javascript" src="js/changedate.js"></script>
<link rel="stylesheet" type="text/css" href="gt_grid.css" />

<!-- 请根据语言和系统编码,自行选择引入的 gt_msg_...js 文件 (默认的msg文件为UTF-8编码) -->
<script type="text/javascript" src="js/gt_msg_cn.js"></script>
<script type="text/javascript" src="js/gt_grid_all.js"></script>
<script language="JavaScript" src="js/calendar_month.js" type="text/JavaScript"></script>
 <script language="javascript" type="text/javascript">  
    function choose(src, dst) {
        var oSelect1 = document.getElementById(src);
        var oSelect2 = document.getElementById(dst);
        
        var opts = new Array();           
        var i;                    
         
        for(i = 0; i < oSelect1.options.length; i++)
        {            
            var item = oSelect1.options[i];        
            if(item.selected) {
               opts.push(item);                
            }
        }       
        
        for(i = 0; i < opts.length; i++)
        {            
            var opt = document.createElement("<option>");
            opt.text = opts[i].text;
            opt.value = opts[i].value;
            
            if(navigator.appName == 'Microsoft Internet Explorer') {
                oSelect2.add(opt);
                //oSelect2.add(opt, null); // IE 不支持
                //oSelect2.appendChild(opt); // IE 不支持,可以添加，但是不显示，^||^
            }
            else {
                //oSelect2.add(opt);      // firefox 不支持
                oSelect2.add(opt, null);                
                //oSelect2.appendChild(opt); // firefox 支持
            }
            oSelect1.removeChild(opts[i]);                    
        }
    }   
</script>
  </head>
  
  <body onload="MM_dragLayer('showdiv','',0,0,0,0,true,false,-1,-1,-1,-1,false,false,0,'',false,'');">
<div id="Layer1" style="position:absolute; height:14px; z-index:1; width: 19px;">
<div id="showdiv" style="position:absolute; width:330px; height:250px; z-index:1; left: 160px; top: 180px; visibility: hidden;">
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
        <td bgcolor="#FFFFFF"><iframe  width="100%" height="215" scrolling="no" frameborder="1" id="fid" name="fid" src="list.htm?id=&action=listsh"></iframe></td>
      </tr>
    </table>
  </div>
</div>
<table class="table_1"  ><tr><td background="images/menu_bg.png" style="color:#3965b5;height:20px;font-weight: bold;border-bottom:1px solid #D1DAE6;">&nbsp;&nbsp;报表打印选择</td></tr><tr><td height=10></td></tr><tr><td style="padding:5px;"><fieldset style="width:100%;height:60px;border: 1 solid #3e7fd9;" ><legend>字段选择</legend>

<table width="100%" cellpadding="0" cellspacing="0" border="0" >
<tr><td width="50">&nbsp;</td><td>
<select id="oSelect1" name="Cars" size="10" multiple="multiple" style="width:120px">
<option value="RCBH">进场编号</option>
<option value="CGS">船公司</option>
<option value="XH" >箱号</option>
<option value="XH" >尺寸</option>
<option value="RCBH">箱型</option>
<option value="CGS">制造年月</option>
<option value="XH" >进场拖车</option>
<option value="XH" >来箱地</option>
<option value="RCBH">进场状态</option>
<option value="CGS">进场位置</option>
<option value="XH" >位置描叙</option>
<option value="XH" >EIR流水号</option>
<option value="RCBH">进场编号</option>
<option value="CGS">转关地</option>
<option value="XH" >作业工人</option>
<option value="XH" >进场时间</option>
<option value="RCBH">确认时间</option>
<option value="CGS">完工时间</option>
<option value="XH" >出场时间</option>
<option value="XH" >结帐时间</option>
</select> </td><td>
<input type="button" onclick="choose('oSelect1', 'oSelect2')" value="－＞" /><br />
<input type="button" onclick="choose('oSelect2', 'oSelect1')" value="＜－" />
</td><td><select id="oSelect2" name="Cars" size="10" multiple="multiple" style="width:120px">
</select></td></tr>
 <tr><td height="10"></td></tr>
<tr><td colspan="8" style="color:red" align="center">&nbsp;<form:errors path="*"></form:errors></td></tr>
<tr ><td style="padding:5px;" colspan="8" align="center"><input type="submit" id="submit" class="btn_2k3" value="报表导出">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn_2k3" value="关闭" onclick="window.close()"></td></tr>


 </table>
 
</fieldset><table><tr><td style="height:5px"></td></tr></table></td></tr>

</table>

  </body>
</html>
