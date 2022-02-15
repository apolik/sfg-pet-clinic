package org.springframework.sfgpetclinic.services.map;

import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/12/2022
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
