package com.src;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResourcesEx 
{
	public static void main(String[] args) 
	{
		Resource re=new ClassPathResource("appContext.xml");  //pointing to the xml resources
		BeanFactory bf=new XmlBeanFactory(re);
		CustomerClass cc=(CustomerClass) bf.getBean("cus"); //creating the object
		cc.display();  //calling the method
	}

}
