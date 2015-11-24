package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.ReviewRatingDao;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.ReviewRating;


public class MyBatisReviewRatingDao implements ReviewRatingDao {
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<ReviewRating> getRatings(int page, String field1, String query1, String field2, String query2) throws SQLException
	{
	SqlSession session = ssf.openSession();
	ReviewRatingDao dao = session.getMapper(ReviewRatingDao.class);
	List<ReviewRating> list = dao.getRatings(page,field1,query1,field2,query2);
	session.close();
	return list;
	}

	@Override
	public int update(ReviewRating rating) throws SQLException {
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