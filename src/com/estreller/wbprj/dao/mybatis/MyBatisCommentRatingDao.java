package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.CommentRatingDao;
import com.estreller.wbprj.vo.CommentRating;

public class MyBatisCommentRatingDao implements CommentRatingDao{
	
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<CommentRating> getCommentRating() throws SQLException {
		// TODO Auto-generated method stub
		return getCommentRating(1,"Code","");
	}

	@Override
	public List<CommentRating> getCommentRating(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getCommentRating(page,"Code","");
	}

	@Override
	public List<CommentRating> getCommentRating(int page, String field, String query) throws SQLException {
		
		SqlSession session = ssf.openSession();
		CommentRatingDao dao = session.getMapper(CommentRatingDao.class);
		List<CommentRating> list = dao.getCommentRating(page,field,query);
		session.close();
		return list;
	}

	@Override
	public int delete(CommentRating commentRating) throws SQLException {
		SqlSession session = ssf.openSession();
		CommentRatingDao dao = session.getMapper(CommentRatingDao.class);
		int count = dao.delete(commentRating);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int insert(CommentRating commentRating) throws SQLException {
		SqlSession session = ssf.openSession();
		CommentRatingDao dao = session.getMapper(CommentRatingDao.class);
		
		int count = dao.insert(commentRating);
		session.commit();
		session.close();
		return count;
	}
	

}
