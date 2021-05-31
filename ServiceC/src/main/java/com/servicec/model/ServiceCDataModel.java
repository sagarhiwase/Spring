package com.servicec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE_C")
public class ServiceCDataModel {
	
	
	@Id
    @GeneratedValue
    @Column(name="SUB_ID")
	private Long id;
	
	
	@Column(name="SUB_NAME")
	private  String subName;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSubName() {
		return subName;
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	
	
	
	

}
