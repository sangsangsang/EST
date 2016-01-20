package com.estreller.wbprj.controllers;

import java.security.Principal;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.vo.Member;

@Controller
@RequestMapping("/mypage/")
public class MypageController {
	
	 @Autowired

	   private MemberDao memberDao;
	
   
   @RequestMapping("myComment")
   public String myComment(){
      return "mypage/myComment";
   }
   
   @RequestMapping("myReview")
   public String myReview(){
      return "mypage/myReview";
   }
   
   
   @RequestMapping(value="memberInfo", method=RequestMethod.GET)
   public String MemberInfo(){
	   
	   
      return "mypage/memberInfo";
   }
   @RequestMapping(value="memberInfo", method=RequestMethod.POST)
   public String MemberInfo(Member m, Principal principal) throws SQLException{
	   m.setEmail(principal.getName());
	   memberDao.update(m);
	   
	   
      return "redirect:../reviews/login-review_list";
   }
   
   
}