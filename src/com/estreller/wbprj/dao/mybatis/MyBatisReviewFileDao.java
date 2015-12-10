package com.estreller.wbprj.dao.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.ReviewFileDao;
import com.estreller.wbprj.vo.ReviewFile;



public class MyBatisReviewFileDao implements ReviewFileDao {
	
	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();


	@Override
	public List<ReviewFile> getReviewFiles(String noitceCode) {
		SqlSession session = ssf.openSession();
		ReviewFileDao dao = session.getMapper(ReviewFileDao.class);
		List<ReviewFile> list = dao.getReviewFiles(noitceCode);
		session.close();
		return list;
	}

	@Override
	public int insert(ReviewFile file) {
		SqlSession session = ssf.openSession();
		ReviewFileDao dao = session.getMapper(ReviewFileDao.class);
	      int count=0;
	      try{
	         count = dao.insert(file);
	      }
	      catch(Exception e){
	         System.out.println(e.getMessage());
	         session.rollback();
	      }
	      session.commit();
	      session.close();
	      return count;
	}

}
