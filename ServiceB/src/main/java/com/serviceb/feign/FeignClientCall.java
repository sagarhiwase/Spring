package com.serviceb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.serviceb.dto.ServiceCDataModel;

@FeignClient(name="ServiceBFeign",  url ="http://localhost:8084/SERVICEC")
public interface FeignClientCall {
 
	@RequestMapping(method=RequestMethod.GET,value="/getDataId/{id}")
	ServiceCDataModel getData(@PathVariable("id") Long id);
}
