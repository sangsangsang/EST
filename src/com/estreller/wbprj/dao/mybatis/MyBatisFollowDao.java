package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.FollowDao;
import com.estreller.wbprj.vo.Follow;



public class MyBatisFollowDao implements FollowDao {
	
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();

	
	/*@Override
	public int select() {
		// TODO Auto-generated method stub
		return 0;
	}*/

	@Override
	public int delete(String yourEmail) throws SQLException {
		SqlSession session = ssf.openSession();
		FollowDao dao = session.getMapper(FollowDao.class);
		
		int count = dao.delete(yourEmail);
		session.commit();
		session.close();
		return count;
	
	}

	@Override
	public int insert(Follow follow) throws SQLException {
		SqlSession session = ssf.openSession();
		FollowDao dao = session.getMapper(FollowDao.class);
		
		int count = dao.insert(follow);
		session.commit();
		session.close();
		return count;
	
	}

	@Override
	public List<Follow> getFollows(String myEmail) throws SQLException {
		SqlSession session = ssf.openSession();
		FollowDao dao = session.getMapper(FollowDao.class);
		List<Follow> list = dao.getFollows(myEmail);
		session.close();
	
		return list;
	}
	
	@Override
	public List<Follow> getFollows() throws SQLException {
		// TODO Auto-generated method stub
		return getFollows(1,"yourEmail","");
	}

	@Override
	public List<Follow> getFollows(int page, String field, String query) throws SQLException {
		
		SqlSession session = ssf.openSession();
		FollowDao dao = session.getMapper(FollowDao.class);
		List<Follow> list = dao.getFollows(page,field,query);
		session.close();
		return list;
	}
		
}
