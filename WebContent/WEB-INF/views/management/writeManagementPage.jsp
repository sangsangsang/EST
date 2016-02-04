<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
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
               <li><a href ="memberManagementPage.html">회원목록</a></li>
               <li><a href ="writeManagementPage.html">글 목록</a></li>
               <li><a href ="reportManagementPage.html">신고 목록</a></li>
            </ul>
         </nav>
      </aside>


      <main id="main" class="h1">
         <h2>글 목록</h2>
         
         <div class="member-search">
            <h3 class="hidden">글 검색</h3>
            <form>
               <fieldset>
                  <legend class="hidden">글 검색 필드</legend>
                  <label class="hidden">분류</label>
                  <select>
                     <option>제목</option>
                     <option>작성자</option>
                     <option>카테고리</option>
                  </select>
                  <label class="hidden">검색어</label><input type="text"/>
                  <input type="submit" value="검색"/>
               </fieldset>
            </form>
         </div>
      
         <h3 class="hidden">글 목록</h3>
         <table id="member">

            <thead>
               <tr>
                  <!-- <th>번호</th> -->
                  <th>카테고리</th>
                  <th>제목</th>
                  <th>작성자</th>
                  <th>작성일자</th>
                  <th>삭제</th>
               </tr>
            </thead>
            <tbody>
              <c:forEach var="n" items="${list}">
						<tr>
						 <%-- <td>${n.num}</td>	 --%>		     
				         <td>${n.categorycode}</td>
				         <td>${n.title}</td>
				         <td>${n.writer}</td>
				         <td><fmt:formatDate pattern="yyyy-MM-dd" value="${n.regdate}"/> </td>
				      	 <td><a href="deleteWriteManagementPage?c=${n.num}"><input type="submit" value="삭제" /></a></td>
				      	</tr>
			 </c:forEach>
              
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