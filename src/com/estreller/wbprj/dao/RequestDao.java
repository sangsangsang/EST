package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Request;

public interface RequestDao {

	public List<Request> getRequest(int page, String field, String query) throws SQLException;

	public int delete(String mid) throws SQLException;
	public int insert(Request request) throws SQLException;


}
