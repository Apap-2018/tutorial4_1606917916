package com.apap.tutorial4.service;

import java.util.List;
import com.apap.tutorial4.model.CarModel;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial4.repository.CarDb;

/*
 * CarServiceImpl
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDb CarDb;
		
	@Override
	public void addCar(CarModel Car) {
		CarDb.save(Car);
	}
	
	@Override
	public void deleteById(Long id) {
		CarDb.deleteById(id);
	}
	
	@Override
	public void updateCar(long id, CarModel newCar) {
		CarModel carUpdated = CarDb.getOne(id);
		carUpdated.setBrand(newCar.getBrand());
		carUpdated.setType(newCar.getType());
		carUpdated.setPrice(newCar.getPrice());
		carUpdated.setAmount(newCar.getAmount());
		CarDb.save(carUpdated);
	}
	
	public CarModel getCar(Long id) {
		return CarDb.findById(id).get();
	}
}