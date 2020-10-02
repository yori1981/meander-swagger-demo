package com.meander.swagger;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sage
 */
@EnableSwagger2Doc
@SpringBootApplication
public class MeanderSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeanderSwaggerApplication.class, args);
	}

}
