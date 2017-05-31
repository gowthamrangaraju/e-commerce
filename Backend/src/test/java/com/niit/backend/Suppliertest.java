package com.niit.backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.SupplierDAO;
import com.niit.backend.model.Supplier;

public class Suppliertest 
{
   public static void main(String arg[])
   {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
       context.scan("com.niit.backend");
       context.refresh();
       System.out.println("hello");
     
        
       SupplierDAO supplierDAO=(SupplierDAO)context.getBean("SupplierDAO");
        
       Supplier supplier = (Supplier)context.getBean("supplier");
       
       
       supplier.setSupplierName("Lokesh");
       supplier.setSupplierphno("9500245335");
       supplier.setSupplierAddress("48-VOC COlony,Peelamedu,Coimbatore-641004");
       
       supplierDAO.insertSupplier(supplier);
       }
   }