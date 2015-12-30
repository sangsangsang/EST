package com.estreller.wbprj.controllers;


import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estreller.wbprj.dao.ReviewDao;

import com.estreller.wbprj.vo.Review;



//POJO클래스
@Controller   //이걸 반드시해줘야 맵핑정보가 호출된다.
@RequestMapping("/reviews/")
public class ReviewsController {
	
	
	   @Autowired
	   private ReviewDao reviewDao;
	   
	
	@RequestMapping("login-mainpage")
	public String loginMainPage(String w, Model model){
		
	/*	Member member = memberDao.getMember(w);
		model.addAttribute("member", member);*/
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
	public String ReviewDetail(String c,Model model){
		Review review = reviewDao.getReview(c);
		
		model.addAttribute("review", review);
		
		/*String code = request.getParameter("c");*/
	    /*NoticeDao dao = new MyBatisNoticeDao();
		Notice n = dao.getNotice(code);
		model.addAttribute("n",n);*/
		/*request.setAttribute("n", n);*/
		/*NoticeFileDao fileDao = new MyBatisNoticeFileDao();
		List<NoticeFile> files=fileDao.getNoticeFiles(code);*/
		return "reviews/reviewDetail";
	}
	
	
	@RequestMapping(value="reviewReg", method=RequestMethod.GET)
	public String reviewReg(HttpSession session){
		
		
		return "reviews/reviewReg";
	}
	@RequestMapping(value="reviewReg", method=RequestMethod.POST)
	public String reviewReg(Review r, Principal principal) {
		r.setWriter(principal.getName());
		reviewDao.insert(r);
		
		return "redirect:login-review_list";
	}
	
	
	@RequestMapping("login-review_list")
	   public String review_list(Model model) throws SQLException{
	      List<Review> list = reviewDao.getReviews(1,"Title","");
	      
	      model.addAttribute("list", list);
	      
	      return "reviews/login-review_list";
	   }
}
