<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>ReviewDetail</title>
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
            <a href=""><img src="${pageContext.request.contextPath}/content/images/search.png" alt="검색" /></a>
    </nav> 
    <nav id="new-write">
           <a href="reviewReg"><img src="${pageContext.request.contextPath}/content/images/new_write.png" alt="새글쓰기" /></a>
    </nav> 
    <nav id="logout">
           <a href="../mainPage"><img src="${pageContext.request.contextPath}/content/images/logout.png" alt="로그아웃" /></a>
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
    </div>
   </header>
   <div id="body">
   <div class="content-container">
	   <main id="main">
		  	<h1 class="hidden">글보기</h3>
		<table id="review">
	 		
		 	<tbody>
		 		<tr>
			 		<td>Food<br/><a href=""></a><img src="${pageContext.request.contextPath}/content/images/food.png"/></a></td>	
			 		<td>The popcon very good</td>				
			 		<td>2011-11-11</td>	
		 		</tr>
		 		
		 	</tbody>
	 	</table>
	 	 <p id="nickName"><ins>11125님</ins></p>
	 	 <nav id="follow">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/follow.png" alt="받아보기" /></a>
       	 </nav>
       	 <div id="raiting"><img src="${pageContext.request.contextPath}/content/images/5.png" alt="본인별점" /></div>
	     <nav id="user">
	            <img src="${pageContext.request.contextPath}/content/images/user.png" alt="별점준사람들" />
	     </nav>
	     <div id="u_raiting"><img src="${pageContext.request.contextPath}/content/images/3.png" alt="유저들별점" /></div>			
	  
	   <div id="content">
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	
	   </div>
	   <div>
	    
								이미지공간
								   <p>d</p>
								   <p>d</p><p>d</p><p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p><p>d</p>
								
							
		</div>
	   <div id="map">
	   <img src="${pageContext.request.contextPath}/content/images/map.png" alt="맵" /><laber>MAP</laber>
	 
	   <p>d</p>
	   <p>d</p><p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   
	   </div>
	   
	   <div id="keyword">
	   <img src="" alt="키워드" /><laber>KEYWORD</laber>
	      <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   
	   </div>
	   <nav class="r-report r-scrap">
	   <a href=""><img src="${pageContext.request.contextPath}/content/images/like.png" alt="좋아요" /></a>
	    &nbsp; &nbsp;<a href=""><img src="${pageContext.request.contextPath}/content/images/comment.png" alt="댓글" /></a>
	    &nbsp; &nbsp;<a href=""><img src="${pageContext.request.contextPath}/content/images/report.png" alt="리뷰신고" /></a>
	    &nbsp; &nbsp;<a href=""><img src="${pageContext.request.contextPath}/content/images/r-scrap.png" width="30" height="20" alt="스크랩" /></a>
	   </nav>
				
	 	<nav>
	 		  <h1 class="hidden">댓글쓰기</h1>
	 		  <dl class="article-detail-row">
	 		    <h2 class="hidden">별</h2>
                     <dd class="cmt">   
                        <select>
                           <option>0</option>
                           <option>1</option>
                           <option>2</option>
                           <option>3</option>
                           <option>4</option>
                           <option>5</option>
                        </select>
                     
                     <h2 class="hidden">내용</h2>
                    
                        &nbsp;<input name="title"/> 
                       <input type="submit" value="댓글완료" />
                     </dd>
                  </dl>   
	 	</nav>
	 	<div>
	 	<h1 class="hidden">댓글</h1>
	 		<dl class="article-detail-row">
             <table id="comments">
	 		
		 	   <tbody>
		 		<tr>
			 		<td name="writer"><img src="${pageContext.request.contextPath}/content/images/faceimg.png"/></td>
			 		<td name="cmt-rating"><ins>I234D</ins><br/><img src="${pageContext.request.contextPath}/content/images/5.png"/></td>
			 		<td name="content">The popcon very goodㅇㅇㅇdddddddㅇddddddddddddddddddddd</td>				
			 		<td name="regDate">2011-11-11</td>
			 		<td name="cmt-cmt"><img src="${pageContext.request.contextPath}/content/images/cmt-cmt.png"/></td>
			 		<td name="report"><a href=""><img src="${pageContext.request.contextPath}/content/images/report.png"/></a></td>	
		 		</tr>
		 		<tr>
			 		<td name="writer"><img src="${pageContext.request.contextPath}/content/images/faceimg.png"/></td>
			 		<td name="cmt-rating"><ins>I234D</ins><br/><img src="${pageContext.request.contextPath}/content/images/5.png"/></td>
			 		<td name="content">The popcon very goodㅇㅇㅇdddddddㅇddddddddddddddddddddd</td>				
			 		<td name="regDate">2011-11-11</td>
			 		<td name="cmt-cmt"><img src="${pageContext.request.contextPath}/content/images/cmt-cmt.png"/></td>
			 		<td name="report"><a href=""><img src="${pageContext.request.contextPath}/content/images/report.png"/></a></td>	
		 		</tr>		
		 	   </tbody>
	 	   </table>
	 	         
                  </dl>   
	 	</div>
	 	
	   </main>   
   </div>
   </div>
    <div id="footer">
   </div>
</body>
</html>