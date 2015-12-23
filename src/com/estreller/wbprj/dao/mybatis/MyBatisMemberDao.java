package com.estreller.wbprj.dao.mybatis;


import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.vo.Member;

public class MyBatisMemberDao implements MemberDao {
	
	//SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired
	private SqlSession session;
	

	
	@Override
	public List<Member> getMembers() throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(1,"Email","");
	}

	@Override
	public List<Member> getMembers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(page,"Email","");
	}

	@Override
	public List<Member> getMembers(int page, String field, String query) throws SQLException {
		
		//SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		List<Member> list = dao.getMembers(page,field,query);
		session.close();
		return list;
	}

	@Override
	public int update(Member member) throws SQLException{
		//SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int count = dao.update(member);
		session.commit();
		session.close();
		return count;
	
	}

	@Override
	public int delete(String email) throws SQLException {
		//SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		int count = dao.delete(email);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int insert(Member m) throws SQLException {
		//SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class);
		
		int count = dao.insert(m);
		/*session.commit();
		session.close();*/
		return count;
	}

	@Override
	public List<Member> getAllEmail() throws SQLException {
		MemberDao dao = session.getMapper(MemberDao.class);
		List<Member> list = dao.getMembers();
		session.close();
		return list;
	}




	

	

}
