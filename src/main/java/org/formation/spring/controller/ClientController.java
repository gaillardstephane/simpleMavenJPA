package org.formation.spring.controller;

import java.util.List;

import org.formation.spring.dao.CrudClientDAO;
import org.formation.spring.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {
	
	@Autowired
	private CrudClientDAO crudClientDAO;
	
	@RequestMapping(value="/displayClients", method = RequestMethod.GET)
	public ModelAndView listClients() {
		
		List<Client> clients = crudClientDAO.findAll();
		return new ModelAndView("displayClients","clients", clients);
		
		
		
	}


}
