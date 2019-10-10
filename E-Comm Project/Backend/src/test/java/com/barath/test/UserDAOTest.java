package com.barath.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.barath.dao.UserDAO;
import com.barath.model.UserDetail;

public class UserDAOTest {

	static UserDAO userDAO;
	
	@BeforeClass
	 public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.barath");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	@Ignore
	@Test
	public void registerUserTest() 
	{
		UserDetail userDetail=new UserDetail();
		
		userDetail.setUsername("bubbles98");
		userDetail.setAddress("Triplicane,Chennai");
		userDetail.setEmailId("bubbles@gmail.com");
		userDetail.setPassword("bubbles");
		userDetail.setMobileNo("8056600428");
		userDetail.setCustomerName("Bubbles");
		userDetail.setEnabled(true);
		userDetail.setRole("user");
		
		assertTrue("Problem occured while adding User",userDAO.registerUser(userDetail));
	}

}
