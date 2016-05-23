//Developer:: Abhishek Kumar
//Create a spring program by using basic annotations
package com.cybage.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//Create Application Context
			Student s=(Student)context.getBean("student");//create bean instance
			System.out.println("Age::"+s.getAge()+",Name::"+s.getName());//print the values
	}
}
