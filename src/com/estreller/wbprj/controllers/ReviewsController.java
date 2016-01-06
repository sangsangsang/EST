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
import com.estreller.wbprj.dao.ReviewRatingDao;
import com.estreller.wbprj.vo.Category;
import com.estreller.wbprj.vo.Comment;
import com.estreller.wbprj.vo.Review;
import com.estreller.wbprj.vo.ReviewRating;



//POJO클래스
@Controller   //이걸 반드시해줘야 맵핑정보가 호출된다.
@RequestMapping("/reviews/")
public class ReviewsController {
	
	
	   @Autowired
	   private ReviewDao reviewDao;
	   
	   @Autowired
		private ReviewRatingDao reviewRatingDao;
	   
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
	
	@RequestMapping("reviewDetail")
	public String ReviewDetail(String c,Model model) throws SQLException{
		Review review = reviewDao.getReview(c);
		System.out.println(review.getWriterNickname()+review.getNum());
		model.addAttribute("review", review);
		
		List<Comment> list = commentDao.getComments(c);
		
		//Comment com = commentDao.getComment(com);
		model.addAttribute("list", list);
		
		
		return "reviews/reviewDetail";
	}
	
	
	@RequestMapping(value="reviewDetail", method=RequestMethod.POST)
	public String reviewDetail(Comment c) throws SQLException{
		//c.setWriter(principal.getName());
		commentDao.insert(c);
		
		return "redirect:reviewDetail";
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
	   public void review_list(Model model,String c) throws SQLException{
	      List<Review> list; 
	      List<ReviewRating> r_list;
	     if(c == null){ 
	      list = reviewDao.getReviews(1,"Title","");
	      model.addAttribute("list", list);}
	     if(c!=null){	
	 		if(c.equals("5")){
	 			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","","RatingCode","5");
	 			model.addAttribute("list",r_list);
	 			}
	 		else if(c.equals("4")){
	 			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","","RatingCode","4");
	 			model.addAttribute("list",r_list);
	 			}
	 		else if(c.equals("3")){
	 			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","","RatingCode","3");
	 			model.addAttribute("list",r_list);
	 			}
	 		else if(c.equals("2")){
	 			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","","RatingCode","2");
	 			model.addAttribute("list",r_list);
	 			}
	 		else if(c.equals("1")){
	 			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","","RatingCode","1");
	 			model.addAttribute("list",r_list);
	 			}
	 		
	 		}
	      
	      //return "reviews/login-review_list";
	   }
	
}
