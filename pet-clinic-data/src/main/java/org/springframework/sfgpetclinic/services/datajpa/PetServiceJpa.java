package org.springframework.sfgpetclinic.services.datajpa;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.repositories.PetRepository;
import org.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 5/3/2022
 */
@Service
public class PetServiceJpa implements PetService {
    private final PetRepository repository;

    public PetServiceJpa(PetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Pet> findAll() {
        return repository.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return repository.save(object);
    }

    @Override
    public void delete(Pet object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
