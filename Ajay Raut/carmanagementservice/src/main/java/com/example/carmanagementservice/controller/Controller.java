package com.example.carmanagementservice.controller;




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

import com.example.carmanagementservice.model.Car;
import com.example.carmanagementservice.service.CarService;



@RestController
@RequestMapping("/car")
public class Controller {
	
	@Autowired
	CarService Service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Car>> getAll(){
		return new ResponseEntity(Service.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Car> addCar(@RequestBody Car car){
		return new ResponseEntity(Service.addCar(car), HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Car> updateCar(@RequestBody Car car){
		return new ResponseEntity(Service.updateCar(car), HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{carno}")
	public ResponseEntity<String> deleteCar(int carno){
		return new ResponseEntity(Service.deleteCar(carno), HttpStatus.ACCEPTED);
	}
	@GetMapping("/pid/{carno}")
	public ResponseEntity<List<Car>> getAllBycarno(@PathVariable("carno") int carno){
		return new ResponseEntity(Service.getCarBycarno(carno),HttpStatus.OK);
	}
	

}