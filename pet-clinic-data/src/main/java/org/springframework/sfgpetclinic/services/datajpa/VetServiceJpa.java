package org.springframework.sfgpetclinic.services.datajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.repositories.VetRepository;
import org.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 5/3/2022
 */
@Service
@Profile("datajpa")
public class VetServiceJpa implements VetService {
    private final VetRepository repository;

    public VetServiceJpa(VetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Vet> findAll() {
        return repository.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return repository.save(object);
    }

    @Override
    public void delete(Vet object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
