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
		//JdbcMemberDao dao = new JdbcMemberDao();//JDBC Ȱ��
		/*SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		
		MemberDao dao = session.getMapper(MemberDao.class);
		
		*/
		
		MemberDao dao= new MyBatisMemberDao();//MyBatisȰ��

		Member member = new Member();

		List<Member> list = dao.getMembers(1);

		//������Ʈ��Ű������ ����.
		/*member.setEmail("rlatkd12");
		member.setNickname("�ֽ�");
		member.setPwd("1234");
		dao.update(member);
		//rlatkd �̶�� ���̵��� �����͸� ����
		dao.delete("rlatkd");*/
		//2�����̿� �ش�Ǵ� �������Ʈ�� ��´�
		/* member.setEmail("rlatkd");
		member.setNickname("���");
		dao.insert(member);
		*/
		/*System.out.println("�˻���� : " + list.size());
		for(Member m : list)
		{
			System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}*/
		
		ReviewDao r_dao = new MyBatisReviewDao();//MyBatisȰ��
		Review review = new Review();
		List<Review> r_list = r_dao.getReviews(1,"Title","");

		System.out.println("�˻���� : " + list.size());
		
		for(Review r : r_list){
			System.out.printf("����: %s, �ۼ��� : %s , ����� : %s, ī�װ� : %s, ����: %s\n", 
					r.getTitle(),r.getWriter(),r.getRegdate(),r.getCategorycode(),r.getContent());

		}

		  
		
		RecommendDao R_dao = new MyBatisRecommendDao();
		Recommend recommend = new Recommend();
		List<Recommend>R_list = R_dao.getRecommend(1,"Writer","");
		/*recommend.setCode("9");//���ƿ� �ڵ带 ����
		recommend.setWriter("kbj_4909@naver.com");
		recommend.setReviewNum("7");
		R_dao.insert(recommend);*/
		//R_dao.delete("9");//���ƿ� �ڵ带 ����
		System.out.println("========���� �Խñۿ� ���̴� ���ƿ� ����===========");
		for(Recommend r:R_list){
			System.out.printf("�Խù��ڵ�: %s,  ���ƿ�: %d ,��ۼ�:%d\n",r.getNum(),r.getRcmCount(),r.getComCount());
		}

		ReviewRatingDao R_R_dao = new MyBatisReviewRatingDao();
		ReviewRating rating = new ReviewRating();
		List<ReviewRating>R_R_list = R_R_dao.getRatings(1,"CategoryCode","Music","RatingCode","3");
		System.out.println("========������ �������� �������� SELECT===========");
		for(ReviewRating r:R_R_list){
			System.out.printf("�Խù��ڵ�:%S ī�װ�:%s �ۼ���:%s ����:%s ��¥:%s ����:%s,���ƿ�:%d,��ۼ�:%d\n",
					r.getNum(),r.getCategoryCode(),r.getWriterNickName(),r.getTitle(),r.getRegdate(),
					r.getRatingcode(),r.getRcmCount(),r.getComCount());

		}
		

		CategoryDao c_dao = new MyBatisCategoryDao();
		Category category = new Category();
		List<Category>c_list = c_dao.getCategory(1,"CategoryCode","Music");
		//session.close();
		System.out.println("========ī�װ� �������� �������� SELECT===========");
		for(Category c:c_list){
			System.out.printf("�Խù��ڵ�:%S ī�װ�:%s �ۼ���:%s ����:%s ��¥:%s ����:%s,���ƿ�:%d,��ۼ�:%d\n",
					c.getNum(),c.getCategoryCode(),c.getWriterNickName(),c.getTitle(),c.getRegdate(),
					c.getRatingcode(),c.getRcmCount(),c.getComCount());
		}

	}

}
