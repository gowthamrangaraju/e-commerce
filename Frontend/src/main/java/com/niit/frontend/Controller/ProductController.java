package com.niit.frontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backend.DAO.ProductDAO;
import com.niit.backend.model.Category;
import com.niit.backend.model.Product;

@Controller
public class ProductController {

	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("productPage")
	public String productpage(Model model){
		
		model.addAttribute("isUserClickedaddproductButton", "true");
		return "adminlogin";
	}
	
	
	@RequestMapping("newproduct")
	public String newProduct(@ModelAttribute Product product){
		
		
		
		productDAO.insertProduct(product);
		
		return "redirect:viewproductPage";
	}
	
	@RequestMapping("viewproductPage")
	public String viewproductPage(Model model){
		List<Product> productList = productDAO.retrieve();
		model.addAttribute("productList", productList);
		model.addAttribute("isUserClickedviewproductButton", "true");
		return "adminlogin";
	}
	
	@RequestMapping("deleteProduct")
	public String deleteProduct(@RequestParam(value = "productId") String id, Model model){
		productDAO.deleteProduct(id);
		
		return "redirect:viewproductPage";
		
	}
	@RequestMapping("editProduct")
	public String editProduct(@RequestParam(value = "productId") String id, Model model) {

		Product product = productDAO.getByProductId(id);
		model.addAttribute("product", product);
		model.addAttribute("isAdminClickedEditProduct", "true");
		return "adminlogin";

	}

	@RequestMapping("afterEditProduct")
	public String afterEditProduct(@ModelAttribute Product product) {

		productDAO.insertProduct(product);
		return "redirect:viewproductPage";

	}
	@ModelAttribute
	public void adminProduct(Model model){
		  model.addAttribute("isAdminLoggedIn", "true");
	}
}