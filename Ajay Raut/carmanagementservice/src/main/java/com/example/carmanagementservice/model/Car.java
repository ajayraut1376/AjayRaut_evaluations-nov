package com.example.carmanagementservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class Car {		
		@Id
		int carno;
		
		
		@Column
		String car_owner;
		
		@Column
		String fuel_type;
		
		@Column
		int noofseats;
		
		@Column
		String model;

		public int getCarno() {
			return carno;
		}

		public void setCarno(int carno) {
			this.carno = carno;
		}

		public String getCar_owner() {
			return car_owner;
		}

		public void setCar_owner(String car_owner) {
			this.car_owner = car_owner;
		}

		public String getFuel_type() {
			return fuel_type;
		}

		public void setFuel_type(String fuel_type) {
			this.fuel_type = fuel_type;
		}

		public int getNoofseats() {
			return noofseats;
		}

		public void setNoofseats(int noofseats) {
			this.noofseats = noofseats;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		@Override
		public String toString() {
			return "Car [carno=" + carno + ", car_owner=" + car_owner + ", fuel_type=" + fuel_type + ", noofseats="
					+ noofseats + ", model=" + model + "]";
		}

		public Car(int carno, String car_owner, String fuel_type, int noofseats, String model) {
			super();
			this.carno = carno;
			this.car_owner = car_owner;
			this.fuel_type = fuel_type;
			this.noofseats = noofseats;
			this.model = model;
		}

		public Car() {
	
		}
		
		
}
