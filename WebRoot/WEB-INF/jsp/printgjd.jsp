<%@ page contentType="text/html;charset=UTF-8"%>   
<%@page import="java.util.Enumeration"%>   
<%@page import="java.net.URLDecoder"%>   
<%   
   String bh = request.getParameter("bh");   
 String chk=request.getParameter("chk"); 
  // System.out.println("viewer.jsp  =========:"+new String(condition.getBytes("ISO8859_1"),"UTF-8"));   
%>   
<html>   
    <head>   
    </head>   
    <body>   
        <!--"CONVERTED_APPLET"-->   
        <!-- HTML CONVERTER -->   
        <object id="app" classid="clsid:8AD9C840-044E-11D1-B3E9-00805F499D93"  
            codebase="http://java.sun.com/update/1.5.0/jinstall-1_5-windows-i586.cab#Version=5,0,0,5"  
            WIDTH="100%" HEIGHT="100%">   
            <PARAM NAME=CODE VALUE="PrintGjdApplet.class">   
            <param name="scriptable" value="false">   
            <PARAM NAME=CODEBASE VALUE="applet/.">   
            <PARAM NAME=ARCHIVE   
                VALUE="jasperreports-3.0.1-javaflow.jar,jasperreports-3.0.1-applet.jar,commons-collections-3.2.jar,antlr-2.7.6.jar,jfreechart-1.0.9.jar,jxl.jar,poi-3.0.1.jar">   
            <param name="type" value="application/x-java-applet;version=1.5">   
            <PARAM NAME="bh" VALUE="<%=bh%>">   
             <PARAM NAME="chk" VALUE="<%=chk%>">   
            <comment>   
            <embed type="application/x-java-applet;version=1.6"  
                \   
            ARCHIVE="jasperreports-3.0.1-javaflow.jar,jasperreports-3.0.1-applet.jar,commons-collections-3.2.jar,antlr-2.7.6.jar,jfreechart-1.0.9.jar,jxl.jar,poi-3.0.1.jar"  
                \   
            WIDTH="0"    
                \   
            HEIGHT="0"  
                \   
            CODE="PrintGjdApplet.class"  
                \   
            CODEBASE="applet/."  
                \   
            ARCHIVE="jasperreports-3.0.1-javaflow.jar,jasperreports-3.0.1-applet.jar,commons-collections-3.2.jar,antlr-2.7.6.jar,jfreechart-1.0.9.jar,jxl.jar,poi-3.0.1.jar"  
                \   
            scriptable="false"  
                \   
            bh="<%=bh%>"  
              \   
            chk="<%=chk%>" 
                \   
            scriptable=false  
            pluginspage="http://java.sun.com/products/plugin/index.html#download">   
                <noembed>   
                    </XMP>   
                </noembed>   
            </embed>   
            </comment>   
        </object>   
    </body>   
</html>  
