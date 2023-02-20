package com.mycompany.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	
	//get방식
	//요청주소 ~컨패/main
	
	@RequestMapping(value="/main")
	public String main(Model model) {
		
		model.addAttribute("greeting", "WELCOME!!");
		
		return "member/main";
	}
	
	
	
}
