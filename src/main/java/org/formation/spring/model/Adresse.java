package org.formation.spring.model;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class Adresse {
  private int numero;
  private String rue;
  private String ville;
	
  public Adresse() {
  }
	
  public Adresse(int numero, String rue, String ville) {
    this.numero = numero;
    this.rue = rue;
    this.ville = ville;
  }

  public String toString() {
		 return " numero  : "+this.getNumero() +" - "+
		    	" rue : "+this.getRue()+" - "+
		    	" ville : "+this.getVille();
  }
  
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getRue() {
    return rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

 
  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }
}
