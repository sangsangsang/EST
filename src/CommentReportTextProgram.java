import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.CommentReportDao;
import com.estreller.wbprj.dao.mybatis.MyBatisCommentReportDao;
import com.estreller.wbprj.vo.CommentReport;

public class CommentReportTextProgram {

	public static void main(String[] args) throws SQLException {
		CommentReportDao Dao = new MyBatisCommentReportDao();

		CommentReport commentRating = new CommentReport();
		
		List<CommentReport> list = Dao.getCommentReport(1);
		//List<CommentRating> List = Dao.getCommentRating(1);
		System.out.println("검색결과 : " + list.size());
		
		for(CommentReport c : list)
		{
		
			System.out.printf("Writer: %s, ReivewNum: %s, Content: %s, Regdate: %s\n",
					c.getWriter(), c.getReviewNum(), c.getContent(), c.getRegdate());
		
		}

	}

}
