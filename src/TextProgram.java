import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.vo.Member;

public class TextProgram {

	public static void main(String[] args) throws SQLException {
		MemberDao dao = new MemberDao();
		
		List<Member> list = dao.getMembers(2);
		
		for(Member m : list)
		{
			System.out.printf("mid:%s, name : %s \n", m.getMid(),m.getName());
		}

	}

}
