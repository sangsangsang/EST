package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.estreller.wbprj.dao.RequestDao;
import com.estreller.wbprj.vo.Request;



public class MybatisRequestDao implements RequestDao{
	
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();

	public List<Request> getRequest(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		RequestDao dao = session.getMapper(RequestDao.class);
		List<Request> list = dao.getRequest(page,field,query);
		session.close();
		
		return list;
	}
	
	
	@Override
	public int insert(Request request) throws SQLException {
		SqlSession session = ssf.openSession();
		RequestDao dao = session.getMapper(RequestDao.class);
		
		int count = dao.insert(request);
		session.commit();
		session.close();
		return count;
	}
	

	

	@Override
	public int delete(String mid) throws SQLException {
		SqlSession session = ssf.openSession();
		RequestDao dao = session.getMapper(RequestDao.class);
		int count = dao.delete(mid);
		session.commit();
		session.close();
		return count;
	}


	
}