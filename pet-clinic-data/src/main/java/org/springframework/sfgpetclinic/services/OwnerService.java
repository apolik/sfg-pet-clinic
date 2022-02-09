package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

/**
 * Created by Polik on 2/1/2022
 */
@Service
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
