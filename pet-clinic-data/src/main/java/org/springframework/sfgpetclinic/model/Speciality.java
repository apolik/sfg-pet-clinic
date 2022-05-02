package org.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Polik on 3/2/2022
 */
@Entity
@Table(name = "specialities")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "speciality_vets",
                joinColumns = @JoinColumn(name = "speciality_id"),
                inverseJoinColumns = @JoinColumn(name = "vet_id"))
    private Set<Vet> vets = new HashSet<>();
}
