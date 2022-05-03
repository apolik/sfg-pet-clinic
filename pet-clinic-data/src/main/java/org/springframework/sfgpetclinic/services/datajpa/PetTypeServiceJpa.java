package org.springframework.sfgpetclinic.services.datajpa;

import org.springframework.sfgpetclinic.model.PetType;
import org.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/1/2022
 */
@Service
public class PetTypeServiceJpa implements PetTypeService {
    private final PetTypeRepository repository;

    public PetTypeServiceJpa(PetTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<PetType> findAll() {
        return repository.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return repository.save(object);
    }

    @Override
    public void delete(PetType object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
