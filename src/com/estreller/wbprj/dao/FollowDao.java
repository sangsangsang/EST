package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Follow;



public interface FollowDao {

	int delete(String yourEmail) throws SQLException;



	List<Follow> getFollows(String myEmail) throws SQLException;

	List<Follow> getFollows() throws SQLException;

	List<Follow> getFollows(int page, String field, String query) throws SQLException;

	public int insert(Follow follow) throws SQLException;


	
	



	//public int select();

}


