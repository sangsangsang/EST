package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Member;

public interface MemberDao {

	public  List<Member> getMembers() throws SQLException;
	public  List<Member> getMembers(int page) throws SQLException;
	public  List<Member> getMembers(int page,String field, String query) throws SQLException;

	public int update(Member member);
	public int delete(String mid);
	public int insert(Member member);
}