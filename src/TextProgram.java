import java.sql.SQLException;
import java.util.Date;
import java.util.List;


import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.estreller.wbprj.dao.CategoryDao;
import com.estreller.wbprj.dao.JdbcMemberDao;
import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.RecommendDao;
import com.estreller.wbprj.dao.ReviewRatingDao;
import com.estreller.wbprj.dao.mybatis.EstrellerSqlSessionFactoryBuilder;
import com.estreller.wbprj.dao.mybatis.MyBatisCategoryDao;
import com.estreller.wbprj.dao.mybatis.MyBatisMemberDao;
import com.estreller.wbprj.dao.mybatis.MyBatisRecommendDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewRatingDao;
import com.estreller.wbprj.vo.Category;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Review;
import com.estreller.wbprj.vo.Recommend;
import com.estreller.wbprj.vo.ReviewRating;


public class TextProgram {

	public static void main(String[] args) throws SQLException {
		//JdbcMemberDao dao = new JdbcMemberDao();//JDBC 활용
		/*SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		MemberDao dao = session.getMapper(MemberDao.class);
		
		*/
		
		MemberDao dao= new MyBatisMemberDao();//MyBatis활용

		Member member = new Member();

		List<Member> list = dao.getMembers(1);

		//업데이트시키기위한 셋팅.
		/*member.setEmail("rlatkd12");
		member.setNickname("쌍쌍");
		member.setPwd("1234");
		dao.update(member);
		//rlatkd 이라는 아이디의 데이터를 삭제
		dao.delete("rlatkd");*/
		//2페지이에 해당되는 멤버리스트를 담는다
		/* member.setEmail("rlatkd");
		member.setNickname("김쌍");
		dao.insert(member);
		*/
		/*System.out.println("검색결과 : " + list.size());
		for(Member m : list)
		{
			System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}*/
		
		ReviewDao r_dao = new MyBatisReviewDao();//MyBatis활용
		Review review = new Review();
		List<Review> r_list = r_dao.getReviews(1,"Title","");

		System.out.println("검색결과 : " + list.size());
		
		for(Review r : r_list){
			System.out.printf("제목: %s, 작성자 : %s , 등록일 : %s, 카테고리 : %s, 내용: %s\n", 
					r.getTitle(),r.getWriter(),r.getRegdate(),r.getCategorycode(),r.getContent());

		}

		  
		
		RecommendDao R_dao = new MyBatisRecommendDao();
		Recommend recommend = new Recommend();
		List<Recommend>R_list = R_dao.getRecommend(1,"Writer","");
		/*recommend.setCode("9");//좋아요 코드를 삽입
		recommend.setWriter("kbj_4909@naver.com");
		recommend.setReviewNum("7");
		R_dao.insert(recommend);*/
		//R_dao.delete("9");//좋아요 코드를 삭제
		System.out.println("========기존 게시글에 보이는 좋아요 갯수===========");
		for(Recommend r:R_list){
			System.out.printf("게시물코드: %s,  좋아요: %d ,댓글수:%d\n",r.getNum(),r.getRcmCount(),r.getComCount());
		}

		ReviewRatingDao R_R_dao = new MyBatisReviewRatingDao();
		ReviewRating rating = new ReviewRating();
		List<ReviewRating>R_R_list = R_R_dao.getRatings(1,"CategoryCode","Music","RatingCode","3");
		System.out.println("========별점순 눌렀을때 보여지는 SELECT===========");
		for(ReviewRating r:R_R_list){
			System.out.printf("게시물코드:%S 카테고리:%s 작성자:%s 제목:%s 날짜:%s 별점:%s,좋아요:%d,댓글수:%d\n",
					r.getNum(),r.getCategoryCode(),r.getWriterNickName(),r.getTitle(),r.getRegdate(),
					r.getRatingcode(),r.getRcmCount(),r.getComCount());

		}
		

		CategoryDao c_dao = new MyBatisCategoryDao();
		Category category = new Category();
		List<Category>c_list = c_dao.getCategory(1,"CategoryCode","Music");
		//session.close();
		System.out.println("========카테고리 눌렀을때 보여지는 SELECT===========");
		for(Category c:c_list){
			System.out.printf("게시물코드:%S 카테고리:%s 작성자:%s 제목:%s 날짜:%s 별점:%s,좋아요:%d,댓글수:%d\n",
					c.getNum(),c.getCategoryCode(),c.getWriterNickName(),c.getTitle(),c.getRegdate(),
					c.getRatingcode(),c.getRcmCount(),c.getComCount());
		}

	}

}
