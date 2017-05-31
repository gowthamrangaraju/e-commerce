package com.niit.backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CustomerDAO;
import com.niit.backend.model.Customer;

public class Customertest 
{
   public static void main(String arg[])
   {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
       context.scan("com.niit.backend");
       context.refresh();
       System.out.println("hello");
     
        
       CustomerDAO CustomerDAO=(CustomerDAO)context.getBean("CustomerDAO");
        
       Customer customer = (Customer)context.getBean("customer");
       
       customer.setCustomerName("Gowtham");
       customer.setCustomerphno("9715406644");
       customer.setCustomerEmail("gowtham051996@gmail.com");
       customer.setCustomeraddress("9-Thukkinar street,Peelamedu,Coimbatore-641004");
       customer.setCustomershippingaddress("36-AnnaNagar,Avarampalayam,coimbatore-641008");
       CustomerDAO.insertCustomer(customer);
      
        
   }
}



