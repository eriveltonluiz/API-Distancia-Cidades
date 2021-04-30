package com.project.apicities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.apicities.model.State;
import com.project.apicities.repository.StateRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/state")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateController {
	
	private StateRepository stateRepository;
	
	@GetMapping
	public List<State> listStatesAll(){
		return stateRepository.findAll();
	}
}
