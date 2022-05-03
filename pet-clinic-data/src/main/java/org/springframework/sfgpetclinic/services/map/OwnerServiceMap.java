package org.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.sfgpetclinic.services.PetService;
import org.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/12/2022
 */
@Service
@Profile("map")
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(el -> {
                    if (el.getPetType() != null) {
                        if (el.getPetType().getId() == null) {
                            el.setPetType(petTypeService.save(el.getPetType()));
                            petTypeService.save(el.getPetType());
                        }

                    } else {
                        throw new RuntimeException("Pet Type is required!");
                    }

                    if (el.getId() == null) {
                        Pet savedPet = petService.save(el);
                        el.setOwner(savedPet.getOwner());
                    }
                });
            }

            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null; //fixme
    }
}
