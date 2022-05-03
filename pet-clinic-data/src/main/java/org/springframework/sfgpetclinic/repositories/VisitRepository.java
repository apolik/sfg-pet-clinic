package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Visit;

/**
 * Created by Polik on 5/3/2022
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
