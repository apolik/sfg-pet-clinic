package org.springframework.sfgpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.sfgpetclinic.model.Owner;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerServiceMap service;

    final Long ownerId = 1L;
    final String ownerFirstName = "Vitaliy";
    final String ownerSurname = "Vilaliev";

    @BeforeEach
    void setUp() {
        service = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        var owner = Owner.builder()
                .id(ownerId)
                .firstName(ownerFirstName)
                .lastName(ownerSurname)
                .build();

        service.save(owner);
    }

    @Test
    void findAll() {
        var owners = service.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    void findById() {
        var owner = service.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        var id = 2L;
        var owner = Owner.builder()
                .id(id)
                .build();

        assertEquals(id, service.save(owner).getId());
    }

    @Test
    void saveNoId() {
        var savedOwner = service.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        service.delete(service.findById(ownerId));
        assertNull(service.findById(ownerId));
    }

    @Test
    void deleteById() {
        service.deleteById(ownerId);
        assertNull(service.findById(ownerId));
    }

    @Test
    void findByLastName() {
        var owner = service.findByLastName(ownerSurname);
        assertNotNull(owner);

        owner = service.findByLastName("null");
        assertNull(owner);
    }
}