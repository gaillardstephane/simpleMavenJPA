package org.formation.spring.test;

import org.formation.spring.config.ApplicationConfig;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		ApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);		   


		IPrestiBanqueService service = context.getBean("service", IPrestiBanqueService.class);
		service.listClients();
		service.addClient(new Client("BritneyJPA","Spears","log2JPA","mdp2",new Adresse(36, "avenue du JPAmaine", "Paris")));
		service.addClient(new Client("Bernard","Tapie","log2","mdp2",new Adresse(36, "rue de la paix", "Paris")));

	    System.out.println("!!!!!!!!!!\n"+service.listClients());

	    ((ConfigurableApplicationContext)(context)).close();

	}

}
