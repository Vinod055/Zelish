package com.zelish.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zelish.entity.FoodTruckEntity;

//@Repository
public interface FoodTruckDao extends JpaRepository<FoodTruckEntity, Long>{
	
	public FoodTruckEntity saveAll(FoodTruckEntity foodTruckEntity);

}
