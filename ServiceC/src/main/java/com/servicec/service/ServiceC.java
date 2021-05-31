package com.servicec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicec.model.ServiceCDataModel;
import com.servicec.repository.ServiceCRepository;

@Service
public class ServiceC {
	
	@Autowired
	private ServiceCRepository serviceBRepository;
	
	public List<ServiceCDataModel> getData(){
		System.out.println("in getdata ==ServiceC");
		return serviceBRepository.findAll();
	}
	
	public Optional<ServiceCDataModel> getDataById(Long id){
		System.out.println("in getdata ==ServiceC");
		return serviceBRepository.findById( id);
	}
	
	

}
