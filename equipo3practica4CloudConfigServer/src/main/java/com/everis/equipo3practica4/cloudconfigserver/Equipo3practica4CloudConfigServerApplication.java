package com.everis.equipo3practica4.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Equipo3practica4CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3practica4CloudConfigServerApplication.class, args);
	}

}
