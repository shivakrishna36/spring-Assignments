package com.capgemini.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//CustomerService service = new CustomerServiceImpl();
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	CustomerService service = context.getBean("service",CustomerService.class);
        System.out.println( service.findAll().get(0).getFirstName());
    }
}
