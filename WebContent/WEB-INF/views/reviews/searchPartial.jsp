<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form action="search-review-list" method="GET">
	<select id="select" name="f">
		<option value="Title">Title</option>
		<option value="WriterNickname">Writer</option>
		<option value="Keyword">Keyword</option>
		<option value="Content">Content</option>	
	</select>
	<!-- <input id="close-btn" type="button" value="X" /> -->
	
	<input id="search-btn" type="submit" value="검색" />
	<input id="search-txt" type="text" name="q" value="Search" />
</form>