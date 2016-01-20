<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
   
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
          <form action="reviewEdit?c=${review.num}" , method="POST">
 			<h2 class="hidden">글쓰기</h1>
            <div id="content">
               <div id="notice-article-detail" class="article-detail margin-large" >
                  <h3 class="hidden">카테고리</h3>
                  <dl class="article-detail-row">
                     <dd class="article-detail-category">
                        <select name="categorycode">
                           <option value="sports">Sports</option>
                           <option value="movie">Movie</option>
                           <option value="game">Game</option>
                           <option value="book">Book</option>
                           <option value="music">Music</option>
                           <option value="fashion&beauty">Fashion&Beauty</option>
                           <option value="show&concert">Show&Concert</option>
                           <option value="food">Food</option>
                           <option value="travel">Travel</option>
                           <option value="electronics">Electronics</option>
                        </select>
                     
                     <h3 class="hidden">별</h3>
                       
                        <select name="ratingcode">
                           <option value="1">★☆☆☆☆</option>
                           <option value="2">★★☆☆☆</option>
                           <option value="3">★★★☆☆</option>
                           <option value="4">★★★★☆</option>
                           <option value="5">★★★★★</option>
                        </select>
                     
                     <h3 class="hidden">제목</h3>
                     	
                        &nbsp;<input name="title" value="${review.title}"/>
                        
                        
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
                     <textarea id="txtContent" class="txtContent" name="content" value="">${review.content}</textarea>
                  </div>
                     
                  <h3 class="hidden">사진</h3>
                   <dl class="article-detail-row">
                     <dt class="article-detail-title">
                        사진
                        <%-- <img src="${pageContext.request.contextPath}/content/images/photo.png" alt="사진" /> --%>
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
                        &nbsp;<input type="file" id="txtFile" name="map" />
                     </dd>
                  </dl>
                  <h3 class="hidden">키워드</h3>
                  <dl class="article-detail-row">
                     <dt class="article-detail-title">
                        키워드
                     </dt>
                     <dd class="article-detail-data">
                        &nbsp;<input type="text" name="keyword" value="${review.keyword}" />
                     
                     </dd>
                  </dl>
               </div>
               
               <h3 class="hidden">버튼</h3>
               <p class="article-comment">                  
                  <input class="btn-save button" type="submit" value="저장" />
                  <a class="btn-cancel button" href="login-review_list"><img src="${pageContext.request.contextPath}/content/images/btn-cancel.png" alt="취소" /></a>                  
               </p>                     
            </div>            
         </form>