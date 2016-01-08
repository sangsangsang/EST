<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>	 
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%

	request.getContextPath();
%>


<script>
  
   
   //window.onload = function(){
	   
	   
	   
   
   function init(){  
	   
	/*    var handler = function(event){
			 var ul = event.target.parentNode;
	   		 ul.style.background="red";
			 
		 }
	 
		var titles = document.querySelectorAll("#main-menu ul a");
		for(var i =0; i<titles.length; i++)
			titles[i].onclick = function(){
			event.preventDefault();
			
		}
			   */       
	/* 		         
	 var lis = document.querySelectorAll("#main-menu ul li");
	 for(var i =0; i<lis.length; i++)
	 	lis[i].onclick = function(event){
		 	alert("gggg");
			var li =event.target.parentNode;
			li.style.background="green";
		}
	  
	   */
	 
	 
	/*  var ul = document.querySelectorAll("#main-menu ul ");
	 ul.addEventListener("click",handler);
		       */
	   
      var btnSearch = document.querySelector("#search");
         btnSearch.onclick = function(){
            //alert("test");
            /* var dlg=document.crateElement("div");
            dlg.style.width="100%";
            dlg.style.height="50px";
            dlg.style.postion="fixed";
            dlg.style.top="30px";
            dlg.style.background="brown";
            
            
            var container=document.createElement("div");
          container.style.background="#fff";
          container.style.width="750px";
          container.style.height="500px";
          container.style.position="fixed";
          container.style.top="200px";
          container.style.left="300px";
          
          
            
            var container=document.createElement("div");
            //container.style.
            
            dlg.appendChild(container);
            document.header.appendChild(dlg); */
            
            var dlg=document.createElement("form");
          //dlg.style.width="100%";
          //dlg.style.height="100%";
          dlg.style.position="fixed";
          dlg.style.top="0px";
          
          /* var screen=document.createElement("div");
          //screen.style.background="#000";
          //screen.style.opacity="0.5";
          screen.style.width="inherit";
          screen.style.height="inherit"; */
          
          var container=document.createElement("div");
          container.style.background="gray";
          container.style.width="100%";
          container.style.height="50px";
          container.style.position="fixed";
          container.style.top="70px";
          container.style.left="0px";
          
          var closeButton = document.createElement("input");
          closeButton.type = "button";
          closeButton.value = "X";
          closeButton.style.width="50px";
          closeButton.style.height="50px";
          closeButton.style.position="fixed";
          closeButton.style.right= parseInt(container.style.left)+20+"px"/*"190px"*/;
          closeButton.style.top=parseInt(container.style.top)+"px"/*"1040px"*/;
          closeButton.style.zIndex=1; //맨앞으로
          
          var searchButton = document.createElement("input");
          searchButton.type = "submit";
          searchButton.value = "검색";
          searchButton.style.width="50px";
          searchButton.style.height="50px";
          searchButton.style.position="fixed";
          searchButton.style.right= parseInt(closeButton.style.width)+parseInt(closeButton.style.right)+10+"px"/*"190px"*/;
          searchButton.style.top=parseInt(container.style.top)+"px"/*"1040px"*/;
          searchButton.style.zIndex=1; //맨앞으로
          
          var searchText = document.createElement("input");
          searchText.type = "text";
          searchText.name = "q";
          //searchText.class="inputText";
          searchText.value = "검색";
          searchText.style.width="1000px";
          searchText.style.height="30px";
          searchText.style.position="fixed";
          searchText.style.right= parseInt(searchButton.style.right)+parseInt(searchButton.style.width)+20+"px"/*"190px"*/;
          searchText.style.top=parseInt(container.style.top)+10+"px"/*"1040px"*/;
          searchText.style.zIndex=1; //맨앞으로
          
          
          closeButton.onclick=function(){closeDialog(dlg);};
          
          
          
         /*  <input type="text" name ="j_username" value="이메일을 입력해주세요" class="inputEmail" /> */
          
         dlg.appendChild(searchText);
         dlg.appendChild(searchButton);
         dlg.appendChild(closeButton);
         //dlg.appendChild(screen);
         dlg.appendChild(container);
          
          document.body.appendChild(dlg);
            return false;
         };
      
   };
   
   var closeDialog = function(dlg){
      document.body.removeChild(dlg);
   };
   
   window.onload=init;
   //}
   
   </script>


<h1 class="hidden">메인</h1>

    <table id = "main-menu">
    <tr>
    <th><a href="loginPage">All</a></th>
    <th><a href="loginPage">Sports</a></th>
    <th><a href="loginPage">Movie</a></th>
    <th><a href="loginPage">Book</a></th>
    <th><a href="loginPage">Music</a></th>
    <th><a href="loginPage">Fashion&Beauty</a></th>
    <th><a href="loginPage">Show&Concert</a></th>
    <th><a href="loginPage">Food</a></th>
    <th><a href="loginPage">Travel</a></th>
    <th><a href="loginPage">Electronics</a></th>
    <tr>
    
    </table>
   
   
   
   <nav id="search">
         <input type="submit" value="검색"/>
      </nav> 
      
      
   <section>
      <h1 class="hidden">회원</h1>
   
       <section>
         <h1 class="hidden">로그인</h1>
         <form id="login-form" action="<c:url value="/j_spring_security_check"/>" method="post" >
            <fieldset class="clearfix">
                  <label >E-mail</label>
                  <input type="email" name="j_username"/>
                              
                  <label>Passward</label>
                  <input type="password" name="j_password"/>
                  
                  <input type="submit" value="로그인"/></a>
            </fieldset>
         </form>
       </section>
         
      <nav id="member-join">
          <h1 class="clearfix"><a href="join">Sign</a></h1>
      </nav>
      
      <nav id="password-find">
         <h1 class="clearfix"><a href="find-password">Find Passward</a></h1>
      </nav>
       
   </section>