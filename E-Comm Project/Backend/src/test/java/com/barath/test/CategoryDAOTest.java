package com.barath.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.barath.dao.CategoryDAO;
import com.barath.model.Category;

public class CategoryDAOTest 
{
static CategoryDAO categoryDAO;

@BeforeClass
public static void executeFirst()
{
	
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.barath");
	context.refresh();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
}

@Ignore
@Test
public void addCategoryTest()
{
	Category category=new Category();
	category.setCategoryName("One Plus");
	category.setCategoryDesc("All Smartphones of One Plus T Series");
	assertTrue("Problem occured while adding category",categoryDAO.addCategory(category));
}
@Ignore
@Test
public void updateCategoryTest()
{
	Category category=categoryDAO.getCategory(4);
	category.setCategoryDesc("All Smartphones with different cost of MI Brand");
	assertTrue("Problem occured while updating category",categoryDAO.updateCategory(category));
}
@Ignore
@Test
public void deleteCategoryTest()
{
	Category category=categoryDAO.getCategory(3);
	assertTrue("Problem occured while deleting category",categoryDAO.deleteCategory(category));
}
//@Ignore
@Test
public void listCategoriesTest()
{
	List<Category> categoryList=categoryDAO.listCategories();
	assertTrue("Problem occured while retrieving from the list",categoryList.size()>0);
	for (Category category : categoryList) 
	{
		System.out.print(category.getCategoryId()+"  |  ");
		System.out.print(category.getCategoryName()+"  |  ");
		System.out.println(category.getCategoryDesc()+" ");
	}
	
}

}