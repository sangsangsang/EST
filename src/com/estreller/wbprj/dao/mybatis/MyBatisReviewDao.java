package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Review;

public class MyBatisReviewDao implements ReviewDao {

	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Review> getReivews() throws SQLException {
		return getReviews(1,"CategoryCode","");
	}

	@Override
	public List<Review> getReviews(int page) throws SQLException {
		return getReviews(page,"CategoryCode","");
		
	}

	@Override
	public List<Review> getReviews(int page, String category, String query)throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewDao dao = session.getMapper(ReviewDao.class);
		List<Review> list = dao.getReviews(page,category,query);
		session.close();
		return list;
	}

	@Override
	public int update(Review review) throws SQLException{
		SqlSession session = ssf.openSession();
		ReviewDao dao = session.getMapper(ReviewDao.class);
		int count = dao.update(review);
		session.commit();
		session.close();
		return count;
	
	}

	@Override
	public int delete(Review review) throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewDao dao = session.getMapper(ReviewDao.class);
		int count = dao.delete(review);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int insert(Review review) throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewDao dao = session.getMapper(ReviewDao.class);
		
		int count = dao.insert(review);
		session.commit();
		session.close();
		return count;
	}

	
	
	
	

}
