package org.springframework.sfgpetclinic.services.datajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.repositories.OwnerRepository;
import org.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 5/3/2022
 */
@Service
@Profile("datajpa")
public class OwnerServiceJpa implements OwnerService {
    private final OwnerRepository repository;

    public OwnerServiceJpa(OwnerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Owner> findAll() {
        return repository.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return repository.save(object);
    }

    @Override
    public void delete(Owner object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }
}
