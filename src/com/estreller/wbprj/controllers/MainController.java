package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {	
	
	@RequestMapping("/main/mainPage")
	public String mainPage(/*Model model*/){
		return "main/mainPage";
	}

}
