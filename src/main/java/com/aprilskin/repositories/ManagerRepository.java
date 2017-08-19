package com.aprilskin.repositories;

import com.aprilskin.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported =false)
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    Manager save(Manager manager);

    Manager findByName(String name);
}
