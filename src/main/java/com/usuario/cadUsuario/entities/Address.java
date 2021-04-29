package com.usuario.cadUsuario.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String streetName;
	private Integer number;
	private String complement;
	private String district;
	private String postalCode;
	private String cityName;
	private String stateName;
	private String countryName;
	
	@ManyToOne
	private User user;
	
	
	public Address() {
		
	}


	public Address(Long id, String streetName, Integer number, String complement, String district, String postalCode,
			String cityName, String stateName, String countryName, User user) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.number = number;
		this.complement = complement;
		this.district = district;
		this.postalCode = postalCode;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.user = user;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
