package com.carpark.service;

import java.util.List;

import com.carpark.entity.Customer;
import com.carpark.entity.Parking;
import com.carpark.entity.ParkingCenter;
import com.carpark.exception.CustomException;
import com.carpark.exception.DeleteParkingException;

public interface CustomerService {
	
	//bookparking-at location
	//search parking- by location 
	
	public Customer addCustomer(Customer customer) throws CustomException;

	public List<ParkingCenter> centersAtLocation(String location) throws CustomException;
	
	public Parking bookParking(Parking parking, Long centerId, Long customerId) throws CustomException;
	
	public String deleteParkingById(Long id) throws DeleteParkingException;

	public String viewParkingAvailable(String location,Long centerId) throws CustomException;

	public Parking viewParkingById(Long id) throws CustomException;
	
	//update his parking

}
