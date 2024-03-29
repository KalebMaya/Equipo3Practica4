package com.everis.equipo3practica4eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class Equipo3practica4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3practica4EurekaServerApplication.class, args);
	}

}
