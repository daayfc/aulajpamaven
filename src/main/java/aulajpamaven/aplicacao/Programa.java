package aulajpamaven.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpamaven.dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Carlos da Silva");
		p1.setEmail("carlos@gmail.com");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Joaquim Torres");
		p2.setEmail("joaquim@gmail.com");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Ana Maria");
		p3.setEmail("ana@gmail.com");
			
		EntityManagerFactory SessionFactory = Persistence.createEntityManagerFactory("aulajpa");
		
		EntityManager entityManager = SessionFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.getTransaction().commit();
		entityManager.close();
	
	}

}

