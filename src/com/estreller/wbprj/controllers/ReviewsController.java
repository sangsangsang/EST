package com.estreller.wbprj.controllers;


import java.io.PrintWriter;
import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estreller.wbprj.dao.CommentDao;
import com.estreller.wbprj.dao.RecommendDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.ReviewRatingDao;
import com.estreller.wbprj.vo.Category;
import com.estreller.wbprj.vo.Comment;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Recommend;
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
	   @Autowired
	   private RecommendDao recommendDao;
	   
	   boolean likeState;
	   
	   
	@RequestMapping("login-mainpage")
	public String loginMainPage(String w, Model model){
		
	/*	Member member = memberDao.getMember(w);
		model.addAttribute("member", member);*/
		return "reviews/login-mainpage";
	}
//-----------------------------글자세히보기----------------------	
	@RequestMapping(value="reviewDetail", method=RequestMethod.GET)
	public String ReviewDetail(String c,Model model,Principal principal) throws SQLException{
		
		double sum=0;//댓글 list 별점 합계
		double avg = 0;//유저댓글별점 평균.
		int imageavg =0;//유저댓글 별점 평균 이미지.
		
		String logID=principal.getName();//로그인된 아이디 가져옴
		//System.out.println(logID);
		model.addAttribute("logID",logID);
		
		Review review = reviewDao.getReview(c);
		model.addAttribute("review", review);	
		
		List<Comment> list = commentDao.getComments(c);		
		//System.out.println("댓글달린수:"+list.size());
		
		if(list.size()!=0){ //댓글이 달렸을경우.
			for(Comment comment : list){
				//System.out.printf("댓글에 대한 별점:%s\n",comment.getRatingCode());
				sum +=  Double.parseDouble(comment.getRatingCode());
				//System.out.printf("댓글별점합계:%d",sum);	
			}
			
		avg = sum / list.size();
		imageavg = (int)(avg+0.5);
		//System.out.println("유저들 댓글 평점을 이미지화:  "+imageavg);
		avg = (int)(avg*10+0.5)/10.0;
		//System.out.println("유저들 댓글 보여주기위한평점:  "+avg);
		}
		
		model.addAttribute("imageavg", imageavg);
		model.addAttribute("avg", avg);
		
		model.addAttribute("list", list);

		//좋아요 하트이미지 상태값.
		List<Recommend> r_list = recommendDao.getReviewRecommend(c);
		
		for(Recommend recommend : r_list){
			if(recommend.getWriter().equals(logID)){
				likeState = true;
				break;
			}
			
			
		}
		model.addAttribute("likeState", likeState);
			
		
		
		return "reviews/reviewDetail";
	}
	
	
	@RequestMapping(value="reviewDetail", method=RequestMethod.POST)
	public String reviewDetail(String c, Comment comment, Model model, Principal principal) throws SQLException{
				
		comment.setReviewNum(c);
		comment.setWriter(principal.getName());
		commentDao.insert(comment);
		List<Comment> list = commentDao.getComments(c);
		//Comment com = commentDao.getComment(com);
		model.addAttribute("list", list);
		String u=comment.getRatingCode();
		System.out.println(u);
		
		return "redirect:reviewDetail?c="+c;
	}
	
/*//-------------------------------좋아요 +1
	@RequestMapping(value="recommend", method=RequestMethod.POST)
	public String recommend(String num, Recommend recommend,Model model, Principal principal) throws SQLException{
		
		
		System.out.println(num);
		recommend.setReviewNum(num);	
		recommend.setWriter(principal.getName());
		recommendDao.insert(recommend);
	
		commentDao.update(comment);
		JSONObject obj = new JSONObject();
		obj.put("content", content);
		obj.put("ratingCode", ratingCode);
		out.print(obj); 
		return "redirect:reviewDetail?c="+num;
	}
//----------------------------좋아요 취소 ----------------------
	@RequestMapping(value="recommendDel", method=RequestMethod.POST)
	public String recommendDel(String num, Recommend recommend,Model model, Principal principal) throws SQLException{
		
		
		System.out.println(num);
		recommend.setReviewNum(num);	
		recommend.setWriter(principal.getName());
		recommendDao.delete(recommend);
	
		commentDao.update(comment);
		JSONObject obj = new JSONObject();
		obj.put("content", content);
		obj.put("ratingCode", ratingCode);
		out.print(obj); 
		return "redirect:reviewDetail?c="+num;
	}
	*/
//=======================글쓰기 저장======================================	
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
		//System.out.println(r.getTitle());
		reviewDao.update(r);
		
		return "redirect:reviewDetail?c="+c;
	}
	//*---------------------글삭제-----------------------------*//
	
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public String reviewDelete(String c,Review r) throws SQLException {
		
	    reviewDao.delete(c);
		
		return "redirect:login-review_list";
	}
	//*---------------------댓글삭제-----------------------------*//
	
	@RequestMapping(value="cmtdelete", method=RequestMethod.POST)
	public String commentDelete(String c,String cmtcode) throws SQLException {
		//System.out.println(c);
		//List<Comment> list = commentDao.getComments(c);	
		System.out.println("리뷰코드"+c);
		System.out.println("댓글코드"+cmtcode);
	    commentDao.delete(cmtcode);
	  
		
	  return "redirect:reviewDetail?c="+c;
	}
	
	//------------------댓글수정
	@RequestMapping(value="commentEdit", method=RequestMethod.POST)
	public void commentEdit(String code,String content,String ratingCode, Comment comment,PrintWriter out) throws SQLException {
		comment.setCmtcode(code);
		comment.setContent(content);
		comment.setRatingCode(ratingCode);
	
		commentDao.update(comment);
		JSONObject obj = new JSONObject();
		obj.put("content", content);
		obj.put("ratingCode", ratingCode);
		out.print(obj); 
	  
	}	
	

	
	/*-------------------------ALL 별점순 list------------------------------------*/
	
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
	

	@RequestMapping("search-review-list")
	   public String search_review_list(String q, String f, Model model) throws SQLException{
	   	System.out.println(f+q);
	   	List<Review> list = reviewDao.getReviews(1,f,q);
 
	 
	      model.addAttribute("list", list);
	      
	      return "reviews/myReview-list";
	   }
	
	@RequestMapping("myReview-list")
	   public String search_review_list(Principal principal, Model model) throws SQLException{
		String name = principal.getName();
	   	List<Review> list = reviewDao.getReviews(1,"Writer",name);
	      
	   	System.out.println(name);
	      model.addAttribute("list", list);
	      
	      return "reviews/myReview-list";
	   }
	

	@RequestMapping("reportPartial")
	public String reportPartial(){
		
		System.out.println("dfdfdf");
		return "/reviews/reportPartial";
	}
	
	@RequestMapping("searchPartial")
	public String searchPartial(){
		
		return "/reviews/searchPartial";
	}
	
}
