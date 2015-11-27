import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.RequestDao;
import com.estreller.wbprj.dao.mybatis.MybatisRequestDao;
import com.estreller.wbprj.vo.Request;

public class TestRequest {

	public static void main(String[] args) throws SQLException {
		
		RequestDao dao = new MybatisRequestDao();//MyBatis활용
				
		Request request = new Request();
		
		
		/*
		//insert 추가
		
		request.setNum("5");
		request.setMid("abcd");
		request.setEmail("kimbj0411@nate.com");
		request.setContent("dddd1222d");
		request.setTitle("gggggg");
		
		
		dao.insert(request);
		
		
		*/
		
		
		//삭제
		dao.delete("5");
		
		List<Request> list = dao.getRequest(1,"TITLE","");
		
	
		
		System.out.println("검색결과 : " + list.size());
		
		
		for(Request r : list)
		{
			System.out.printf("작성자:%s, 날짜 :%s, 글 제목:%s, 글 내용:%s \n" , 
					r.getEmail(), r.getRegdate(), r.getTitle(), r.getContent());
			
			//System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}
		
		//session.close();

	}

}
