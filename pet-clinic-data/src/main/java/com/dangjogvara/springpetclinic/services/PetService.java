package com.dangjogvara.springpetclinic.services;

import com.dangjogvara.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

