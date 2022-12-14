package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(DemoApplication.class, args);
		Car car = applicationContext.getBean(Car.class);
		car.getCar();
	}

}
