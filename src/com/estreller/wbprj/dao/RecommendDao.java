package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Recommend;

public interface RecommendDao {
	
	public  List<Recommend> getRecommend(int page,String field, String query) throws SQLException;
	public  List<Recommend> getReviewRecommend(String code) throws SQLException;
	public int insert(Recommend recommend) throws SQLException;
	public int delete(Recommend recommend) throws SQLException;

}
