package com.serviceb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serviceb.dto.ServiceBDataModel;

@Repository
public interface ServiceBRepository  extends JpaRepository<ServiceBDataModel, Long> {

}
