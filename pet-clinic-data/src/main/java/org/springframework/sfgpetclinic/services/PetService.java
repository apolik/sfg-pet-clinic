package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

/**
 * Created by Polik on 2/1/2022
 */
@Service
public interface PetService extends CrudService<Pet, Long> {

}
