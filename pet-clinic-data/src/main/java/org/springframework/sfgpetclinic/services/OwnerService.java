package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/1/2022
 */
@Service
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById();

    Owner save(Owner owner);

    Set<Owner> findAll();
}
