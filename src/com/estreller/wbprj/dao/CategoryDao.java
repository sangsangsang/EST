package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Category;


public interface CategoryDao {
	public  List<Category> getCategory(int page,String field1,String query1) throws SQLException;

	public int update(Category category) throws SQLException;
	public int delete(String code) throws SQLException;
	public int insert(String code) throws SQLException;
}
