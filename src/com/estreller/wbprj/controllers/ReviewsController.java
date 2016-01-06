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

import com.estreller.wbprj.dao.CommentDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.vo.Comment;
import com.estreller.wbprj.vo.Review;



//POJO클래스
@Controller   //이걸 반드시해줘야 맵핑정보가 호출된다.
@RequestMapping("/reviews/")
public class ReviewsController {
	
	
	   @Autowired
	   private ReviewDao reviewDao;
	   
	   
	   @Autowired
	   private CommentDao commentDao;
	   
	
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
	
	@RequestMapping(value="reviewDetail", method=RequestMethod.GET)
	public String ReviewDetail(String c,Model model,HttpSession session,Comment comment) throws SQLException{
		Review review = reviewDao.getReview(c);
		
		model.addAttribute("review", review);
		
		List<Comment> list = commentDao.getComments(c);
		
		//Comment com = commentDao.getComment(com);
		model.addAttribute("list", list);
		
		
		
				
		
		return "reviews/reviewDetail";
	}
	
	
	
	@RequestMapping(value="reviewDetail", method=RequestMethod.POST)
	public String reviewDetail(String c, Comment comment, Model model, Principal principal) throws SQLException{
				
		//System.out.printf("%s",c);
		comment.setReviewNum(c);
		comment.setWriter(principal.getName());
		//comment.setReviewNum(principal.toString());
		commentDao.insert(comment);
		
		List<Comment> list = commentDao.getComments(c);
		
		//Comment com = commentDao.getComment(com);
		model.addAttribute("list", list);
		
		
		
		return "redirect:reviewDetail?c="+c;
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
	
	
	/*----------------------글쓰기 수정--------------------------*/
	
	
	
	@RequestMapping(value ="reviewEdit", method=RequestMethod.GET)
	public String reviewEdit(String c, Model model, Principal principal, HttpSession session) {
		
		Review review = reviewDao.getReview(c);
		
		model.addAttribute("review", review);
		//System.out.printf("%s",review.getTitle());
		/*
		review.setWriter(principal.getName());
		reviewDao.insert(review);
		*/
		return "reviews/reviewEdit";
	}
	
	@RequestMapping(value="reviewEdit", method=RequestMethod.POST)
	public String reviewEdit(String c,String content,String title, String categorycode, String keyword, String ratingcode, Review r,   Principal principal) throws SQLException {
		r.setWriter(principal.getName());
		r.setNum(c);
		r.setContent(content);
		r.setTitle(title);
		r.setCategorycode(categorycode);
		r.setKeyword(keyword);
		r.setRatingcode(ratingcode);
		
		reviewDao.update(r);
	
		
		return "redirect:login-review_list";
	}
	
	
	
	
	
	
	/*-------------------------------------------------------------*/
	
	
	
	@RequestMapping("login-review_list")
	   public String review_list(Model model) throws SQLException{
	      List<Review> list = reviewDao.getReviews(1,"Title","");
	      
	      model.addAttribute("list", list);
	      
	      return "reviews/login-review_list";
	   }
}
