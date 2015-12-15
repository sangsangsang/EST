package com.estreller.wbprj.controllers;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewDao;


//POJO클래스
@Controller   //이걸 반드시해줘야 맵핑정보가 호출된다.
@RequestMapping("/reviews/")
public class ReviewsController {
	
	@RequestMapping("login-mainpage")
	public String loginMainPage(/*Model model*/){
		return "reviews/login-mainpage";
	}
	
	/*@RequestMapping("login-page")//url 맵핑정보
	public String Review(PrintWriter out,Model model){
		
		
		//ReviewDao reviewDao = new MyBatisReviewDao();
		//List<Review> list =reviewDao.getReviews(1,"title","");
		
		model.addAttribute("list",list);
		//model.addAttribute("n",list.get(0));
		for(Notice n:list)
			out.println("title:"+n.getTitle()+"<br/>");
		
		return "reviews/login-page";
	}*/
	
	@RequestMapping("reviewDetail")
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
	@RequestMapping("reviewReg")
	public String reviewReg(){
		return "reviews/reviewReg";
	}
	@RequestMapping("review_list")
	public String review_list(){
		return "reviews/review_list";
	}
}
