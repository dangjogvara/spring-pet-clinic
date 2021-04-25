package com.dangjogvara.springpetclinic.services;

import com.dangjogvara.springpetclinic.model.Owner;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
