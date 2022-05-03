package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.sfgpetclinic.model.Vet;

/**
 * Created by Polik on 2/1/2022
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
