package com.estreller.wbprj.controllers;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estreller.wbprj.dao.MemberDao;

import com.estreller.wbprj.spring.board.email.Email;
import com.estreller.wbprj.spring.board.email.EmailSender;
import com.estreller.wbprj.vo.Member;



@Controller
@RequestMapping("/joinus/")
	public class JoinusController {
	
	
	  @Autowired
	   private MemberDao memberDao;
	   
	  
		@RequestMapping(value="loginPage",method=RequestMethod.GET)
		public String loginPage(){
			return "joinus/loginPage";
		}
	
		@RequestMapping("join")
		public String join(){
			return "joinus/join";
		}
	

		@RequestMapping(value="next-join", method=RequestMethod.GET)
		public String nextJoin(){
			return "joinus/next-join";
		}
		@RequestMapping(value="next-join", method=RequestMethod.POST)
		public String nextJoin(Member m ,Model model,String c) throws SQLException{
			
			List<Member> list = memberDao.getAllEmail();
			for(Member member : list)
				if(m.getEmail().equals(member.getEmail()))
					 return "redirect:joinus/next-join c?=error";
				else
					 return "redirect:joinus/next-join c?=check";
			String error="중복된 아이디입니다.";
			String check="사용가능한 아이디입니다.";
			
			if(c.equals("error"))
				model.addAttribute("error", error);
			else if(c.equals("check"))
				model.addAttribute("check", check);
			
			
			memberDao.insert(m);
			return "redirect:../home/mainPage";
		}
		
		@RequestMapping("find-password")
		public String findPassword(){
			return "joinus/find-password";
		}
	
}
