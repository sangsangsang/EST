<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
   <c:set var="ctx" value="${pageContext.request.contextPath}"/>
   <h1 class="hidden">메인</h1>
   <nav id="main-menu">
      <h1 class="hidden">카테고리</h1>
      <ul>
      <li><a href="${ctx}/category/sports-list">Sports</a></li>
      <li><a href="${ctx}/category/movie-list">Movie</a></li>
      <li><a href="${ctx}/category/game-list">Game</a></li>
      <li><a href="${ctx}/category/book-list">Book</a></li>
      <li><a href="${ctx}/category/music-list">Music</a></li>
      <li><a href="${ctx}/category/fashion&beauty-list">Fashion&Beauty</a></li>
      <li><a href="${ctx}/category/show&concert-list">Show&Concert</a></li>
      <li><a href="${ctx}/category/food-list">Food</a></li>
      <li><a href="${ctx}/category/travel-list">Travel</a></li>
      <li><a href="${ctx}/category/electronics-list">Electronics</a></li>
      </ul>
   </nav>
    <nav id="search">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/search.png" alt="검색" /></a>
    </nav> 
    <nav id="new-write">
           <a href="reviewReg"><img src="${pageContext.request.contextPath}/content/images/new_write.png" alt="새글쓰기" /></a>
    </nav> 
    <nav id="logout">
           <a href=""><img src="${pageContext.request.contextPath}/content/images/logout.png" alt="로그아웃" /></a>
    </nav> 
   <section>
      <h1 class="hidden">회원</h1>
         
         
         <nav id="profile">
            <a href="../mypage/MemberInfo.html"><img src="${pageContext.request.contextPath}/content/images/faceimg.png" alt="프로필수정" /></a>
       </nav>
       <p><a href="" alt="마이페이지">I23412343124124312D님</a></p>
        <nav id="write">
           <a href=""><img src="${pageContext.request.contextPath}/content/images/scrap.png" alt="스크랩" /></a>
       </nav> 
       <nav id="comment">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/comment.png" alt="댓글" /></a>
       </nav> 
       <nav id="like">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/like.png" alt="좋아요" /></a>
       </nav>
       <nav id="report">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/report.png" alt="신고하기" /></a>
       </nav> 
         
       
   </section>