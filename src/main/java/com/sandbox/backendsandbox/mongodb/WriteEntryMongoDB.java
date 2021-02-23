package com.sandbox.backendsandbox.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WriteEntryMongoDB {

	public static void Main(String[] args) {


		ApplicationContext ctx = (ApplicationContext)SpringApplication.run(WriteEntryMongoDB.class, args);

		// Write data to mongodb collection
		System.out.println("Start");
		PersonRepository personRepository = ctx.getBean(PersonRepository.class);
		Person p1 = new Person(123, "test");
		personRepository.save(p1);
		System.out.println("End");
	}

}
