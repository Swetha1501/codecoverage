package com.kgisl.codecoverage.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.kgisl.codecoverage.model.Car;
import com.kgisl.codecoverage.service.CarService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
 public class CarControllerTest {

    @Mock
    CarService carService;
    @InjectMocks
    CarController carController;
    List<Car> expected;

    Car car1=new CarBuild().id(1L).name("name1").build();
    Car car2=new CarBuild().id(2L).name("name2").build();
    @Test
    public void getallcarsTest() {
        expected = Arrays.asList(car1, car2);
        when(carService.getCars()).thenReturn(expected);
        List<Car> actual = carController.getallcars();
        assertEquals(expected, actual);
    }
}