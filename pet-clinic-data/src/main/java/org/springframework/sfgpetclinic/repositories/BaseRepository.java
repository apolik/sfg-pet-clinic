package org.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Set;

/**
 * Created by Polik on 2/1/2022
 */
@NoRepositoryBean
public interface BaseRepository<T> extends CrudRepository<T, Long> {
    @Override
    Set<T> findAll();
}
