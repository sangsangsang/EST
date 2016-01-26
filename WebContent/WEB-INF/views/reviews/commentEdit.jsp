<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
   
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

		<c:forEach var="cmt" items="${list}">
		 		
		 		<tr>
					
			 		<td class="writer"><img src="${ctx}/content/images/faceimg.png"/><br/>${cmt.writerNickname}</td>
			 		<td class="cmt-rating"><ins></ins>
			 		
			 		 <dd class="cmt">   
                        <select name="ratingCode">
                           <option value="1">★☆☆☆☆</option>
                           <option value="2">★★☆☆☆</option>
                           <option value="3">★★★☆☆</option>
                           <option value="4">★★★★☆</option>
                           <option value="5">★★★★★</option>
                        </select>
                     
                     <h2 class="hidden">내용</h2>
                    
                      <!--   &nbsp;<input type="text" name="content"/>  -->
                       
                     </dd>
			 		</td>
			 		<%-- <td class="cmt-rating"><ins></ins><img src="${ctx}/content/images/g${cmt.ratingCode}.png"/></td> --%>
			 		<td class="content"><input type="text" id="content" value="${cmt.content}"/>				
			 		<input class = "btnSave" type="submit" value="save" /></td>
			 		<td class="regDate"><fmt:formatDate pattern="yyyy-MM-dd"
						value='${cmt.regdate}'/></td>
					<td class="cmt-cmt"><img src="${ctx}/content/images/cmt-cmt.png"/>
			 		<a href="" name="report"><img src="${ctx}/content/images/report.png"/></a></td>
					<c:if test="${cmt.writer == logID}">
					 <td class="cmt-edit">
					 
						  <input type="submit"value="Edit"/>
					
					 
					 <form class="cmt-del" action ="cmtdelete" method="post">
						  <input type="hidden" value="${review.num}" name="c"/> 
						  <input type="hidden" value="${cmt.cmtcode}" name="cmtcode"/>
					      <input type="submit" value="Del"/></a>	
				     </form>
					 
					 </td>
					</c:if>
			 		
		 		</tr>
		 		</c:forEach>