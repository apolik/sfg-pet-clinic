package org.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Polik on 2/6/2022
 */
@Getter @Setter
@MappedSuperclass
public class BaseEntity implements Serializable, Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
