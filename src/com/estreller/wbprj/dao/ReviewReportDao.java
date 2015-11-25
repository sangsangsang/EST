package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.ReviewReport;

public interface ReviewReportDao {
	
	public  List<ReviewReport> getReviewReports() throws SQLException;
	public  List<ReviewReport> getReviewReports(int page) throws SQLException;
	
	public int insert(ReviewReport reviewReport) throws SQLException;
	public int delete(ReviewReport reviewReport) throws SQLException;
}
