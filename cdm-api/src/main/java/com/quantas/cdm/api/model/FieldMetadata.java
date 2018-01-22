package com.quantas.cdm.api.model;

import lombok.Getter;
import lombok.Setter;


/**
 *Represents a field on customer object.
 * 
 *@author Anjith
 *@since 1.0.0
 */
@Getter
@Setter
public class FieldMetadata {
	private String name;
	private String pattern;
	private boolean encrypted;
	private boolean mandatory;
}
