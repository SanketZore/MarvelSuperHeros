package com.example.sanket.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sanket.springcrud.models.Characters;

@Repository
public interface SuperheroCharacterRepository extends JpaRepository<Characters,Integer>{	

}
