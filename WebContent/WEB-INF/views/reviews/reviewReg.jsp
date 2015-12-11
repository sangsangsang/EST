<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginMainpage</title>
<link href="${pageContext.request.contextPath}/content/css/reset.css" type="text/css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/content/reviews/css/reviewRegStyle.css" type="text/css" rel="stylesheet">
</head>
<body>
<header id="header">
   <div class="content-container">
   <h1 class="hidden">메인</h1>
   <nav id="main-menu">
      <h1 class="hidden">카테고리</h1>
      <ul>
      <li><a href="../Category/Sports.html">Sports</a></li>
      <li><a href="../Category/Movie.html">Movie</a></li>
      <li><a href="../Category/Game.html">Game</a></li>
      <li><a href="../Category/Book.html">Book</a></li>
      <li><a href="../Category/Music.html">Music</a></li>
      <li><a href="../Category/Fashion&Beauty.html">Fashion&Beauty</a></li>
      <li><a href="../Category/Show&Concert.html">Show&Concert</a></li>
      <li><a href="../Category/Food.html">Food</a></li>
      <li><a href="../Category/Travel.html">Travel</a></li>
      <li><a href="../Category/Electronics.html">Electronics</a></li>
      </ul>
   </nav>
    <nav id="search">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/search.png" alt="검색" /></a>
    </nav> 
    <nav id="new-write">
           <a href="../Review/reviewReg.html"><img src="${pageContext.request.contextPath}/content/images/new_write.png" alt="새글쓰기" /></a>
    </nav> 
    <nav id="logout">
           <a href="../MainPage.html"><img src="${pageContext.request.contextPath}/content/images/logout.png" alt="로그아웃" /></a>
    </nav> 
   <section>
      <h1 class="hidden">회원</h1>
         
         
         <nav id="profile">
            <a href="../mypage/MemberInfo.html"><img src="${pageContext.request.contextPath}/content/images/faceimg.png" alt="프로필수정" /></a>
       </nav>
       <p><a href="">I23412343124124312D님</a></p>
        <nav id="write">
           <a href=""><img src="${pageContext.request.contextPath}/content/images/scrap.png" alt="내글보기" /></a>
       </nav> 
       <nav id="comment">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/comment.png" alt="댓글보기" /></a>
       </nav> 
       <nav id="like">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/like.png" alt="좋아요보기" /></a>
       </nav>
       <nav id="report">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/report.png" alt="신고보기" /></a>
       </nav> 
         
      
       
   </section>
    </div>
   </header>
   <!-- <div id="visual">
   </div> -->
   <div id="body">
   <div class="content-container">
      <main id="main">
         <h2 class="hidden">글쓰기</h1>
         <form action="" method="post">
            <div id="content">
               
               <div id="notice-article-detail" class="article-detail margin-large" >
                  <h3 class="hidden">카테고리</h3>
                  <dl class="article-detail-row">
                     <dd class="article-detail-category">
                        <select>
                           <option>Sports</option>
                           <option>Move</option>
                           <option>Game</option>
                           <option>Book</option>
                           <option>Music</option>
                           <option>Fashion & Beauty</option>
                           <option>Show & Concert</option>
                           <option>Food</option>
                           <option>Travel</option>
                           <option>Electronics</option>
                        </select>
                     
                     <h3 class="hidden">별</h3>
                       
                        <select>
                           <option>0</option>
                           <option>1</option>
                           <option>2</option>
                           <option>3</option>
                           <option>4</option>
                           <option>5</option>
                        </select>
                     
                     <h3 class="hidden">제목</h3>
                     
                        &nbsp;<input name="title"/>
                     </dd>
                  </dl>            
                                    
                  <!-- <dl class="article-detail-row">
                     <dt class="article-detail-title">
                        첨부파일
                     </dt>
                     <dd class="article-detail-data">
                        &nbsp;<input type="file" id="txtFile" name="file" />
                     </dd>
                  </dl> -->
                  <h3 class="hidden">본문</h3>
                  <div class="article-content" >
                     <textarea id="txtContent" class="txtContent" name="content"></textarea>
                  </div>
                     
                  <h3 class="hidden">사진</h3>
                   <dl class="article-detail-row">
                     <dt class="article-detail-title">
                        사진
                        <!-- <img src="../images/photo.png" alt="사진" /> -->
                     </dt>
                     <dd class="article-detail-data">
                        &nbsp;<input type="file" id="txtFile" name="file" />
                     </dd>
                  </dl>
                  <h3 class="hidden">지도</h3>
                   <dl class="article-detail-row">
                     <dt class="article-detail-title">
                        지도
                     </dt>
                     <dd class="article-detail-data">
                        &nbsp;<input type="file" id="txtFile" name="file" />
                     </dd>
                  </dl>
                  <h3 class="hidden">키워드</h3>
                  <dl class="article-detail-row">
                     <dt class="article-detail-title">
                        키워드
                     </dt>
                     <dd class="article-detail-data">
                        &nbsp;<input type="text" name="keyWord" />
                     </dd>
                  </dl>
               </div>
               
               <h3 class="hidden">버튼</h3>
               <p class="article-comment">                  
                  <input class="btn-save button" type="submit" value="저장" />
                  <a class="btn-cancel button" href="../Review/login-mainpage.html"><img src="${pageContext.request.contextPath}/content/images/btn-cancel.png" alt="취소" /></a>                  
               </p>                     
            </div>            
         </form>
      <main>   
   </div>
   </div>
   <div id="footer">
   </div>
</body>
</html>
</body>
</html>