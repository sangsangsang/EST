package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("home")
public class CategoryController {
	

	@RequestMapping("food-list")
	public String food(){
		return "category/food-list";
	}
}
