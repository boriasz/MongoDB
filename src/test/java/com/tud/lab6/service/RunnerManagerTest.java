package com.tud.lab6.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tud.lab6.domain.Runner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
public class RunnerManagerTest {
	
	@Autowired
	private RunnerManager runnerManager;
	
	
	@Test
	public void checkAdding(){
		Runner runner = new Runner();
		runner.setFirstName("Borys");
		runner.setLastName("Stefanski");
		runner.setNationality("Poland");
		runner.setYob(1991);
		runnerManager.addRunner(runner);
		
		
	}
}
