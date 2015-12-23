package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MypageController {
   
   @RequestMapping("myComment")
   public String myComment(){
      return "mypage/myComment";
   }
   
   @RequestMapping("myReview")
   public String myReview(){
      return "mypage/myReview";
   }
   
   
   @RequestMapping("memberInfo")
   public String MemberInfo(){
      return "mypage/memberInfo";
   }
   
   
}