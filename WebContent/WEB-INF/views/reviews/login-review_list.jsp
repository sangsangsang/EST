<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
   
<%

   request.getContextPath();
%>

<script>
    function init(){  
   
      var btnSearch = document.querySelector("#search");
         btnSearch.onclick = function(){
          
            
          var dlg=document.createElement("form");
          dlg.style.position="fixed";
          dlg.style.top="0px";
          dlg.action="search-review-list";
		  dlg.method="get";
          
          var container=document.createElement("div");
          container.style.background="#fff";
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
          closeButton.style.right= parseInt(container.style.left)+20+"px";
          closeButton.style.top=parseInt(container.style.top)+"px";
          closeButton.style.zIndex=1; //맨앞으로
          
          var searchButton = document.createElement("input");
          searchButton.type = "submit";
          searchButton.value = "검색";
          searchButton.style.width="50px";
          searchButton.style.height="50px";
          searchButton.style.position="fixed";
          searchButton.style.right= parseInt(closeButton.style.width)+parseInt(closeButton.style.right)+10+"px";
          searchButton.style.top=parseInt(container.style.top)+"px";
          searchButton.style.zIndex=1; //맨앞으로
          
          var searchText = document.createElement("input");
          searchText.type = "text";
          searchText.name = "q";
          //searchText.class="inputText";
          searchText.value = "검색";
          searchText.style.width="1000px";
          searchText.style.height="30px";
          searchText.style.position="fixed";
          searchText.style.right= parseInt(searchButton.style.right)+parseInt(searchButton.style.width)+20+"px";
          searchText.style.top=parseInt(container.style.top)+10+"px";
          searchText.style.zIndex=1; //맨앞으로
          
          
          closeButton.onclick=function(){closeDialog(dlg);};
         
         dlg.appendChild(searchText);
         dlg.appendChild(searchButton);
         dlg.appendChild(closeButton);
         dlg.appendChild(container);
          
          document.body.appendChild(dlg);
            return false;
         };
      
   };
   
   var closeDialog = function(dlg){
      document.body.removeChild(dlg);
   };
   
   window.onload=init;

</script>



<c:set var="ctx" value="${pageContext.request.contextPath}"/>
   
   <main id="main">  
   <h1 class="hidden">리뷰리스트</h1> 
         <div id ="box1" class="hc vc">
           <nav id ="category-form">
            <ul>
            <%-- <a href=""><img src="${ctx}/content/images/food.png"
                     alt="음식사진" /></a>
            <a href=""><img src="${ctx}/content/images/foodLetter.png"
                     alt="food" /></a> --%>
             <a href="login-review_list">
             ALL
             </a>
            
            </ul>
            </nav>
            
         <nav id = "rating-menu">
            <h1 class ="hidden">별점메뉴</h1>
            <ul>
               <li><a href="login-review_list?c=5"><img src="${ctx}/content/images/5.png"
                     alt="별5개" /></a></li>
               <li><a href="login-review_list?c=4"><img src="${ctx}/content/images/4.png"
                     alt="별4개" /></a></li>
               <li><a href="login-review_list?c=3"><img src="${ctx}/content/images/3.png"
                     alt="별3개" /></a></li>
               <li><a href="login-review_list?c=2"><img src="${ctx}/content/images/2.png"
                     alt="별2개" /></a></li>
               <li><a href="login-review_list?c=1"><img src="${ctx}/content/images/1.png"
                     alt="별1개" /></a></li>
               
            </ul>
            </nav>
            <nav id = "count-menu">
            <ul>
              <a href=""> 추천수</a> /<a href=""> 조회수</a> /<a href=""> 댓글수</a> 
           
            </ul>
            </nav>
            
         
         
         </div>
         
         <div id ="box2" class="hc2 vc2">
         <div id ="box2-1">
         
         <div id="review-preview">
         <table>
         <tbody>
             <tr>
                <td><a href=""><img src="${ctx}/content/images/faceimg.png"
                     alt="닉네임" /></a></td>   
                <td>Chicken good</td>            
                <td>2011-11-11</td>   
             </tr>
             
          </tbody>
          </table>
          </div>
          
          <div id="review-frame">
       
           <table id ="review-img">
          <tbody>
                <tr>
                   <td>
                      <a href=""><img src="${ctx}/content/images/faceimg.png" width ="25" height="25"
                        alt="닉네임" /></a>
                        </td>
                        <td id = "user-star1">
                        <a href=""><img src="${ctx}/content/images/g4.png" width ="50" height="15"/>
                        </a></td>
                        <td>
                        <a href=""><img src="${ctx}/content/images/user.png" width ="25" height="25"
                        alt="닉네임" /></a>
                        </td>
                        
                        <td>
                        <a href=""><img src="${ctx}/content/images/g3.png" width ="50" height="15"/>
                        </a></td>
                        
                        <td id = "like1">
                         <a href=""><img src="${ctx}/content/images/like.png" width ="15" height="15"
                        alt="좋아요갯수" /></a>
                        (20)
                        </td>
                        
                        <td id = "comment1">
                         <a href=""><img src="${ctx}/content/images/comment.png" width ="15" height="15"
                        alt="댓글갯수" /></a>
                        (5)
                        </td>
                        
                     </tr>
                  
                     
                     
              </tbody>   
          
          </table>
       </div>
            
       

         
     </div>
          
          
          <div id ="box2-2">
          <div id="review-preview2">
          <table>
         <tbody>
             <tr>
                <td><a href=""><img src="${ctx}/content/images/faceimg.png"
                     alt="닉네임" /></a></td>   
                <td>Chicken good</td>            
                <td>2011-11-11</td>   
             </tr>
             
          </tbody>
       </table>
       </div>
       
       
        <div id="review-frame2">
       
           <table id ="review-img2">
          <tbody>
                <tr>
                   <td>
                      <a href=""><img src="${ctx}/content/images/faceimg.png" width ="25" height="25"
                        alt="닉네임" /></a>
                        </td>
                        <td id = "user-star2">
                        <a href=""><img src="${ctx}/content/images/g4.png" width ="50" height="15"/>
                        </a></td>
                        <td>
                      <a href=""><img src="${ctx}/content/images/user.png" width ="25" height="25"
                        alt="닉네임" /></a>
                        </td>
                        
                        <td>
                        <a href=""><img src="${ctx}/content/images/g3.png" width ="50" height="15"/>
                        </a></td>
                        
                        <td id = "like2">
                         <a href=""><img src="${ctx}/content/images/like.png" width ="15" height="15"
                        alt="좋아요갯수" /></a>
                        (20)
                        </td>
                        
                        <td id = "comment2">
                         <a href=""><img src="${ctx}/content/images/comment.png" width ="15" height="15"
                        alt="댓글갯수" /></a>
                        (5)
                        </td>
                        
                     </tr>
              </tbody>   
          
          </table>
       </div>
    </div>
         

          
          <div id ="box2-3">
          <div id="review-preview3">
          <table>
         <tbody>
             <tr>
                <td><a href=""><img src="${ctx}/content/images/faceimg.png"
                     alt="닉네임" /></a></td>   
                <td>Chicken good</td>            
                <td>2011-11-11</td>   
             </tr>
             
          </tbody>
       </table>
       </div>
       <div id="review-frame3">
       
           <table id ="review-img3">
          <tbody>
                <tr>
                   <td>
                      <a href=""><img src="${ctx}/content/images/faceimg.png" width ="25" height="25"
                        alt="닉네임" /></a>
                        </td>
                        <td id = "user-star3">
                        <a href=""><img src="${ctx}/content/images/g4.png" width ="50" height="15"/>
                        </a></td>
                        <td>
                      <a href=""><img src="${ctx}/content/images/user.png" width ="25" height="25"
                        alt="닉네임" /></a>
                        </td>
                        
                        <td>
                        <a href=""><img src="${ctx}/content/images/g3.png" width ="50" height="15"/>
                        </a></td>
                        
                        <td id = "like3">
                         <a href=""><img src="${ctx}/content/images/like.png" width ="15" height="15"
                        alt="좋아요갯수" /></a>
                        (20)
                        </td>
                        
                        <td id = "comment3">
                         <a href=""><img src="${ctx}/content/images/comment.png" width ="15" height="15"
                        alt="댓글갯수" /></a>
                        (5)
                        </td>
                        
                     </tr>
              </tbody>   
          
          </table>
          </div>
      </div>
   </div> 
       
       <c:forEach var="r" items = "${list}" >
       
       <div id ="box3" class="hc3 vc3" me>
       
       <table id="review-preview-wide">
         <tbody>
             <tr>
                <td class="writer"><img src="${ctx}/content/images/faceimg.png"
                     alt="닉네임" />${r.writerNickname}</td>   
                <td class="title"><a href="reviewDetail?c=${r.num }">${r.title}</a></td>            
                <td class="regdate"><fmt:formatDate pattern="yyyy-MM-dd" value="${r.regdate}"/></td>   
             </tr>
             
          </tbody>
     
       </table>
       <div id="review-frame-wide">
       
           <table id ="review-img-wide">
          <tbody>
                <tr>
                	<!-- <td id ="review-img"></td> -->
                   <td>
                      <a href=""><img src="${ctx}/content/images/faceimg.png" width ="45" height="45"
                        alt="닉네임" /></a>
                        </td>
                        <td id = "user-star-wide">
                        <a href=""><img src="${ctx}/content/images/g${r.ratingcode }.png" width ="80" height="15"/>
                        </a></td>
                        <td>
                      <a href=""><img src="${ctx}/content/images/user.png" width ="45" height="45"
                        alt="닉네임" /></a>
                        </td>
                        
                        <td>
                        <a href=""><img src="${ctx}/content/images/g3.png" width ="80" height="15"/>
                        </a></td>
                        
                         <td id = "like-wide">
                         <a href=""><img src="${ctx}/content/images/like.png" width ="25" height="25"
                        alt="좋아요갯수" />${r.rcmCount}</a>
                        (3)
                        </td>
                        
                        <td id = "comment-wide">
                         <a href=""><img src="${ctx}/content/images/comment.png" width ="25" height="25"
                        alt="댓글갯수" />${r.comCount}</a>
                        (1)
                        </td>
                        
                     </tr>
              </tbody>   
          
          </table>
          </div>
          
       </div>
       </c:forEach>
       
       </main>