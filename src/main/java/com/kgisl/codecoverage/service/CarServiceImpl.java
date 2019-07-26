package com.kgisl.codecoverage.service;

import java.util.List;

import com.kgisl.codecoverage.model.Car;
import com.kgisl.codecoverage.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getCars() {
        System.out.println(""+carRepository.findAll());
        return carRepository.findAll();
    }
}