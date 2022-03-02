package org.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.model.Pet;
import org.springframework.sfgpetclinic.model.PetType;
import org.springframework.sfgpetclinic.model.Vet;
import org.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Polik on 2/14/2022
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType savedCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1234132412");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthday(LocalDate.now());
        mikesPet.setName("Seventeen5ive");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("124 brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("413241324132");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCat);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthday(LocalDate.now());
        fionasCat.setName("Loxxx");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
