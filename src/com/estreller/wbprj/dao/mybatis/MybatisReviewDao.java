package com.estreller.wbprj.dao.mybatis;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.vo.Member;

public class MybatisReviewDao implements ReviewDao {

	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public int select() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Member member) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String mid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(String title, String keyword, String categorycode, String content) throws SQLException {
		SqlSession session = ssf.openSession();
		ReviewDao dao = session.getMapper(ReviewDao.class);
		
		int count = dao.insert(title,keyword,categorycode,content);
		session.commit();
		session.close();
		return count;
	
	}

	

}
