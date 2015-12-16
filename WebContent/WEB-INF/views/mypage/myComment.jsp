<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%

   request.getContextPath();
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
   

   <div id ="box" class="hc vc">

      <main id="main" class="h1">
         <h2>내가 작성한 댓글 </h2>
         
         <div class="member-search">
            <h3 class="hidden"></h3>
            <form>
               <fieldset>
                  <label class="hidden">분류</label>
                  <select>
                     <option>카테고리</option>
                     <option>Sports</option>
                     <option>Movie</option>
                     <option>Game</option>
                     <option>Book</option>
                     <option>Music</option>
                     <option>Fashion&Beauty</option>
                     <option>Show&Concert</option>
                     <option>Food</option>
                     <option>Travel</option>
                     <option>Electronics</option>
                     
                  </select>
                  <label class="hidden">검색어</label><input type="text"/>
                  <input type="submit" value="검색"/>
               </fieldset>
            </form>
         </div>
      
         <h3 class="hidden">내가 작성한 댓글</h3>
         <table id="comment-table">

            <thead>
               <tr>
                  <th>카테고리</th>
                  <th>댓글</th>
                  <th>등록일자</th>
                  <th>삭제</th>
               </tr>
            </thead>
            <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody>
            
             <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody> <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody> <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody> <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody> <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody> <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
               
              
                  <tr>
                     <td>Movie</td>
                     <td><a href="">히말라ㅏㅏㅏㅏㅏ야ㅑㅑㅑㅇㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㅑㅑ</a></td>
                     <td>2011-12-01</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody> <tbody>
              
                  <tr>
                     <td>Food</td>
                     <td><a href="">맥날츄러스존맛핵맛꿀맛</a></td>
                     <td>2011-09-11</td>
                     <td><input type="submit" value="삭제" /></td>
                  </tr>
              
            </tbody>                   
         </table>
         
         <h3 class="hidden">전체페이지와 현재페이지</h3>
         <br>
         <br>
          <br>
         <br>
         <h3 class="hidden">페이지 번호</h3>
         <p><a href="">1</a></p>
         <p>1/1page</p>
         
         
      </main>
      
      </div>
   </div>
   
   <!-- 박스 div -->
   </div>
   
   
   
   <footer id="footer">
      
    
      </div>
   </footer>
   
</body>
</html>