package com.example.practice15.repositories;

import com.example.practice15.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
    List<Phone> findPhoneByName(@Param("name") String name);
    List<Phone> findPhoneByCreationYear(@Param("creationYear") int creationYear);
    List<Phone> findPhoneByManufacture(@Param("manufacture") String manufacture);
}
