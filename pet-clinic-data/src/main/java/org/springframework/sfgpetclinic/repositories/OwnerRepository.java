package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Owner;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Polik on 2/1/2022
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    @Override
    Set<Owner> findAll();

    Optional<Owner> findByLastName(String lastName);
}
