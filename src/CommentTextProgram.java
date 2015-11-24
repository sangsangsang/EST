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
		//JdbcMemberDao dao = new JdbcMemberDao();//JDBC 활용
		/*SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		MemberDao dao = session.getMapper(MemberDao.class);
		
		*/
		MemberDao dao = new MyBatisMemberDao();//MyBatis활용
		
		Member member = new Member();
		//업데이트시키기위한 셋팅.
		/*member.setEmail("rlatkd12");
		member.setNickname("쌍쌍");
		member.setPwd("1234");
		dao.update(member);
		//rlatkd 이라는 아이디의 데이터를 삭제
		dao.delete("rlatkd");*/
		//2페지이에 해당되는 멤버리스트를 담는다
		List<Member> list = dao.getMembers(1);
		//insert ID ,NAME 추가
	   /* member.setEmail("rlatkd");
		member.setNickname("김쌍");
		dao.insert(member);
		*/
		
		CommentDao cDao = new MyBatisCommentDao();
		
		Comment comment = new Comment();

	
		/*//입력
		comment.setWriter("kimbj0411@nate.com");
		comment.setReviewNum("1");
		comment.setRatingCode("4");
		comment.setContent("지나니짱");
		cDao.insert(comment);*/
		
		/*//삭제
		comment.setWriter("kbj_4909@naver.com");
		comment.setReviewNum("1");
		cDao.delete(comment);*/
		
		/*//수정
		comment.setWriter("kbj_4909@naver.com");
		comment.setReviewNum("1");
		comment.setRatingCode("4");
		comment.setContent("지나니짱");
		cDao.update(comment);*/
		
		List<Comment> cList = cDao.getComments(1);
		System.out.println("검색결과 : " + list.size()+" 결과: "+cList.size());
		
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
