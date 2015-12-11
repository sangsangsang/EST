<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginMainpage</title>
<link href="${pageContext.request.contextPath}/content/css/reset.css" type="text/css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/content/reviews/css/reviewBase.css" type="text/css" rel="stylesheet">
</head>
<body>
<header id="header">
   <div class="content-container">
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
            <a href=""><img src="../images/search.png" alt="검색" /></a>
    </nav> 
    <nav id="new-write">
           <a href="../Review/reviewReg.html"><img src="../images/new_write.png" alt="새글쓰기" /></a>
    </nav> 
    <nav id="logout">
           <a href="../MainPage.html"><img src="../images/logout.png" alt="로그아웃" /></a>
    </nav> 
   <section>
      <h1 class="hidden">회원</h1>
         
         
         <nav id="profile">
            <a href="../mypage/MemberInfo.html"><img src="../images/faceimg.png" alt="프로필수정" /></a>
       </nav>
       <p><a href="" alt="마이페이지">I23412343124124312D님</a></p>
        <nav id="write">
           <a href=""><img src="../images/scrap.png" alt="스크랩" /></a>
       </nav> 
       <nav id="comment">
            <a href=""><img src="../images/comment.png" alt="댓글" /></a>
       </nav> 
       <nav id="like">
            <a href=""><img src="../images/like.png" alt="좋아요" /></a>
       </nav>
       <nav id="report">
            <a href=""><img src="../images/report.png" alt="신고하기" /></a>
       </nav> 
         
      
       
   </section>
    </div>
   </header>
   <!-- <div id="visual">
   </div> -->
   <div id="body">
   <div class="content-container">
      <main id="main">
         <h1 class="hidden">로그인했을떄 모든글 최신으로 보여지기</h1>
           
      <main>   
   </div>
   </div>
   <!-- <div id="footer">
   </div> -->
</body>
</html>