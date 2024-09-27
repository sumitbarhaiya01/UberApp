package com.sumit.project.uber.uberApp.repositories;

import com.sumit.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
