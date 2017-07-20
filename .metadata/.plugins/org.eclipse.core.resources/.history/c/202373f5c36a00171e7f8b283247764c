package org.com.spring.mySpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_configuration.xml");
		BeanFactory factory = context;
		MySpringBeanDependency test = (MySpringBeanDependency) factory.getBean("mySpringBeanDependency");
		test.run("abc");
	}
}
