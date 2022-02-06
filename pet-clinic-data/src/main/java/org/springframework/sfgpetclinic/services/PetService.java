package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/1/2022
 */
@Service
public interface PetService {
    Pet findById();

    Pet save(Pet pet);

    Set<Pet> findAll();
}
