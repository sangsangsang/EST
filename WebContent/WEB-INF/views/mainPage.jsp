<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Estreller</title>
<link href="${pageContext.request.contextPath}/content/css/reset.css" type="text/css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/content/css/Style.css" type="text/css" rel="stylesheet">
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
         <input type="submit" value="검색"/>
      </nav> 
   <section>
      <h1 class="hidden">회원</h1>
   
       <section>
         <h1 class="hidden">로그인</h1>
         <form id="login-form">
            <fieldset class="clearfix">
                  <label >E-mail</label>
                  <input type="email" name="email"/>
                              
                  <label>Passward</label>
                  <input type="password" name="pwd"/>
                  <input type="submit" value="로그인"/>
            </fieldset>
         </form>
       </section>
         
      <nav id="member-join">
          <h1 class="clearfix"><a href="joinus/join.html">Sign</a></h1>
      </nav>
      
      <nav id="password-find">
         <h1 class="clearfix"><a href="joinus/find-passward.html">Find Passward</a></h1>
      </nav>
       
   </section>
    </div>
   </header>
   <!-- <div id="visual">
   </div> -->
   <div id="body">
   <div class="content-container">
	   <main id="main">
		   <h1 class="hidden">홈페이지 설명</h1>
		      <p>별점을 매기고, 자신의 리뷰를 작성해보세요.<br>
		      여러 분야를 직접 평가한 리뷰와 댓글, 별점을 통하여 정보를 공유해보세요.</p>
	   <main>   
   </div>
   </div>
   <div id="footer">
   </div>
</body>
</html>