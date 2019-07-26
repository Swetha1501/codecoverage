package com.kgisl.codecoverage.controller;

import com.kgisl.codecoverage.model.*;

/**
 * CarBuilder
 */
public class CarBuild {

    Car car = new Car();

    public CarBuild id(Long id) {
        car.setId(id);
        return this;
    }

    public CarBuild name(String name) {
        car.setName(name);
        return this;
    }

    public Car build() {
        return this.car;
    }
}