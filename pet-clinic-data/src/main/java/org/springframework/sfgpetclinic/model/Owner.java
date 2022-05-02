package org.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Polik on 2/4/2022
 */
@Data
@Entity
@Table(name = "owners")
@EqualsAndHashCode(callSuper = true)
public class Owner extends Person {

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(mappedBy = "owner",
            cascade = CascadeType.ALL)
    private Set<Pet> pets = new HashSet<>();
}
