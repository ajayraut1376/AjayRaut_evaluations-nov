package com.example.carmanagementservice.service;

import java.util.List;

import com.example.carmanagementservice.model.Car;



public interface CarService {
	public List<Car> getAll();
	public Car addCar(Car car);
	public String deleteCar(int carno);
	public Car updateCar(Car car);
	public List<Car> getCarBycarno(int carno);

}
