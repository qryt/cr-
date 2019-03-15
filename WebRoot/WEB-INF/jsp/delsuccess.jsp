<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统</title>
    	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统">
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
  
  <body>
 <c:if test="${flag=='1'}">
<script>alert("删除成功！");window.close();</script>
</c:if>
 <c:if test="${flag=='0'}">
<script>alert("删除失败！");window.close();</script>
</c:if>
  </body>
</html>
