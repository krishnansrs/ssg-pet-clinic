package com.skhome.ssgpetclinic.services;

import com.skhome.ssgpetclinic.model.Owner;
import com.skhome.ssgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
