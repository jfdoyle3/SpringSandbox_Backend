package com.sandbox.backendsandbox;

import com.sandbox.backendsandbox.api.NewsAPI;
import kong.unirest.json.JSONArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sandbox.backendsandbox.mongodb.Person;
import com.sandbox.backendsandbox.mongodb.PersonRepository;

@SpringBootApplication
public class BackendsandboxApplication {

	public static void main(String[] args) {

//		SpringApplication.run(BackendsandboxApplication.class, args);


		String newsJson=NewsAPI.getNews();
		System.out.println(newsJson);
	}
}
