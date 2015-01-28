package com.tud.lab6.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.tud.lab6.domain.Runner;

public interface RunnerRepository extends CrudRepository<Runner, ObjectId> {
	Runner findById(ObjectId id);
	List<Runner> findByLastName(String lastName);
}
