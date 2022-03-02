package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Polik on 2/4/2022
 */
@Getter @Setter
public class Vet extends Person {
    private Set<Speciality> specialities = new HashSet<>();
}
