package com.quantas.cdm.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Address {

	private String type;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private String zipcode;
}
