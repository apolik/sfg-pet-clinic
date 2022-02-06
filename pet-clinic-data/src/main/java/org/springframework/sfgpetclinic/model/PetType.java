package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Polik on 2/4/2022
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class PetType extends BaseEntity {
    private String name;
}
