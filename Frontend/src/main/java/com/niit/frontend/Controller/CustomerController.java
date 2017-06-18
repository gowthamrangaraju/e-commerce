package com.niit.frontend.Controller;

import java.security.Principal;

import org.hibernate.validator.constraints.ModCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.backend.DAO.CustomerDAO;
import com.niit.backend.DAO.RoleDAO;
import com.niit.backend.model.Customer;
import com.niit.backend.model.Role;

@Controller
public class CustomerController {

	
	@Autowired
	private CustomerDAO customerDAO;
	@Autowired
	private Role role;
	
	@Autowired
	private RoleDAO roleDAO;
	
	@RequestMapping("customer")
	public String customer (Model model){
		model.addAttribute("isuserclickedcustomer","true");
		return "home";
	}
	
	@RequestMapping("newcustomer")
	public String newCustomer(@ModelAttribute Customer customer,Model model){
		String message;
		if(customerDAO.isAllReadyRegister(customer.getCustomerEmail())){
			message="Hiiii";
			model.addAttribute("message","Entered Email id already exist you have to login first");
		}
		else{
		customer.setEnabled(true);
		
		role.setcustomerEmail(customer.getCustomerEmail());
		role.setCustomerId(customer.getCustomerId());
		
		role.setRole("ROLE_USER");
		
		customer.setRole(role);
		role.setCustomer(customer);
		
		customerDAO.insertCustomer(customer);
		roleDAO.insertRole(role);
		message = "Successfully Registered";
		}
		
		model.addAttribute("isuserClickedLoginButton","true");
		model.addAttribute("message", message);
		return "home";
	}
	
	@RequestMapping("afterlogin")
	public String afterlogin(Principal p, Model model){

		String customerEmail=p.getName();
	    Role role = roleDAO.getBycustomerEmail(customerEmail); 
	//    System.out.println(role);
        String validator = role.getRole();

        if (validator.equals("ROLE_ADMIN")) {
         model.addAttribute("isAdminLoggedIn", "true");
            return "adminlogin";
        } else if (validator.equals("ROLE_USER")) {
        	model.addAttribute("isUserLoggedIn", "true");

            return "customerlogin";
        } else{
        	model.addAttribute("message", "invalid data");
        }
		return "loginPage";
	}
	
}
