package com.niit.frontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.backend.DAO.ProductDAO;
import com.niit.backend.model.Product;

@Controller
public class HomeController {
	
	@Autowired ProductDAO productDAO;
	@Autowired Product product;

	@RequestMapping("/")
	public String homePage(Model model){
		List<Product> productList=productDAO.retrieve();
		model.addAttribute("productList",productList );
		
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

