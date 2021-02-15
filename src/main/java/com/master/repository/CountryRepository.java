package com.master.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.model.CountryModel;

/**
 * CountryRepository class acts as a repository for eap_country table.
 * 
 * 
 */
@Repository
public interface CountryRepository extends JpaRepository<CountryModel, Long> {

	public List<CountryModel> findAllByOrderByCountryName();
	

}

