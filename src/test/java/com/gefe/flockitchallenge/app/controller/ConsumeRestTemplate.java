package com.gefe.flockitchallenge.app.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

public class ConsumeRestTemplate {

	@SpringBootTest
	public class ConsumingRestApplicationTest {

		@Autowired
		private RestTemplate restTemplate;

		@Test
		public void contextLoads() {
			assertThat(restTemplate).isNotNull();
		}

	}
}
