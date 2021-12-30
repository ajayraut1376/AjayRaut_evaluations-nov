package com.example.tripmanagementservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tripmanagementservice.model.Trip;
import com.example.tripmanagementservice.service.TripService;



@RestController
@RequestMapping("/trip")
public class Controller {
	
	@Autowired
	TripService Service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Trip>> getAll(){
		return new ResponseEntity(Service.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Trip> addTrip(@RequestBody Trip trip){
		return new ResponseEntity(Service.addTrip(trip), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{tripId}")
	public ResponseEntity<String> deleteTrip(int tripId){
		return new ResponseEntity(Service.deleteTrip(tripId), HttpStatus.ACCEPTED);
	}
	@GetMapping("/pid/{carno}")
	public ResponseEntity<List<Trip>> getAllBycarno(@PathVariable("carno") int carno){
		return new ResponseEntity(Service.getTripBycarno(carno),HttpStatus.OK);
	}
	

}