package com.skhome.ssgpetclinic.services;

import com.skhome.ssgpetclinic.model.Owner;
import com.skhome.ssgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
