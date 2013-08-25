package com.rohan.core;

import com.rohan.core.shop.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("shopbeans.xml");
        Product aaa = (Product) context.getBean("cdrw");
        System.out.println(aaa);
    }
}
