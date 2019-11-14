package com.sprinter.customShop.customshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.sprinter.customShop.entity"} )
public class CustomShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomShopApplication.class, args);
	}

}
