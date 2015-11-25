import java.sql.SQLException;
import java.util.List;


import com.estreller.wbprj.dao.CommentDao;
import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.mybatis.MyBatisCommentDao;
import com.estreller.wbprj.dao.mybatis.MyBatisMemberDao;
import com.estreller.wbprj.vo.Comment;
import com.estreller.wbprj.vo.Member;

public class CommentTextProgram {

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
		
		CommentDao cDao = new MyBatisCommentDao();
		
		Comment comment = new Comment();

	
		/*//�Է�
		comment.setWriter("kimbj0411@nate.com");
		comment.setReviewNum("1");
		comment.setRatingCode("4");
		comment.setContent("������¯");
		cDao.insert(comment);*/
		
		/*//����
		comment.setWriter("kbj_4909@naver.com");
		comment.setReviewNum("1");
		cDao.delete(comment);*/
		
		/*//����
		comment.setWriter("kbj_4909@naver.com");
		comment.setReviewNum("1");
		comment.setRatingCode("4");
		comment.setContent("������¯");
		cDao.update(comment);*/
		
		List<Comment> cList = cDao.getComments(1);
		System.out.println("�˻���� : " + list.size()+" ���: "+cList.size());
		
		for(Member m : list)
		{
			
			System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}
		
		for(Comment c : cList)
		{
		
			System.out.printf("Writer: %s, ReivewNum: %s, Content: %s, RatingCode: %s, Regdate: %s\n",
					c.getNickName(), c.getReviewNum(), c.getContent(), c.getRatingCode(), c.getRegdate());
		
		}
		
		
		//session.close();

	}

}