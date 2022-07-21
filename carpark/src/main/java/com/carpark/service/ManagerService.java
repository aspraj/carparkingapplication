package com.carpark.service;

import java.util.List;

import com.carpark.entity.ParkingCenter;
import com.carpark.exception.CustomException;
import com.carpark.exception.ParkingNotFoundException;

public interface ManagerService {
	
	public ParkingCenter createParkingCenter(ParkingCenter parkingcenter) throws CustomException; 

	public ParkingCenter viewParkingCenter(Long centerId) throws CustomException;
	
	public String viewParkingAvailable(String location,Long centerId) throws CustomException;
	
	public List<ParkingCenter> centersAtLocation(String Location) throws CustomException;
	
	public String deleteParkingCenterById(Long Id) throws CustomException;
	
	public ParkingCenter updateParkingCenter(ParkingCenter parkingcenter , Long Id) throws ParkingNotFoundException;
}
