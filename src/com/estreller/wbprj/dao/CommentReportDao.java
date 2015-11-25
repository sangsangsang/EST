package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.CommentReport;


public interface CommentReportDao {
	public  List<CommentReport> getCommentReport() throws SQLException;
	public  List<CommentReport> getCommentReport(int page) throws SQLException;
	public  List<CommentReport> getCommentReport(int page,String field, String query) throws SQLException;

	public int delete(CommentReport commentReport) throws SQLException;
	public int insert(CommentReport commentReport) throws SQLException;
}
