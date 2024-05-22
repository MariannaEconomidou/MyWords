package com.marianna.myWords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.marianna.myWords")
public class MyWordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWordsApplication.class, args);
	}

}
