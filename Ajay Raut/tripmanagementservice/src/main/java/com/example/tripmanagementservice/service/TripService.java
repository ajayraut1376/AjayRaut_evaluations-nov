package com.example.tripmanagementservice.service;

import java.util.List;

import com.example.tripmanagementservice.model.Trip;

public interface TripService {
	public List<Trip> getAll();
	public Trip addTrip(Trip trip);
	public String deleteTrip(int carno);
	public List<Trip> getTripBycarno(int carno);

}
