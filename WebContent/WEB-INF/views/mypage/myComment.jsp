<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../content/css/reset.css" type="text/css" rel="stylesheet">
<link href="../content/mypage/css/myComment.css" type="text/css" rel="stylesheet">
</head>
<body>
  <header id="header">
   <div class="content-container">
   <h1 class="hidden">메인</h1>
   <nav id="main-menu">
      <h1 class="hidden">카테고리</h1>
      <ul>
      <li><a href="Category/Sports.html">Sports</a></li>
      <li><a href="Category/Movie.html">Movie</a></li>
      <li><a href="Category/Game.html">Game</a></li>
      <li><a href="Category/Book.html">Book</a></li>
      <li><a href="Category/Music.html">Music</a></li>
      <li><a href="Category/Fashion&Beauty.html">Fashion&Beauty</a></li>
      <li><a href="Category/Show&Concert.html">Show&Concert</a></li>
      <li><a href="Category/Food.html">Food</a></li>
      <li><a href="Category/Travel.html">Travel</a></li>
      <li><a href="Category/Electronics.html">Electronics</a></li>
      </ul>
   </nav>
   <nav id="search">
         <input type="submit" value="검색"/>
    </nav> 
      <section>
      <h1 class="hidden">회원</h1>
         
         
         <nav id="mypage">
            <a href=""><img src="../images/faceimg.png" alt="마이페이지" /></a>
       </nav>
       <p><a href="">I23412343124124312D님</a></p>
        <nav id="write">
           <a href=""><img src="../images/scrap.png" alt="내글보기" /></a>
       </nav> 
       <nav id="comment">
            <a href=""><img src="../images/comment.png" alt="댓글보기" /></a>
       </nav> 
       <nav id="like">
            <a href=""><img src="../images/like.png" alt="좋아요보기" /></a>
       </nav>
       <nav id="report">
            <a href=""><img src="../images/report.png" alt="신고보기" /></a>
       </nav> 
         
      
       
   </section>
    </div>
   </header>
   
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