<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%

	request.getContextPath();
%>
<div class="logo-center">
			<span>
				<a href="${ctx}/home/mainPage">
				<img src="${ctx}/content/images/smallLogo.png" alt="estrellerLogo">
				</a>
			</span>
		</div>