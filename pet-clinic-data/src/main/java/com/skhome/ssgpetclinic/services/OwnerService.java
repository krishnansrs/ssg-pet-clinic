package com.skhome.ssgpetclinic.services;

import com.skhome.ssgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService  extends  CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
