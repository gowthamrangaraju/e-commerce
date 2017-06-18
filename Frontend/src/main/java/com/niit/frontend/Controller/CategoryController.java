package com.niit.frontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backend.DAO.CategoryDAO;
import com.niit.backend.model.Category;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping("categoryPage")
	public String categorypage(Model model) {

		model.addAttribute("isUserClickedaddcategoryButton", "true");
		return "adminlogin";
	}

	@RequestMapping("newcategory")
	public String newCategory(@ModelAttribute Category category) {

		categoryDAO.insertCategory(category);

		return "redirect:viewcategoryPage";
	}

	@RequestMapping("viewcategoryPage")
	public String viewcategoryPage(Model model) {
		List<Category> categoryList = categoryDAO.retrieve();
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("isUserClickedviewcategoryButton", "true");
		return "adminlogin";
	}

	@RequestMapping("deleteCategory")
	public String deleteCategory(@RequestParam(value = "categoryId") String id) {
		categoryDAO.deleteCategory(id);

		return "redirect:viewcategoryPage";

	}

	@RequestMapping("editCategory")
	public String editCategory(@RequestParam(value = "categoryId") String id, Model model) {

		Category category = categoryDAO.getBycategoryId(id);
		model.addAttribute("category", category);
		model.addAttribute("isAdminClickedEditCategory", "true");
		return "adminlogin";

	}

	@RequestMapping("afterEditCategory")
	public String afterEditCategory(@ModelAttribute Category category) {

		categoryDAO.insertCategory(category);
		return "redirect:viewcategoryPage";

	}

	@ModelAttribute
	public void adminCategory(Model model) {
		model.addAttribute("isAdminLoggedIn", "true");
	}

}