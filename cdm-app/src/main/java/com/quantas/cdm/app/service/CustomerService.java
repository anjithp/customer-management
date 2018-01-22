package com.quantas.cdm.app.service;



import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quantas.cdm.api.model.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import io.swagger.annotations.ApiResponse;


/**
 *Defines endpoints for a customer service.
 * 
 * @author Anjith
 *@since 1.0.0
 */
@RestController
@RequestMapping("/customers")
@Api(value="customer data management")
public class CustomerService {
	
	//we can use NoSQL database like Solr for persistence and use spring data and dao patterns for code organization.
	
	/**
	 * Registers a given customer.
	 *
	 * @param customer
	 */
	@RequestMapping( method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Register a customer",response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully created a customer",
            		responseHeaders= {@ResponseHeader(name="Location")}),
            @ApiResponse(code = 400, message = "Invalid input data")
    })
	public ResponseEntity<Void> registerCustomer(@RequestBody Customer customer) {
		return null;
	}

	/**
	 * Get customer based on ID.
	 * 
	 * @param id
	 * @return customer
	 */
	@ApiOperation(value = "Get a customer",response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved a customer"),
            @ApiResponse(code = 400, message = "Invalid customer ID")
    })
	@RequestMapping(value="/{id}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomer(@RequestParam("id") String id) {
	return null;	
	}

	/**
	 * Update a given customer completely.
	 * 
	 * @param customer
	 */
	@ApiOperation(value = "Update a customer",response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successfully updated a customer"),
            @ApiResponse(code = 400, message = "Invalid input data")
    })
	@RequestMapping(value="/{id}", method = RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateCustomer(@RequestParam("id") String id, @RequestBody Customer customer) {
		return null;
	}

	/**
	 * Patch a given customer.
	 * 
	 * 
	 * @param customer
	 * @return customer
	 */
	@ApiOperation(value = "Patch a customer",response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successfully patched a customer"),
            @ApiResponse(code = 400, message = "Invalid input data")
    })
	@RequestMapping(value="/{id}", method = RequestMethod.PATCH, consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> patchCustomer(@RequestParam("id") String id, @RequestBody Customer customer) {
		return null;
	}

	/**
	 * Deletes a given customer based on ID.
	 * 
	 * 
	 * @param id
	 */
	@ApiOperation(value = "Delete a customer",response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successfully deleted a customer"),
            @ApiResponse(code = 400, message = "Invalid customer ID")
    })
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCustomer(@RequestParam("id") String id) {
		return null;
	}

}
