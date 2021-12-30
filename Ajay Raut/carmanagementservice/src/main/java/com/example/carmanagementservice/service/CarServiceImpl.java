package com.example.carmanagementservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.carmanagementservice.dao.CarDao;
import com.example.carmanagementservice.model.Car;


@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarDao repo;



	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Car addCar(Car car) {
		// TODO Auto-generated method stub
		return repo.save(car);
	}

	@Override
	public String deleteCar(int carno) {
		// TODO Auto-generated method stub
		repo.deleteById(carno);
		return "deleted";
	}

	@Override
	public Car updateCar(Car car) {
		// TODO Auto-generated method stub
		return repo.save(car);
	}

	@Override
	public List<Car> getCarBycarno(int carno) {
		// TODO Auto-generated method stub
		List<Car> data = repo.findAll();
		List<Car> result = new ArrayList();
		for (Car car : data) {
			if (car.getCarno() == carno)
				result.add(car);
		}
		return result;

	}

}
