<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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