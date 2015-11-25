import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;
import com.estreller.wbprj.vo.Review;

public class TestReview {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		
		
		ReviewDao dao = new MyBatisReviewDao();//MyBatisȰ��
		
		MENU:while(true){
			
			System.err.println("---�޴��ӷ�---");
			System.out.println("1.����˻�");
			System.out.println("2.������");
			System.out.println("3.�������");
			System.out.println("4.�������");
			System.out.println("5.����");
			System.out.print(">>");
			
			int menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				//�˻����(select)
				//�⺻�� ������, �˻��� ī�װ������� �Է�
				
				//�˻����� : Writer(�ۼ���), CategoryCode(ī�װ�)...
				System.out.print("�˻������Է� :");
				String selcategory = input.next();
				System.out.print("�˻��� �Է� :");
				String word = input.next();
				
				
				List<Review> list = dao.getReviews(1,selcategory,word);
			
				System.out.println("�˻���� : " + list.size());
				
				for(Review m : list)
				{
					
					System.out.printf("����: %s, �ۼ��� : %s , ����� : %s, ī�װ� : %s, ����: %s\n", 
							m.getTitle(),m.getWriter(),m.getRegdate(),m.getCategorycode(),m.getContent());
				}
				break;
			case 2:
				//����(insert)
				
				System.out.println("�ۼ���ȣ : ");
				String num = input.next();
				System.out.println("���� : ");
				String title = input.next();
				System.out.println("�ۼ��� : ");
				String writer = input.next();
				System.out.println("ī�װ� : ");
				String inscategory = input.next();
				System.out.println("���� : ");
				String content = input.next();
				System.out.println("Ű���� : ");
				String keyword = input.next();
				
				//�����ȣ�� ���߿� �ڵ����� �߰��ؾ���
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
				//����(update)
				//������ ����� �ۼ���ȣ,�ۼ��ڸ� �Է��Ͽ� �ĺ��Ѵ�
				System.out.println("�ۼ���ȣ : ");
				String update_num = input.next();
				System.out.println("�ۼ��� : ");
				String update_writer = input.next();
				System.out.println("������ ���� : ");
				String update_title = input.next();
				System.out.println("������ ī�װ� : ");
				String update_category = input.next();
				System.out.println("������ ���� : ");
				String update_content = input.next();
				System.out.println("������ Ű���� : ");
				String update_keyword = input.next();
				
				//����(update)
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
				//����(delete) 
				//������ ����� �����ȣ�� �ۼ��ڸ� �Է��Ͽ� ��ġ�ϸ� �����Ѵ�
				Review delete_review = new Review();
				System.out.println("�ۼ���ȣ : ");
				String delete_num = input.next();
				System.out.println("�ۼ��� : ");
				String delete_writer = input.next();
				
				delete_review.setNum(delete_num);
				delete_review.setWriter(delete_writer);
				
				dao.delete(delete_review);
				break;
			case 5:
				System.out.println("����!");
				break MENU;
			default:
				System.out.println("�ٽ� �Է����ּ���!!");
				continue;
			}
		}

	}

}
