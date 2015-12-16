package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class ManagementController {

	
	
	@Controller
	@RequestMapping("/management/")
		public class JoinusController {
		
		
			@RequestMapping("management")
			public String management(){
				return "management/management";
			}
			
	}
}
