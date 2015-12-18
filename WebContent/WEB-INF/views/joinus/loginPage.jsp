<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%

	request.getContextPath();
%>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $(".inputEmail").click(function(){
        $(".inputEmail").val("");
    });
    $(".inputEmail").focusout(function(){
        if($(".inputEmail").val() == "") {
            $(".inputEmail").val("이메일을 입력해주세요");
        }
    });
});

$(document).ready(function(){
    $(".inputPassword").click(function(){
        $(".inputPassword").val("");
    });
    $(".inputPassword").focusout(function(){
        if($(".inputPassword").val() == "") {
            $(".inputPassword").val("비밀번호를 입력해주세요");
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
        }
    });
});

$(document).ready(function(){
    $(".inputNickname").click(function(){
        $(".inputNickname").val("");
    });
    $(".inputNickname").focusout(function(){
        if($(".inputNickname").val() == "") {
            $(".inputNickname").val("닉네임을 입력해주세요");
        }
    });
});
</script> 

 
         <main id="join-main">
         
         <p>로그인</p>      
            <div id="box" class="hc vc">
            <form action="<c:url value="/j_spring_security_check"/>" method="post">
            <br>
              <div style="color: red;"><c:if test="${param.error != null}">아이디 또는 비밀번호가 잘못되었습니다.</c:if></div>
               <br>
               <br>
               <input type="email" name ="j_username" value="이메일을 입력해주세요" class="inputEmail" />
               <br>
               <br>
               <br>
               <br>
               <input type="password" name ="j_password" value="비밀번호를 입력해주세요" class="inputPassword" />
               <br>
               
               <div id="join-button">
             <a href="${ctx}/joinus/join"><ins>회원가입</ins></a>
              </div>
               <div id="find-password">
             <a href="${ctx}/joinus/find-password"><ins>비밀번호찾기</ins></a>
              </div>
               
               <br>
               <br>
               <ul id = "login-button">
                  <fieldset class="clearfix">
                
                       <input type="submit" value="로그인"/>
                  </fieldset>
               </ul>
               </form>
            </div>
         </main>
  