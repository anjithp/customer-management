package com.quantas.cdm.app.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quantas.cdm.api.model.FieldMetadata;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Defines endpoints for customer metadata service. This service can be used to
 * define new data fields on customer class.
 * 
 * @author Anjith
 * @since 1.0.0
 */
@RestController
@RequestMapping("/fieldmetadata")
@Api(value = "field meta data management")
public class FieldMetadataService {

	/**
	 * Create field metadata to define new field on customer.
	 *
	 * @param customer
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Create field  metadata", response = Void.class)
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Successfully created field metadata"), @ApiResponse(code = 400, message = "Invalid input data") })
	public ResponseEntity<Void> createFieldMetadata(@RequestBody FieldMetadata fieldMetadata) {
		return null;
	}
	
	
	// we can provide update and delete operations for field metadata and add restrictions for OOB fields.

}
