package com.kgisl.codecoverage.repository;

import com.kgisl.codecoverage.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CarRepository
 */
public interface CarRepository extends JpaRepository<Car,Long>{

    
}
