package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Created by Polik on 2/4/2022
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthday;
}
