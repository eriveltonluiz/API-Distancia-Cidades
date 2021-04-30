package com.project.apicities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.apicities.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
