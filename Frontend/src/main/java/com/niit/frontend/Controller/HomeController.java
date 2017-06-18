package com.niit.frontend.Controller;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage(){
		return "home";
	}
	
	@RequestMapping("loginPage")
	public String loginPage(Model model){
		
		model.addAttribute("isUserClickedLoginButton", "true");
		return "home";
	}
	
	@RequestMapping("signupPage")
	public String signuppage(Model model){
		
		model.addAttribute("isUserClickedSignupButton", "true");
		return "home";
	}
}

