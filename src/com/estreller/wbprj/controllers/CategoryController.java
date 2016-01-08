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

import com.estreller.wbprj.dao.CategoryDao;
import com.estreller.wbprj.dao.CommentDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.ReviewRatingDao;
import com.estreller.wbprj.dao.mybatis.MyBatisReviewRatingDao;
import com.estreller.wbprj.vo.Category;
import com.estreller.wbprj.vo.Comment;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Review;
import com.estreller.wbprj.vo.ReviewRating;

@Controller
@RequestMapping("/category/")
public class CategoryController {

	
	@Autowired
	private ReviewDao reviewDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private ReviewRatingDao reviewRatingDao;
	@Autowired
	   private CommentDao commentDao;
	
	//-----------리뷰글 Detail 댓글포함--------------------------------------------
	
	@RequestMapping("reviewDetail")
	public String ReviewDetail(String c,Model model,Principal principal) throws SQLException{
		String logID=principal.getName();
		model.addAttribute("logID",logID);
		
		Review review = reviewDao.getReview(c);
		List<Comment> list = commentDao.getComments(c);
		model.addAttribute("list", list);
		model.addAttribute("review", review);
		
		
		return "category/reviewDetail";
	}
	
	
	//-------------------------------------------------------------------
	
	//-------------------------댓글쓰기------------------------------------------
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
	//-------------------------------------------------------------------
	
	//--------카테고리별점순리스트.-----------------------------------------
	
	@RequestMapping(value="book-list", method=RequestMethod.GET)
	public void bookRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Book");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Book","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Book","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Book","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Book","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Book","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
		
	}
	

	
	@RequestMapping(value="electronics-list", method=RequestMethod.GET)
	public void electronicsRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Electronics");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Electronics","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Electronics","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Electronics","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Electronics","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Electronics","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
		
	}
	
	
	
	@RequestMapping(value="fashion&beauty-list", method=RequestMethod.GET)
	public void fashionBeautyRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Fashion&Beauty");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Fashion&Beauty","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Fashion&Beauty","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Fashion&Beauty","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Fashion&Beauty","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Fashion&Beauty","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
		
	}
	
	
	@RequestMapping(value="food-list", method=RequestMethod.GET)
	public void foodRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Food");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Food","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Food","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Food","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Food","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Food","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
		
	}

	@RequestMapping(value="game-list", method=RequestMethod.GET)
	public void gameRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Game");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Game","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Game","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Game","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Game","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Game","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
	}
	
	@RequestMapping(value="movie-list", method=RequestMethod.GET)
	public void movieRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Movie");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Movie","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Movie","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Movie","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Movie","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Movie","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
	}
	
	@RequestMapping(value="music-list", method=RequestMethod.GET)
	public void musicRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Music");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Music","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Music","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Music","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Music","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Music","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
	}
	
	@RequestMapping(value="show&concert-list", method=RequestMethod.GET)
	public void showConcertRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		System.out.printf("%s\n",c);
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Show&Concert");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Show&Concert","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Show&Concert","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Show&Concert","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Show&Concert","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Show&Concert","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
	}
	
	@RequestMapping(value="sports-list", method=RequestMethod.GET)
	public void sportsRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Sports");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Sports","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Sports","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Sports","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Sports","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Sports","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
	}
	@RequestMapping(value="travel-list", method=RequestMethod.GET)
	public void travelRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		
		if(c == null){
			list = categoryDao.getCategory(1,"CategoryCode","Travel");
			
		      model.addAttribute("list", list);
		}
		if(c!=null){	
		if(c.equals("5")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Travel","RatingCode","5");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("4")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Travel","RatingCode","4");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("3")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Travel","RatingCode","3");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("2")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Travel","RatingCode","2");
			model.addAttribute("list",r_list);
			}
		else if(c.equals("1")){
			r_list =  reviewRatingDao.getRatings(1,"CategoryCode","Travel","RatingCode","1");
			model.addAttribute("list",r_list);
			}
		
		}
	}
	//-------------------------------------------------------------------
	
	//------------카테고리별 글수정---------------------------------------//
	
	
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
		System.out.println(r.getTitle());
		reviewDao.update(r);
	
		
		return "redirect:reviewDetail?c="+c;
	}
	
	
	
	//*---------------------글삭제-----------------------------*//
	
		@RequestMapping(value="delete", method=RequestMethod.POST)
		public String reviewDelete(String c) throws SQLException {
			//System.out.println(c);
			  Review r = reviewDao.getReview(c);
			  String code= r.getCategorycode();
			  System.out.println();
		    reviewDao.delete(c);
		  System.out.println(code);
			
			return "redirect:"+code+"-list";
		}
		@RequestMapping(value="cmtdelete", method=RequestMethod.POST)
		public String commentDelete(String c,String cmtcode) throws SQLException {
			//System.out.println(c);
			//List<Comment> list = commentDao.getComments(c);	
			System.out.println("리뷰코드"+c);
			System.out.println("댓글코드"+cmtcode);
		    commentDao.delete(cmtcode);
		  
			
		  return "redirect:reviewDetail?c="+c;
		}		
}
