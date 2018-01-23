package org.formation.spring.controller;

import java.util.List;

import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class RestClientController {

	@Autowired
	IPrestiBanqueService service; 
	
	@GetMapping(value="/clients" , produces="application/json")
	List<Client> listClients(){
	return service.listClients();
	
	}
}
