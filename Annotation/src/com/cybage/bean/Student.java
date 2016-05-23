//Developer:: Abhishek kUMAR
//Create a spring program by using basic annotations

package com.cybage.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Required;

public class Student//create bean student
{
	 private Integer age;//data members
	   private String name;
	   private String message;
	   
	   public Student()//constructor
	   {
		   this.message="hello";
		System.out.println("in ctor");
	   }
	   
	   @PostConstruct
	   public void print()//method which must call after constructor with the help of postconstruct anno.
	   {
		   System.out.println("in post construct::::"+message);
	   }
	   @Required
	   public void setAge(Integer age)//setter of the age data member with required anno  
	   {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   
	   @Required
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
}
