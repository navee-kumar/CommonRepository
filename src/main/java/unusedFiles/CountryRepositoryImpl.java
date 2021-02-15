package unusedFiles;
//package com.master.repository;
//
//import java.util.List;
//
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.master.mapper.MapperRow;
//import com.master.model.CountryModel;
//
//@Repository
//public class CountryRepositoryImpl implements CountryRepository {
//
//	private String QUERY_STRING = "select countryname from eap_country ec where countrycode = 'IND'";
//
//	NamedParameterJdbcTemplate template;
//
//	public CountryRepositoryImpl(NamedParameterJdbcTemplate template) {
//		this.template = template;
//	}
//
//	@Override
//	public String getCountry() {
//		List<CountryModel> countryList = template.query(QUERY_STRING, new MapperRow());
//		return countryList.get(0).getCountryName();
//	}
//
//}
