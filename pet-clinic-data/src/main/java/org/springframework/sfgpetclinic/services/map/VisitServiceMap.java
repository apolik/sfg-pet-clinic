package org.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.sfgpetclinic.exception.NotFoundException;
import org.springframework.sfgpetclinic.model.Visit;
import org.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Polik on 5/5/2022
 */
@Service
@Profile({"default", "map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null
                || visit.getPet().isNew() || visit.getPet().getOwner().isNew()) {
            throw new NotFoundException("Invalid visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
