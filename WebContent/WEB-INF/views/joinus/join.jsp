<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

	request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
   
		<main id="join-main">
			<p>회원가입</p>	
				<div id="box" class="hc vc">
	         	<ul id ="agree">
                  <img src="${ctx}/content/images/agg.png" />
               </ul>
               <p>
              
               <b>서비스 이용약관</b><br>
			                이 약관은 (주)Estreller(이하 "회사")에서 제공하는 서비스 
			               "Estreller"의 이용과 관련하여 회사와 고객간의 권리,의무
			               및 기타 필요한 제반 사항을 정하고 있습니다. 서비스를 이용하시기 전에 이 약관을 주의 깊게 읽어 보시기 바랍니다.
            
              </p>
              <form id = "required-form">
              <fieldset class="clearfix">
             
              <input type ="checkbox" value="동의함 필수항목" > 
              <label>동의함 필수항목</label>   
              
              </fieldset>
              </form>
              <p2>
              
               <b>개인정보 취급방침</b><br>
               (주)Estreller(이하 "회사")는 원활한 서비스의 이용을
			                위하여 다음과 같이 이용자의 개인정보를 수집,이용함에 있어 
			                정보통신망 이용촉진 및 정보보호 등에 관한 법률, 
			               개인정보 보호법 등 관련법령에 따라 개인정보 수집 및 이용에 관하여 동의를 받고 있습니다. 
            
              </p2>
              
              <form id = "required-form2">
              <fieldset class="clearfix">
             
              <input type ="checkbox" value="동의함 필수항목" > 
              <label>동의함 필수항목</label>   
              
              </fieldset>
              </form>
	           <nav id = "join-cancel">
	            <a href="mainPage">
	           <img src="${ctx}/content/images/cancel.png" alt ="가입취소"/>
	           </a>
	           </nav>
	           <nav id = "join-next">
	           <a href="next-join">
	           <img src="${ctx}/content/images/next.png" alt ="다음"/>
	           </a>
	           </nav>
           
           <p3>
         
        	  이미 가입되어 있으신가요? 
      
          </p3>
		     
		 <div id="login-button">
		     <a href="loginPage"><ins>로그인하기</ins></a>
	     </div>
           
	         	</div>
			</main>