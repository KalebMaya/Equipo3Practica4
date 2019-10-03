package com.everis.equipo3practica4enviaremail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.everis.equipo3practica4enviaremail.configuration.SwaggerConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@Import(SwaggerConfiguration.class)
public class Equipo3practica4EnviarEmailApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3practica4EnviarEmailApplication.class, args);
	}

	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	         registry.addResourceHandler("swagger-ui.html")
	                  .addResourceLocations("classpath:/META-INF/resources/");
	  }
}
