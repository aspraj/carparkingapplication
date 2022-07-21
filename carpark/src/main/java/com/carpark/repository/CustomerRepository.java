package com.carpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpark.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
