package com.example.demorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoRestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(DemoRestApplication.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (String bean: beans) {
			System.out.println(bean);
		}
		System.out.println("All beans= " + context.getBeanDefinitionCount());
	}

}
