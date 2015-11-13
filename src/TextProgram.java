import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.JdbcMemberDao;
import com.estreller.wbprj.vo.Member;

public class TextProgram {

	public static void main(String[] args) throws SQLException {
		JdbcMemberDao dao = new JdbcMemberDao();
		
		List<Member> list = dao.getMembers(2);
		
		for(Member m : list)
		{
			System.out.printf("mid:%s, name : %s \n", m.getMid(),m.getName());
		}

	}

}
