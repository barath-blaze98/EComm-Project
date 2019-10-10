package com.barath.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.barath.dao.ProductDAO;
import com.barath.model.Product;

public class ProductDAOTest 
{
 static ProductDAO productDAO;
 @BeforeClass
 public static void executeFirst()
 {
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	 context.scan("com.barath");
	 context.refresh();
	productDAO=(ProductDAO)context.getBean("productDAO");
 }
    @Ignore
	@Test
	public void addCategoryTest() 
	{
	Product product =new Product();
	 
	product.setProductName("Redmi Note 4");
	product.setProductDesc("Smartphone from Xiaomi Brand with Latest features");
	product.setStock(20);
	product.setSupplierId(1);
	product.setCategoryId(2);
	product.setPrice(14000);
	
	assertTrue("Problem occured while adding product", productDAO.addProduct(product));
	
	}
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(2);
		
		product.setStock(5);
		product.setPrice(35000);
		
		assertTrue("Problem occured while updating product",productDAO.updateProduct(product));
	}
@Test	
public void listProductsCategoryWiseTest()
{
	List<Product> productList=productDAO.listProductsCategoryWise(2);
	assertTrue("Problem in Retrieving",productList.size()>0);
	System.out.println("--------Category Wise--------");
	
	for (Product product : productList) 
	{
	  System.out.print(product.getProductId()+"  ");
	  System.out.print(product.getProductName()+"  ");
	  System.out.println(product.getPrice());
	}
	
}

}








