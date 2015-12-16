<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

   <div id="body">
      <div class="content-container clearfix">
      <aside id="aside">
         <h1 class="hidden">관리목록</h1>
         
         <nav>
            <h1 class="hidden">관리목록 메뉴</h1>
            <ul>
               <li><a href ="memberManagementPage">회원목록</a></li>
               <li><a href ="writeManagementPage">글 목록</a></li>
               <li><a href ="reportManagementPage">신고 목록</a></li>
            </ul>
         </nav>
      </aside>


      <main id="main" class="h1">
         <h2>신고 목록</h2>
         
         <div class="member-search">
            <h3 class="hidden">신고 검색</h3>
            <form>
               <fieldset>
                  <legend class="hidden">신고 검색 필드</legend>
                  <label class="hidden">분류</label>
                  <select>
                     <option>제목</option>
                     <option>작성자</option>
                     <option>카테고리</option>
                     <option>신고자</option>
                     <option>신고내용</option>
                  </select>
                  <label class="hidden">검색어</label><input type="text"/>
                  <input type="submit" value="검색"/>
               </fieldset>
            </form>
         </div>
      
         <h3 class="hidden">신고 목록</h3>
         <table id="member">

            <thead>
               <tr>
                  <th>번호</th>
                  <th>신고내용</th>
                  <th>카테고리</th>
                  <th>제목</th>
                  <th>작성자</th>
                  <th>작성일자</th>
                  <th>신고자</th>
                  <th>삭제</th>
               </tr>
            </thead>
            <tbody>
               <form id="member-list" action="">
                  <tr>
                     <td>1</td>
                     <td>음란스</td>
                     <td>Food</td>
                     <td><a href ="">우왕맛있어용</a></td>
                     <td>나는나</td>
                     <td>2011-09-11</td>
                     <td>울라라</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               </form>
               <form id="member-list" action="">
                  <tr>
                     <td>2</td>
                     <td>욕설스</td>
                     <td>Game</td>
                     <td>우왕재밌어용</td>
                     <td>나에요</td>
                     <td>2011-10-05</td>
                     <td>울라라</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               </form>
            </tbody>
         </table>
         
         <h3 class="hidden">페이지 번호</h3>
         <p>1</p>
         
         <h3 class="hidden">전체페이지와 현재페이지</h3>
         <p>1/1page</p>
      </main>
      
      </div>
   </div>
  
</body>
</html>