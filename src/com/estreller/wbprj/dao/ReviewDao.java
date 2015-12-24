package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;


import com.estreller.wbprj.vo.Review;

public interface ReviewDao {
	
	public  List<Review> getReivews() throws SQLException;
	public  List<Review> getReviews(int page) throws SQLException;
	public  List<Review> getReviews(int page,String category, String query) throws SQLException;
	public int update(Review review) throws SQLException;
	public int insert(Review r) ;
	public String getLastNum();
	public int delete(Review review) throws SQLException;
}

