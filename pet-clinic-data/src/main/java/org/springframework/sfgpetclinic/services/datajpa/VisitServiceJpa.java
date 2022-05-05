package org.springframework.sfgpetclinic.services.datajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Visit;
import org.springframework.sfgpetclinic.repositories.VisitRepository;
import org.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 5/5/2022
 */
@Service
@Profile("datajpa")
public class VisitServiceJpa implements VisitService {
    private final VisitRepository repository;

    public VisitServiceJpa(VisitRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Visit> findAll() {
        return repository.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return repository.save(object);
    }

    @Override
    public void delete(Visit object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
