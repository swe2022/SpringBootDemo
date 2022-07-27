package com.springboot.dibasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIbasicsApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DIbasicsApplication.class, args);
//		Student s1 = new Student();  // manual object creation, tightly coupled
//		s1.say();

//		ConfigurableApplicationContext ctx = SpringApplication.run(DIbasicsApplication.class, args);
//		Student s1 = ctx.getBean(Student.class);
//		s1.say();

//		SpringApplication.run(DIbasicsApplication.class, args);

		ConfigurableApplicationContext ctx = SpringApplication.run(DIbasicsApplication.class, args);
//		Student s1 = ctx.getBean(Student.class);
//		s1.say();
		Student s2 = ctx.getBean(Student.class);
		s2.say();



	}

}
