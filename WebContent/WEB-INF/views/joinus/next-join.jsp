<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%
	String email=request.getParameter("email");

%>
 --%>
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $(".inputEmail").click(function(){
        $(".inputEmail").val("");
    });
    $(".inputEmail").focusout(function(){
        if($(".inputEmail").val() == "") {
            $(".inputEmail").val("이메일을 입력해주세요");
            alert("이메일을 입력하세요.");
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


<!-- </head>
<body>
   <header id="join-header">
   <div class="content-container">
      <div class="logo-center">
         <span>
            <a href="../MainPage.html">
            <img src="../images/smallLogo.png" alt="estrellerLogo">
            </a>
         </span>
      </div>
   </div>
   </header>

   <div id="body">
        <div class="content-container"> -->
         <main id="join-main">
        
         <p>회원가입</p>      
            <div id="box" class="hc vc">
            <form  action="next-join" method="post" >
            <br>
            <p>오류메세지</p>
             		 <c:if test="${error != null}">
               		  <p>${error}</p>
               		  </c:if>
               		  <c:if test="${check != null}">
               		  <p>${check}</p>
               		  </c:if>  
               
               <br>
               <input type="email"  name ="email" value="이메일을 입력해주세요" 
               		  class="inputEmail"  maxlength="25" style="ime-mode:disabled"/>
               <input type="submit" class="checker" value="중복확인" />
               <br>
               <br>
               <input type="password" name="pwd" value="비밀번호를 입력해주세요" class="inputPassword"  maxlength="12"/>
               <br>
               <br>
               <br>
               <input type="password" name ="repwd" value="비밀번호를 재입력해주세요" class="inputRepassword" maxlength="12" />
               <br>
               <br>
               <br>
               <input type="text" name ="nickname" value="닉네임을 입력해주세요" class="inputNickname" maxlength="5"/>
               <br>
               <br>  
               <div id = "join-form">
            <fieldset class="clearfix">
                 <input type="submit" value="가입하기"/>
            </fieldset>
               </div>
               </form>
            </div>
         </main>
   <!--    </div>
   </div>

</body>
</html> -->