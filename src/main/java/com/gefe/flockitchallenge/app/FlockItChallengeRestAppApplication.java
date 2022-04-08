package com.gefe.flockitchallenge.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.gefe.flockitchallenge.app.models.DataArg;

@SpringBootApplication
public class FlockItChallengeRestAppApplication {

	
	private static final Logger log = LoggerFactory.getLogger(FlockItChallengeRestAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FlockItChallengeRestAppApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			DataArg dataArg = restTemplate.getForObject(
					"https://apis.datos.gob.ar/georef/api/provincias", DataArg.class);
			DataArg.instance = dataArg;
			log.info("*****Consumiendo Api provincias*****");
			log.info(dataArg.toString());
		
			
		};
	}

}
