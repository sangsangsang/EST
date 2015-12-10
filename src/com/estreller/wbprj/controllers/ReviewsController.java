package com.estreller.wbprj.controllers;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;


//POJOŬ����
@Controller   //�̰� �ݵ������� ���������� ȣ��ȴ�.
public class ReviewsController {
	
	@RequestMapping("/reviews/review")//url ��������
	public String Review(PrintWriter out,Model model){
		
		
		//ReviewDao reviewDao = new MyBatisReviewDao();
		//List<Review> list =reviewDao.getReviews(1,"title","");
		
		/*model.addAttribute("list",list);*/
		//model.addAttribute("n",list.get(0));
		/*for(Notice n:list)
			out.println("title:"+n.getTitle()+"<br/>");*/
		
		return "reviews/review";
	}
	
	@RequestMapping("/reviews/reviewDetail")
	public String ReviewDetail(/*Model model*/){
		
		/*String code = request.getParameter("c");*/
	    /*NoticeDao dao = new MyBatisNoticeDao();
		Notice n = dao.getNotice(code);
		model.addAttribute("n",n);*/
		/*request.setAttribute("n", n);*/
		/*NoticeFileDao fileDao = new MyBatisNoticeFileDao();
		List<NoticeFile> files=fileDao.getNoticeFiles(code);*/
		return "reviews/reviewDetail";
	}
	@RequestMapping("/reviews/login-mainpage")
	public String loginMainPage(/*Model model*/){
		return "reviews/login-mainpage";
	}
	@RequestMapping("/reviews/reviewReg")
	public String reviewReg(/*Model model*/){
		return "reviews/reviewReg";
	}
}
