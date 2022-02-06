package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Polik on 2/6/2022
 */
@Getter @Setter @NoArgsConstructor
public class BaseEntity implements Serializable {
    private Long id;
}
