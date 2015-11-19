package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Member;

public interface ReviewDao {
	
	/*public  List<Member> getMembers() throws SQLException;
	public  List<Member> getMembers(int page) throws SQLException;
	public  List<Member> getMembers(int page,String field, String query) throws SQLException;*/
	public int select();
	public int update(Member member) throws SQLException;
	public int delete(String mid) throws SQLException;
	public int insert(String title, String keyword, String categorycode, String content) throws SQLException;
}