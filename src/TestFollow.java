import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.estreller.wbprj.dao.FollowDao;
import com.estreller.wbprj.dao.mybatis.EstrellerSqlSessionFactoryBuilder;
import com.estreller.wbprj.dao.mybatis.MyBatisFollowDao;
import com.estreller.wbprj.vo.Follow;



public class TestFollow {

	public static void main(String[] args) throws SQLException {
		
		
	
		
		FollowDao dao = new MyBatisFollowDao();//MyBatis활용
		
		Follow follow = new Follow();
		
		
		/* 추가
		
		follow.setMyEmail("kimney66@naver.com");
		follow.setYourEmail("rlatkd577@naver.com");
		
		
		dao.insert(follow);
		
		
		
		*/
		
		
		/*
		 * 삭제
		  dao.delete("kimbj0411@nate.com");
		
		*/
		
		
		List<Follow> list = dao.getFollows(1,"myEmail","kimney66@naver.com");
	
		
		
		
		System.out.println("검색결과 : " + list.size());
		
		
		for(Follow f : list)
		{
			System.out.printf("작성자:%s, 날짜 :%s, 카테고리 코드 :%s, 글 제목:%s \n" ,
					f.getWriterNickName(), f.getRegdate(), f.getCategoryCode(), f.getTitle());
			
			//System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}
		
		//session.close();

	}

}
