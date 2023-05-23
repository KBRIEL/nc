package com.del_origen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*
@SpringBootApplication
public class DelOrigenApplication extends {

	public static void main(String[] args) {
		SpringApplication.run(DelOrigenApplication.class, args);
	}

} */


 @SpringBootApplication
public class DelOrigenApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DelOrigenApplication.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DelOrigenApplication.class);
	    }

}

