package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Polik on 3/2/2022
 */
@Getter @Setter
public class Speciality extends BaseEntity {
    private String description;
}
