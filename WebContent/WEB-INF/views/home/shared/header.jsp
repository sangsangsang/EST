<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%

	request.getContextPath();
%>

<h1 class="hidden">메인</h1>
   <nav id="main-menu">
      <h1 class="hidden">카테고리</h1>
      <ul>
      <li><a href="Category/Sports.html">Sports</a></li>
      <li><a href="Category/Movie.html">Movie</a></li>
      <li><a href="Category/Game.html">Game</a></li>
      <li><a href="Category/Book.html">Book</a></li>
      <li><a href="Category/Music.html">Music</a></li>
      <li><a href="Category/Fashion&Beauty.html">Fashion&Beauty</a></li>
      <li><a href="Category/Show&Concert.html">Show&Concert</a></li>
      <li><a href="Category/Food.html">Food</a></li>
      <li><a href="Category/Travel.html">Travel</a></li>
      <li><a href="Category/Electronics.html">Electronics</a></li>
      </ul>
   </nav>
   <nav id="search">
         <input type="submit" value="검색"/>
      </nav> 
   <section>
      <h1 class="hidden">회원</h1>
   
       <section>
         <h1 class="hidden">로그인</h1>
         <form id="login-form" action="<c:url value="/j_spring_security_check"/>" method="post" >
            <fieldset class="clearfix">
                  <label >E-mail</label>
                  <input type="email" name="email"/>
                              
                  <label>Passward</label>
                  <input type="password" name="pwd"/>
                  <a href="login-review_list"><input type="submit" value="로그인"/></a>
            </fieldset>
         </form>
       </section>
         
      <nav id="member-join">
          <h1 class="clearfix"><a href="${ctx}/joinus/join">Sign</a></h1>
      </nav>
      
      <nav id="password-find">
         <h1 class="clearfix"><a href="${ctx}/joinus/find-password">Find Passward</a></h1>
      </nav>
       
   </section>