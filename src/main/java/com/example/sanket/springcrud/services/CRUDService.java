package com.example.sanket.springcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sanket.springcrud.models.Characters;
import com.example.sanket.springcrud.repositories.SuperheroCharacterRepository;

@Service
public class CRUDService {

	@Autowired
	SuperheroCharacterRepository superheroCharacterRepository;
	
	// Create API endpoint
	public void createSuperhero(Characters character) {
		superheroCharacterRepository.save(character);
	}
	
	// Read API endpoint
	public Characters readSuperHeroById(int val) {
		// TODO Auto-generated method stub
		return superheroCharacterRepository.findById(val).get();
	}

	// Update API endpoint
	public void updateSuperHeroHumanName(Characters superhero, int id) {
		// TODO Auto-generated method stub
		Characters superheroToBeUpdated=readSuperHeroById(id);
		superheroToBeUpdated.setHumanName(superhero.getHumanName());
		superheroCharacterRepository.save(superheroToBeUpdated);
	}

	// Delete API endpoint
	public void deleteSuperHero(int id) {
		// TODO Auto-generated method stub
		superheroCharacterRepository.deleteById(id);
	}
	
	// ReadAll API endpoint
	public List<Characters> readAllSuperHero() {
		return superheroCharacterRepository.findAll();
	}


}
