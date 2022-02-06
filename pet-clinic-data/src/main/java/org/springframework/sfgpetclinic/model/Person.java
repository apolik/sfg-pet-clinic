package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Polik on 2/4/2022
 */
@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
