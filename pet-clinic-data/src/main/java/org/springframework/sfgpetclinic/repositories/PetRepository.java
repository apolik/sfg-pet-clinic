package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Pet;

/**
 * Created by Polik on 2/1/2022
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
