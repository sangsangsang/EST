package com.estreller.wbprj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.estreller.wbprj.vo.Member;

public class JdbcMemberDao implements MemberDao {
	public  List<Member> getMembers() throws SQLException{
					
				return getMembers(1,"MID","");
	}
	public  List<Member> getMembers(int page) throws SQLException{
		
		return getMembers(page,"MID","");
}
	
	public  List<Member> getMembers(int page,String field, String query) throws SQLException{
		int start = 1+(page-1)*10;//1,11,21,31,41...an = a1+(n-1)d ->1+(page-1)*10
		int end=page*10;//10,20,30,40,.... 
		String sql ="SELECT * FROM ("
					+ "SELECT ROW_NUMBER() OVER(ORDER BY REGDATE DESC) NUM,MEMBERS.* FROM MEMBERS WHERE "+field+" LIKE ? )A "
					+ "WHERE NUM BETWEEN ? AND ?"; 


		//String url ="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=edudb;";
		
		Connection con = DriverManager.getConnection(url,"edu","class2d");
		
		/*Statement st=con.createStatement();//�����������ϰ����ִ°� DB������ ��������̸��������.
		ResultSet rs=st.executeQuery(sql);*///��������� ��ġ�ؼ� �����;���.
		
		PreparedStatement st = con.prepareStatement(sql);//���������� ? ���� �ش�Ǵ� ���� �̾Ƴ�.
		st.setString(1, "%"+query+"%");//��Ͽ�  ���̵� ����ѰŸ� �˻�����(ù��°?, ��)
		st.setInt(2, start);
		st.setInt(3, end);
		ResultSet rs=st.executeQuery(); //���� �����Ѵ��� ���� 
		
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		
		while(rs.next())
		{
			member = new Member();
			
			member.setEmail(rs.getString("mid"));
			member.setNickname(rs.getString("name"));
			member.setPwd(rs.getString("pwd"));
		
			list.add(member);
		}
		
		rs.close();
		st.close();
	
		con.close();
		
		return list;
	}
	@Override
	public int update(Member member) throws SQLException{
		String sql="UPDATE Members SET Name =?, Pwd=? WHERE Mid=?";
		
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=edudb;";
		Connection con = DriverManager.getConnection(url,"edu","class2d");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,member.getNickname());
		st.setString(2,member.getPwd());
		st.setString(3,member.getEmail());
		
		
		int count=st.executeUpdate();
		
		st.close();
		con.close();
		
		return count;
	}
	@Override
	public int delete(String mid) throws SQLException {
		String sql="DELETE Members WHERE MID=?";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=edudb;";
		Connection con = DriverManager.getConnection(url,"edu","class2d");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1,mid);
		int count=st.executeUpdate();
	    
		
		st.close();
		con.close();
		
		return count;
	}
	@Override
	public int insert(Member member) throws SQLException {
		String sql="INSERT INTO MEMBERS(MID,NAME) VALUES(?,?)";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=edudb;";
		Connection con = DriverManager.getConnection(url,"edu","class2d");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,member.getEmail());
		st.setString(2,member.getNickname());
		
	int count=st.executeUpdate();
		
		st.close();
		con.close();
		
		return count;
	}
	@Override
	public Member getMember(String email) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
		
	

}
