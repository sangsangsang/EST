<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>	
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%
	request.getContextPath();
%>
<script>
    function init(){  
   
      var btnSearch = document.querySelector("#search");
         btnSearch.onclick = function(){
          
            
          var dlg=document.createElement("form");
          dlg.style.position="fixed";
          dlg.style.top="0px";
          dlg.action="../reviews/search-review-list";
		  dlg.method="get";
          
          var container=document.createElement("div");
          container.style.background="#fff";
          container.style.width="100%";
          container.style.height="50px";
          container.style.position="fixed";
          container.style.top="70px";
          container.style.left="0px";
          
          var closeButton = document.createElement("input");
          closeButton.type = "button";
          closeButton.value = "X";
          closeButton.style.width="50px";
          closeButton.style.height="50px";
          closeButton.style.position="fixed";
          closeButton.style.right= parseInt(container.style.left)+20+"px";
          closeButton.style.top=parseInt(container.style.top)+"px";
          closeButton.style.zIndex=1; //맨앞으로
          
          var searchButton = document.createElement("input");
          searchButton.type = "submit";
          searchButton.value = "검색";
          searchButton.style.width="50px";
          searchButton.style.height="50px";
          searchButton.style.position="fixed";
          searchButton.style.right= parseInt(closeButton.style.width)+parseInt(closeButton.style.right)+10+"px";
          searchButton.style.top=parseInt(container.style.top)+"px";
          searchButton.style.zIndex=1; //맨앞으로
          
          var searchText = document.createElement("input");
          searchText.type = "text";
          searchText.name = "q";
          //searchText.class="inputText";
          searchText.value = "검색";
          searchText.style.width="1000px";
          searchText.style.height="30px";
          searchText.style.position="fixed";
          searchText.style.right= parseInt(searchButton.style.right)+parseInt(searchButton.style.width)+20+"px";
          searchText.style.top=parseInt(container.style.top)+10+"px";
          searchText.style.zIndex=1; //맨앞으로
          
          
          closeButton.onclick=function(){closeDialog(dlg);};
         
         dlg.appendChild(searchText);
         dlg.appendChild(searchButton);
         dlg.appendChild(closeButton);
         dlg.appendChild(container);
          
          document.body.appendChild(dlg);
            return false;
         };
      
   };
   
   var closeDialog = function(dlg){
      document.body.removeChild(dlg);
   };
   
   window.onload=init;

</script>

   <h1 class="hidden">메인</h1>
      <h1 class="hidden">카테고리</h1>
     
   <h1 class="hidden">메인</h1>

    <table id = "main-menu">
    <tr>
	    <th><a href="${ctx}/reviews/login-review_list">All</a></th>
	    <th><a href="${ctx}/category/sports-list">Sports</a></th>
	    <th><a href="${ctx}/category/movie-list">Movie</a></th>
	    <th><a href="${ctx}/category/book-list">Book</a></th>
	    <th><a href="${ctx}/category/game-list">Game</a>
	    <th><a href="${ctx}/category/music-list">Music</a></th>
	    <th><a href="${ctx}/category/fashion&beauty-list">Fashion&Beauty</a></th>
	    <th><a href="${ctx}/category/show&concert-list">Show&Concert</a></th>
	    <th><a href="${ctx}/category/food-list">Food</a></th>
	    <th><a href="${ctx}/category/travel-list">Travel</a></th>
	    <th><a href="${ctx}/category/electronics-list">Electronics</a></th>
    <tr>
    </table>
     
    <nav id="search">
            <a href=""><img src="${pageContext.request.contextPath}/content/images/search.png" alt="검색" /></a>
    </nav> 
    <nav id="new-write">
           <a href="${ctx}/reviews/reviewReg"><img src="${pageContext.request.contextPath}/content/images/new_write.png" alt="새글쓰기" /></a>
    </nav> 
    <nav id="logout">
    	<c:if test="${pageContext.request.userPrincipal !=null }">	
		<c:url var="logout" value="/j_spring_security_logout"/>
           <a href="${logout}"><img src="${pageContext.request.contextPath}/content/images/logout.png" alt="로그아웃" /></a>
    	</c:if>	
    </nav> 
   <section>
      <h1 class="hidden">회원</h1>
         
         
         <nav id="profile">

            <a href="${pageContext.request.contextPath}/mypage/memberInfo"><img src="${pageContext.request.contextPath}/content/images/faceimg.png" alt="프로필수정" /></a>

       </nav>
       <p><a href="${pageContext.request.contextPath}/reviews/myReview-list" alt="마이페이지" name="name"><security:authentication property="name"/></a></p>
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