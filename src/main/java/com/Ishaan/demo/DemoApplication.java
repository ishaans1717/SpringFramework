package com.Ishaan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int[] x ={1,2,3};
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		System.out.println(binarySearch.search(x,2));
	}

}
