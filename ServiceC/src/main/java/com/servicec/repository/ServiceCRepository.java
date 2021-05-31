package com.servicec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicec.model.ServiceCDataModel;

@Repository
public interface ServiceCRepository  extends JpaRepository<ServiceCDataModel, Long> {

}
