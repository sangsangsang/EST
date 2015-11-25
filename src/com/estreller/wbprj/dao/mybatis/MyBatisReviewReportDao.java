package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.ReviewReportDao;
import com.estreller.wbprj.vo.ReviewReport;

public class MyBatisReviewReportDao implements ReviewReportDao {
	
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<ReviewReport> getReviewReports() throws SQLException {
		return getReviewReports(1);
	}

	@Override
	public List<ReviewReport> getReviewReports(int page) throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewReportDao dao = session.getMapper(ReviewReportDao.class);
		List<ReviewReport> list = dao.getReviewReports(page);
		session.close();
		return list;
	}

	@Override
	public int insert(ReviewReport reviewReport) throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewReportDao dao = session.getMapper(ReviewReportDao.class);
		
		int count = dao.insert(reviewReport);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int delete(ReviewReport reviewReport) throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewReportDao dao = session.getMapper(ReviewReportDao.class);
		
		int count = dao.delete(reviewReport);
		session.commit();
		session.close();
		return count;
	}

}
