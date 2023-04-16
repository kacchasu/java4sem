package com.example.practice15.repositories;

import com.example.practice15.entity.Manufacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ManufactureRepository extends JpaRepository<Manufacture, Integer> {
    List<Manufacture> findManufactureByAddress(@Param("address") String address);
    List<Manufacture> findManufactureByName(@Param("name") String name);
}
