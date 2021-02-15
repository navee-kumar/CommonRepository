package com.master.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.master.repository.CountryRepository;
import com.master.service.ISimpleMasterService;
import com.master.service.SimpleMasterServiceImpl;

@Configuration
public class MasterConfig {

	@Autowired(required = true)
	CountryRepository countryRepository;

	@Bean
	public ISimpleMasterService 
	iSimpleMasterService(CountryRepository countryRepository) {
		return new SimpleMasterServiceImpl(countryRepository);
	}

}
