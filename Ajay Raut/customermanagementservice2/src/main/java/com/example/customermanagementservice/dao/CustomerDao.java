package com.example.customermanagementservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customermanagementservice.model.Customer;

import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface CustomerDao extends JpaRepository<Customer,Integer>{

}
