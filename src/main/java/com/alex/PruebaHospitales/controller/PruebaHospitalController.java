package com.alex.PruebaHospitales.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController


public class PruebaHospitalController {
	

	
			
	@RequestMapping("/")
	  public String home() {

	    return "hola mundo";
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(SpringBootApplication.class, args);
	  }
}
