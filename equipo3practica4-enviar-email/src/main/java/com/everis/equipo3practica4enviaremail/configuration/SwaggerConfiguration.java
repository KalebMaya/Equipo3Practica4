package com.everis.equipo3practica4enviaremail.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	
	public static final Contact DEFAULT_CONTACT = new Contact("Osmar Kaleb Maya Morales", "https://github.com/KalebMaya", "vkaleb7@hotmail.com");
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Documentacion enviar correo", "Documentacion Enviar Correo", "1.0",
			"PREMIUM", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	
	@Bean
    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//      .select()
//      .apis(RequestHandlerSelectors.basePackage("com.everis.equipo3practica4enviaremail.rest"))
//             .paths(regex("/enviarcorreo.*"))
//             .build();
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
    }
}
