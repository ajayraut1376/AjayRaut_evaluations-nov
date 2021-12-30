package com.example.customermanagementservice.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {		
		@Id
		int mobile;
		
		

		@Column
		String address;

	

		public int getMobile() {
			return mobile;
		}



		public void setMobile(int mobile) {
			this.mobile = mobile;
		}






		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public Customer(int mobile, String customerName, String address) {
			super();
			this.mobile = mobile;

			this.address = address;
		}





		@Override
		public String toString() {
			return "Customer [mobile=" + mobile + ", address=" + address + "]";
		}



		public Customer() {

		}
	
		
}
