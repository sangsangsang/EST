import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.estreller.wbprj.dao.ScrapDao;
import com.estreller.wbprj.dao.mybatis.MyBatisScrapDao;
import com.estreller.wbprj.vo.ReviewReport;
import com.estreller.wbprj.vo.Scrap;

public class TestScrap {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		
		
		ScrapDao dao = new MyBatisScrapDao();//MyBatisÈ°¿ë
		
		
		MENU:while(true){
			
			System.err.println("---¸Þ´ºÀÓ·Â---");
			System.out.println("1.½ºÅ©·¦Ãâ·Â");
			System.out.println("2.½ºÅ©·¦µî·Ï");
			System.out.println("3.½ºÅ©·¦»èÁ¦");
			System.out.println("4.Á¾·á");
			System.out.print(">>");
			
			int menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				//°Ë»ö
				// ½ºÅ©·¦ÇÑ ¸®ºä ¸ðµÎ Ãâ·Â
				System.out.print("³»°¡ÇÑ ½ºÅ©·¦");
				
				
				List<Scrap> list = dao.getScraps(1);
			
				System.out.println("°Ë»ö°á°ú : " + list.size());
				
				for(Scrap m : list)
				{
					
					System.out.printf("½ºÅ©·¦ÇÑ ¸®ºä¹øÈ£: %s,½ºÅ©·¦ÇÑ ÀÏÀÚ : %s\n", 
							m.getReviewnum(),m.getRegdate());
				}
				break;
			case 2:
				//»ðÀÔ(insert)
				//½ºÅ©·¦ÇÒ ¸®ºä ¹øÈ£ÀÔ·Â
				System.out.println("½ºÅ©·¦ÇÒ ¸®ºä¹øÈ£ : ");
				String review_num = input.next();
				
				Scrap Scrap_review = new Scrap();
				Scrap_review.setReviewnum(review_num);
			
				dao.insert(Scrap_review);
				break;
			
			case 3:
				//»èÁ¦
				//½ºÅ©·¦ÇÑ ¸®ºä ¹øÈ£ ÀÔ·ÂÇØ¼­ »èÁ¦ÇÏ±â
				Scrap delete_scrap = new Scrap();
				System.out.println("½ºÅ©·¦ÇÑ ¸®ºä¹øÈ£: ");
				String de_scrap_num = input.next();
			
				
				delete_scrap.setReviewnum(de_scrap_num);
				
				
				dao.delete(delete_scrap);
				break;
			case 4:
				System.out.println("Á¾·á!");
				break MENU;
			default:
				System.out.println("´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä!!");
				continue;
			}
		}
		
	

	}

}
