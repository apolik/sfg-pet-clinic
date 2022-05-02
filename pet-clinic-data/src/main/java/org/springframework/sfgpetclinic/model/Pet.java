package org.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Polik on 2/4/2022
 */
@Data
@Entity
@Table(name = "pets")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birthday_date")
    private LocalDate birthday;
}
