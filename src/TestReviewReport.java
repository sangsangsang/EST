import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.estreller.wbprj.dao.ReviewReportDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewReportDao;
import com.estreller.wbprj.vo.Review;
import com.estreller.wbprj.vo.ReviewReport;

public class TestReviewReport {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		
		
		ReviewReportDao dao = new MyBatisReviewReportDao();//MyBatis활용
		
		
		MENU:while(true){
			
			System.err.println("---메뉴임력---");
			System.out.println("1.신고된리뷰출력");
			System.out.println("2.리뷰신고등록");
			System.out.println("3.신고된리뷰삭제");
			System.out.println("4.종료");
			System.out.print(">>");
			
			int menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				//검색기능
				//신고된 모든 리뷰 최신순으로 출력
				System.out.print("신고된 리뷰신고");
				
				
				List<ReviewReport> list = dao.getReviewReports(1);
			
				System.out.println("검색결과 : " + list.size());
				
				for(ReviewReport m : list)
				{
					
					System.out.printf("리뷰번호: %s, 신고자 : %s , 신고내용 : %s, 신고일자 : %s\n", 
							m.getReviewnum(),m.getWriter(),m.getContent(),m.getRegdate());
				}
				break;
			case 2:
				//삽입(insert)
				//신고할 리뷰번호와 신고하는사람, 신고내용 입력
				System.out.println("리뷰번호 : ");
				String review_num = input.next();
				System.out.println("신고자 : ");
				String report_writer = input.next();
				System.out.println("신고내용 : ");
				String report_content = input.next();
				
				
				
				ReviewReport review_report = new ReviewReport();
				review_report.setReviewnum(review_num);
				review_report.setWriter(report_writer);
				review_report.setContent(report_content);
				
				
				
				dao.insert(review_report);
				break;
			
			case 3:
				//신고된 리뷰삭제
				//관리자가 사용할 기능 - 신고된 리뷰 조치후 삭제
				ReviewReport delete_re_report = new ReviewReport();
				System.out.println("신고된리뷰번호: ");
				String de_report_num = input.next();
				System.out.println("신고자: ");
				String de_report_writer = input.next();
				
				delete_re_report.setReviewnum(de_report_num);
				delete_re_report.setWriter(de_report_writer);
				
				dao.delete(delete_re_report);
				break;
			case 4:
				System.out.println("종료!");
				break MENU;
			default:
				System.out.println("다시 입력해주세요!!");
				continue;
			}
		}
		
	

	}

}
