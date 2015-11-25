import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.dao.CommentRatingDao;
import com.estreller.wbprj.dao.mybatis.MyBatisCommentRatingDao;
import com.estreller.wbprj.vo.CommentRating;


public class CommentRatingTextProgram {
	public static void main(String[] args) throws SQLException {
		
	CommentRatingDao Dao = new MyBatisCommentRatingDao();

	CommentRating commentRating = new CommentRating();
	
	List<CommentRating> list = Dao.getCommentRating(1);
	//List<CommentRating> List = Dao.getCommentRating(1);
	System.out.println("검색결과 : " + list.size());
	
	for(CommentRating c : list)
	{
	
		System.out.printf("Code: %s\n", c.getCode());
	
	}
	}
}


