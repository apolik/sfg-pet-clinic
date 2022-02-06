package org.springframework.sfgpetclinic.services;

import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/1/2022
 */
@Service
public interface VetService {
    Vet findById();

    Vet save(Vet vet);

    Set<Vet> findAll();
}
