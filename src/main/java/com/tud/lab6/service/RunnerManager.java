package com.tud.lab6.service;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tud.lab6.domain.Runner;
import com.tud.lab6.domain.RunningShoes;
import com.tud.lab6.repository.RunnerRepository;

@Component
public class RunnerManager {
	@Autowired
	private RunnerRepository runnerRepository;
	
	public void addRunner(Runner runner){
		runnerRepository.save(runner);
	}
	public List<Runner> getRunnersByLastName(String lastName){
		return runnerRepository.findByLastName(lastName);
	}
	public Runner getRunnerById(ObjectId id){
		return runnerRepository.findById(id);
	}
	public List<Runner> getAllRunners(){
		ArrayList<Runner> runners = (ArrayList<Runner>) runnerRepository.findAll();
		return runners;
	}
	public void deleteRunner(Runner runner){
		runnerRepository.delete(runner);
	}
	public void deleteAllRunners(){
		runnerRepository.deleteAll();
	}
	public void updateLastNameRunner(String oldLastName, String newLastName){
		ArrayList<Runner> runners = (ArrayList<Runner>) runnerRepository.findByLastName(oldLastName);
		runners.get(0).setLastName(newLastName);
		runnerRepository.save(runners);
	}
	public void deleteShoes(String runnerName, String shoesName){
		ArrayList<Runner> runners = (ArrayList<Runner>) runnerRepository.findByLastName(runnerName);
		for(RunningShoes shoes : runners.get(0).getRunningShoes()){
			if(shoes.getModel().equals(shoesName)){
				runners.get(0).getRunningShoes().remove(shoes);
			}
		}
		runnerRepository.save(runners);
	}
	public ArrayList<RunningShoes> getShoesFromRunner(String runnerName, String shoesName){
		ArrayList<Runner> runners = (ArrayList<Runner>) runnerRepository.findByLastName(runnerName);
		ArrayList<RunningShoes> shoes = new ArrayList<RunningShoes>();
		for(RunningShoes s : runners.get(0).getRunningShoes()){
			if(s.getModel().equals(shoesName)){
				shoes.add(s);
			}
		}
		return shoes;
	}
}
