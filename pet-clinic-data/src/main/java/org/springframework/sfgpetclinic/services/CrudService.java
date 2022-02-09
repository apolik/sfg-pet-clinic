package org.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Polik on 2/9/2022
 */
public interface CrudService<T, ID extends Number> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
