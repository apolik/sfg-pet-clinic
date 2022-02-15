package org.springframework.sfgpetclinic.services.map;

import org.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Polik on 2/12/2022
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T t) {
        if (t != null) {
            if (t.getId() == null) {
                t.setId(map.isEmpty() ? 1 : getNextId());
            }

            map.put(t.getId(), t);
        } else {
            throw new RuntimeException("OBJECT CANNOT BE NULL!!!");
        }

        return t;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(el -> el.getValue().equals(object));
    }

    private Long getNextId() {
        return Collections.max(map.keySet()) + 1;
    }
}
