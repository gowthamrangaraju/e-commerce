package com.niit.frontend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backend.DAO.CartDAO;
import com.niit.backend.model.Cart;

@Controller
public class CartController {

	
	@Autowired
	private CartDAO cartDAO;
	
	@RequestMapping("cartPage")
	public String cartpage(Model model){
		
		model.addAttribute("isUserClickedaddcartButton", "true");
		return "home";
	}
	
	@RequestMapping("newcart")
	public String newCart(@ModelAttribute Cart cart){
		
		
		
		cartDAO.insertCart(cart);
		
		return "home";
	}
	@RequestMapping("viewcartPage")
	public String viewcartPage(Model model){
		
		model.addAttribute("isUserClickedviewcartButton", "true");
		return "home";
	}
	
}