package com.niit.backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CategoryDAO;
import com.niit.backend.model.Category;

public class Categorytest 
{
   public static void main(String arg[])
   {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
       context.scan("com.niit.backend");
       context.refresh();
       System.out.println("hello");
     
        
       CategoryDAO categoryDAO=(CategoryDAO)context.getBean("CategoryDAO");
        
       Category category = (Category)context.getBean("category");
       
       
       category.setCategoryName("mobile");
       category.setCategoryDesc("bla bla bla");
       
       categoryDAO.insertCategory(category);

        
   }
}
