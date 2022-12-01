package com.example.demo;

import com.exampe.pages.HomePage;
import com.exampe.pages.LoginPage;
import com.exampe.pages.MainPage;
//import jdk.tools.jmod.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		/*System.out.println("Hello begin");
		HomePage homePage = new HomePage();
		LoginPage loginPage = homePage.signOn();
		loginPage.login("aruna", "hello");
		System.out.println("hello end");*/
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class);
		Car car = applicationContext.getBean(Car.class);
		car.getCar();

		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		MainPage mainPage = new MainPage(loginPage, homePage);
		mainPage.performLogin();
	}

}
