package com.example.tripmanagementservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tripmanagementservice.dao.TripDao;
import com.example.tripmanagementservice.model.Trip;

@Service
public class TripServiceImpl implements TripService {
	@Autowired
	TripDao repo;


	@Override
	public List<Trip> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Trip addTrip(Trip trip) {
		// TODO Auto-generated method stub
		return repo.save(trip);
	}

	@Override
	public String deleteTrip(int carno) {
		// TODO Auto-generated method stub
		repo.deleteById(carno);
		return "deleted";
	}

	@Override
	public List<Trip> getTripBycarno(int carno) {
		// TODO Auto-generated method stub
		List<Trip> data = repo.findAll();
		List<Trip> result = new ArrayList();
		for (Trip trip : data) {
			if (trip.getCarno() == carno)
				result.add(trip);
		}
		return result;

	}

}


