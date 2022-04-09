package com.greatlearning.lab6spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Lab6SpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Lab6SpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Helooo Spring");
	}


}
