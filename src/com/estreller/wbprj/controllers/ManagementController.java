package com.estreller.wbprj.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estreller.wbprj.dao.MemberDao;
import com.estreller.wbprj.dao.ReviewDao;
import com.estreller.wbprj.dao.ReviewReportDao;
import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.Review;
import com.estreller.wbprj.vo.ReviewReport;

@Controller
@RequestMapping("/management/")
public class ManagementController {

	@Autowired
	private MemberDao memberDao;	
	@Autowired
	private ReviewReportDao reviewreportDao;
	@Autowired
	private ReviewDao reviewDao;
	
	
		//--------------관리자페이지 회원목록 출력----------------------------------------------
	   @RequestMapping("memberManagementPage")
	   public String memberManagementPage(Model model) throws SQLException{
		   
		   List<Member> list = memberDao.getMembers(1,"Email","");
			
			
			//다음 페이지로 request를 전달
			model.addAttribute("list", list);
	      
		   
		   return "management/memberManagementPage";
	   }
	   
	   
	   //----------------관리자페이지 신고목록출력--------------------------------------------------
	   @RequestMapping("reportManagementPage")
	   public String reportManagementPage(Model model) throws SQLException{
		   
		   List<ReviewReport> list = reviewreportDao.getReviewReports(1);
			
			
			//다음 페이지로 request를 전달
			model.addAttribute("list", list);
	      
	      return "management/reportManagementPage";
	   }
	   
	   
	   //---------------관리자페이지에서 글목록 출력--------------------------------------------------
	   @RequestMapping("writeManagementPage")
	   public String writeManagementPage(Model model) throws SQLException{
	      
		   List<Review> list = reviewDao.getReviews(1);
			
			
			//다음 페이지로 request를 전달
			model.addAttribute("list", list);
		   
	      return "management/writeManagementPage";
	   }
	   
	   //관리자 페이지에서 글 삭제
	   @RequestMapping("deleteWriteManagementPage")
	   public String deleteWriteManagementPage(String c) throws SQLException{
	      
		   reviewDao.delete(c);
		   
		   return "redirect:writeManagementPage";
	   }
	   
	   
	 //관리자 페이지에서 신고글 삭제
	   @RequestMapping("deleteReviewReportManagementPage")
	   public String deleteReviewReportManagementPage(String c) throws SQLException{
	      
		   reviewDao.delete(c);
		   
		   return "redirect:reportManagementPage";
	   }
	   
	 //관리자페이지에서 회원삭제
	   @RequestMapping("deleteMemberManagementPage")
	   public String deleteMemberManagementPage(String c) throws SQLException{
	      
		   memberDao.delete(c);
		   
		   return "redirect:memberManagementPage";
	   }
	   
	   
	   
	   
}
