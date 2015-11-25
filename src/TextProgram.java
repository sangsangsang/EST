import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Review;

public class TextProgram {

	public static void main(String[] args) throws SQLException {
		//JdbcMemberDao dao = new JdbcMemberDao();//JDBC 활용
		/*SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		MemberDao dao = session.getMapper(MemberDao.class);
		
		*/
		ReviewDao dao = new MyBatisReviewDao();//MyBatis활용
		
		Member member = new Member();
		Review review = new Review();
		//업데이트시키기위한 셋팅.
		/*member.setEmail("rlatkd12");
		member.setNickname("쌍쌍");
		member.setPwd("1234");
		dao.update(member);
		//rlatkd 이라는 아이디의 데이터를 삭제
		dao.delete("rlatkd");*/
		//2페지이에 해당되는 멤버리스트를 담는다
		List<Review> list = dao.getReviews(1,"Title","축구");
		//insert ID ,NAME 추가
	   /* member.setEmail("rlatkd");
		member.setNickname("김쌍");
		dao.insert(member);
		*/
		System.out.println("검색결과 : " + list.size());
		
		for(Review m : list)
		{
			
			System.out.printf("제목: %s, 작성자 : %s , 등록일 : %s, 카테고리 : %s, 내용: %s\n", 
					m.getTitle(),m.getWriter(),m.getRegdate(),m.getCategorycode(),m.getContent());
		}
		
		//session.close();

	}

}
