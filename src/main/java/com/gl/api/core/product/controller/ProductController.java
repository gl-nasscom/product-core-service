/**
 * 
 */
package com.gl.api.core.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.GsonBuilder;
import com.gl.api.core.product.config.MicroserviceConfig;
import com.gl.api.core.product.model.Product;
import com.gl.api.core.product.model.SellerDetails;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author sorabhkumar.sahu
 *
 */
@Validated
@RestController
@RequestMapping("/api/core/products")
@Api("Product controller")
public class ProductController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);


	@Autowired
	private MicroserviceConfig config;


	/**
	 * @param message
	 */
	@ApiOperation(value = "Mocked API for test", notes = "Mocked API")
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Map<String, String>> getTestMessage(@RequestParam String message) {
		LOGGER.info("Controller processInit !");
		Map<String, String> response = new HashMap<>();
		response.put("response", "Hi this is mocked response for your message - " + message);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * @param customerId
	 * @return
	 */
	@ApiOperation(value = "Get Product Details", notes = "Mocked API")	
	@RequestMapping(value = "/{productId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Product> getProduct(@PathVariable String productId) {

		List<String> description = new ArrayList<String>();
		description.add("Compact Design");
		description.add("Corning Gorilla Glass");
		description.add("High Quality Camera");
		description.add("SlowMo recording");

		//Mocked
		SellerDetails mockedSeller = new SellerDetails("Inspire", true, "4.3", "5");

		Product mockProduct = new Product("Iphone 7", "79999.00", "10%", true, "4.5", false, "img/iphone7.jpeg", description, mockedSeller);
		return new ResponseEntity<Product>(mockProduct, HttpStatus.OK);
	}


}
