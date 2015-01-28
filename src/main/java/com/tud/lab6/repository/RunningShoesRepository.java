package com.tud.lab6.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.tud.lab6.domain.RunningShoes;

public interface RunningShoesRepository extends CrudRepository<RunningShoes, ObjectId>{
	RunningShoes findById(ObjectId id);
	List<RunningShoes> findByBrand(String brand);
}
