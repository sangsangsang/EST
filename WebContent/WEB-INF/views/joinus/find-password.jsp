<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

	request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
   
	<main id="join-main">
			
			<p>비밀번호 찾기</p>		
				<div id="box" class="hc vc">
			   <br>
               <br>
               <br>
               <br>
               <br>
	         	<label id="find-passward"><b>가입하신 E-mail을 입력해주세요.</b></label>
	           <br>
               <br>
               <br>
               <br>
               <br>
                <form id = "find-form">
              <fieldset class="clearfix">
               <input id="find-input" type="email"/><br>
              <label id="find-passward">(임시비밀번호가 가입하신 E-mail로 전송됩니다.)</label>
               <br>
               <br>
               <br>
               <br>
               <br>
               <br>
			  <input type="submit" value="비밀번호 E-mail 전송"/>
				</fieldset>
				</form>
			</main>