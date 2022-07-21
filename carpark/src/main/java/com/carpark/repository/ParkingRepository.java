package com.carpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpark.entity.Parking;

public interface ParkingRepository extends JpaRepository<Parking, Long> {

}
