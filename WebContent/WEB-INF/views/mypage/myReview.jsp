<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
   
 
      <main id="main">
      
         <h1 class="hidden">리뷰리스트</h1>
         
         
         <div id ="box1" class="hc vc">
         
          <nav id ="category-form">
            <ul>
            <a href=""><img src=""
                     alt="" /></a>
            <a href="">내가 작성한 글 보기</a>
            
            </ul>
            </nav>
         <nav id = "rating-menu">
            <h1 class ="hidden">별점메뉴</h1>
            <ul>
               <li><a href=""><img src="${ctx}/content/images/5.png"
                     alt="별5개" /></a></li>
               <li><a href=""><img src="${ctx}/content/images/4.png"
                     alt="별4개" /></a></li>
               <li><a href=""><img src="${ctx}/content/images/3.png"
                     alt="별3개" /></a></li>
               <li><a href=""><img src="${ctx}/content/images/2.png"
                     alt="별2개" /></a></li>
               <li><a href=""><img src="${ctx}/content/images/1.png"
                     alt="별1개" /></a></li>
               
            </ul>
         
            
        
         
         </div>
         
         
          <div id ="box2" class="hc2 vc2" >
       <table id="review-preview-wide">
         <tbody>
             <tr>
                <td><a href=""><img src="${ctx}/content/images/faceimg.png"
                     alt="닉네임" /></a></td>   
                <td>Chicken good</td>            
                <td>2011-11-11</td>   
             </tr>
             
          </tbody>
     
       </table>
       <div id="review-frame-wide">
       
           <table id ="review-img-wide">
          <tbody>
                <tr>
                   <td>
                      <a href=""><img src="${ctx}/content/images/faceimg.png" width ="45" height="45"
                        alt="닉네임" /></a>
                        </td>
                        <td id = "user-star-wide">
                        <a href=""><img src="${ctx}/content/images/g4.png" width ="80" height="20"/>
                        </a></td>
                        <td>
                      <a href=""><img src="${ctx}/content/images/user.png" width ="45" height="45"
                        alt="닉네임" /></a>
                        </td>
                        
                        <td>
                        <a href=""><img src="${ctx}/content/images/g3.png" width ="80" height="20"/>
                        </a></td>
                        
                        <td id = "like-wide">
                         <a href=""><img src="${ctx}/content/images/like.png" width ="25" height="25"
                        alt="좋아요갯수" /></a>
                        (20)
                        </td>
                        
                        <td id = "comment-wide">
                         <a href=""><img src="${ctx}/content/images/comment.png" width ="25" height="25"
                        alt="댓글갯수" /></a>
                        (5)
                        </td>
                        
                     </tr>
              </tbody>   
          
          </table>
          </div>
       </div>
         
         
       
       
       <div id ="box3" class="hc3 vc3" >
       <table id="review-preview-wide">
         <tbody>
             <tr>
                <td><a href=""><img src="${ctx}/content/images/faceimg.png"
                     alt="닉네임" /></a></td>   
                <td>Chicken good</td>            
                <td>2011-11-11</td>   
             </tr>
             
          </tbody>
     
       </table>
       <div id="review-frame-wide">
       
           <table id ="review-img-wide">
          <tbody>
                <tr>
                   <td>
                      <a href=""><img src="${ctx}/content/images/faceimg.png" width ="45" height="45"
                        alt="닉네임" /></a>
                        </td>
                        <td id = "user-star-wide">
                        <a href=""><img src="${ctx}/content/images/g4.png" width ="80" height="20"/>
                        </a></td>
                        <td>
                      <a href=""><img src="${ctx}/content/images/user.png" width ="45" height="45"
                        alt="닉네임" /></a>
                        </td>
                        
                        <td>
                        <a href=""><img src="${ctx}/content/images/g3.png" width ="80" height="20"/>
                        </a></td>
                        
                        <td id = "like-wide">
                         <a href=""><img src="${ctx}/content/images/like.png" width ="25" height="25"
                        alt="좋아요갯수" /></a>
                        (3)
                        </td>
                        
                        <td id = "comment-wide">
                         <a href=""><img src="${ctx}/content/images/comment.png" width ="25" height="25"
                        alt="댓글갯수" /></a>
                        (1)
                        </td>
                        
                     </tr>
              </tbody>   
          
          </table>
          </div>
       </div>
    
      </main>   
 