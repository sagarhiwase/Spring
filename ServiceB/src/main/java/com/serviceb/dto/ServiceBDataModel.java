package com.serviceb.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE_B")
public class ServiceBDataModel {
	
	
	@Id
    @GeneratedValue
	private Long id;
	
	
	@Column(name="NAME")
	private  String name;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "DtoA [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
