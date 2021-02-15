package com.master.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.master.repository.CountryRepository;

@Service
@Transactional
public class SimpleMasterServiceImpl implements ISimpleMasterService {

	private CountryRepository countryRepository;

	public SimpleMasterServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public String getData() {
		return countryRepository.findAllByOrderByCountryName().get(0).getCountryName();
	}

	@Override
	public String demoCheck() {
		return "demoCheck....";
	}

}
