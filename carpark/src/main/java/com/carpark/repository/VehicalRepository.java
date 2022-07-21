package com.carpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpark.entity.Vehical;

public interface VehicalRepository extends JpaRepository<Vehical, String> {

}
