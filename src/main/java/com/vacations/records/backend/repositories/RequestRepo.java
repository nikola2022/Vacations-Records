package com.vacations.records.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.vacations.records.backend.models.Request;

@EnableJpaRepositories
@Repository
public interface RequestRepo extends JpaRepository<Request, Integer> {

}
