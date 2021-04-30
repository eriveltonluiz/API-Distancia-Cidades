package com.project.apicities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.apicities.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
