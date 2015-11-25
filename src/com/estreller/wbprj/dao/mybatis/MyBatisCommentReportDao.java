package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.estreller.wbprj.dao.CommentReportDao;

import com.estreller.wbprj.vo.CommentReport;

public class MyBatisCommentReportDao implements CommentReportDao {
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<CommentReport> getCommentReport() throws SQLException {
		// TODO Auto-generated method stub
		return getCommentReport(1,"CommentCode","");
	}

	@Override
	public List<CommentReport> getCommentReport(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getCommentReport(page,"CommentCode","");
	}

	@Override
	public List<CommentReport> getCommentReport(int page, String field, String query) throws SQLException {
		
		SqlSession session = ssf.openSession();
		CommentReportDao dao = session.getMapper(CommentReportDao.class);
		List<CommentReport> list = dao.getCommentReport(page,field,query);
		session.close();
		return list;
	}

	@Override
	public int delete(CommentReport commentReport) throws SQLException {
		SqlSession session = ssf.openSession();
		CommentReportDao dao = session.getMapper(CommentReportDao.class);
		int count = dao.delete(commentReport);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int insert(CommentReport commentReport) throws SQLException {
		SqlSession session = ssf.openSession();
		CommentReportDao dao = session.getMapper(CommentReportDao.class);
		
		int count = dao.insert(commentReport);
		session.commit();
		session.close();
		return count;
	}
}
