package org.springframework.sfgpetclinic.services.map;

import org.springframework.sfgpetclinic.model.Speciality;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 2/12/2022
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() != 0) {
            object.getSpecialities().forEach(el -> {
                if (el.getId() == null) {
                    Speciality savedSpeciality = specialtyService.save(el);
                    el.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
