<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>
<%@ taglib uri ="http://jsptags.com/tags/navigation/pager"  prefix ="pg" %>
<%
int size=0;
int i=0;
int j=0;
int k=0;
int l=0;
if(request.getAttribute("size")!=null)
size=Integer.parseInt(request.getAttribute("size").toString());
if((size%10)!=0)
{j=size/10+1;
l=size/10+1;
}else
{j=size/10;
l=size/10;
}
if(j==0)
j=1;
k=0;
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>集装箱修理管理系统->修理方法</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="javascript">
function sel(a){
	var arr=a.split("|");
	
	var row=<%=request.getParameter("row")%>;
	
parent.document.getElementsByName("lx")[row].value=arr[0];
 
parent.document.getElementsByName("xs")[row].value=arr[1];

parent.document.getElementsByName("gsf")[row].value=arr[2];
parent.document.getElementsByName("clf")[row].value=arr[3];
parent.document.getElementsByName("gsfl")[row].value=arr[4];
parent.document.getElementsByName("xsl")[row].value=arr[1];
parent.document.getElementsByName("clfl")[row].value=arr[3];
parent.document.getElementsByName("xlmx")[row].value=arr[5];
parent.document.getElementsByName("sl")[row].value="1";
parent.document.getElementsByName("sl")[row].focus();
parent.document.getElementById("showdiv").style.visibility="hidden";
}
</script>
<style type="text/css">
.tableBorder1
{
width:100%;
border: 1px;
background-color: #6595D6;
}
</style>
  </head>
  
  <body style="margin:0px">
   <input type="hidden" id="si" name="si" value="<%=l%>" />
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="tableBorder1">
<tr bgcolor="#6595d6"><td><font style="font-size:12px">序号</font></td><td><font style="font-size:12px">类型</font></td></tr>
<pg:pager  index="center"  export="pageOffset,currentPageNumber=pageNumber" isOffset="false"   url="list.htm" items="<%=size%>" scope="request" maxIndexPages="10" maxPageItems="10">

<c:forEach items="${xlfl2}" var="xlfl2"> <pg:item>
  <% k++; %>
 <TR bgcolor="#ffffff" onDblclick="sel('${xlfl2.lx }|<fmt:formatNumber value="${xlfl2.gs }" pattern="#0.00"></fmt:formatNumber>|<fmt:formatNumber value="${xlfl2.gsf }" pattern="#0.00"></fmt:formatNumber>|<fmt:formatNumber value="${xlfl2.clf }" pattern="#0.00"></fmt:formatNumber>|<fmt:formatNumber value="${xlfl2.gsfl }" pattern="#0.00"></fmt:formatNumber>|${xlfl2.xlmx }');" onmouseover=this.bgColor='#bbbbbb';   onmouseout=this.bgColor='#ffffff'; >
<TD width="50" ><input type="hidden" name="d<%=k-1 %>" id="d<%=k-1 %>" value="${xlfl2.lx }|<fmt:formatNumber value="${xlfl2.gs }" pattern="#0.00"></fmt:formatNumber>|<fmt:formatNumber value="${xlfl2.gsf }" pattern="#0.00"></fmt:formatNumber>|<fmt:formatNumber value="${xlfl2.clf }" pattern="#0.00"></fmt:formatNumber>|<fmt:formatNumber value="${xlfl2.gsfl }" pattern="#0.00"></fmt:formatNumber>|${xlfl2.xlmx}" /><font style="font-size:12px"><%=k-1 %></font></TD>
                                <TD ><font style="font-size:12px">${xlfl2.lx }</font></TD>

                       		</TR>
                               </pg:item>
                               </c:forEach>



 <pg:index>


    <tr align=center valign=top><td colspan="9"><table><tr>
    <td valign=bottom ></td>
    <pg:prev ifnull="true">
      <% if (pageUrl != null) { %>
        <td align=right><A HREF="<%=pageUrl%>&pageNo=<%=pageNumber%>&id=<%=request.getParameter("id")%>&bh=<%=request.getParameter("bh")%>&xlff=<%=request.getParameter("xlff")%>&c=<%=request.getParameter("c")%>&k=<%=request.getParameter("k")%>&lx=<%=request.getParameter("lx")%>&action=listlx">
        <b style="font-size:12px">上一页</b></A></td>
      <% } else { %>
        <td></td>
      <% } %>
    </pg:prev>
    <pg:pages>
      <% if (pageNumber == currentPageNumber) { %>
        <td >
        <font color=#A90A08><%= pageNumber %></font></td>
      <% } else { %>
        <td><A style="font-size:12px" HREF="<%=pageUrl%>&pageNo=<%=pageNumber%>&id=<%=request.getParameter("id")%>&bh=<%=request.getParameter("bh")%>&xlff=<%=request.getParameter("xlff")%>&c=<%=request.getParameter("c")%>&k=<%=request.getParameter("k")%>&lx=<%=request.getParameter("lx")%>&action=listlx">
        <%=pageNumber%></A></td>
      <% } %>
    </pg:pages>
    <pg:next ifnull="true" >
      <% if (pageUrl != null) { %>
        <td align=right><A HREF="<%=pageUrl%>&pageNo=<%=pageNumber%>&id=<%=request.getParameter("id")%>&bh=<%=request.getParameter("bh")%>&xlff=<%=request.getParameter("xlff")%>&c=<%=request.getParameter("c")%>&k=<%=request.getParameter("k")%>&lx=<%=request.getParameter("lx")%>&action=listlx">
        <b style="font-size:12px">下一页</b></A></td>
      <% } else { %>
        <td></td>
      <% } %>
    </pg:next>
   </tr></table></td> </tr>

  </pg:index>
</pg:pager>
</table>
  </body>
</html>
