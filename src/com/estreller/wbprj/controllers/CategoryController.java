package com.estreller.wbprj.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estreller.wbprj.dao.CategoryDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.vo.Category;
import com.estreller.wbprj.vo.Review;


@Controller
@RequestMapping("/category/")
public class CategoryController {
   
   @Autowired
   private ReviewDao reviewDao;
   
   @Autowired

   private CategoryDao categoryDao;
   
   
   @RequestMapping("book-list")
   public String book_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Book");
      
         model.addAttribute("list", list);
         
         
      return "category/book-list";
   }
   
   @RequestMapping("electronics-list")
   public String electronics_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Electronics");
      
         model.addAttribute("list", list);
         
         
      return "category/electronics-list";
   }
   
   @RequestMapping("fashion&beauty-list")
   public String fashionAndBeauty_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Fashion&Beauty");
      
         model.addAttribute("list", list);
         
         
      return "category/fashion&beauty-list";
   }
   
   @RequestMapping("food-list")
   public String food_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Food");
      
         model.addAttribute("list", list);
         
         
      return "category/food-list";
   }
   
   @RequestMapping("game-list")
   public String game_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Game");
      
         model.addAttribute("list", list);
         
         
      return "category/game-list";
   }
   
   @RequestMapping("movie-list")
   public String movie_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Movie");
      
         model.addAttribute("list", list);
         
         
      return "category/movie-list";
   }
   
   @RequestMapping("music-list")
   public String music_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Music");
      
         model.addAttribute("list", list);
         
         
      return "category/music-list";
   }
   
   @RequestMapping("show&concert-list")
   public String showAndConcert_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Show&Concert");
      
         model.addAttribute("list", list);
         
         
      return "category/show&concert-list";
   }
   
   @RequestMapping("sports-list")
   public String sports_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Sports");
      
         model.addAttribute("list", list);
         
         
      return "category/sports-list";
   }
   
   @RequestMapping("travel-list")
   public String travel_list(Model model) throws SQLException{
            
         List<Category> list = categoryDao.getCategory(1,"CategoryCode","Travel");
      
         model.addAttribute("list", list);
         
         
      return "category/travel-list";
   }
   
   
   
  
   
   
}
