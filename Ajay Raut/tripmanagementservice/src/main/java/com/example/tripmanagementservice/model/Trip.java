package com.example.tripmanagementservice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trip")
public class Trip {		
		@Id
		int tripId;
		
		
		@Column
		int carno;
		
		@Column
		String source;
		
		@Column
		String customerName;
		
		@Column
		int amount;

		public int getTripId() {
			return tripId;
		}

		public void setTripId(int tripId) {
			this.tripId = tripId;
		}

		public int getCarno() {
			return carno;
		}

		public void setCarno(int carno) {
			this.carno = carno;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Trip [tripId=" + tripId + ", carno=" + carno + ", source=" + source + ", customerName="
					+ customerName + ", amount=" + amount + "]";
		}

		public Trip(int tripId, int carno, String source, String customerName, int amount) {
			super();
			this.tripId = tripId;
			this.carno = carno;
			this.source = source;
			this.customerName = customerName;
			this.amount = amount;
		}

		public Trip() {

		}

		
		
		
}
