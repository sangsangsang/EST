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
		
		
		
		ReviewReportDao dao = new MyBatisReviewReportDao();//MyBatisȰ��
		
		
		MENU:while(true){
			
			System.err.println("---�޴��ӷ�---");
			System.out.println("1.�Ű�ȸ������");
			System.out.println("2.����Ű���");
			System.out.println("3.�Ű�ȸ������");
			System.out.println("4.����");
			System.out.print(">>");
			
			int menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				//�˻����
				//�Ű�� ��� ���� �ֽż����� ���
				System.out.print("�Ű�� ����Ű�");
				
				
				List<ReviewReport> list = dao.getReviewReports(1);
			
				System.out.println("�˻���� : " + list.size());
				
				for(ReviewReport m : list)
				{
					
					System.out.printf("�����ȣ: %s, �Ű��� : %s , �Ű��� : %s, �Ű����� : %s\n", 
							m.getReviewnum(),m.getWriter(),m.getContent(),m.getRegdate());
				}
				break;
			case 2:
				//����(insert)
				//�Ű��� �����ȣ�� �Ű��ϴ»��, �Ű��� �Է�
				System.out.println("�����ȣ : ");
				String review_num = input.next();
				System.out.println("�Ű��� : ");
				String report_writer = input.next();
				System.out.println("�Ű��� : ");
				String report_content = input.next();
				
				
				
				ReviewReport review_report = new ReviewReport();
				review_report.setReviewnum(review_num);
				review_report.setWriter(report_writer);
				review_report.setContent(report_content);
				
				
				
				dao.insert(review_report);
				break;
			
			case 3:
				//�Ű�� �������
				//�����ڰ� ����� ��� - �Ű�� ���� ��ġ�� ����
				ReviewReport delete_re_report = new ReviewReport();
				System.out.println("�Ű�ȸ����ȣ: ");
				String de_report_num = input.next();
				System.out.println("�Ű���: ");
				String de_report_writer = input.next();
				
				delete_re_report.setReviewnum(de_report_num);
				delete_re_report.setWriter(de_report_writer);
				
				dao.delete(delete_re_report);
				break;
			case 4:
				System.out.println("����!");
				break MENU;
			default:
				System.out.println("�ٽ� �Է����ּ���!!");
				continue;
			}
		}
		
	

	}

}
