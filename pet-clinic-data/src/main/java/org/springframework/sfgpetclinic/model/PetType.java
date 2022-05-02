package org.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Polik on 2/4/2022
 */
@Entity
@Table(name = "type")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;
}
