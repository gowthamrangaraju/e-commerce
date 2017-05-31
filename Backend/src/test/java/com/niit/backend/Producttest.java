package com.niit.backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.ProductDAO;
import com.niit.backend.model.Product;

public class Producttest 
{
   public static void main(String arg[])
   {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
       context.scan("com.niit.backend");
       context.refresh();
       System.out.println("hello");
     
        
       ProductDAO ProductDAO=(ProductDAO)context.getBean("ProductDAO");
        
       Product product = (Product)context.getBean("product");
       
       product.setProductName("mobile");
       product.setProductsupplier("Poorvika_Mobiles");
       product.setProductprice("14,999");
       product.setProductdes("bla bla bla");
       product.setProductstock("94");
       product.setProductreview("bla bla bla");
       product.setProductoffers("5%");
       
       ProductDAO.insertProduct(product);
     
        
   }
}



