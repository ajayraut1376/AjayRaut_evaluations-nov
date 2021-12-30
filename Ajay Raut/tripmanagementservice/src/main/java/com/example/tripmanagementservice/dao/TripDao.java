package com.example.tripmanagementservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.example.tripmanagementservice.model.Trip;


@Repository
@Transactional
public interface TripDao extends JpaRepository<Trip,Integer>{

}
