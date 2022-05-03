package org.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Polik on 3/2/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "speciality_vets",
//                joinColumns = @JoinColumn(name = "speciality_id"),
//                inverseJoinColumns = @JoinColumn(name = "vet_id"))
//    private Set<Vet> vets = new HashSet<>();
}
