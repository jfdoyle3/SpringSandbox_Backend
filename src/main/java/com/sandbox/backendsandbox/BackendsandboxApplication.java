package com.sandbox.backendsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sandbox.backendsandbox.mongodb.Person;
import com.sandbox.backendsandbox.mongodb.PersonRepository;

@SpringBootApplication
public class BackendsandboxApplication {

	public static void main(String[] args) {

//		SpringApplication.run(BackendsandboxApplication.class, args);

		ApplicationContext ctx = (ApplicationContext)SpringApplication.run(BackendsandboxApplication.class, args);

		// Write data to mongodb collection
		System.out.println("Start");
		PersonRepository personRepository = ctx.getBean(PersonRepository.class);
		Person p1 = new Person(123, "test");
		personRepository.save(p1);
		System.out.println("End");
	}

}
