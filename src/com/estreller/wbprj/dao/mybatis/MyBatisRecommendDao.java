package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.RecommendDao;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Recommend;

public class MyBatisRecommendDao implements RecommendDao{
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Override
	public List<Recommend> getRecommend(int page,String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		List<Recommend> list = dao.getRecommend(page,field,query);
		session.close();
		return list;
	}

	@Override
	public int insert(Recommend recommend) throws SQLException {
		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		
		int count = dao.insert(recommend);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int delete(String code) throws SQLException {
		SqlSession session = ssf.openSession();
		RecommendDao dao = session.getMapper(RecommendDao.class);
		int count = dao.delete(code);
		session.commit();
		session.close();
		return count;
	}
	
	

	
}
