package com.project.apicities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.apicities.model.City;
import com.project.apicities.repository.CityRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/city")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {
	
	private CityRepository cityRepository;
	
	public Page<City> listCitiesAll(Pageable pageable){
		return cityRepository.findAll(pageable);
	}
}
