package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Speciality;

/**
 * Created by Polik on 2/1/2022
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
