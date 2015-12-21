package com.estreller.wbprj.controllers;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		public String nextJoin(Member m) throws SQLException{
			
			
			memberDao.insert(m);
			return "redirect:../home/mainPage";
		}
		
		@RequestMapping("find-password")
		public String findPassword(){
			return "joinus/find-password";
		}
		/* @Autowired
		   private EmailSender emailSender;
		   @Autowired
		   private Email email;
		    @RequestMapping("/sendpw.do")
		    public ModelAndView sendEmailAction (@RequestParam Map<String, Object> paramMap, ModelMap model) throws Exception {
		        ModelAndView mav;
		        String id=(String) paramMap.get("id");
		        String e_mail=(String) paramMap.get("email");
		        String pw=mainService.getPw(paramMap);
		        System.out.println(pw);
		        if(pw!=null) {
		            email.setContent("비밀번호는 "+pw+" 입니다.");
		            email.setReceiver(e_mail);
		            email.setSubject(id+"님 비밀번호 찾기 메일입니다.");
		            emailSender.SendEmail(email);
		            mav= new ModelAndView("redirect:/login.do");
		            return mav;
		        }else {
		            mav=new ModelAndView("redirect:/logout.do");
		            return mav;
		        }
		    }*/

}
