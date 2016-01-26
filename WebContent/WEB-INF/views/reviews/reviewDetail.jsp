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
<script src="../content/js/commentEdit.js"></script> 
<!-- <script type="text/javascript">

var isModifying=false;
 
		function editBtn(th, code,content) {
			
		  if(isModifying)
		{
			return;	
		} 
		
		
		
	 	var id="#cmt-list-"+code;//"'#"+code+"'";
		var trTemp=document.querySelector(id);
		var cmtContent = trTemp.querySelector(".content");
		
			
		
		 isModifying=true;
		
			
			//아래 2번을 위한 사전 작업
		var textBox=document.createElement("input");
		textBox.type="text";
		//editBtn 함수 안에 인자를 this 로 보내서 th 로받아서 textBox에 this innerText를 찾아서 꽂아준다. 
		textBox.value=th.parentNode.parentNode.querySelector("td:nth-child(3)").innerText;//content; 
		
		var save = document.createElement("input");
		save.type="submit";
		
		
		save.value="save"; //save 클릭함수를 만들어서 post 방식으로 넘겨줘야함. 
			
			//1. 기존 내용 지우고
		cmtContent.innerText=""; 
			//2. 기존텍스트를 담은 인풋태그를 대신 집어넣음
		cmtContent.appendChild(textBox); 
		cmtContent.appendChild(save);
			
	 
		save.onclick = function(){
        
        alert("제발");
        var content = textBox.value;
		 var data = "code=" + code + "&content=" + content;
	     var request;
         if (window.ActiveXObject)
            request = new ActiveXObject("Microsoft.XMLHTTP");
         else if (window.XMLHttpRequest)
            request = new XMLHttpRequest();

         request.onreadystatechange = function() {

            if (request.readyState == 4 && request.status == 200) // operation is complete
            {
               //if (request.responseText == "ok")
	            var test=JSON.parse(request.responseText);
	            alert(test.content);  
	            cmtContent.innerText = test.content;
	            isModifying=false;
             
       
              //document.write(request.responseText);
            }
            
         }
         request.open("POST", "commentEdit", true);
         //open과 send 사이에 집어넣어야 함
         request.setRequestHeader("Content-type",
               "application/x-www-form-urlencoded");
         request.setRequestHeader("Content-length", data.length);
         request.setRequestHeader("Connection", "close");

         request.send(data); 
	  
         return false;  
		}
		}
		
	</script> -->

 
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
	 
	     <div id="u_raiting"><img src="${ctx}/content/images/g${imageavg}.png" alt="유저들별점" />
	     <span style="font-weight: bold;">(${avg })</span></div>			
	  
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
                           <option value="1">★☆☆☆☆</option>
                           <option value="2">★★☆☆☆</option>
                           <option value="3">★★★☆☆</option>
                           <option value="4">★★★★☆</option>
                           <option value="5">★★★★★</option>
                        </select>
                     
                     <h2 class="hidden">내용</h2>
                    
                        &nbsp;<input type="text" name="content"/> 
                       <input class = "btnSave" type="submit" value="댓글완료" />
                     </dd>
                  </dl>   
	 	</nav>
	 	</form>
	 	<nav>
	 	<h1 class="hidden">댓글</h1>
	 	 <dl class="article-detail-row">
           <table id="comments" >
	 		<tbody id="cmt-tbody">
	 	 	<c:forEach var="cmt" items="${list}">
				<tr id="cmt-list-${cmt.cmtcode}">	
			 		<td class="writer"><img src="${ctx}/content/images/faceimg.png"/><br/>${cmt.writerNickname}</td>
			 		<td class="cmt-rating">
		
			 		<span id="r"><ins></ins><img id="cmtRimg" src="${ctx}/content/images/g${cmt.ratingCode}.png"/></span>
			 		</td>
			 		
			 		<td id="reply-content" class="content">
			 		${cmt.content}
			 		</td>				
			 		
			 		<td class="regDate"><fmt:formatDate pattern="yyyy-MM-dd"
						value='${cmt.regdate}'/></td>
					<td class="cmt-cmt"><img src="${ctx}/content/images/cmt-cmt.png"/>
			 		<a href="" name="report"><img src="${ctx}/content/images/report.png"/></a></td>
					<c:if test="${cmt.writer == logID}">
					 <td class="cmt-edit">
					 
						 <%-- <a href="commentEdit?c=${cmt.cmtcode}" style="font-size:20px;">Edit</a> --%>
						<input type="button" onclick="editBtn(this, '${cmt.cmtcode}','${cmt.content}');" id="edit-btn" value="Edit"/>
					
						 
						 <form class="cmt-del" action ="cmtdelete" method="post">
							  <input type="hidden" value="${review.num}" name="c"/> 
							  <input type="hidden" value="${cmt.cmtcode}" name="cmtcode"/>
						      <input type="submit" value="Del"/></a>	
					     </form>
					 
					 </td>
					</c:if>
			 		
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
	 	 </nav>
	 	</div>	
	   </main>   