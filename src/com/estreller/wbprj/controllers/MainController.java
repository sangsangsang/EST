package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home/")
public class MainController {	
	
	@RequestMapping(value="mainPage",method=RequestMethod.GET)
	public String mainPage(){
		return "home/mainPage";
	}
	

}
