package com.dangjogvara.springpetclinic.services;

import com.dangjogvara.springpetclinic.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
