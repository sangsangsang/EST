package com.estreller.wbprj.dao.mybatis;


import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.estreller.wbprj.dao.CommentDao;
import com.estreller.wbprj.vo.Comment;



public class MyBatisCommentDao implements CommentDao {
	
	//SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired
	private SqlSession sqlSession;
	
	/*@Override
	public List<Comment> getComments() throws SQLException {
		// TODO Auto-generated method stub
		return getComments(1,"Writer","");
	}

	@Override
	public List<Comment> getComments(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getComments(page,"Writer","");
	}
*/
	@Override
	public List<Comment> getComments(String code) throws SQLException {
		
		//SqlSession session = ssf.openSession();
		CommentDao dao = sqlSession.getMapper(CommentDao.class);
		List<Comment> list = dao.getComments(code);
		//session.close();
		return list;
	}

	@Override
	public int update(Comment comment) throws SQLException{
		//SqlSession session = ssf.openSession();
		CommentDao dao = sqlSession.getMapper(CommentDao.class);
		int count = dao.update(comment);
		//session.commit();
		//session.close();
		return count;
	
	}

	@Override
	public int delete(String c) throws SQLException {
		//SqlSession session = ssf.openSession();
		CommentDao dao = sqlSession.getMapper(CommentDao.class);
		int count = dao.delete(c);
		//session.commit();
		//session.close();
		return count;
	}

	@Override
	public int insert(Comment comment) throws SQLException {
		//SqlSession session = ssf.openSession();
		CommentDao dao = sqlSession.getMapper(CommentDao.class);
		
		int count = dao.insert(comment);
		//session.commit();
		//session.close();
		return count;
	}

}
