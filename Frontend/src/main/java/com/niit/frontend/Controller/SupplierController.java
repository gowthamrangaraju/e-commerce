package com.niit.frontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backend.DAO.SupplierDAO;
import com.niit.backend.model.Category;
import com.niit.backend.model.Supplier;

@Controller
public class SupplierController {

	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("supplierPage")
	public String supplierpage(Model model){
		
		model.addAttribute("isUserClickedaddsupplierButton", "true");
		return "adminlogin";
	}
	
	@RequestMapping("newsupplier")
	public String newSupplier(@ModelAttribute Supplier supplier){
		
		
		
		supplierDAO.insertSupplier(supplier);
		
		return "redirect:viewsupplierPage";
	}
	
	@RequestMapping("viewsupplierPage")
	public String viewsupplierPage(Model model){
		List<Supplier> supplierList = supplierDAO.retrieve();
		model.addAttribute("supplierList", supplierList);
		model.addAttribute("isUserClickedviewsupplierButton", "true");
		return "adminlogin";
	}
	
	@RequestMapping("deleteSupplier")
	public String deleteSupplier(@RequestParam(value = "supplierId") String id, Model model){
		supplierDAO.deleteSupplier(id);
		
		return "redirect:viewsupplierPage";
		
	}
	@RequestMapping("editSupplier")
	public String editSupplier(@RequestParam(value = "supplierId") String id, Model model) {

		Supplier supplier = supplierDAO.getBySupplierId(id);
		model.addAttribute("supplier", supplier);
		model.addAttribute("isAdminClickedEditSupplier", "true");
		return "adminlogin";

	}

	@RequestMapping("afterEditSupplier")
	public String afterEditSupplier(@ModelAttribute Supplier supplier) {

		supplierDAO.insertSupplier(supplier);
		return "redirect:viewsupplierPage";

	}
	@ModelAttribute
	public void adminSupplier(Model model){
		  model.addAttribute("isAdminLoggedIn", "true");
	}
}