import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;
import com.estreller.wbprj.vo.Review;

public class TestReview {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		
		
		ReviewDao dao = new MyBatisReviewDao();//MyBatis활용
		
		MENU:while(true){
			
			System.err.println("---메뉴임력---");
			System.out.println("1.리뷰검색");
			System.out.println("2.리뷰등록");
			System.out.println("3.리뷰수정");
			System.out.println("4.리뷰삭제");
			System.out.println("5.종료");
			System.out.print(">>");
			
			int menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				//검색기능(select)
				//기본은 모두출력, 검색은 카테고리선택후 입력
				
				//검색기준 : Writer(작성자), CategoryCode(카테고리)...
				System.out.print("검색기준입력 :");
				String selcategory = input.next();
				System.out.print("검색어 입력 :");
				String word = input.next();
				
				
				List<Review> list = dao.getReviews(1,selcategory,word);
			
				System.out.println("검색결과 : " + list.size());
				
				for(Review m : list)
				{
					
					System.out.printf("제목: %s, 작성자 : %s , 등록일 : %s, 카테고리 : %s, 내용: %s\n", 
							m.getTitle(),m.getWriter(),m.getRegdate(),m.getCategorycode(),m.getContent());
				}
				break;
			case 2:
				//삽입(insert)
				
				System.out.println("작성번호 : ");
				String num = input.next();
				System.out.println("제목 : ");
				String title = input.next();
				System.out.println("작성자 : ");
				String writer = input.next();
				System.out.println("카테고리 : ");
				String inscategory = input.next();
				System.out.println("내용 : ");
				String content = input.next();
				System.out.println("키워드 : ");
				String keyword = input.next();
				
				//리뷰번호는 나중에 자동으로 추가해야함
				Review review = new Review();
				review.setNum(num);
				review.setTitle(title);
				review.setWriter(writer);
				review.setCategorycode(inscategory);
				review.setContent(content);
				review.setKeyword(keyword);
				
				dao.insert(review);
				break;
			case 3:
				//수정(update)
				//수정할 리뷰는 작성번호,작성자를 입력하여 식별한다
				System.out.println("작성번호 : ");
				String update_num = input.next();
				System.out.println("작성자 : ");
				String update_writer = input.next();
				System.out.println("수정된 제목 : ");
				String update_title = input.next();
				System.out.println("수정된 카테고리 : ");
				String update_category = input.next();
				System.out.println("수정된 내용 : ");
				String update_content = input.next();
				System.out.println("수정된 키워드 : ");
				String update_keyword = input.next();
				
				//수정(update)
				Review update_review = new Review();
				update_review.setNum(update_num);
				update_review.setWriter(update_writer);
				update_review.setTitle(update_title);
				update_review.setCategorycode(update_category);
				update_review.setContent(update_content);
				update_review.setKeyword(update_keyword);
				
				dao.update(update_review);
				break;
			case 4:
				//삭제(delete) 
				//삭제할 리뷰는 리뷰번호와 작성자를 입력하여 일치하면 삭제한다
				Review delete_review = new Review();
				System.out.println("작성번호 : ");
				String delete_num = input.next();
				System.out.println("작성자 : ");
				String delete_writer = input.next();
				
				delete_review.setNum(delete_num);
				delete_review.setWriter(delete_writer);
				
				dao.delete(delete_review);
				break;
			case 5:
				System.out.println("종료!");
				break MENU;
			default:
				System.out.println("다시 입력해주세요!!");
				continue;
			}
		}

	}

}
