<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>	
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

   <!-- <div id="visual">
   </div> -->
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
   <script >
	$(document).ready(function(){
	    $(".inputPassword").click(function(){
	        $(".inputPassword").val("");
	    });
	    $(".inputPassword").focusout(function(){
	        if($(".inputPassword").val() == "") {
	            $(".inputPassword").val("비밀번호를 입력해주세요");
	            alert("비밀번호를 입력하세요.");
	        }
	    });
	});

	$(document).ready(function(){
	    $(".inputRepassword").click(function(){
	        $(".inputRepassword").val("");
	    });
	    $(".inputRepassword").focusout(function(){
	        if($(".inputRepassword").val() == "") {
	            $(".inputRepassword").val("비밀번호를 재입력해주세요");
	            alert("비밀번호를 재입력하세요.");
	        }
	        else if($(".inputPassword").val()!=$(".inputRepassword").val())
	           alert("비밀번호가 일치하지 않습니다.");
	    });
	});

	$(document).ready(function(){
	    $(".inputNickname").click(function(){
	        $(".inputNickname").val("");
	    });
	    $(".inputNickname").focusout(function(){
	        if($(".inputNickname").val() == "") {
	            $(".inputNickname").val("닉네임을 입력해주세요");
	            alert("닉네임을 입력하세요.");
	        }
	    });
	});
   </script>
  
         <main id="main">
            <img src="${ctx}/content/images/profile-face.png" alt="얼굴" />
            <p><security:authentication property="name"/></p>
            <p>profile</p>
         </main>
         <aside id="aside">
             <h1 class="hidden">로그인</h1>
         <form action="memberInfo" method="post">
            <div class="clearfix info-label">
                  <label>Nicname</label>
                  <input class="inputNickname" type="text" name="nickname"/>  
            </div>
            <div class="clearfix info-label">     
                  <label>Passward</label>
                  <input class="inputPassword" type="password" name="pwd"/>
            </div>
            <div class="clearfix info-label">
                  <label>Confirming</label>
                  <input class="inputRepassword" type="password" />
            </div>      
                  <h3 class="hidden">버튼</h3>
            <p class="info-change">                  
               <input class="btn-save button" type="submit" value="저장" />
               <a class="btn-cancel button" href="${ctx}/reviews/login-review_list"><img src="${ctx}/content/images/btn-cancel.png" alt="취소" /></a>                  
            </p>   

         </form>
         </aside>
   
  
 