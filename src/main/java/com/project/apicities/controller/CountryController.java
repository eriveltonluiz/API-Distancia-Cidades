package com.project.apicities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.apicities.exceptions.CountryNotFoundException;
import com.project.apicities.model.Country;
import com.project.apicities.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping
	public Page<Country> countriesAll(Pageable page){
		return countryRepository.findAll(page);
	}
	
	@GetMapping("/{id}")
	public Country returnCountryById(@PathVariable Long id) throws CountryNotFoundException {
		Country country = countryRepository.findById(id).orElseThrow(() -> new CountryNotFoundException());
		return country;
	}
}
