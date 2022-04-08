package com.gefe.flockitchallenge.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gefe.flockitchallenge.app.FlockItChallengeRestAppApplication;
import com.gefe.flockitchallenge.app.models.Provincia;
import com.gefe.flockitchallenge.app.service.ProvinciaServiceImpl;

@RestController
public class ProvinciaRestController {

	private static final Logger log = LoggerFactory.getLogger(FlockItChallengeRestAppApplication.class);
	
	@Autowired
	private ProvinciaServiceImpl service;
	
	
	
	@GetMapping(value = "/provincia")
	public Provincia getProvinciaLatLon(@RequestParam(value = "name", defaultValue = "")String name) {
		
		Provincia provincia = service.getProvinciaByName(name);
		
			
		return provincia;
	}
	
}
