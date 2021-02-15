package com.master.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "eap_country")
@Getter
@Setter
public class CountryModel implements Serializable {

	private static final long serialVersionUID = 1432316533700414630L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COUNTRY_SEQ")
	@SequenceGenerator(sequenceName = "seq_country", allocationSize = 1, name = "COUNTRY_SEQ")
	private Long id;

	@Column(name = "countryname")
	private String countryName;

	@Column(name = "countrycode")
	private String countryCode;

	@Column(name = "countrydesc")
	private String countryDesc;

	@Column(name = "countryisdcode")
	private String countryIsdCode;

	@Column(name = "countryphonecode")
	private String countryPhoneCode;

	@Column(name = "continent")
	private String continent;

	@Column(name = "capital")
	private String capital;

	@Column(name = "timezone")
	private String timeZone;

	@Column(name = "currencycode")
	private String currencyCode;

	@Column(name = "currencyname")
	private String currencyName;

	@Column(name = "geonameid")
	private Long geoNameId;

	@Column(name = "isactive")
	private Boolean isActive;

	@Column(name = "createdby")
	private Long createdBy;

	@Column(name = "createddate")
	private LocalDateTime createdDate;

	@Column(name = "updatedby")
	private Long updatedBy;

	@Column(name = "updateddate")
	private LocalDateTime updatedDate;

}
