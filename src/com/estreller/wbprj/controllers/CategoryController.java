package com.estreller.wbprj.controllers;

import java.sql.SQLException;
import java.util.List;

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
	
	//-----------¸®ºä±Û Detail--------------------------------------------
	
	@RequestMapping("reviewDetail")
	public String ReviewDetail(String c,Model model) throws SQLException{
		Review review = reviewDao.getReview(c);
		List<Comment> list = commentDao.getComments(c);
		model.addAttribute("list", list);
		model.addAttribute("review", review);
		
		
		return "category/reviewDetail";
	}
	
	
	//-------------------------------------------------------------------
	
	
	@RequestMapping(value="book-list", method=RequestMethod.GET)
	public void bookRating(Model model,String c) throws SQLException{
		List<ReviewRating> r_list;
		List<Category> list;
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
		System.out.printf("%s\n",c);
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
}
