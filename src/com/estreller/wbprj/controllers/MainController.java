package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {	
	
	@RequestMapping("/mainPage")
	public String loginMainPage(/*Model model*/){
		return "mainPage";
	}

}
