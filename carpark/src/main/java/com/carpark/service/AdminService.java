package com.carpark.service;

import java.util.List;

import com.carpark.entity.Parking;
import com.carpark.entity.ParkingCenter;
import com.carpark.exception.AdminException;
import com.carpark.exception.CustomException;
import com.carpark.exception.DeleteParkingException;

public interface AdminService {
	
	//add parking 
	// delete parking
	// update parking
	// view parking 
	
	public Parking addParking(Parking parking, Long centerid) throws CustomException;
	
	public String deleteParkingByToken(Long tokenId) throws DeleteParkingException;
	
	public List<Parking> viewAllParking() throws AdminException;
	
	public Parking updateParking(Parking parking, Long id) throws CustomException;
	
	public List<ParkingCenter> viewAllParkingCenter() throws AdminException;
	
	
}
