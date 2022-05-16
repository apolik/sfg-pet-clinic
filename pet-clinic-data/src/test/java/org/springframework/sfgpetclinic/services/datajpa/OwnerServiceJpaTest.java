package org.springframework.sfgpetclinic.services.datajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.repositories.OwnerRepository;
import org.springframework.sfgpetclinic.repositories.PetRepository;
import org.springframework.sfgpetclinic.repositories.PetTypeRepository;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//@ActiveProfiles("datajpa")
@ExtendWith(MockitoExtension.class)
class OwnerServiceJpaTest {
    public static final String LAST_NAME = "smith";
    public static final String FIRST_NAME = "max";

    public static final Long OWNER_ID = 1L;

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    Owner returnOwner;

    @InjectMocks
    OwnerServiceJpa service;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder()
                .id(OWNER_ID)
                .lastName(LAST_NAME)
                .firstName(FIRST_NAME)
                .build();
    }

    @Test
    void findAll() {
        var owner1 = Owner.builder().id(1L).build();
        var owner2 = Owner.builder().id(2L).build();

        var returnOwnerSet = Set.of(owner1, owner2);

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        var owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        var owner = service.findById(OWNER_ID);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        var owner = service.findById(OWNER_ID);

        assertNull(owner);
    }

    @Test
    void save() {
        var ownerToSave = Owner.builder().id(OWNER_ID).build();

        when(ownerRepository.save(any())).thenReturn(ownerToSave);

        var savedOwner = service.save(ownerToSave);

        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(returnOwner.getId());
        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        var smith = service.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }
}