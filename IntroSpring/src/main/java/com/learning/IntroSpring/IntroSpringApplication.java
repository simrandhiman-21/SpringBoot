package com.learning.IntroSpring;

import com.learning.IntroSpring.controller.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {

		System.out.println("I'M main Method");
		//	Retrieves Spring Beans manually = ApplicationContext
		ApplicationContext context= SpringApplication.run(IntroSpringApplication.class, args);
//		EmployeeBean employee=context.getBean(EmployeeBean.class);
//		employee.showEmployeeDetails();
	}

}
