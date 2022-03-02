package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Polik on 2/4/2022
 */
@Getter @Setter @NoArgsConstructor @ToString
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();
}
