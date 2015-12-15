<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

	request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Estreller</title>
<link href="${ctx}/content/css/reset.css" type="text/css" rel="stylesheet"/>
<link href="${ctx}/content/css/Style.css" type="text/css" rel="stylesheet"/>
</head>
<body>
   <header id="header">
   <div class="content-container">
  		<tiles:insertAttribute name ="header"/>
    </div>
   </header>
   <div id="body">
   <div class="content-container">
		<tiles:insertAttribute name ="body"/>
   </div>
   </div>
    <div id="footer">
   </div>
</body>
</html>