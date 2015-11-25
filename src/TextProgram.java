import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Review;

public class TextProgram {

	public static void main(String[] args) throws SQLException {
		//JdbcMemberDao dao = new JdbcMemberDao();//JDBC Ȱ��
		/*SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		MemberDao dao = session.getMapper(MemberDao.class);
		
		*/
		ReviewDao dao = new MyBatisReviewDao();//MyBatisȰ��
		
		Member member = new Member();
		Review review = new Review();
		//������Ʈ��Ű������ ����.
		/*member.setEmail("rlatkd12");
		member.setNickname("�ֽ�");
		member.setPwd("1234");
		dao.update(member);
		//rlatkd �̶�� ���̵��� �����͸� ����
		dao.delete("rlatkd");*/
		//2�����̿� �ش�Ǵ� �������Ʈ�� ��´�
		List<Review> list = dao.getReviews(1,"Title","�౸");
		//insert ID ,NAME �߰�
	   /* member.setEmail("rlatkd");
		member.setNickname("���");
		dao.insert(member);
		*/
		System.out.println("�˻���� : " + list.size());
		
		for(Review m : list)
		{
			
			System.out.printf("����: %s, �ۼ��� : %s , ����� : %s, ī�װ� : %s, ����: %s\n", 
					m.getTitle(),m.getWriter(),m.getRegdate(),m.getCategorycode(),m.getContent());
		}
		
		//session.close();

	}

}
