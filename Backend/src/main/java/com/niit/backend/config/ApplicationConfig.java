package com.niit.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.backend.DAO.CartDAO;
import com.niit.backend.DAO.CartDAOimpl;
import com.niit.backend.DAO.CategoryDAO;
import com.niit.backend.DAO.CategoryDAOimpl;
import com.niit.backend.DAO.CustomerDAO;
import com.niit.backend.DAO.CustomerDAOimpl;
import com.niit.backend.DAO.OrderDAO;
import com.niit.backend.DAO.OrderDAOimpl;
import com.niit.backend.DAO.ProductDAO;
import com.niit.backend.DAO.ProductDAOimpl;
import com.niit.backend.DAO.SupplierDAO;
import com.niit.backend.DAO.SupplierDAOimpl;
import com.niit.backend.model.Cart;
import com.niit.backend.model.Category;
import com.niit.backend.model.Customer;
import com.niit.backend.model.Order;
import com.niit.backend.model.Product;
import com.niit.backend.model.Role;
import com.niit.backend.model.Supplier;

@Configuration
@ComponentScan("com.niit.backend")
@EnableTransactionManagement
public class ApplicationConfig {
	@Autowired
	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		System.out.println("Data Source Method");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/MyDB");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("Data Source Created");
		return dataSource;
	}

	public Properties getHibernateProperties() {
		System.out.println("Hibernate Properties -Entered");
		Properties properties = new Properties();

		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");

		System.out.println("Hibernate Property Object Created");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory() {
		System.out.println("SessionFactory Method-Entered");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(getHibernateProperties());

		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Role.class);
		sessionBuilder.addAnnotatedClass(Customer.class);
		sessionBuilder.addAnnotatedClass(Order.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);

		SessionFactory sessionfactory = sessionBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object Created");
		return sessionfactory;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("Transaction Manager");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

	@Bean(name = "CategoryDAO")

	public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
		return new CategoryDAOimpl(sessionFactory);
	}

	@Bean(name = "CartDAO")
	public CartDAO getCartDAO(SessionFactory sessionFactory) {
		return new CartDAOimpl(sessionFactory);
	}

	@Bean(name = "CustomerDAO")

	public CustomerDAO getCustomerDAO(SessionFactory sessionFactory) {
		return new CustomerDAOimpl(sessionFactory);
	}

	@Bean(name = "ProductDAO")
	public ProductDAO getProductDAO(SessionFactory sessionFactory) {
		return new ProductDAOimpl(sessionFactory);
	}

	@Autowired(required = true)
	@Bean(name = "OrderDAO")
	public OrderDAO getOrderDAO(SessionFactory sessionFactory) {
		return new OrderDAOimpl(sessionFactory);
	}

	@Bean(name = "SupplierDAO")
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
		return new SupplierDAOimpl(sessionFactory);
	}

}
