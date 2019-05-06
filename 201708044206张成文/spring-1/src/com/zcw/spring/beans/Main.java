package com.zcw.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * HelloWorld helloWorld = new HelloWorld(); helloWorld.setName("zcw");
		 */
		// 1.创建Spring的IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.从IOC中获取Bean实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		// 3.调用方法
		helloWorld.hello();
	}
}
