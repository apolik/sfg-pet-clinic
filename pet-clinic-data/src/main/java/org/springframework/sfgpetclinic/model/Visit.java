package org.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Polik on 3/2/2022
 */
@Entity
@Table(name = "visits")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Visit extends BaseEntity {
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
