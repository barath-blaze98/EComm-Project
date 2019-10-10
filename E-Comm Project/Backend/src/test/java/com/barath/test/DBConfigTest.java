package com.barath.test;
import org.junit.Ignore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Ignore
public class DBConfigTest 
{
	public static void main(String arg[])
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.barath");
		
		context.refresh();
		
		
	}
}
