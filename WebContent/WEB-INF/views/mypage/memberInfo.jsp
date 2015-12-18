<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

   <!-- <div id="visual">
   </div> -->
  
         <main id="main">
            <img src="${ctx}/content/images/profile-face.png" alt="얼굴" />
            <p>profile</p>
         </main>
         <aside id="aside">
             <h1 class="hidden">로그인</h1>
         <form action="" method="post">
            <div class="clearfix info-label">
                  <label>Nicname</label>
                  <input type="text"/>  
            </div>
            <div class="clearfix info-label">     
                  <label>Passward</label>
                  <input type="password"/>
            </div>
            <div class="clearfix info-label">
                  <label>Confirming</label>
                  <input type="password"/>
            </div>      
                  <h3 class="hidden">버튼</h3>
            <p class="info-change">                  
               <input class="btn-save button" type="submit" value="저장" />
               <a class="btn-cancel button" href="../Review/login-mainpage.html"><img src="${ctx}/content/images/btn-cancel.png" alt="취소" /></a>                  
            </p>   

         </form>
         </aside>
   
  
 