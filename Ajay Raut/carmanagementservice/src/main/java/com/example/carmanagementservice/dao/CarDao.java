package com.example.carmanagementservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carmanagementservice.model.Car;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface CarDao extends JpaRepository<Car,Integer>{

}
