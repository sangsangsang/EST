<%-- <%@page import="java.util.List"%>
<%@page import="com.estreller.wbprj.vo.Member"%>
<%@page import="com.estreller.wbprj.dao.mybatis.MyBatisMemberDao"%>
<%@page import="com.estreller.wbprj.dao.MemberDao"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%

	MemberDao dao = new MyBatisMemberDao();//MyBatis활용
	
	Member member = new Member();
	/* 
	List<Member> list = dao.getMembers(1); */


%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/reset.css" type="text/css" rel="stylesheet">
<link href="../css/Style-join.css" type="text/css" rel="stylesheet"> --%>
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
            <form action="" method="post" >
            <br>
               <br>
               <br>
               <input type="email"  name ="email" value="이메일을 입력해주세요" class="inputEmail"  maxlength="25"/>
               <br>
               <br>
               <br>
               <input type="password"  value="비밀번호를 입력해주세요" class="inputPassword"  maxlength="12"/>
               <br>
               <br>
               <br>
               <input type="password" name ="pwd" value="비밀번호를 재입력해주세요" class="inputRepassword" maxlength="12" />
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