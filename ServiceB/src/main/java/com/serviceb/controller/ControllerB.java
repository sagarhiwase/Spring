package com.serviceb.controller;

import java.net.URI;
import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.serviceb.dto.ServiceBDataModel;
import com.serviceb.dto.ServiceCDataModel;
import com.serviceb.exception.StudentNotFoundException;
import com.serviceb.feign.FeignClientCall;
import com.serviceb.service.ServiceB;

@RestController
@RequestMapping("/SERVICEB")
public class ControllerB {
	
	@Autowired
	private ServiceB serviceB;
	
	@Autowired
	FeignClientCall feignClient;
	
	@GetMapping("/getDataB")
	public ResponseEntity<List<ServiceBDataModel>> getData() throws StudentNotFoundException{
		System.out.println("in getdataB");
		
		
		//rest template call to another microservice
		/*RestTemplate restTemplate = new RestTemplate();
		
		ServiceCDataModel model= restTemplate.getForObject("http://localhost:8084/getDataId/1", ServiceCDataModel.class);
		
		System.out.println("model "+model.getSubName());
		*/
		//Feign Client call
		/*ServiceCDataModel s= feignClient.getData(1L);
		System.out.println("value of s "+s.getSubName());*/
		
		//return  model;
		return ResponseEntity.status(HttpStatus.OK).body(serviceB.getData());
				
	}

	
	
}
