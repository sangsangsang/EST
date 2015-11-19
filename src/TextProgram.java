import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.JdbcMemberDao;
import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.mybatis.EstrellerSqlSessionFactoryBuilder;
import com.estreller.wbprj.dao.mybatis.MyBatisMemberDao;
import com.estreller.wbprj.vo.Member;

public class TextProgram {

	public static void main(String[] args) throws SQLException {
		//JdbcMemberDao dao = new JdbcMemberDao();//JDBC Ȱ��
		/*SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		MemberDao dao = session.getMapper(MemberDao.class);
		
		*/
		MemberDao dao = new MyBatisMemberDao();//MyBatisȰ��
		
		Member member = new Member();
		//������Ʈ��Ű������ ����.
		/*member.setEmail("rlatkd12");
		member.setNickname("�ֽ�");
		member.setPwd("1234");
		dao.update(member);
		//rlatkd �̶�� ���̵��� �����͸� ����
		dao.delete("rlatkd");*/
		//2�����̿� �ش�Ǵ� �������Ʈ�� ��´�
		List<Member> list = dao.getMembers(1);
		//insert ID ,NAME �߰�
	   /* member.setEmail("rlatkd");
		member.setNickname("���");
		dao.insert(member);
		*/
		System.out.println("�˻���� : " + list.size());
		
		for(Member m : list)
		{
			
			System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}
		
		//session.close();

	}

}
