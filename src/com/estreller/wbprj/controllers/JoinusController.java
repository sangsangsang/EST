package com.estreller.wbprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/joinus/")
	public class JoinusController {
	
	
		@RequestMapping("join")
		public String join(){
			return "joinus/join";
		}
		@RequestMapping("next-join")
		public String nextJoin(){
			return "joinus/next-join";
		}
		@RequestMapping("find-password")
		public String findPassword(){
			return "joinus/find-password";
		}
}
