package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.CategoryDao;
import com.estreller.wbprj.dao.ReviewRatingDao;
import com.estreller.wbprj.vo.Category;
import com.estreller.wbprj.vo.ReviewRating;

public class MyBatisCategoryDao implements CategoryDao{
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Override
	public List<Category> getCategory(int page, String field1, String query1) throws SQLException {
		SqlSession session = ssf.openSession();
		CategoryDao dao = session.getMapper(CategoryDao.class);
		List<Category> list = dao.getCategory(page,field1,query1);
		session.close();
		return list;
	}

	@Override
	public int update(Category category) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(String code) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
