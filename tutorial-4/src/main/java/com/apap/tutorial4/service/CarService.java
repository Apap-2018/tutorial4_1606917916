package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.CarModel;

/*
 * CarService
 */
public interface CarService {
	void addCar(CarModel car);
	CarModel getCar(Long id);
	public void deleteById(Long id);
	void updateCar(long id,CarModel car);
}