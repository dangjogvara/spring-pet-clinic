package com.dangjogvara.springpetclinic.services;

import com.dangjogvara.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}


