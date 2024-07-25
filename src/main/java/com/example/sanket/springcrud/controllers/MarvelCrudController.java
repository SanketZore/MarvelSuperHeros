package com.example.sanket.springcrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sanket.springcrud.models.Characters;
import com.example.sanket.springcrud.services.CRUDService;

@RestController
public class MarvelCrudController {

	@Autowired
	CRUDService crudService;
	//CRUD
	
	//Create API endPoint - POST
	@PostMapping(path="create")
	public void createSuperHero(@RequestBody Characters superhero){
		crudService.createSuperhero(superhero);
	}
	
	@GetMapping("read")
	public Characters readSuperheroById(@RequestParam(name = "id") int val) {
		return crudService.readSuperHeroById(val);
	}
	
	@PutMapping("update")
	public void updateSuperHeroHumanName(@RequestBody Characters superhero,@RequestParam(name="id") int id) {
		crudService.updateSuperHeroHumanName(superhero,id);
	}
	
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name="id") int id) {
		crudService.deleteSuperHero(id);
	}
	
	@GetMapping("readall")
	public List<Characters> readAllSuperHero() {
		return crudService.readAllSuperHero();
	}

	
}
