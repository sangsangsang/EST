package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/management/")
public class ManagementController {

   @RequestMapping("memberManagementPage")
   public String memberManagementPage(){
      
      return "management/memberManagementPage";
   }
   
   @RequestMapping("reportManagementPage")
   public String reportManagementPage(){
      
      return "management/reportManagementPage";
   }
   
   @RequestMapping("writeManagementPage")
   public String writeManagementPage(){
      
      return "management/writeManagementPage";
   }
}
