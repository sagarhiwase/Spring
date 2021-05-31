package com.servicec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicec.model.ServiceCDataModel;
import com.servicec.service.ServiceC;

@RestController
@RequestMapping("/SERVICEC")
public class ControllerC {

	@Autowired
	private ServiceC serviceC;
  //
	@GetMapping("/getDataC")
	public List<ServiceCDataModel> getData() {
		System.out.println("in getdataC");
		return serviceC.getData();

	}

	@GetMapping("/getDataId/{id}")
	public Optional<ServiceCDataModel> getDataById(@PathVariable Long id) {

		System.out.println("in getdataC");
		return serviceC.getDataById(id);

	}

}
