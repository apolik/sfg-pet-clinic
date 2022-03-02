package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by Polik on 3/2/2022
 */
@Getter @Setter
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;
}
