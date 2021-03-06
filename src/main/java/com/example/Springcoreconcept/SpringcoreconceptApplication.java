package com.example.Springcoreconcept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Springcoreconcept.component.DemoBean;
import com.example.Springcoreconcept.component.EmployeeBean;
import com.example.Springcoreconcept.controller.HelloRestController;

@SpringBootApplication
public class SpringcoreconceptApplication {

	public static final Logger logger =LoggerFactory.getLogger(SpringcoreconceptApplication.class);
	public static void main(String[] args) {
		
		logger.debug("Spring core logger");
		System.out.println("Hello java..!!");
		ApplicationContext context=SpringApplication.run(SpringcoreconceptApplication.class, args);
	    DemoBean demoBean=context.getBean(DemoBean.class);
	    logger.debug("context{}",context.getBean(DemoBean.class));
	    System.out.println(context.getBean(HelloRestController.class));
	    EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
	    employeeBean.setEid(102);
	    employeeBean.setEname("Spring framework");
	    employeeBean.showEmployeeDetails();
	
	
	}

}
