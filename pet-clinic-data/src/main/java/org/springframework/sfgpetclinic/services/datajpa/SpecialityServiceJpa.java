package org.springframework.sfgpetclinic.services.datajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Speciality;
import org.springframework.sfgpetclinic.repositories.SpecialityRepository;
import org.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 5/3/2022
 */
@Service
@Profile("datajpa")
public class SpecialityServiceJpa implements SpecialtyService {
    private final SpecialityRepository repository;

    public SpecialityServiceJpa(SpecialityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Speciality> findAll() {
        return repository.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return repository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
