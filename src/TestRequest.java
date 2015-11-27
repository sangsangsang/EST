import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.RequestDao;
import com.estreller.wbprj.dao.mybatis.MybatisRequestDao;
import com.estreller.wbprj.vo.Request;

public class TestRequest {

	public static void main(String[] args) throws SQLException {
		
		RequestDao dao = new MybatisRequestDao();//MyBatisȰ��
				
		Request request = new Request();
		
		
		/*
		//insert �߰�
		
		request.setNum("5");
		request.setMid("abcd");
		request.setEmail("kimbj0411@nate.com");
		request.setContent("dddd1222d");
		request.setTitle("gggggg");
		
		
		dao.insert(request);
		
		
		*/
		
		
		//����
		dao.delete("5");
		
		List<Request> list = dao.getRequest(1,"TITLE","");
		
	
		
		System.out.println("�˻���� : " + list.size());
		
		
		for(Request r : list)
		{
			System.out.printf("�ۼ���:%s, ��¥ :%s, �� ����:%s, �� ����:%s \n" , 
					r.getEmail(), r.getRegdate(), r.getTitle(), r.getContent());
			
			//System.out.printf("Email:%s, NickName : %s , Pwd : %s, JoinDate: %s\n", m.getEmail(),m.getNickname(),m.getPwd(),m.getJoinDate());
		}
		
		//session.close();

	}

}
