package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assessment2Application {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(Assessment2Application.class, args);

		StorageService storage = context.getBean(StorageService.class);
		storage.storeFile("notes.txt");

		StorageService local1 =(StorageService) context.getBean("localStorage");

		StorageService local2 =(StorageService) context.getBean("localStorage");

		local1.storeFile("file1.txt");
		local2.storeFile("file2.txt");

		System.out.println("\nAre both local beans same? " + (local1 == local2));
	}
}