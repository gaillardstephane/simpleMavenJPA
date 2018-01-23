package org.formation.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.formation.spring.config.ApplicationConfig;
import org.formation.spring.dao.CrudClientDAO;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class})
public class ClientServiceTest {

	
	@Autowired
	private CrudClientDAO crudClientDAO;

	
	@Test
	public void testClientService() {
		
		assertNotNull(crudClientDAO);
		Adresse a = new Adresse(1, "kjhk", "kjhkjh");
		
		Client c = new Client("client de test", "iuiuyhiu", "lkj", "kjhk", a);
		
		crudClientDAO.save(c);
		List<Client> byNom = crudClientDAO.findAllClientByNom("client de test");
		
		System.out.println(byNom);
		assertEquals(1, byNom.size());
		
		
	}
	
}
