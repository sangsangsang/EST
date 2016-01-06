package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Comment;

public interface CommentDao {
/*
	public  List<Comment> getComments() throws SQLException;
	//public  List<Comment> getComment(String c) throws SQLException;
	public  List<Comment> getComments(int page,String field, String query) throws SQLException;
	List<Comment> getComments(int page) throws SQLException;
	*/
	public int update(Comment comment) throws SQLException;
	public int delete(Comment comment) throws SQLException;
	public int insert(Comment comment) throws SQLException;
	public List<Comment> getComments(String code) throws SQLException;

}
