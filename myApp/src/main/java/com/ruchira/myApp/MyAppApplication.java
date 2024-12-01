package com.ruchira.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		// IoC is of type ApplicationContext
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);  // creates the IoC Container in the JVM

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
