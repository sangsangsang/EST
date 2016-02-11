<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form action="reviewDetail" method="post">
	<div>
		<h2 class="hidden">사유 선택</h2>
		<p>사유 선택</p>
		<select id="rep-select" name="option">
			<option>음란성 또는 청소년에게 부적합한 내용</option>
			<option>욕설 또는 폭력적인 내용</option>
			<option>부적절한 홍보 글</option>
			<option>기타</option>	
		</select>
	</div>
	<div>
		<h2 class="hidden">세부내용</h2>
		<p>세부 내용</p>
		<textarea id="text-area" name="content"></textarea>
	</div>
	<h2 class="hidden">버튼</h2>
	<input id="save-button" type="submit" value="저장" />
</form>