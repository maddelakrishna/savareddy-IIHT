package com.iiht.hospitalmanagement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.iiht.hospitalmanagement")
public class HospitalManagementApplication {

	public static void main(String[] args) {

   SpringApplication.run(HospitalManagementApplication.class, args);

	}

}
