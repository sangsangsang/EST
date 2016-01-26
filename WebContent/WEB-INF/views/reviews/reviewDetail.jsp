<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%
	request.getContextPath();
%>
<script>
function init(){  
	var btnReport = document.querySelector("#rep");
	btnReport.onclick = function() {

		var dlg=document.createElement("div");
		dlg.style.width="100%";
		dlg.style.height="100%";
		dlg.style.position="fixed";
		dlg.style.top="0px";
	   
	   	var screen=document.createElement("div");
	   	screen.style.backgroundColor="black";
	  	screen.style.opacity="0.3";
	   	screen.style.width="inherit";
	   	screen.style.height="inherit";
	   
	   	var container=document.createElement("div");
	   	container.style.backgroundColor="#fff";
	   	container.style.width="720px";
	   	container.style.height="500px";
	   	container.style.position="fixed";
	   	container.style.top="100px";
	   	container.style.left="300px";
	   
	   	var closeButton = document.createElement("input");
        closeButton.type = "button";
        closeButton.value = "X";
        closeButton.style.width = "50px";
        closeButton.style.height = "50px";
        closeButton.style.position = "fixed";
        closeButton.style.left = parseInt(container.style.left)+parseInt(container.style.width)+"px";
        closeButton.style.top = parseInt(container.style.top) - 10 + "px";
        closeButton.style.zIndex = 1;
        
        closeButton.onclick = function(){closeDialog(dlg);};
        
        //container.appendChild(closeButton);
        
        dlg.appendChild(closeButton);
	   	
	   	dlg.appendChild(screen);
	   	dlg.appendChild(container);
	   	document.body.appendChild(dlg);
	   	
	    
		    var request;
		   	if(window.ActiveXObject)
	            request = new ActiveXObject("Microsoft.XMLHTTP"); 
	         else if(window.XMLHttpRequest)
	            request = new XMLHttpRequest();
		    	//container.innerHTML=request.responseText;
		   	
			request.onreadystatechange=function(){
				if(request.readyState==4){
				   container.innerHTML=request.responseText;
			    }
	   		};

		    request.open("GET", "reportPartial", true);
		    request.send(null);
	   		return false;
	};
	
	var closeDialog = function(dlg){
	    document.body.removeChild(dlg);
	};
};
 window.onload=init;

</script>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>  

 
   <main id="main">
	<h1 class="hidden">글보기</h3>
	 <div id ="detail" class="hc vc">
		<table id="review">
	 		
		 	<tbody>
		 		<tr>
			 		<td><img src="${ctx}/content/images/${review.categorycode }.png"/></td>	
			 		<td>${review.title}</td>				
			 		<td>${review.regdate}</td>	
		 		</tr>
		 		
		 	</tbody>
	 	</table>
	 	 <p id="nickName"><ins>${review.writerNickname}</ins></p>
	 	 <nav id="follow">
            <a href=""><img src="${ctx}/content/images/follow.png" alt="받아보기" /></a>
       	 </nav>
       	 <div id="raiting"><img src="${ctx}/content/images/g${review.ratingcode }.png" alt="본인별점" /></div>
	     <nav id="user">
	            <img src="${ctx}/content/images/user.png" alt="별점준사람들" />
	     </nav>
	     <div id="u_raiting"><img src="${ctx}/content/images/g3.png" alt="유저들별점" /></div>			
	  
	   <div id="content">
		   ${review.content}
	
	   </div>
	   <div>
	    
								이미지공간
								   <p>d</p>
								   <p>d</p><p>d</p><p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p>
								   <p>d</p><p>d</p>
								
							
		</div>
	   <div id="map">
	   <img src="${ctx}/content/images/map.png" alt="맵" /><laber>MAP</laber>
	 
	   <p>d</p>
	   <p>d</p><p>d</p>
	   <p>d</p>
	   <p>d</p>
	   <p>d</p>
	   
	   </div>
	   
	   <div id="keyword">
	   <img src="" alt="키워드" /><laber>KEYWORD</laber>
	      ${review.keyword }
	   
	   </div>
	   
	   <nav  class="r-report r-scrap">
	   <a href="login-review_list"><img src="${ctx}/content/images/like.png" alt="좋아요" /></a>
	    &nbsp; &nbsp;<a href=""><img src="${ctx}/content/images/comment.png" alt="댓글" /></a>
	    &nbsp; &nbsp;<img id="rep" class="report" src="${ctx}/content/images/report.png" alt="리뷰신고" />
	    &nbsp; &nbsp;<a href=""><img src="${ctx}/content/images/r-scrap.png" width="30" height="20" alt="스크랩" /></a>
		<c:if test="${review.writer == logID}">
		&nbsp; &nbsp;<a href="reviewEdit?c=${review.num}" style="font-size:20px;">Edit</a>
	   <form class="del" action ="delete" method="post">
	    <input type="hidden" value="${review.num}" name="c"/> <!-- 페이지 코드값을 넘겨준다 -->
		<input type="submit" value="Delete"/>
		</form>	   
		</c:if>
	   </nav>
			
		<form action="reviewDetail?c=${review.num}" method="post">
				
	 	<nav>
	 		  <h1 class="hidden">댓글쓰기</h1>
	 		  <dl class="article-detail-row">
	 		    <h2 class="hidden">별</h2>
                     <dd class="cmt">   
                        <select name="ratingCode">
                           <option>1</option>
                           <option>2</option>
                           <option>3</option>
                           <option>4</option>
                           <option>5</option>
                        </select>
                     
                     <h2 class="hidden">내용</h2>
                    
                        &nbsp;<input type="text" name="content"/> 
                       <input class = "btnSave" type="submit" value="댓글완료" />
                     </dd>
                  </dl>   
	 	</nav>
	 	</form>
	 	<div>
	 	<h1 class="hidden">댓글</h1>
	 		<dl class="article-detail-row">
             <table id="comments">
	 		<tbody>
	 		<c:forEach var="cmt" items="${list}">
		 		
		 		<tr>

			 		<td class="writer"><img src="${ctx}/content/images/faceimg.png"/><br/>${cmt.writerNickname}</td>
			 		<td class="cmt-rating"><ins></ins><img src="${ctx}/content/images/g${cmt.ratingCode}.png"/></td>
			 		<td class="content">${cmt.content}</td>				
			 		<td class="regDate"><fmt:formatDate pattern="yyyy-MM-dd"
						value='${cmt.regdate}'/></td>
					<c:if test="${cmt.writer == logID}">
					 <td class="cmt-edit"><a href="">수정</a></td>
				     <td class="cmt-del"><a href="">삭제</a></td>	
					</c:if>
			 		<td class="cmt-cmt"><img src="${ctx}/content/images/cmt-cmt.png"/></td>
			 		<td class="report"><a href=""><img src="${ctx}/content/images/report.png"/></a></td>	
		 		</tr>
		 		</c:forEach>		
	 			</tbody>
	 		
	 		
	 		<%-- 
		 	   <tbody>
		 		<tr>
			 		<td name="writer"><img src="${ctx}/content/images/faceimg.png"/></td>
			 		<td name="cmt-rating"><ins>I234D</ins><br/><img src="${ctx}/content/images/5.png"/></td>
			 		<td name="content">The popcon very goodㅇㅇㅇdddddddㅇddddddddddddddddddddd</td>				
			 		<td name="regDate">2011-11-11</td>
			 		<td name="cmt-cmt"><img src="${ctx}/content/images/cmt-cmt.png"/></td>
			 		<td name="report"><a href=""><img src="${ctx}/content/images/report.png"/></a></td>	
		 		</tr>
		 		<tr>
			 		<td name="writer"><img src="${ctx}/content/images/faceimg.png"/></td>
			 		<td name="cmt-rating"><ins>I234D</ins><br/><img src="${ctx}/content/images/5.png"/></td>
			 		<td name="content">The popcon very goodㅇㅇㅇdddddddㅇddddddddddddddddddddd</td>				
			 		<td name="regDate">2011-11-11</td>
			 		<td name="cmt-cmt"><img src="${ctx}/content/images/cmt-cmt.png"/></td>
			 		<td name="report"><a href=""><img src="${ctx}/content/images/report.png"/></a></td>	
		 		</tr>		
		 	   </tbody> --%>
	 	   </table>
	 	         
          </dl>   
	 	 </div>
	 	</div>	
	   </main>   