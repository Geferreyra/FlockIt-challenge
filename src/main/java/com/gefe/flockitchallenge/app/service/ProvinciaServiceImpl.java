package com.gefe.flockitchallenge.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gefe.flockitchallenge.app.FlockItChallengeRestAppApplication;
import com.gefe.flockitchallenge.app.models.DataArg;
import com.gefe.flockitchallenge.app.models.Provincia;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{
	
	private static final Logger log = LoggerFactory.getLogger(FlockItChallengeRestAppApplication.class);

	@Override
	public Provincia getProvinciaByName(String name) {
		
		log.info(this.getClass().getName() + " - Busca provincia: "+name);
		
		for(Provincia prov : DataArg.instance.getProvincias())
		{
			if (prov.getNombre().equals(name)) {
				
				String lat = prov.getCentroide().getLat();
				String lon = prov.getCentroide().getLon();
			
				log.info("Se encontro la provincia: " + name+ " Latitud: "+ lat + " Longitud: " + lon);
				
				return prov;
			}
			
			
		}
		log.debug("NO ENCUENTRA PROVINCIA");
		return null;
	
	}

}
