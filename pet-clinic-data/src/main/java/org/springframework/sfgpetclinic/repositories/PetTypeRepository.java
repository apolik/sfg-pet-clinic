package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.PetType;

/**
 * Created by Polik on 2/1/2022
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
