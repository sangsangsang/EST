package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.ReviewRating;

public interface ReviewRatingDao {
	
	public  List<ReviewRating> getRatings(int page,
			String field1,
			String query1, 
			String field2, 
			String query2) throws SQLException;

	public int update(ReviewRating rating) throws SQLException;
	public int delete(String code) throws SQLException;
	public int insert(String code) throws SQLException;

}
