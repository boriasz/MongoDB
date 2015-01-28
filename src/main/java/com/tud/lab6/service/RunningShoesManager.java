package com.tud.lab6.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tud.lab6.domain.RunningShoes;
import com.tud.lab6.repository.RunningShoesRepository;

@Component
public class RunningShoesManager {
	@Autowired
	RunningShoesRepository RSRepository;
	
	public void addRunningShoes(RunningShoes RS){
		RSRepository.save(RS);
	}
	public void deleteRunningShoes(RunningShoes RS){
		RSRepository.delete(RS);
	}
	public void deleteAllRunningShoes(){
		RSRepository.deleteAll();
	}
	public RunningShoes getRunningShoesById(ObjectId id){
		return RSRepository.findById(id);
	}
	public List<RunningShoes> getRunningShoesByBrand(String brand){
		return RSRepository.findByBrand(brand);
	}
	public List<RunningShoes> getAllRunningShoes(){
		ArrayList<RunningShoes> runningShoes = (ArrayList<RunningShoes>) RSRepository.findAll();
		return runningShoes;
	}
	public void updateRunningShoes(String oldBrand, String newBrand){
		ArrayList<RunningShoes> runningShoes = (ArrayList<RunningShoes>) RSRepository.findByBrand(oldBrand);
		runningShoes.get(0).setBrand(newBrand);
		RSRepository.save(runningShoes);
	}

}
