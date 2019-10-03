package com.everis.equipo3practica4enviaremail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class Equipo3practica4EnviarEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3practica4EnviarEmailApplication.class, args);
	}

}
