package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;


import com.estreller.wbprj.vo.CommentRating;



public interface CommentRatingDao {
	public  List<CommentRating> getCommentRating() throws SQLException;
	public  List<CommentRating> getCommentRating(int page) throws SQLException;
	public  List<CommentRating> getCommentRating(int page,String field, String query) throws SQLException;

	public int delete(CommentRating commentRating) throws SQLException;
	public int insert(CommentRating commentRating) throws SQLException;
}
