package com.serviceb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceb.dto.ServiceBDataModel;
import com.serviceb.exception.StudentNotFoundException;
import com.serviceb.repository.ServiceBRepository;

@Service
public class ServiceB {
	
	@Autowired
	private ServiceBRepository serviceBRepository;
	
	public List<ServiceBDataModel> getData() throws StudentNotFoundException{
		System.out.println("in getdata ==ServiceB");
		return serviceBRepository.findAll();
	}

}
