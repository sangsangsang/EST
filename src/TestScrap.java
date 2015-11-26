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
		
		
		
		ScrapDao dao = new MyBatisScrapDao();//MyBatisȰ��
		
		
		MENU:while(true){
			
			System.err.println("---�޴��ӷ�---");
			System.out.println("1.��ũ�����");
			System.out.println("2.��ũ�����");
			System.out.println("3.��ũ������");
			System.out.println("4.����");
			System.out.print(">>");
			
			int menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				//�˻�
				// ��ũ���� ���� ��� ���
				System.out.print("������ ��ũ��");
				
				
				List<Scrap> list = dao.getScraps(1);
			
				System.out.println("�˻���� : " + list.size());
				
				for(Scrap m : list)
				{
					
					System.out.printf("��ũ���� �����ȣ: %s,��ũ���� ���� : %s\n", 
							m.getReviewnum(),m.getRegdate());
				}
				break;
			case 2:
				//����(insert)
				//��ũ���� ���� ��ȣ�Է�
				System.out.println("��ũ���� �����ȣ : ");
				String review_num = input.next();
				
				Scrap Scrap_review = new Scrap();
				Scrap_review.setReviewnum(review_num);
			
				dao.insert(Scrap_review);
				break;
			
			case 3:
				//����
				//��ũ���� ���� ��ȣ �Է��ؼ� �����ϱ�
				Scrap delete_scrap = new Scrap();
				System.out.println("��ũ���� �����ȣ: ");
				String de_scrap_num = input.next();
			
				
				delete_scrap.setReviewnum(de_scrap_num);
				
				
				dao.delete(delete_scrap);
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
