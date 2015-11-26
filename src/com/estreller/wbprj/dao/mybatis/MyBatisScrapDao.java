package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.ReviewReportDao;
import com.estreller.wbprj.dao.ScrapDao;
import com.estreller.wbprj.vo.Scrap;

public class MyBatisScrapDao implements ScrapDao {
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Override
	public List<Scrap> getScraps() throws SQLException {
		return getScraps(1);
	}

	@Override
	public List<Scrap> getScraps(int page) throws SQLException {
		SqlSession session = ssf.openSession();
		ScrapDao dao = session.getMapper(ScrapDao.class);
		List<Scrap> list = dao.getScraps(page);
		session.close();
		return list;
	}


	@Override
	public int insert(Scrap scrap) throws SQLException {
		SqlSession session = ssf.openSession();
		ScrapDao dao = session.getMapper(ScrapDao.class);
		
		int count = dao.insert(scrap);
		session.commit();
		session.close();
		return count;
	}
	
	@Override
	public int delete(Scrap scrap) throws SQLException {
		SqlSession session = ssf.openSession();
		ScrapDao dao = session.getMapper(ScrapDao.class);
		
		int count = dao.delete(scrap);
		session.commit();
		session.close();
		return count;
	}

}
